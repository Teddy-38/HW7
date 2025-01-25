public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        double deposit = 15000;
        double total = 0;
        int month = 0;
        while (total < 2459000) {
            total += deposit;
            ;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
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
    }
}