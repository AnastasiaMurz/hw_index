public class BmiService {

    public double calculate(double heightMeters, int weightKg) {
        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi;
    }
}
