public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.67;
        double weight = 54;
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}