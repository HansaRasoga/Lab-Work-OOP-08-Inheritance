public class Vehicle 
{
    private String brand;
    private int year;

    public Vehicle(String brand, int year)
    {
        this.brand=brand;
        this.year=year;
    }

    public String getBrand() 
    {
        return brand;
    }
    public int getYear() 
    {
        return year;
    }

    public void start()
    {
        System.out.println("Sterting the"+year+" "+brand+"vehicle.");
    }

    public void stop()
    {
        System.out.println("Stopping the "+year+" "+brand+" vehicle.");
    }

    public void accelerate()
    {
        System.out.println("Accelerating the "+year+" "+brand+" vehicle.");
    }
}
