// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println(" ");
        for (; n > 0; ) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println(" ");
        float population = 12_000_000;
        float mortality = 0.008f;
        float birthLate = 0.017f;
        i = 0;
        while (i < 10) {
            i++;
            population = population + (birthLate * population) - (mortality * population);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
        i = 0;
        float sum = 15000;
        float percent = 0.07F;
        while (sum < 12_000_000) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + sum);
            }
            sum = sum + percent * sum;
            i++;
        }
        System.out.println("Месяц " + i + " сумма накоплений " + sum);
        sum = 15000;
        i = 0;
        while (i <= 9 * 12) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + sum);
            }
            sum = sum + percent * sum;
            i++;
        }
        n = 7;
        while (n <= 31) {
            System.out.println("Сегодня пятница, " + n + "-е число. Необходимо подготовить отчет.");
            n = n + 7;
        }
        i = 0;
        int currentYear = 2023;
        int futureYear = currentYear + 100;
        int pastYear = currentYear - 200;
        while (i < futureYear) {
            i = i + 79;
            if ((i > pastYear) && (i < futureYear)) {
                System.out.println(i);
            }

        }
    }
}