package com.company.lesson1;

public class Main {

    public static void main(String[] args) {

        Roupa camisaTop = new Roupa();

        camisaTop.descricao = "camisa";
        camisaTop.cor       = "preta";
        camisaTop.modelo    = "G";
        camisaTop.colecao   = "slim";

        System.out.println(camisaTop.descricao);
        System.out.println(camisaTop.cor);
        System.out.println(camisaTop.modelo);
        System.out.println(camisaTop.colecao);

        Sapato tenis = new Sapato();

        tenis.tamanho = 41;
        tenis.cor = "preta";
        tenis.modelo = "corrida";
        tenis.marca = "Adidas";

        System.out.println(tenis.tamanho);
        System.out.println(tenis.cor);
        System.out.println(tenis.modelo);
        System.out.println(tenis.marca);

    }

}
