import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car(12, "Merc", 1989, "yellow", 154, 12, "kuzov", 14);
        Car car2 = new Car(13, "Merc", 1991, "blue", 124, 11, "kuzov11", 12);
        Car car3 = new Car(11, "BMW", 1991, "green", 124, 13, "kuzov12", 11);
        Car car4 = new Car(14, "Toyota", 1991, "blue", 124, 11, "kuzov11", 10);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4);

        CarList carChosenBrand = new CarList();
        System.out.println("Список Машин марки мэрс:");
        List<Car> resultList1 = carChosenBrand.getBrandCar(cars, "BMW");
        System.out.println(resultList1.toString());
        //for(Car a: resultList1)
        //    System.out.println(a.toString());
    }

}

