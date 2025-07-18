package behavioral.template;

public abstract class ReportGenerator {

    // Template Method
    public final void generate() {
        collectData();
        formatData();
        exportData();
    }

    abstract void collectData();
    abstract void formatData();
    abstract void exportData();

}
