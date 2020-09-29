import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class task_para {
    public static void main(String[] args)
    {
        Car car1 = new Car(12, "Merc", 1989, "yellow", 154, 12, "kuzov", 14);
        Car car2 = new Car(12, "Merc", 1991, "blue", 124, 11, "kuzov11", 12);
        List<Car> cars = Arrays.asList(car1, car2);

        CarList car__ = new CarList();
        System.out.println("Список Машин марки мэрс:");
        List<Car> resultList1 = car__.getBrandCar(cars, "Merc");
        for(Car a: resultList1)
            System.out.println(a.toString());
    }

}