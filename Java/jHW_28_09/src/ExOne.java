//Необходимо написать метод, которая печатает все целые
// нечетные числа в диапазоне  между num1 и num2. Учтите, num1
// может быть как меньше, так больше или равно  num2.

public class ExOne {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 40;


        for (int i = num1; i < num2; i++) {
            if (i % 2 != 0) System.out.println(i);


        }
    }
}
