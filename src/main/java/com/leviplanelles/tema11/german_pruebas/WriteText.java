package com.leviplanelles.tema11.german_pruebas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
    private static final String FILE_PATH = "F:\\PROGRAMACIONN\\U11\\tema11\\ficheros\\adios.txt";
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Tienes que indicar la ruta del archivo.");
            System.exit(-1);
            //throw new RuntimeException("Tienes que indicar la ruta del archivo.");
        }
        String texto = args[0];
        File file = new File(FILE_PATH);

        try (FileWriter fw = new FileWriter(file)){
            fw.write(texto);
        } catch (IOException e) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }
    }
}
