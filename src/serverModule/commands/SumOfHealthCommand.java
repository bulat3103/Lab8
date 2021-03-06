package serverModule.commands;

import common.exceptions.EmptyCollectionException;
import common.exceptions.NonAuthorizedUserException;
import common.exceptions.WrongAmountOfParametersException;
import common.utility.User;
import resources.LocaleBundle;
import serverModule.utility.CollectionManager;
import serverModule.utility.ResponseOutputer;

/**
 * Command 'sum_of_health'. Prints the sum of health of all marines.
 */
public class SumOfHealthCommand extends AbstractCommand{
    private CollectionManager collectionManager;

    public SumOfHealthCommand(CollectionManager collectionManager) {
        super("sum_of_health", "sumHealthCommandDescription");
        this.collectionManager = collectionManager;
    }

    /**
     * Executes the command.
     * @return Command exit status.
     */
    @Override
    public boolean execute(String argument, Object objectArgument, User user) {
        try {
            if (user == null) throw new NonAuthorizedUserException();
            if (!argument.isEmpty() || objectArgument != null) throw new WrongAmountOfParametersException();
            double sum_of_health = collectionManager.getSumOfHealth();
            if (sum_of_health == 0) throw new EmptyCollectionException();
            ResponseOutputer.append("sumHealthCommandText:" + sum_of_health);
            return true;
        } catch (WrongAmountOfParametersException exception) {
            ResponseOutputer.append("У этой команды нет параметров!\n");
        } catch (EmptyCollectionException exception) {
            ResponseOutputer.append("emptyError");
        } catch (NonAuthorizedUserException e) {
            ResponseOutputer.append("Необходимо авторизоваться!\n");
        }
        return false;
    }
}
