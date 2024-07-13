//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int costs[] = {18000, 30000, 25000, 15000, 40000};
        int sum = 0;
        for (int index = 0; index < costs.length; index++) {
            sum += costs[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача 2");
        int accounting[] = {300004, 123124, 546312, 123788, 989878};
        int maxSpending = -1;
        int minSpending = accounting[0];
        for (final int spending : accounting) {
            if (spending > maxSpending) {
                maxSpending = spending;
            }
        }
        for (int i = 1; i < accounting.length; i++) {
            if (accounting[i] < minSpending) {
                minSpending = accounting[i];
            }
        }
        System.out.println("Минимальная сумма затрат за неделю составила " + minSpending + " рублей. Максимальная сумма затрат за неделю составила " + maxSpending + " рублей");
        System.out.println("Задача 3");
        int avgAccounting[] = {645424, 141525, 456773, 123664, 14321};
        double average = 0;
        if (avgAccounting.length > 0) {
            double sum1 = 0;
            for (int i = 0; i < avgAccounting.length; i++) {
                sum1 += avgAccounting[i];
            }
            average = sum1 / avgAccounting.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            char temp = reverseFullName[i];
            System.out.print(reverseFullName[i]);
        }
    }
}