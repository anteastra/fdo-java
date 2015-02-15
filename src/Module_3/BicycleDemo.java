
public class BicycleDemo {
	public static void main(String[] args) {

        // Создает два различных объекта Bicycle 
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Вызывает методы, созданных объектов
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
   }
}
