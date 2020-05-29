package de.th3ph4nt0m.info.kw22;

public class Simulation
{

    private int[] ergebnisse;

    public Simulation()
    {
        ergebnisse = new int[5];
    }

    public void simulieren(){
        for(int i = 0; i<5; i++){
            ergebnisse[i] = (int) (Math.random()*6+1);
        }
    }
}
