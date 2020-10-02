public class Car {
    private int id;
    private String brand;
    private int year;
    private String color;
    private int cost;
    private String model;
   // private int age;
    private int registNumber;

    public Car(int id_, String brand_, int year_, String color_, int cost_, String model_, int registNumber_)
    {
        id = id_;
        brand = brand_;
        year = year_;
        color = color_;
        cost = cost_;
      //  age = age_;
        model = model_;
        registNumber = registNumber_;
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
