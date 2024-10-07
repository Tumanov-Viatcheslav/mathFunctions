package myMath;

public class LineFunction implements MathFunction {
    double k = 1, c = 0;

    public LineFunction() {
    }

    public LineFunction(double k, double c) {
        this.k = k;
        this.c = c;
    }

    @Override
    public double calc(double x) {
        return k * x + c;
    }
}
