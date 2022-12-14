package org.example.functional.Strip;

public class TrimVsStrip {
    public static void main(String[] args){
        String str = '\u2001' + "Hello" + '\u2001';
        System.out.println(str.trim().equals("Hello"));
        System.out.println(str.strip().equals("Hello"));
    }
}
