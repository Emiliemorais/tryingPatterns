import java.util.ArrayList;

import command.BorrowCommand;
import command.Command;
import domain.Borrowing;

public class Invoker {
	
	ArrayList<Command> commands = new ArrayList<Command>();
	Command lastCommand;
	
	public Invoker(){
		 
	}
	
	public void makeBorrowing(Borrowing borrowing){
		
		// As the Invoker is the Whole, it creates the Pieces, which are the Commands (Creator pattern)
		Command borrowCommand = new BorrowCommand(borrowing);
		this.addCommand(borrowCommand);
		
		borrowCommand.execute();
	}
	
	public void undo(){
		lastCommand.undo();
	}
	
	private void addCommand(Command command){
		this.commands.add(command);
		this.lastCommand = command;
	}
}
