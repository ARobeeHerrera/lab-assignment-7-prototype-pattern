package Classes;

import Interface.DocumentInterface;

public class SpreadSheetDocument implements DocumentInterface {
    private String spreadSheetName;
    private Integer row;
    private Integer columnCount;

    public SpreadSheetDocument (String spreadSheetName, Integer row, Integer columnCount) {
        this.spreadSheetName = spreadSheetName;
        this.row = row;
        this.columnCount = columnCount;
        System.out.println("Creating a Spreadsheet Document prototype.");
    }


    public void setSpreadSheetName(String spreadSheetName) {
        this.spreadSheetName = spreadSheetName;
    }

    public String getSpreadSheetName() {
        return spreadSheetName;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public Integer getColumnCount() {
        return columnCount;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getRow() {
        return row;
    }

    @Override
    public SpreadSheetDocument clone() {
        try {
            return (SpreadSheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + getSpreadSheetName()
                + " (" + getRow() + " rows, " + getColumnCount() + " columns");
    }

    @Override
    public String getType() {
        return "Type: Spreadsheet, File: " + getSpreadSheetName()
                + ", Rows: " + getRow() + ", Columns: " + getColumnCount() ;
    }
}
