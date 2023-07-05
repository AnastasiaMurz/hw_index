public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height_meters = 1.87;
        int weight_kg = 98;
        double bmi1 = service.calculate(height_meters, weight_kg);
        int bmi = (int) bmi1;
        System.out.println(bmi + " - индекс массы тела");

    }
}
