import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class CarList {

    public CarList(){}
    public List<Car> getBrandCar(List<Car> cars, String brand){
        List<Car> result = new ArrayList<>();
        for(Car car: cars)
        {
           if(car.getBrand().equals(brand))
               result.add(car);
        }
        return result;
    }
    public List<Car> getYearPrice(List<Car> cars, int year, int price)
    {
        List<Car> result = new ArrayList<Car>();
        for(Car car: cars)
        {
            if((car.getYear() == year) && (car.getCost() > price))
                result.add(car);
        }
        return result;
    }

    public List <Car> ModelGreaterNYears(List<Car> cars, String brand, int n){
        List<Car> result = new ArrayList();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (Car car: cars) {
            if ((car.getBrand().equals(brand)) && ((currentYear - car.getYear()) > n))
                result.add(car);
        }
        return result;
    }
}

