import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int[] weights = {55, 44, 22, 11, 2, 34, 65, 77, 0, 0, 0, 0};
//        int[] weightsCopy = {55, 44, 22, 11, 2, 34, 65, 77, 0, 0, 0, 0};
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println();
//        }
//        boolean arraysAreEqual = true;
//        arraysAreEqual = weights.length == weightsCopy.length;
//        if (arraysAreEqual) {
//            for (int i = 0; i < weights.length; i++) {
//                if (weights[i] != weightsCopy[i]) {
//                    arraysAreEqual = false;
//                }
//            }
//        }
//        if (arraysAreEqual) {
//            System.out.println("Массивы одинаковые");
//        } else {
//            System.out.println("Массивы разные");
//        }
//        int maxWeight =-1;
//        for (final int current : weights) {
//            if (current > maxWeight) {
//                maxWeight = current;
//            }
//        }
//        System.out.println(maxWeight);
//
//        for (int i = 0; i < weights.length-1 && weights[i+1]!=0; i++) {
//            System.out.println(weights[i+1]-weights[i]);
//        }

        System.out.println("Задача №1");
        int[] salary = {89000, 122550, 67900, 99000, 130000};
        int sumSalary = 0;
        for (final int element : salary) {
            sumSalary += element;
        }
        System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей");

        System.out.println("Задача №2");
        int[] expensesWeek = {35000, 12000, 23000, 42000, 11500};
        int maxExpenses = expensesWeek[0];
        int minExpenses = expensesWeek[0];
        for (int element : expensesWeek) {
            if (element > maxExpenses) {
                maxExpenses = element;
            }
            if (element < minExpenses) {
                minExpenses = element;
            }
        }
        System.out.printf("«Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за неделю составила %s рублей»", minExpenses, maxExpenses);

        System.out.println();


        System.out.println("Задача №3");
        double[] moneyWeek = {24000, 32000, 41000, 47000, 5000};
        double averageMoney = 0;
        for (double i : moneyWeek) {
            averageMoney += i / 5;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageMoney + " рублей");

        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a = ' ';
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }




    }
}