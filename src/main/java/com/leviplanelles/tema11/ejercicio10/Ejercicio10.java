package com.leviplanelles.tema11.ejercicio10;

import java.io.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        File f1 = new File("F:\\PROGRAMACIONN\\U11\\tema11\\ficheros\\hola.txt");
        File f2 = new File("F:\\PROGRAMACIONN\\U11\\tema11\\ficheros\\adios.txt");
    }

    public static void concat(File f1, File f2) {
        File f3 = new File("F:\\PROGRAMACIONN\\U11\\tema11\\ficheros\\fichero3.txt");
        StringBuilder sb = new StringBuilder();
        int check;
        try (FileReader fr1 = new FileReader(f1)) {
            while ((check = fr1.read()) != -1) {
                sb.append((char) check);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr2 = new FileReader(f2)) {
            while ((check = fr2.read()) != -1) {
                sb.append((char) check);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sb);
        /*
        try {
            if (f3.createNewFile()) {
                try (BufferedWriter bf = new BufferedWriter(new FileWriter(f3))) {
                    while ((check = bf.)) {

                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
