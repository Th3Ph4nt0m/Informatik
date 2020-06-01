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
    private final int rounds;

    /**
     * @param rounds number of rounds
     */
    public Simulation(int rounds)
    {
        results = new int[rounds];
        this.rounds = rounds;
        simulate();
        printResults();
        countArray();
    }

    /**
     * start the simulation
     */
    public void simulate()
    {
        for (int i = 0; i < rounds; i++) {
            results[i] = (int) (Math.random() * 6 + 1);
        }
    }

    /**
     * print the results of the simulation
     */
    public void printResults()
    {
        for (int i = 0; i < rounds; i++) {
            System.out.println("Wurf " + i + ": " + results[i]);
        }
    }

    public void countArray()
    {
        int[] frequency = new int[results.length];
        int visited = -1;
        for (int i = 0; i < results.length; i++) {
            int count = 1;
            for (int j = i + 1; j < results.length; j++) {
                if (results[i] == results[j]) {
                    count++;
                    //To avoid counting same element again
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited) {
                frequency[i] = count;
            }
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != visited) {
                System.out.println("    " + results[i] + "    |    " + frequency[i]);
            }
        }
        System.out.println("----------------------------------------");
    }
}
