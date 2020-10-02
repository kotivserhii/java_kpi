import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Car car1 = new Car(11, "Merc", 2000, "yellow", 154,  "kuzov", 14);
        Car car2 = new Car(12, "Merc", 1950, "blue", 124,  "kuzov11", 12);
        Car car3 = new Car(13, "BMW", 1991, "green", 120, "kuzov12", 11);
        Car car4 = new Car(14, "Toyota", 1991, "blue", 130,  "kuzov11", 10);

     //   System.out.println(car3.getBrand());

        List <Car> cars = Arrays.asList(car1, car2, car3, car4);

        CarList carList = new CarList();
        List <Car> resultBrand = carList.getBrandCar(cars, "Merc");
        for (Car car: resultBrand){
        //    System.out.println(car.toString());
        }

        List <Car> resultModelYear = carList.ModelGreaterNYears(cars, "Merc", 40);
        for (Car car: resultModelYear){
          //  System.out.println(car.toString());
        }

        List <Car> resultYearPrice = carList.getYearPrice(cars, 1991, 105);
        for (Car car: resultYearPrice) {
            System.out.println(car.toString());
        }


        }

}

