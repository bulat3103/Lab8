package serverModule.commands;

import common.exceptions.DatabaseManagerException;
import common.exceptions.EmptyCollectionException;
import common.exceptions.WrongAmountOfParametersException;
import common.utility.User;
import serverModule.utility.CollectionManager;
import serverModule.utility.DatabaseCollectionManager;
import serverModule.utility.ResponseOutputer;

public class UpdateIsDrewCommand extends AbstractCommand{
    private DatabaseCollectionManager databaseCollectionManager;
    private CollectionManager collectionManager;

    public UpdateIsDrewCommand(DatabaseCollectionManager databaseCollectionManager, CollectionManager collectionManager) {
        super("updateIsDrewCommand", "служебная команда");
        this.databaseCollectionManager = databaseCollectionManager;
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String argument, Object objectArgument, User user) {
        try {
            if (argument.isEmpty() || objectArgument == null || user != null) throw new WrongAmountOfParametersException();
            int id = Integer.parseInt(argument);
            int key = collectionManager.getKeyById(id);
            boolean value = (boolean) objectArgument;
            databaseCollectionManager.updateIsDrewById(value, id);
            collectionManager.getCollection().get(key).setDrew(value);
        } catch (WrongAmountOfParametersException e) {
            ResponseOutputer.append("Вместе с этой командой должен быть передан параметр!\n");
        } catch (DatabaseManagerException e) {
            ResponseOutputer.append("Произошла ошибка при обращении к базе данных!\n");
        }
        return false;
    }
}
