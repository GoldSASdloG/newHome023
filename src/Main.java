import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HumanTest vasy = new HumanTest(45, "Vasy", 174.2);
        HumanTest pety = new HumanTest(45, "Vasy", 174.2);

        System.out.println(pety == vasy);
        System.out.println(pety.equals(vasy));


        System.out.println("Введите любое не отрицательное число!");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    private static double avg(int num) {
        String numString = String.valueOf(num);
        double sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        System.out.println("сумма чисел = " + sum);
        System.out.println("количество цифр в числе = " + numString.length());
        return sum / numString.length();
    }
}