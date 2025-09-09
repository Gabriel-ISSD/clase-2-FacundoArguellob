package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Variables y Tipos de Datos Primitivos

        // Numeros enteros (int, byte, short, long)
        byte age = 18; // 1 byte 
        short shortNumber = 18; // 2 byte 
        int bigNumber = 10000; // 4 bytes
        long longNumber = 1000000000; // 8 bytes

        System.out.println(age);
        System.out.println(shortNumber);
        System.out.println(bigNumber);
        System.out.println(longNumber);

        // Decimales (float, double)
        float floatNumber = 15.5f;
        double doubleNumber = 17.965f;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // Boolean (true, false)
        boolean isActive = true;
        boolean isOff = false;

        // Caracter (char)
        char course = 'H';
        System.out.println(course);
        
        // Strings (inmutable)
        // String text0 = new String("Hola mundo!"); // forma larga
        String text1 = "Hola mundo!";
        
        int cantCaracteres = text1.length();
        System.out.println(cantCaracteres);
        
        String replaceText = text1.replace("Hola", "Chao");
        System.out.println(replaceText);

        System.out.println(replaceText.endsWith("undo!"));
        System.out.println(replaceText.startsWith("C"));
        System.out.println(replaceText.contains("H"));
        System.out.println(replaceText.indexOf("!"));
        System.out.println(replaceText.toUpperCase());
        System.out.println(replaceText.toLowerCase());
        
        String malo = "    chanchito feliz   ";
        System.out.println(malo);
        System.out.println(malo.trim());
        
    }
}