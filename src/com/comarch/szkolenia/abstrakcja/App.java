package com.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        SimpleInterface simpleInterface = new KlasaZUmowy();
        simpleInterface.cos();

        simpleInterface.calculate(4, 5.5);

        simpleInterface.saveData("jakies dane");

        PoloaczenieDoBazy poloaczenieDoBazy = new MongoDBConnector();
        poloaczenieDoBazy.connect();
        poloaczenieDoBazy.modifyEntity();
        poloaczenieDoBazy.deleteData();

        Algorytm algorytm = new AlgorytmPliki();
        algorytm.policz();


    }
}
