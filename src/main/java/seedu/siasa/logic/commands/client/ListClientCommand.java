package seedu.siasa.logic.commands.client;

import static java.util.Objects.requireNonNull;
import static seedu.siasa.model.Model.PREDICATE_SHOW_ALL_PERSONS;

import seedu.siasa.logic.commands.Command;
import seedu.siasa.logic.commands.CommandResult;
import seedu.siasa.model.Model;

/**
 * Lists all persons in the address book to the user.
 */
public class ListClientCommand extends Command {

    public static final String COMMAND_WORD = "listclient";

    public static final String MESSAGE_SUCCESS = "Listed all clients";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
