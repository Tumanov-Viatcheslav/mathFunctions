package myMath;

import java.util.ArrayList;
import java.util.List;

public class PointsFabricator {

    public static List<Point> generatePoints(double xMin, double xMax, int numberOfPoints, MathFunction func) {
        List<Point> pointList = new ArrayList<>();
        if (numberOfPoints == 0)
            return pointList;
        double step = (xMax - xMin) / (numberOfPoints - 1);

        for (int i = 0; i <= numberOfPoints; i++) {
            pointList.add(new Point(xMin + i * step, func.calc(xMin + i * step)));
        }

        return pointList;
    }
}
