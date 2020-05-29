package de.th3ph4nt0m.info.kw22;

@SuppressWarnings ({"unused", "SpellCheckingInspection", "InfiniteRecursion"})
public class Buch extends Medium
{
    private int seitenzahl;

    public Buch(int erscheinungsjahr, String urheber, int seitenzahl)
    {
        super(erscheinungsjahr, urheber);
        this.seitenzahl = seitenzahl;
    }

    public void setUrheber(String urheber){
        setUrheber(urheber);
    }

    public String toString(){
        return "Das Buch von " + getUrheber() + " erschien " + getErscheinungsjahr() + " mit " + seitenzahl + " Seiten.";
    }
}
