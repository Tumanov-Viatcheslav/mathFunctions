package myMath;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.spi.LoggingEvent;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/main/resources/output.xlsx";
        BasicConfigurator.configure(new AppenderSkeleton() {
            @Override
            protected void append(LoggingEvent loggingEvent) {}
            @Override
            public void close() {}
            @Override
            public boolean requiresLayout() {return false;}
        });
        PointsWriter.writePointListToExel(PointsFabricator.generatePoints(-10, 10, 100, new LineFunction(3, 2)), fileName);
    }
}