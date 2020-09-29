public class Car {
    private static int id;
    private static String brand;
    private static int year;
    private static String color;
    public static int cost;
    public static String model;
    public static int age;
    public static int registNumber;

    public Car()
    {

    }
    public Car(int id_, String brand_, int year_, String color_, int cost_, int age_, String model_, int registNumber_)
    {
        this.id = id_;
        this.brand = brand_;
        this.year = year_;
        this.color = color_;
        this.cost = cost_;
        this.age = age_;
        this.model = model_;
        this.registNumber = registNumber_;
    }

    public String getBrand()
    {
        return brand;
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

    public int getAge()
    {
        return age;
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
        return ("Id:" + getID() + " brand:" + getBrand() + " year:" + getYear() + " color:" + getColor() + " cost:" + getCost()
                + " age:" + getAge() + " model:" + getModel() + " registr:" + getRegistNumber());
    }

}
