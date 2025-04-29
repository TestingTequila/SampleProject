public class Test
{
    public static void main(String[] args) {
        System.out.println("This is a Sample Project....");
        Car car = new Car();
        car.nameOfCar="Audi";
        car.color = "White";
        car.price = 34543;
        System.out.println("CAR DETAILS=> "+car.nameOfCar+ ", "+car.color + ", "+ car.price + ", "+ Car.numberOfWheels);

        Car car1 = new Car();
        car1.nameOfCar="BMW";
        car1.color = "Red";
        car1.price = 987686;
        System.out.println("CAR DETAILS=> "+car1.nameOfCar+ ", "+car1.color + ", "+ car1.price + ", "+ Car.numberOfWheels);
    }
}
