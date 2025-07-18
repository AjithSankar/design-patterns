package behavioral.template;

public class Main {

    public static void main(String[] args) {

        ReportGenerator reportGenerator = new PdfReportGenerator();
        reportGenerator.generate();

        reportGenerator = new ExcelReportGenerator();
        reportGenerator.generate();

    }
}
