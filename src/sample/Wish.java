package sample;

public class Wish {
    public String[]wishes={"Sto lat, ","Wszystkiego najlepszego, ","Zdrowia i szczęścia, ", "Najlepsze życzenia, ", "Wielu sukcesów, ", "Żyj długo i szczęśliwie, "};
     Wish(){}
    public String toWish(String name)
    {
        String finalWish=null;
        if (name!=null)
        {
            int border=wishes.length-1; // jaki jest najwyższy index tej tablicy? Ilość elementów w tablicy (tablica.length) – 1
            int number=(int)Math.round(Math.random()*border); // wylosuj liczbę z zakresu [0,zakres]
            finalWish=wishes[number];
        }

        return finalWish;
    }
}
