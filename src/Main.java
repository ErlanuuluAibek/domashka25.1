import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 2343);
        Car car2 = new Car(2, 9750);
        Car car3 = new Car(3, 5995);

        CarData carData = new CarData(2006, "Camry 3.5", 3179000, "black");
        CarData carData1 = new CarData(1999, "BMW", 2000000, "White");
        CarData carData2 = new CarData(2002, "Mersedes", 1200000, "Black");
        Map<Car, CarData> carCarDataHashMap = new HashMap<>();
        carCarDataHashMap.put(car, carData);
        carCarDataHashMap.put(car2, carData1);
        carCarDataHashMap.put(car3, carData2);
        for (Map.Entry<Car,CarData> a : carCarDataHashMap.entrySet()) {
            System.out.println(a.getKey()+" : "+a.getValue());
        }
    }
}