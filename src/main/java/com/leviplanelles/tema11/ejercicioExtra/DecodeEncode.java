package com.leviplanelles.tema11.ejercicioExtra;

import java.util.HashMap;
import java.util.Map;

public class DecodeEncode {
    Map<Character,String> letraMorse = new HashMap<>();

    private void rellenarMap() {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int contador = 0;
        for (int i = 97; i <= 122; i++) {
            letraMorse.put((char)i, morse[contador++]);
        }
        letraMorse.put(',', "--..--");
        letraMorse.put('.', ".-.-.-");
        letraMorse.put(' '," ");
    }
    public String encode(char letra) {
        return letraMorse.get(letra);
    }
}
