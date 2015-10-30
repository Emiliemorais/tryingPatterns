package observer;

import domain.Borrowing;

public abstract class Observer {
	
	Borrowing borrowing;

	public abstract void update(Borrowing borrowing);
}
