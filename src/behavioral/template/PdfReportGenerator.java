package behavioral.template;

public class PdfReportGenerator extends ReportGenerator {

    @Override
    void collectData() {
        System.out.println("Collecting Data for PDF report");
    }

    @Override
    void formatData() {
        System.out.println("Formatting Data for PDF report");
    }

    @Override
    void exportData() {
        System.out.println("Exporting Data with PDF format");

    }
}
