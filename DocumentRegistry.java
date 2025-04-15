import Classes.PdfDocument;
import Classes.SpreadSheetDocument;
import Classes.TextDocument;

public class DocumentRegistry {
    private PdfDocument pdfDocumentPrototype = new PdfDocument("Default Filename", "Default Author", 0);
    private TextDocument textDocumentPrototype = new TextDocument("Default FilePath", "Default Encoding", 0);
    private SpreadSheetDocument spreadSheetDocumentPrototype = new SpreadSheetDocument("Default Sheetname", 0, 0);


    public PdfDocument createPDF(String fileName, String author, Integer pageCount){
        PdfDocument pdf = pdfDocumentPrototype.clone();
        pdf.setFileName(fileName);
        pdf.setAuthor(author);
        pdf.setPageCount(pageCount);
        return pdf;
    }

    public TextDocument createTextDocument(String filePath, String encoding, Integer wordCount) {
        TextDocument text = textDocumentPrototype.clone();
        text.setFilePath(filePath);
        text.setEncoding(encoding);
        text.setWordCount(wordCount);
        return text;
    }

    public SpreadSheetDocument createSpreadSheetDocument(String spreadSheetName, Integer row, Integer column) {
        SpreadSheetDocument sheetDocument = spreadSheetDocumentPrototype.clone();
        sheetDocument.setSpreadSheetName(spreadSheetName);
        sheetDocument.setRow(row);
        sheetDocument.setColumnCount(column);
        return  sheetDocument;
    }
}
