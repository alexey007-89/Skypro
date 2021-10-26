package ru.skypro.homework6;

public class hw6 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("ФИО сотрудника — " + lastName + " " + firstName + " " + middleName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task3() {
        // так и не понял должен ли быть пробел ' ' после ';'
        // поэтому сделал 2 варианта
        String fullName = "Ivanov Ivan Ivanovich";
//         Вариант 1
        System.out.print("Данные ФИО сотрудника для административного отдела — ");
        String[] fio = fullName.split(" ");
        for (int i = 0; i < fio.length - 1; i++) {
            System.out.print(fio[i] + "; ");
        }
        System.out.println(fio[fio.length - 1]);

//         Вариант 2
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(' ', ';'));

//         Вариант 3
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replaceAll(" ", "; "));
    }

    private static void task4() {
        String fullName = "Иванов Семён Семёнович";
        System.out.print("Данные ФИО сотрудника — ");
        if (fullName.contains("ё")) {
            System.out.println(fullName.replace('ё', 'е'));
        } else {
            System.out.println(fullName);
        }
    }

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' '));
        String middleName = fullName.substring(fullName.lastIndexOf(' '), fullName.length() - 1);
        String lastName = fullName.substring(0, fullName.indexOf(' '));
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] letters = fullName.toCharArray();
        letters[0] = Character.toUpperCase(letters[0]);
        for (int i = letters.length - 1; i >= 0; i--) {
            if (letters[i] == ' ') {
                letters[i + 1] = Character.toUpperCase(letters[i + 1]);
            }
        }
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — ");
        for (char letter : letters) {
            System.out.print(letter);
        }
        System.out.println();
    }

    private static void task7() {
        String first = "135";
        String second = "246";
        StringBuilder sb = new StringBuilder(first);
        int j = 1;
        for (int i = 0; i < second.length(); i++) {
            sb.insert(j, second.charAt(i));
            j += 2;
        }
        System.out.println("Данные строки — " + sb);
    }

    private static void task8() {
        String doubleLetter = "aabccddefgghiijjkk";
        char[] abc = doubleLetter.toCharArray();
        int j = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < abc.length; i++) {
            if (abc[i] == abc[i - 1]) {
                answer.insert(j++, abc[i]);
            }
        }
        System.out.println(answer);
    }

}
