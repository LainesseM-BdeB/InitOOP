package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    protected List<Article> catalogue;

    public Catalogue() {
        catalogue = new ArrayList<>();
    }

    public void addArticle(Article article) {
        catalogue.add(article);
    }

    public void removeArticle(String code) {
        catalogue.removeIf(art -> art.code.equals(code));
    }

    public void printCatalogue() {
        int i = 0;
        System.out.printf("Voici le catalogue complet(%d articles):\n", catalogue.size());
        for (Article art: catalogue) {
            System.out.println("--------------------------------------------------");
            System.out.printf("Article #%d\n", ++i);
            System.out.println(art.getClass().getSimpleName());
            art.printInfo();
        }
        System.out.println("--------------------------------------------------");
    }

    public Article getItem(int index) {
        return catalogue.get(index);
    }

}
