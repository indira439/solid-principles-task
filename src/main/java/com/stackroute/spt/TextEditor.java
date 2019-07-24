package com.stackroute.spt;

public class TextEditor {
    private String text;
    private String author;
    private int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    void allLettersToUpperCase() {
        System.out.println(text.toUpperCase());
    }

    void findSubTextAndDelete() {
        String string = text;
        String subText = string.substring(8);
        string = string.replace(subText, "");
        System.out.println(string);

    }

    void printText() {
        System.out.println("End....");
    }
}
