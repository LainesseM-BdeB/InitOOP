package com.company;

public class Livre extends Article{
    protected String titre;
    protected String auteur;
    protected String publication;
    protected int nbPage;

    public Livre(String titre, String auteur, String publication, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.publication = publication;
        this.nbPage = nbPages;
        super.setCode(genCode());
        super.setAvailable(true);
    }

    private String genCode() {
        return this.auteur.substring(0, 2).toUpperCase().replace(" ", "#") +
                "-" +
                this.titre.substring(0, 4).toUpperCase().replace(" ", "#") +
                "-" +
                this.publication.substring(0, 4).toUpperCase().replace(" ", "#") +
                "-" +
                this.nbPage +
                "-" +
                nbArticle;
    }

    public void printInfo() {
        super.printInfo();
        String info = "Titre: " + this.titre + "\n" +
                "Auteur: " + this.auteur + "\n" +
                "Publication: " + this.publication + "\n" +
                "Nombre de pages: " + this.nbPage + "\n" +
                "Disponible: " + this.available + "\n" +
                "Code: " + this.code;
        System.out.println(info);
    }

}
