package car.evidence;

import car.evidence.v01.Brand;
import car.evidence.v01.Car;
import car.evidence.v01.HondaModel;
import car.evidence.v01.MercedesModel;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = Brand.Mercedes;
        c.model = MercedesModel.A;
        c.model = HondaModel.Accord;
    }
}
