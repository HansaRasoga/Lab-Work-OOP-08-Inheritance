public class Main 
{
    public static void main(String [] args)
    {
        Vehicle vehicle = new Vehicle("Toyota", 2020);
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();

        Car car = new Car("Honda", 2021);
        car.start();
        car.honk();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Yamaha", 2019);
        motorcycle.start();
        motorcycle.wheelie();
        motorcycle.stop();
    }
}
