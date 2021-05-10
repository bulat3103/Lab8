package serverModule.commands;

import common.data.Chapter;
import common.data.Coordinates;
import common.data.SpaceMarine;
import common.data.Weapon;
import common.exceptions.*;
import common.utility.SpaceMarineLite;
import common.utility.User;
import resources.LocaleBundle;
import serverModule.utility.CollectionManager;
import serverModule.utility.DatabaseCollectionManager;
import serverModule.utility.ResponseOutputer;

import java.time.LocalDateTime;

/**
 * Command 'update'. Updates the information about selected marine.
 */
public class UpdateCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private DatabaseCollectionManager databaseCollectionManager;

    public UpdateCommand(CollectionManager collectionManager, DatabaseCollectionManager databaseCollectionManager) {
        super("update id {element}", "updateCommandDescription");
        this.collectionManager = collectionManager;
        this.databaseCollectionManager = databaseCollectionManager;
    }

    /**
     * Executes the command.
     * @return Command exit status.
     */
    @Override
    public boolean execute(String argument, Object objectArgument, User user) {
        try {
            if (argument.isEmpty() || objectArgument == null) throw new WrongAmountOfParametersException();
            if (collectionManager.collectionSize() == 0) throw new EmptyCollectionException();
            int id = Integer.parseInt(argument);
            int key = collectionManager.getKeyById(id);
            SpaceMarine oldMarine = collectionManager.getFromCollection(key);
            if (oldMarine == null) throw new NotFoundMarineException();
            if (!oldMarine.getOwner().equals(user)) throw new PermissionDeniedException();
            if (!databaseCollectionManager.checkSpaceMarineByIdAndUserId(oldMarine.getId(), user)) throw new IllegalDatabaseEditException();
            SpaceMarineLite marineLite = (SpaceMarineLite) objectArgument;
            databaseCollectionManager.updateSpaceMarineByID(id, marineLite);
            String name = marineLite.getName() == null ? oldMarine.getName() : marineLite.getName();
            Coordinates coordinates = marineLite.getCoordinates() == null ? oldMarine.getCoordinates() : marineLite.getCoordinates();
            LocalDateTime creationDate = oldMarine.getCreationDate();
            int health = marineLite.getHealth() == -1 ? oldMarine.getHealth() : marineLite.getHealth();
            Integer heartCount = marineLite.getHeartCount() == -1 ? oldMarine.getHeartCount() : marineLite.getHeartCount();
            String achievements = marineLite.getAchievements() == null ? oldMarine.getAchievements() : marineLite.getAchievements();
            Weapon weapon = marineLite.getWeaponType() == null ? oldMarine.getWeaponType() : marineLite.getWeaponType();
            Chapter chapter = marineLite.getChapter() == null ? oldMarine.getChapter() : marineLite.getChapter();
            collectionManager.removeFromCollection(key);
            collectionManager.addToCollection(key, new SpaceMarine(
                    id,
                    name,
                    coordinates,
                    creationDate,
                    health,
                    heartCount,
                    achievements,
                    weapon,
                    chapter,
                    user,
                    databaseCollectionManager.getIsDrewById(id)
            ));
            ResponseOutputer.append("updateCommandSuccess");
            return true;
        } catch (WrongAmountOfParametersException exception) {
            ResponseOutputer.append("Вместе с этой командой должен быть передан параметр! Наберит 'help' для справки!\n");
        } catch (EmptyCollectionException exception) {
            ResponseOutputer.append("emptyError");
        } catch (NotFoundMarineException e) {
            ResponseOutputer.append("notFoundError");
        } catch (PermissionDeniedException e) {
            ResponseOutputer.append("permissionError");
        } catch (DatabaseManagerException e) {
            ResponseOutputer.append("databaseError");
        } catch (IllegalDatabaseEditException e) {
            ResponseOutputer.append("illegalError");
        }
        return false;
    }
}
