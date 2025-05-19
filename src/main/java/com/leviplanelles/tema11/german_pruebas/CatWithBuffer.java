package com.leviplanelles.tema11.german_pruebas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CatWithBuffer {
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Tienes que indicar la ruta del archivo.");
            System.exit(-1);
            //throw new RuntimeException("Tienes que indicar la ruta del archivo.");
        }

        String rutaArchivo = args[0];
        File file = new File(rutaArchivo);

        try (
                FileReader fl = new FileReader(file);
                BufferedReader br = new BufferedReader(fl);
                ){
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }
    }
}
