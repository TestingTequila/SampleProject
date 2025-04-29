public class Test
{
    public static void main(String[] args) {
        System.out.println("This is a Sample Project....");
        Car car = new Car();
        car.nameOfCar="Audi";
        car.color = "White";
        car.price = 34543;
        System.out.println("CAR DETAILS=> "+car.nameOfCar+ ", "+car.color + ", "+ car.price + ", "+ Car.numberOfWheels);
    }
}
