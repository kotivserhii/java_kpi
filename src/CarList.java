import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class CarList {
    public List <Car> getBrand(List<Car> cars, String brand) {
        List<Car> result = new ArrayList();
        for (Car car: cars) {
            if (car.getBrand().equals(brand))
                result.add(car);
        }
        return result;
    }
        public List <Car> getBrand(List<Car> cars, int n){
            List<Car> result = new ArrayList();
            for (Car car: cars) {
                if (car.getAge() > n)
                    result.add(car);
            }
            return result;
        }
    public List<Car> getYearPrice(List<Car> cars, int year, int price)
    {
        List<Car> result = new ArrayList();
        for(Car car: cars)
        {
            if((car.getYear() == year) && (car.getCost() > price))
                result.add(car);
        }
        return result;
    }
}

