package com.xitrust.cocktails;

import java.util.ArrayList;
import java.util.List;

public class MixedDrink implements IMixedDrink {

    protected List<IDrink> mixedDrinks;

    public MixedDrink() {
        this.mixedDrinks = new ArrayList<>();
    }

    @Override
    public String getName() {
        String temp = "";

        for (IDrink currentDrink : mixedDrinks)
            temp += currentDrink.getName() + "-";

        temp = temp.substring(0, temp.length() - 1);
        return temp;
    }

    @Override
    public double getVolume() {
        double calculation = 0.0d;

        for(IDrink drink : mixedDrinks)
            calculation += drink.getVolume();

        return calculation;
    }

    @Override
    public double getAlcoholicVolume() {
        double alcoholicContent = 0.0d;
        double tempAlcoholicContent = 0.0d;

        for(IDrink drink : mixedDrinks)
        {
            if (Double.compare(drink.getAlcoholicVolume(), 0.0d) > 0)
            {
                tempAlcoholicContent = calculateAlcoholPercentage(drink.getVolume() ,drink.getAlcoholicVolume());
                alcoholicContent += tempAlcoholicContent;
            }
        }

        return alcoholicContent;
    }

    public double calculateAlcoholPercentage(double volume, double alcoholicVolume) {
        double percentage = (alcoholicVolume / 100) * volume;
        return percentage;
    }

    @Override
    public void addDrink(IDrink part) {
        mixedDrinks.add(part);
    }

    @Override
    public String toString() {

        String temp = "(" + getName() + "[";

        for(IDrink currentDrink : mixedDrinks)
            temp += currentDrink.toString() + ", ";

        temp = temp.substring(0, temp.length() - 2);
        temp += "])";
        return temp;
    }

    @Override
    public int compareTo(IDrink that) {
        return Double.compare(this.getAlcoholicVolume(), that.getAlcoholicVolume());
    }
}
