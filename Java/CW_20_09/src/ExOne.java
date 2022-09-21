//Представьте, что вы пишите программу для онлайн кинотеатра. У вас известно возрастное ограничение
// фильма и возраст клиента (естественно заданы в виде переменных). Ваша программа должна
// выдавать на экран: «вы можете смотреть этот фильм» или «данный контент вам не доступен»
public class ExOne {
    public static void main(String[] args) {
        int age = 23;
        int ageMinimum = 18;
        LimitAge.yourAge(age, ageMinimum);
    }

    class LimitAge {
        int age;
        int ageMinimum;

        public static void yourAge(int age, int ageMinimum) {
            if (age >= ageMinimum) {
                System.out.println("You can watch this movie");
            } else {
                System.out.println("You can't watch this movie");


            }
        }
    }
}
