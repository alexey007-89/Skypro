package ru.skypro.homework9;

public class Library {
    private final Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
        System.out.println("Can't add book, catalog is full");
    }

    public void printAll() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthor().getName() + " "
                        + book.getAuthor().getSurname() + ": " + book.getName() + ": " + book.getPublishedYear());
            }
        }
    }

    public void printAllInfoByName(String bookName) {
        Book book = findBookByName(bookName, books);
        if (book == null) {
            System.out.println("Книга отсутствует в бибилиотеке");
        } else {
            System.out.println(book.getName() + " - книга, котрую написал " + book.getAuthor().getName() + " "
                    + book.getAuthor().getSurname() + ", была опубликована в " + book.getPublishedYear());
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
        Book book = findBookByName(bookName, books);
        if (book == null) {
            System.out.println("Книга отсутствует в бибилиотеке");
        } else {
            book.setPublishedYear(publishingYear);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Library:\n");
        for (Book book : books) {
            stringBuilder.append(book).append("\n");
        }
        return stringBuilder.toString();

    }
}
