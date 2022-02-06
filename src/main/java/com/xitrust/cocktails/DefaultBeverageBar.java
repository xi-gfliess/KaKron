package com.xitrust.cocktails;

public class DefaultBeverageBar implements IBeverageBar {
    @Override
    public IDrink getWater(double volumen) {
        IDrink water = new Drink("Water", volumen, 0);
        return water;
    }

    @Override
    public IDrink getBeer(double volumen) {
        IDrink beer = new Drink("Beer", volumen, 2);
        return beer;
    }

    @Override
    public IDrink getCola(double volumen) {
        IDrink cola = new Drink("Cola", volumen, 0);
        return cola;
    }

    @Override
    public IDrink getGin(double volumen) {
        IDrink gin;
        if(volumen <= 100)
            gin = new Drink("Gin", volumen, 42);
        else
            gin = new Drink("Gin", volumen, 52.5);

        return gin;
    }

    @Override
    public IDrink getTonic(double volumen) {
        IDrink tonic = new Drink("Tonic", volumen, 0);
        return tonic;
    }

    @Override
    public IDrink getRum(double volumen) {
        IDrink rum = new Drink("Rum", volumen, 38);
        return rum;
    }
}
