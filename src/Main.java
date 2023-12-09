import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] array = new double[]{12.5, 34.2, 34.7, -45.11, 3.5, 7.5, 5.5, -256.1, -44.6, 7.5, 11.5, 2.5, 8.5, -12.4, -99, 10.5};
        boolean isPlusNum = false;
        int plusNumCount = 0;
        double sumCount = 0;
        for (double num : array) {
            if (num < 0) {
                isPlusNum = true;
                continue;
            }
            if (isPlusNum) {
                sumCount += num;
                plusNumCount++;
            }
        }
        System.out.println("Среднее арифметическое число массива: " + (sumCount / plusNumCount) +
                "  (" + sumCount + " / " + plusNumCount + ")");
        System.out.println(isPalindrome());
    }

    public static String isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String stroke = scanner.nextLine();

        stroke = stroke.toLowerCase();
        stroke = stroke.replaceAll("[,./';:#&*--_+= ]", "");

        for (int i = 0; i < (stroke.length() / 2); i++) {
            // Сравниваем символы попарно
            if (stroke.charAt(i) != stroke.charAt(stroke.length() - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return "it's not palindrome";
            }
        }
        return "it's palindrome";
        /*if (stroke.contentEquals(new StringBuilder(stroke).reverse())) {

        } else {

        }*/
    }
}