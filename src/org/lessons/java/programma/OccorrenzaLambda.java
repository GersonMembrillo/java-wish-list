package org.lessons.java.programma;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OccorrenzaLambda {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = sc.nextLine();

        Map<Character, Long> occorrenze = parola.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Conteggio delle occorrenze:");

        occorrenze.forEach((carattere, conteggio) -> {
            System.out.println(carattere + ": " + conteggio);
            
            sc.close();
        });
    }
}

