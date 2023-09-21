package org.lessons.java.wishlist;

public class Regalo {
    private String nome;
    private String descrizione;
    private String destinatario;

    public Regalo(String nome, String descrizione, String destinatario) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.destinatario = destinatario;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
