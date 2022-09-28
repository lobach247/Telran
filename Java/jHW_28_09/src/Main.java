//Необходимо написать метод, которая печатает все целые числа в диапазоне
// между num1 и num2. Для каждого числа, которое делится на 2 выводить надпись
// «делиться на 2». Для каждого числа, которое делится на 3 выводить надпись «делится на 3»

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 50;

        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " divisible by  2");
            }
            if (i % 3 == 0) {
                System.out.println(i + "   divisible by 3");
            }
        }
    }
}