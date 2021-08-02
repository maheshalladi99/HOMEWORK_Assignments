package com.test;

public class WhiteSpace {

    public static void main(String[] args) {
        String sentence = "this is white space example       ";
        System.out.println("Original sentence: " + sentence+"  count length: "+sentence.length());

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence+"  count length: "+sentence.length());
    }
}