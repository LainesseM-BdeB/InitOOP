package com.company;

public class Magasine extends Livre{

    protected int nbParution;

    public Magasine(String titre, String auteur, String publication, int nbPages, int nbParution) {
        super(titre, auteur, publication, nbPages);
        this.nbParution = nbParution;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Parution: #" + this.nbParution);
    }
}
