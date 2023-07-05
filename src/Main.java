public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 98;
        double bmi1 = service.calculate(height, weight);
        int bmi = (int) bmi1;
        System.out.println(bmi);

    }
}
