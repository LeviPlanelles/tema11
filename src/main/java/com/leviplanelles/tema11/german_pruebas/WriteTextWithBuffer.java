package com.leviplanelles.tema11.german_pruebas;

import java.io.*;

public class WriteTextWithBuffer {
    private static final String FILE_PATH = "F:\\PROGRAMACIONN\\U11\\tema11\\ficheros\\adios.txt";
    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Tienes que indicar la ruta del archivo.");
            System.exit(-1);
            //throw new RuntimeException("Tienes que indicar la ruta del archivo.");
        }
        String texto = args[0];
        File file = new File(FILE_PATH);

        try (FileWriter fw = new FileWriter(file,file.exists());
             BufferedWriter bw = new BufferedWriter(fw);
        ){
            bw.write(texto);
        } catch (IOException e) {
            System.out.println("El archivo no existe");
            System.exit(-1);
        }
    }
}
