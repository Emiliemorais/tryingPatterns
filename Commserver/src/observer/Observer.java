package observer;

import domain.Borrowing;

public abstract class Observer {
	
	public abstract void newBorrowing(Borrowing borrowing);
	public abstract void endBorrowing(Borrowing borrowing);
}
