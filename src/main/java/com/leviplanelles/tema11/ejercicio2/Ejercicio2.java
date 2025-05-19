package com.leviplanelles.tema11.ejercicio2;

import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args) {
        File file = new File("F:\\PROGRAMACIONN\\U11\\tema11\\ficheros");
        for (int i = 0; i < file.list().length; i++) {
            System.out.println(i + "."+file.list()[i]);
        }
    }
}
