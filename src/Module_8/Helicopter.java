public class Helicopter extends Airplane implements Flyer {
	// вертолет взлетает вертикально, здесь могут быть переопределены 
	//  методы из класса самолета или добавлены новые
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Вертолет - взлетает!");
	}
}
