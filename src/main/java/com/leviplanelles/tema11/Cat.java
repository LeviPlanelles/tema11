package com.leviplanelles.tema11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cat {
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Tienes que indicar la ruta del archivo.");
            System.exit(-1);
            //throw new RuntimeException("Tienes que indicar la ruta del archivo.");
        }

        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);

        try (FileReader fl = new FileReader(file)){
            StringBuilder sb = new StringBuilder();
            char [] texto = new char[1024];
            int caracter;
            int cantidad;
            while ((cantidad = fl.read(texto)) >= 0) {
                for (int i = 0; i < cantidad; i++) {
                    System.out.print(texto[i]);
                }
            }


            /*while ((caracter = fl.read()) != -1) {
                sb.append((char)caracter);
            }*/
            System.out.println(sb);
        } catch (IOException e) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }
    }
}
