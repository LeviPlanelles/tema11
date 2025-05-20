package com.leviplanelles.tema11.ejercicioExtra;

import java.io.*;

public class GestionMorse {
    private static File ficheroNormal = new File("F:\\PROGRAMACIONN\\U11\\tema11\\ficheros\\ficheroNormal.txt");

    public String leerArchivoTexto(File file) {
        StringBuilder sb = new StringBuilder();
        String check;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((check = br.readLine()) != null) {
                sb.append(check);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public File escribirArchivoTexto(String[] contenidoArchivo, File file) {
        int check;
        int i = 0;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String palabra : contenidoArchivo) {
                StringBuilder sbmorse = new StringBuilder();
                for (char c : palabra.toLowerCase().toCharArray()) {
                    char morse;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public File crearArchivoMorseAPartirDeOtroNormal(File file) {
        File ficheroMorse = new File(file.getPath()+".txt");
        String[] contenidoArchivo = leerArchivoTexto(file).split("\\s+");


    }
}
