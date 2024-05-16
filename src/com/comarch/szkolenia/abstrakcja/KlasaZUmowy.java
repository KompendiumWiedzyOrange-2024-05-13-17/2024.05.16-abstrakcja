package com.comarch.szkolenia.abstrakcja;

public class KlasaZUmowy implements SimpleInterface {
    @Override
    public int calculate(int a, double b) {
        System.out.println("Cos sie liczy !!");
        return (int) (a+b);
    }

    @Override
    public void saveData(String data) {
        System.out.println("Zapisuje jakies dane !!");
    }

    @Override
    public void cos() {
        System.out.println("cos !!");
    }
}
