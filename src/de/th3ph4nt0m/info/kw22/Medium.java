/*
 * Copyright (c) 2020 Henrik Steffens aka Th3Ph4nt0m
 *
 * Medium.java is part of the Informatik
 * Last edit: 2020.6.1
 */

package de.th3ph4nt0m.info.kw22;

public class Medium
{
    private final int publish;
    private String author;

    public Medium(int publish, String author){
        this.publish = publish;
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPublish()
    {
        return publish;
    }

    protected void setAuthor(String author)
    {
        this.author = author;
    }
}
