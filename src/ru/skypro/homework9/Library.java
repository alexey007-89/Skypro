package ru.skypro.homework9;

public class Library {
    int size;
    private Book[] books;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book newBook) {
        boolean isFilled = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                isFilled = false;
                books[i] = newBook;
                return;
            }
        }
        if (isFilled) System.out.println("Can't add book, catalog is full");
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
