/*
 * Copyright (c) 2020 Henrik Steffens aka Th3Ph4nt0m
 *
 * Book.java is part of the Informatik
 * Last edit: 2020.6.1
 */

package de.th3ph4nt0m.info.kw22;

@SuppressWarnings ({"unused", "SpellCheckingInspection", "InfiniteRecursion"})
public class Book extends Medium
{
    private final int page;

    public Book(int publish, String author, int page)
    {
        super(publish, author);
        this.page = page;
    }

    public void setAuthor(String author){
        setAuthor(author);
    }

    public String toString(){
        return "Das Buch von " + getAuthor() + " erschien " + getPublish() + " mit " + page + " Seiten.";
    }
}
