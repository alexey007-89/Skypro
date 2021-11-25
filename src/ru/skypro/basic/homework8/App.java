package ru.skypro.basic.homework8;

public class App {
    public static void main(String[] args) {
        Author lTolstoy = new Author("Лев", "Толстой");
        Author aPushkin = new Author("Александр", "Пушкин");
        Book voinaIMir = new Book("Война и мир", lTolstoy, 2018);
        Book kapDochka = new Book("Капитанская дочка", aPushkin, 1960);
        kapDochka.setPublishingYear(2014);

        // средний уровень

        Book[] catalog = new Book[7];
        addBook(catalog, voinaIMir);
        addBook(catalog, kapDochka);
        Book eOnegin = new Book("Евгений Онегин", aPushkin, 2015);
        addBook(catalog, eOnegin);

        printAll(catalog);

        System.out.println("*******************************");
        System.out.println("*******************************");

        // сложный уровень

        Library library = new Library(catalog);
        for (int i = 0; i < 3; i++) {
            library.addBook(eOnegin);
        }
        library.printAll();
        library.printAllInfoByName("Евгений Онегин");
        library.changeYearPublicationByName("Евгений Онегин", 2018);
        System.out.println();
        library.printAll();

    }

    public static void addBook(Book[] catalog, Book newBook) {
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] == null) {
                catalog[i] = newBook;
                return;
            }
        }
        System.out.println("Can't add book, catalog is full");
    }

    public static void printAll(Book[] catalog) {
        for (Book book : catalog) {
            if (book != null) {
                System.out.println(book.getAuthor().getAuthorName() + " "
                        + book.getAuthor().getAuthorSurname() + ": " + book.getName() + ": " + book.getPublishingYear());
            }
        }
    }

}
