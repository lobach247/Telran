//Допустим, вам дано целое число, которое обозначает год.
// Напишите метод, который определяет, этот год високосный или нет
public class ExTwo {
    public static void main(String[] args) {
        
        int numberYear = 2023;
        Year.whatYear(numberYear);
    }

    class Year {
        int numberYear;

        public static void whatYear(int numberYear) {
            if (numberYear % 400 == 0 || numberYear % 4 == 0) {
                System.out.println("Year is leap");
            } else {
                System.out.println("Year is not leap");
            }
        }

    }
}
