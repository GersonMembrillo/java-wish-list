package org.lessons.java.programma;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occorrenza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = sc.nextLine();

        // mappa per memorizzare conteggio occorrenze
        Map<Character, Integer> occorrenze = new HashMap<>();

        for (char carattere : parola.toCharArray()) {
        	
            // conteggio aggiornato
            occorrenze.put(carattere, occorrenze.getOrDefault(carattere, 0) + 1);
        }

        // stampa conteggio
        System.out.println("Conteggio delle occorrenze:");

        for (Map.Entry<Character, Integer> entry : occorrenze.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
            sc.close();
        }
    }
}
