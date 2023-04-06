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
            population = population + (birthLate*population) - (mortality*population);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }
}