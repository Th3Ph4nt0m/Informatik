/*
 * Copyright (c) 2020 Henrik Steffens aka Th3Ph4nt0m
 *
 * Book.java is part of the Informatik
 * Last edit: 2020.6.1
 */

package de.th3ph4nt0m.info.kw22;

@SuppressWarnings ({"unused", "InfiniteRecursion"}) public class Book extends Medium
{
    private final int page;

    /**
     *
     * @param publish publishing year -> Medium
     * @param author author -> Medium
     * @param page number of pages
     */
    public Book(int publish, String author, int page)
    {
        //access the constructor of Medium.java
        super(publish, author);
        //initialize attribute page with parameter page
        this.page = page;
    }

    //setter-method for author, unnecessary because it's similar to super#setAuthor

    /**
     *
     * @param author author
     * @throws RuntimeException infinite recursion
     */
    public void setAuthor(String author){
        setAuthor(author);
    }

    //generates a String to describe the book with all given information
    public String toString(){
        return "The book by " + getAuthor() + " published " + getPublish() + " with " + page + " pages.";
    }
}
