import Interface.DocumentInterface;

public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        System.out.println();

        DocumentInterface pdf = registry.createPDF("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();
        System.out.println(pdf.getType() + "\n");

        DocumentInterface text = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        text.open();
        System.out.println(text.getType() + "\n");

        DocumentInterface spreadSheet = registry.createSpreadSheetDocument("sales_data_q1.xlsx", 1000, 20);
        spreadSheet.open();
        System.out.println(text.getType() + "\n");

        DocumentInterface anotherPdf = registry.createPDF("summary_report.pdf", "Acme Corp", 30);
        anotherPdf.open();
    }
}