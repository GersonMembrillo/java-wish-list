package org.lessons.java.wishlist;

import java.util.ArrayList;
import java.util.Scanner;

public class WishList {
    private ArrayList<Regalo> regali = new ArrayList<>();

    public void aggiungiRegalo(Regalo regalo) {
        regali.add(regalo);
    }

    public void stampaLista() {
        System.out.println("Lista dei regali:");
        for (int i = 0; i < regali.size(); i++) {
            Regalo regalo = regali.get(i);
            System.out.println((i + 1) + ". Nome: " + regalo.getNome());
            System.out.println("   Descrizione: " + regalo.getDescrizione());
            System.out.println("   Destinatario: " + regalo.getDestinatario());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WishList listaDesideri = new WishList();

        boolean vuoiContinuare = true;

        while (vuoiContinuare) {
            System.out.print("Inserisci il nome del regalo (o 'esci' per terminare): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("esci")) {
                vuoiContinuare = false;
            } else {
                System.out.print("Inserisci una descrizione per il regalo: ");
                String descrizione = sc.nextLine();

                System.out.print("Inserisci a chi è destinato il regalo: ");
                String destinatario = sc.nextLine();

                Regalo regalo = new Regalo(nome, descrizione, destinatario);
                listaDesideri.aggiungiRegalo(regalo);

                System.out.print("Vuoi aggiungere un altro regalo? (sì/no): ");
                String risposta = sc.nextLine();
                if (!risposta.equalsIgnoreCase("sì")) {
                    vuoiContinuare = false;
                }
            }
        }

        listaDesideri.stampaLista();
        sc.close();
    }
}
