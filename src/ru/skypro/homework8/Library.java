package ru.skypro.homework8;

public class Library {
    private Book[] catalog;

    public Library(Book[] catalog) {
        this.catalog = catalog;
    }

    public void addBook(Book newBook) {
        boolean isFilled = true;
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] == null) {
                isFilled = false;
                catalog[i] = newBook;
                return;
            }
        }
        if (isFilled) System.out.println("Can't add book, catalog is full");
    }

    public void printAll() {
        for (Book book : catalog) {
            if (book != null) {
                System.out.println(book.getAuthor().getAuthorName() + " "
                        + book.getAuthor().getAuthorSurname() + ": " + book.getName() + ": " + book.getPublishingYear());
            }
        }
    }

    public void printAllInfoByName(String bookName) {
        Book book = findBookByName(bookName, catalog);
        if (book == null) {
            System.out.println("Книга отсутствует в бибилиотеке");
        } else {
            System.out.println(book.getName() + " - книга, котрую написал " + book.getAuthor().getAuthorName() + " "
                    + book.getAuthor().getAuthorSurname() + ", была опубликована в " + book.getPublishingYear());
        }
    }

    private Book findBookByName(String bookName, Book[] catalog) {
        Book book = null;
        for (Book value : catalog) {
            if (value != null && value.getName().equals(bookName)) {
                book = value;
                break;
            }
        }
        return book;
    }

    public void changeYearPublicationByName(String bookName, int publishingYear) {
        Book book = findBookByName(bookName, catalog);
        if (book == null) {
            System.out.println("Книга отсутствует в бибилиотеке");
        } else {
            book.setPublishingYear(publishingYear);
        }
    }
}
