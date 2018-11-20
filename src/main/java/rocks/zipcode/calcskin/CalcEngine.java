package rocks.zipcode.calcskin;

public class CalcEngine {

    CalcEngine() {
    }

    public double add(double v, double v1) {

        double sum = v + v1;
        return sum;
    }

    public double subtract(double v, double v1) {

        double result = v - v1;
        return result;
    }

    public double multiply(double v, double v1) {

        double result = v * v1;
        return result;
    }

    public double divide(double v, double v1) {
        double result = v / v1;
        return result;
    }
}
