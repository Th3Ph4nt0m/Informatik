/*
 * Copyright (c) 2020 Henrik Steffens aka Th3Ph4nt0m
 *
 * Simulation.java is part of the Informatik
 * Last edit: 2020.6.1
 */

package de.th3ph4nt0m.info.kw22;

@SuppressWarnings ({"SpellCheckingInspection", "unused"}) public class Simulation
{

    private final int[] results;
    private int rounds;

    public Simulation(int rounds)
    {
        results = new int[rounds];
        this.rounds = rounds;
    }

    public void simulate(){
        for(int i = 0; i<rounds; i++){
            results[i] = (int) (Math.random()*6+1);
        }
    }

    public void printResults(){
        for(int i = 0; i<rounds; i++){
            System.out.println("Wurf " + i + ": " + results[i]);
        }
    }
}
