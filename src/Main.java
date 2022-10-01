public class Main {
    public static void main(String[] args) {
        // arrays.part2
        int[] arr = generateRandomArray();
        //task1
        int total = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            total = total + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");
        //task2
        int maxExpense = 0;
        int minExpense = 200000;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. " +
                "Максимальная сумма трат за день составила " + maxExpense + " рублей.");

        //task3
        float middleExpense = (float) total/30;
        System.out.println("Средняя сумма трат за месяц составила " + middleExpense + " рублей.");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}