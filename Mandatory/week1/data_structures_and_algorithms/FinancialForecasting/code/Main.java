public class Main {

    public static void main(String[] args) {

        double initialValue = 10000;
        double growthRate = 0.10; //10%
        int years = 5;

        double result = FinancialForecast.futureValue(initialValue, growthRate, years);

        System.out.println("Initial Value : " + initialValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years          : " + years);
        System.out.printf("Future Value   : %.2f\n", result);
    }
}