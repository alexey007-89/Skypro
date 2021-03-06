package ru.skypro.basic.homework9;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishedYear;

    public Book(String name, Author author, int publishedYear) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        if (publishedYear < 1950 || publishedYear > 2050) {
            System.out.println("Invalid publishing year parameter: " + publishedYear);
            return;
        }
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book: " + name + " by " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishedYear);
    }
}
