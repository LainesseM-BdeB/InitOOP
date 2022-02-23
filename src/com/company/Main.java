package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Catalogue catalogue = new Catalogue();
	    catalogue.addArticle(new Livre("Java pour les nuls", "Maxime Lainesse", "Chambly Pub", 342));
        catalogue.addArticle(new Livre("Python pour les nuls", "Maxime Lainesse", "Chambly Pub", 258));
        catalogue.addArticle(new Livre("Les bazous", "Michel Barette", "MPH Pub", 442));
        catalogue.addArticle(new Magasine("Mindfulness Today", "Michèle Durette", "Chambly Pub", 78, 1));
        catalogue.addArticle(new Livre("Le petit prince", "Wu Tei", "Wu Pub", 1022));
        catalogue.addArticle(new Livre("Tchoupi à l'école", "James Boyd", "Auto Pub", 15));
        catalogue.printCatalogue();
    }
}
