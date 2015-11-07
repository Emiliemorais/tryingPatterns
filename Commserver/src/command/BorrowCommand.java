package command;

import domain.Borrowing;

public class BorrowCommand extends Command {

	Borrowing borrowing;
	
	public BorrowCommand(Borrowing borrowing) {
		this.borrowing = borrowing;
	}
	
	@Override
	public void execute(){
		borrowing.borrowBooks();
	}

	@Override
	public void undo(){
		borrowing.returnBooks();
	}

}
