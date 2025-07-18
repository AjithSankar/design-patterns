package behavioral.template;

public class ExcelReportGenerator extends ReportGenerator {

    @Override
    void collectData() {
        System.out.println("Collecting Data for Excel report");
    }

    @Override
    void formatData() {
        System.out.println("Formatting Data for Excel report");
    }

    @Override
    void exportData() {
        System.out.println("Exporting Data with Excel format");

    }

}
