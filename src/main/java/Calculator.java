public class Calculator {

    private int num1;
    private int num2;

    public Calculator(int numberPassedIn1, int numberPassedIn2){
        this.num1 = numberPassedIn1;
        this.num2 = numberPassedIn2;
    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        return num1 / num2;
    }
}
