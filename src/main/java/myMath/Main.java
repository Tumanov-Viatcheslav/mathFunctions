package myMath;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/main/resources/output.xlsx";
        PointsWriter.writePointListToExel(PointsFabricator.generatePoints(-10, 10, 100, new Sinus()), fileName);
    }
}