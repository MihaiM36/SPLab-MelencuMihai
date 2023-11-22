package ro.uvt.info.splab2023.models;

public class Context {
    // Example fields that could be part of the context
    private int pageWidth;
    private int pageHeight;
    private String fontFamily;
    private int fontSize;
    private String outputPath;

    // Constructor
    public Context(int pageWidth, int pageHeight, String fontFamily, int fontSize, String outputPath) {
        this.pageWidth = pageWidth;
        this.pageHeight = pageHeight;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.outputPath = outputPath;
    }

    public Context() {

    }

    // Getters and setters for each field
    public int getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(int pageWidth) {
        this.pageWidth = pageWidth;
    }

    public int getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(int pageHeight) {
        this.pageHeight = pageHeight;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

}
