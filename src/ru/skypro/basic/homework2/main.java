package ru.skypro.basic.homework2;

public class main {
    public static void main(String[] args) {
        // Задача 1
        byte aa = 1;
        short bb = 2;
        int cc = 3;
        long dd = 4L;
        float ee = 1.1f;
        double ff = 1.1;
        char gg = 'a';
        boolean hh = true;

        // Задача 2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float weightAllBoxers = weightBoxer1 + weightBoxer2;
        float weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Вес боксёров " + weightAllBoxers + " кг");
        System.out.println("Разница в весе " + weightDifference + " кг");

        // Задача 3
        byte weightBanana = 80;
        byte weightCupOfMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;
        float weightBreakfastInKg = (5 * weightBanana + 2 * weightCupOfMilk + 2 * weightIceCream + 4 * weightEgg) / 1000f;
        System.out.println("Вес завтрака " + weightBreakfastInKg + " кг");

        // Задача 4
        short fullWeightLoss = 7;
        short minWeightLoss = 250;
        short maxWeightLoss = 500;
        float maxDaysOfWeightLoss = fullWeightLoss * 1000f / minWeightLoss;
        float minDaysOfWeightLoss = fullWeightLoss * 1000f / maxWeightLoss;
        float averageDaysOfWeightLoss = (maxDaysOfWeightLoss + minDaysOfWeightLoss) / 2f;
        System.out.println("Максимальное время похудения " + maxDaysOfWeightLoss + " дней");
        System.out.println("Минимальной время похудения " + minDaysOfWeightLoss + " дней");
        System.out.println("Среднее время похудения " + averageDaysOfWeightLoss + " дней");

        // Задача 5
        int mashaSalary1 = 67_760;
        int denisSalary1 = 83_690;
        int kristinaSalary1 = 76_230;
        int mashaSalary2 = (int) (mashaSalary1 * 1.1);
        int mashaIncrease = (mashaSalary2 - mashaSalary1) * 12;
        int denisSalary2 = (int) (denisSalary1 * 1.1);
        int denisIncrease = (denisSalary2 - denisSalary1) * 12;
        int kristinaSalary2 = (int) (denisSalary1 * 1.1);
        int kristinaIncrease = (kristinaSalary2 - kristinaSalary1) * 12;
        System.out.println("Маша теперь получает " + mashaSalary2 + " рублей. Годовой доход вырос на " + mashaIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей. Годовой доход вырос на " + denisIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalary2 + " рублей. Годовой доход вырос на " + kristinaIncrease + " рублей");

        // Задача 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result *= -1;
        System.out.println(result);

        // Задача 7
        int a1 = 5;
        int b1 = 7;
        System.out.println("a=" + a1 + "; b=" + b1);
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("a=" + a1 + "; b=" + b1);

        // Задача 8
        int a2 = 938;
        int b2 = a2 % 100 / 10;
        System.out.println("a=" + a2 + "; b=" + b2);
    }
}