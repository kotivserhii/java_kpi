public class Car {
    private int id;
    private String brand;
    private int year;
    private String color;
    private int cost;
    private String model;
   // private int age;
    private int registNumber;

    public Car(int ID, String Brand, int Year, String Color, int Cost, String Model, int RegistNumber)
    {
        id = ID;
        brand = Brand;
        year = Year;
        color = Color;
        cost = Cost;
      //  age = age_;
        model = Model;
        registNumber = RegistNumber;
    }

    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
    public int getID()
    {
        return id;
    }

    public int getYear()
    {
        return year;
    }

    public int getCost()
    {
        return cost;
    }

    public int getRegistNumber()
    {
        return registNumber;
    }
    @Override
    public String toString() {
        return ("Id:" + this.getID() + " brand:" + getBrand() + " year:" + getYear() + " color:" + getColor() + " cost:" + getCost()
                 + " model:" + getModel() + " registr:" + getRegistNumber());
    }

}
