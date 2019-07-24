package com.stackroute.spt;

public class main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setText("Welcome to stackRoute");
        textEditor.setAuthor("NIIT");
        textEditor.setLength(textEditor.getText().length());

        System.out.println(textEditor.getAuthor());
        System.out.println(textEditor.getText());
        textEditor.allLettersToUpperCase();
        System.out.println(textEditor.getLength());
        textEditor.findSubTextAndDelete();
        textEditor.printText();

    }
}
