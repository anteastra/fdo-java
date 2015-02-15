
public class Bird extends Animal implements Flyer {

	@Override
	public void fly() {
		// TODO код дл€ полета птички

	}

	@Override
	public void land() {
		// TODO код дл€ посадки птички

	}

	@Override
	public void takeOff() {
		// TODO код дл€ взлета птички
		System.out.println("ѕтичка - взлетает!");

	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("мы птички клюЄм букашек");
	}

}
