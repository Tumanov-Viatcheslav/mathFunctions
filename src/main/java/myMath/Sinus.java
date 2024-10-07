package myMath;

public class Sinus implements MathFunction {
    double A = 1, k = 1, w = 0;

    public Sinus() {
    }

    public Sinus(double a, double k, double w) {
        A = a;
        this.k = k;
        this.w = w;
    }

    @Override
    public double calc(double x) {
        return A * Math.sin(k * x + w);
    }
}
