package Classes;

import Interface.DocumentInterface;

public class TextDocument implements DocumentInterface {
    private String filePath;
    private String encoding;
    private Integer wordCount;

    public TextDocument(String filePath, String encoding, Integer wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
        System.out.println("Creating a Text Document prototype.");
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + getFilePath()
                            + " with encoding: " + getEncoding() + " (" + getWordCount() + " words)");
    }

    @Override
    public String getType() {
        return "Type: Text, File: " + getFilePath()
                + ", Encoding: " + getEncoding() + ", Words: " + getWordCount() ;
    }
}
