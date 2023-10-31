package calcwithcommand;

/*
 * Command Interface
 */

public interface Command
{
	void execute();
	void undo();
}