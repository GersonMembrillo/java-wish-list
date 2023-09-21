package org.lessons.java.elenco;

import java.util.ArrayList;
import java.util.Scanner;

public class ElencoNumeri {
    private ArrayList<Integer> numeri;
    private int indice;

    public ElencoNumeri() {
        numeri = new ArrayList<>();
        indice = 0;
    }

    public ElencoNumeri(int[] numeriIniziali) {
        numeri = new ArrayList<>();
        for (int numero : numeriIniziali) {
            numeri.add(numero);
        }
        indice = 0;
    }

    public int getElementoSuccessivo() {
        if (indice < numeri.size()) {
            int elemento = numeri.get(indice);
            indice++;
            return elemento;
        } else {
            throw new IllegalStateException("Nessun altro elemento disponibile.");
        }
    }

    public boolean hasAncoraElementi() {
        return indice < numeri.size();
    }

    public void addElemento(int numero) {
        numeri.add(numero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElencoNumeri elenco = new ElencoNumeri();

        while (true) {
            System.out.print("Inserisci un numero (oppure scrivi 'fine' per terminare): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("fine")) {
                break;
            }

            try {
                int numero = Integer.parseInt(input);
                elenco.numeri.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero valido o 'fine' per terminare.");
            }
        }

        while (elenco.hasAncoraElementi()) {
            System.out.println("· " + elenco.getElementoSuccessivo());
            
            sc.close();
        }
    }
}
