package com.xitrust.cocktails;

import java.util.Formatter;
import java.util.Locale;

public class Drink extends AbstractDrink {

    public Drink(String name, double volumen, double alcoholInPercent) {
        super(name, volumen, alcoholInPercent);
    }

    public Drink(String name, double volumen) {
        super(name, volumen);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getAlcoholicVolume() {
        return alcoholicContentInPercent;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter(new StringBuilder(), Locale.GERMAN);
        return formatter.format("(%s %.1f%% %.2f)", name, alcoholicContentInPercent, volume).toString();
    }

    @Override
    public int compareTo(IDrink that) {
        return Double.compare(this.getAlcoholicVolume(), that.getAlcoholicVolume());
    }
}
