public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 88;  // Кг
        double height = 1.79;   // метр
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}