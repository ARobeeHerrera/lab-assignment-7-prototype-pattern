package Classes;

import Interface.DocumentInterface;

public class PdfDocument implements DocumentInterface {
    private String fileName;
    private String author;
    private Integer pageCount;
    private String name;

    public PdfDocument(String fileName, String author, Integer pageCount ) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        System.out.println("Creating a PDF Document prototype.");
    }

    public PdfDocument() {

    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    @Override
    public PdfDocument clone() {
        try{
            return (PdfDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + getFileName()
        + " by " + getAuthor() + " (" + getPageCount() + " pages)");
    }

    @Override
    public String getType() {
        return "Type: PDF, File: " + getFileName()
                + ", Author: " + getAuthor() + ", Pages: " + getPageCount() ;
    }
}
