import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4_6();
        task7();
        task8();
        taskAdd1();
        taskAdd2();
        taskAdd3();
        taskAdd4();
        taskAdd5();
        taskAdd6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0, i = 0;
        int salary = 15000;
        while (total <= 2459000) {
            total += total / 100;
            total += salary;
            i++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int countOfPeople = 12_000_000;
        int countOfDeath = 8 * 1000;
        int countOfBirth = 17 * 1000;
        for (int i = 1; i <= 10; i++) {
            countOfPeople += countOfBirth - countOfDeath;
            System.out.printf("За %d год численность населения составляет %d\n", i, countOfPeople);
        }
    }

    public static void task4_6() {
        System.out.println("Task 4-6");
        float depositSum = 15000f;
        int countOfMonth = 1;
        while (countOfMonth <= 9 * 12) {
            depositSum *= 1.07;
            countOfMonth++;
            if (countOfMonth % 6 == 0) {
                System.out.printf("За %d месяц вклад равен %.2f рублей\n", countOfMonth, depositSum);
            }
        }
    }

    public static void task7() {
        System.out.println("Task7");
        int fridayDate = 4;
        for (int i = 1; i <= 31; i++) {
            if ((i - fridayDate) % 7 == 0) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);
            }

        }
    }

    public static void task8() {
        System.out.println("task8");
        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        for (int i = currentYear - 200; i < currentYear + 100; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void taskAdd1() {
        System.out.printf("TaskAdd1\n");
        int countOfNum = 0;
        int countOfNum2 = 0, j = 1000;
        for (int i = 1000; countOfNum < 4; i++) {
            if (i % 5 == 0) {
                countOfNum++;
                System.out.println(i);
            }
        }
        while (countOfNum2 < 4) {
            if (j % 5 == 0) {
                countOfNum2++;
                System.out.println(j);
            }
            j++;
        }
    }

    public static void taskAdd2() {
        System.out.printf("TaskAdd2\n");
        int countOfNum3 = 0, i = 1;
        while (countOfNum3 < 10) {
            System.out.print(i + " ");
            i += 2;
            countOfNum3++;
        }
        System.out.println();
    }

    public static void taskAdd3() {
        System.out.printf("TaskAdd3\n");
        for (int i = 90; i > -1; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void taskAdd4() {
        System.out.printf("TaskAdd4\n");
        int num = 2;
        for (int countOfNum = 0; countOfNum < 10; countOfNum++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    public static void taskAdd5() {
        System.out.printf("TaskAdd5\n");
        for (int i = 1; i <= 31; i++) {
            if (i == 1 || i == 2 || (i - 1) % 7 == 0 || (i - 2) % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void taskAdd6() {
        System.out.printf("TaskAdd6\n");
        int countOfHappyTickets = 0;
        int firstPart, secondPart, firstSum, secondSum = 0;
        for (int i = 1; i <= 999999; i++) {
            firstPart = i / 1000;
            secondPart = i % 1000;
            firstSum = firstPart / 100 + firstPart % 100 / 10 + firstPart % 10;
            secondSum = secondPart / 100 + secondPart % 100 / 10 % 10 + secondPart % 10;
            if (firstSum == secondSum) {
                countOfHappyTickets++;
            }
        }
        System.out.printf("Количество счастливых билетов = %d", countOfHappyTickets);
    }
}
