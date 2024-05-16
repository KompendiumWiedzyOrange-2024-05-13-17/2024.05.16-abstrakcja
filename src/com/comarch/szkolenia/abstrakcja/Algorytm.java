package com.comarch.szkolenia.abstrakcja;

public abstract class Algorytm {

    public void policz() {
        wczytajDane();
        krok1();
        krok2();
        krok3();
        zapiszWyniki();
    }

    abstract void wczytajDane();

    void krok1() {

    }

    void krok2() {

    }

    void krok3() {

    }

    abstract void zapiszWyniki();
}
