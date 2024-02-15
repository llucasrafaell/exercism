public class SalaryCalculator {

    private final static double BASE_SALARY = 1000.00;
    private final static double MAX_SALARY = 2000.00;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped > 4 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (BASE_SALARY + bonusForProductsSold(productsSold)) * salaryMultiplier(daysSkipped);
        return salary >= MAX_SALARY ? MAX_SALARY : salary;  
    } 
}
