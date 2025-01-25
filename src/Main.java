public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        double deposit = 15_000;
        double total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total += deposit;
            month += 1;
            System.out.print("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("Task2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        int start2 = 10;
        while (start2 > 0) {
            System.out.print(start2 + " ");
            start2 = start2 - 1;
        }
        System.out.println();
        System.out.println("Task3");
        int people = 12_000_000;
        int birth1000 = 17;
        int mortal1000 = 8;
        int yearNow = 2025;
        for (int year = yearNow; year < yearNow + 10; year++) {
            people += people / 1000 * birth1000 - people / 1000 * mortal1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }
        System.out.println("Task4");
        int deposit2 = 15000;
        double monthlyPercent2 = 0.07;
        int totalAmount2 = 12_000_000;
        int numberMonth2 = 1;
        while (deposit2 <= totalAmount2) {
            deposit2 += deposit2 * monthlyPercent2;
            System.out.print(" Месяц " + numberMonth2 + ", сумма накоплений " + deposit2);
            numberMonth2++;
        }
        System.out.println();
        System.out.println("Task5");
    }
}
