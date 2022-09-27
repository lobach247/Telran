//Задание 1
//Реализуйте метод, который получая 3 числа int определяет, есть ли среди них
// такое, которое равно сумме двух других.

public class Main {
    public static void main(String[] args) {
        int numberOne = 26;
        int numberTwo = 37;
        int numberThree = 63;
        System.out.println(findSum(numberOne, numberTwo, numberThree));

    }

    public static boolean findSum(int numberOne, int numberTwo, int numberThree) {
        return (numberOne + numberTwo == numberThree) || (numberOne + numberThree == numberTwo) || (numberThree + numberTwo == numberOne);
    }
}
