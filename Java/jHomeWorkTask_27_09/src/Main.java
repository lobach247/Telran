
// Напишите метод, который принимает три числа и определяет в каком порядке они введены:
//печатает increasing  если числа возрастают (1,2.3),  decreasing если числа
// введены в убывающем порядке (3,2,1) и "neither increasing nor decreasing order" во всех остальных случаях.
public class Main {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 2;
        int numberTree = 3;
    }

    public static void increasingNumber(int numberOne, int numberTwo, int numberTree) {
        if (numberOne < numberTwo && numberTwo < numberTree) {
            System.out.println("increasing");
        } else {
            if (numberTree < numberTwo && numberTwo < numberOne) {
                System.out.println("decreasing");
            } else {
                System.out.println("neither increasing nor decreasing order");
            }
        }
    }
}