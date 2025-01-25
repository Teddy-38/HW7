public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        double deposit = 15000;
        double total = 0;
        int month = 0;
        while (total < 2459000) {
            total += deposit;;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
}