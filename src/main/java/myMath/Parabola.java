package myMath;

public class Parabola implements MathFunction {
    double a = 1, b = 0, c = 0;

    public Parabola() {
    }

    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calc(double x) {
        return a * (x + b) * (x + b) + c;
    }
}
