package com.leviplanelles.tema11.ejercicio7;

import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        File file = new File(args[0]);
        leerArchivoBinario(file);
    }

    public static void leerArchivoBinario(File file) {
        int check;
        try (FileInputStream fis = new FileInputStream(file)) {
            while ((check = fis.read()) != -1) {
                System.out.printf("%02X ",check);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
