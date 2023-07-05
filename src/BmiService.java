public class BmiService {

    public double calculate(double height_meters, int weight_kg) {
        return weight_kg/(height_meters*height_meters);
    }
}
