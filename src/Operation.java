import java.util.ArrayList;

import command.Command;

public class Operation {
	
	ArrayList<Command> commands = new ArrayList<Command>();
	Command lastCommand;
	
	public Operation(){
		
	}
	
	public void borrowBook(){
		
		BorrowCommand borrowBook = new BorrowCommand();
		
	}
	
	public void undo(){
		
	}
}
