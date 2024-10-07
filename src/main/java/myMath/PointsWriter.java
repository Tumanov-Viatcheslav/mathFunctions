package myMath;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

public class PointsWriter {

    public static void writePointListToExel(List<Point> pointList, String fileName) {
        Workbook exelBook;
        exelBook = new XSSFWorkbook();
        Sheet sheet = exelBook.createSheet("points");
        for (int i = 0; i < pointList.size(); i++) {
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(pointList.get(i).getX());
            row.createCell(1).setCellValue(pointList.get(i).getY());
        }
        try (FileOutputStream output = new FileOutputStream(fileName)) {
            exelBook.write(output);
        }
        catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
