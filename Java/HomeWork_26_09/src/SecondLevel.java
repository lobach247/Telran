//  Представьте, Вы пишите программу  для расчета штрафов за превышение скорости. В качестве исходных данных у вас:
//  ограничение скорости на данном участке дороги и скорость, с которой двигался автомобиль Таблица штрафов такая:
//- превышение менее 10% от скоростного ограничения – не штрафуется
//- 10% - менее 20%   от скоростного ограничения – 50 евро
//- 20% - менее 30%   от скоростного ограничения – 150 евро
//- от 30% и выше  - 500 евро плюс
//Реализуйте программу, которая рассчитывает штраф и выводит соответствующее сообщение на экран.


public class SecondLevel {
    public static void main(String[] args) {

        int yourSpeed = 120;
        int normalSpeed = 100;

        int speedOverTen = ((normalSpeed * 10) / 100);
        int speedOverTwenty = ((normalSpeed * 20) / 100);
        int speedOverThity = ((normalSpeed * 30) / 100);

        int speedingTen = (normalSpeed + (speedOverTen));
        int speedingTwenty = (normalSpeed + (speedOverTwenty));
        int speedingThity = (normalSpeed + (speedOverThity));

    }

    //Первый способ, не самый удачный, у меня не работает. почему, не могу понять
   /* public static void MySpeed(int yourSpeed, int normalSpeed, int speedOverTen, int speedOverTwenty, int speedOverThity, int speedingTen, int speedingTwenty, int speedingThity) {
        if (yourSpeed < speeding10 || yourSpeed < normalSpeed) {
            System.out.println("No fine for speeding");
        }
        if (yourSpeed >= speeding10 && yourSpeed < speeding20) {
            System.out.println("Fine for speeding is 50$");
        }
        if (yourSpeed >= speeding20 && yourSpeed < speeding30) {
            System.out.println("Fine for speeding is 150$");
        }
        if (yourSpeed >= speeding30) {
            System.out.println("Fine for speeding is 500$");
        }
*/
//второй способ, тоже не работает, помогите разобраться, что не так
    public static void mySpeed(int yourSpeed, int normalSpeed, int speedOverTen, int speedOverTwenty, int speedOverThity, int speedingTen, int speedingTwenty, int speedingThity) {
        if (yourSpeed < speedingTen && yourSpeed < normalSpeed) {
            System.out.println("No fine for speeding");
        } else {
            if (yourSpeed >= speedingTen && yourSpeed < speedingTwenty) {
                System.out.println("Fine for speeding is 50$");
            } else {
                if (yourSpeed >= speedingTwenty && yourSpeed < speedingThity) {
                    System.out.println("Fine for speeding is 150$");
                } else {
                    System.out.println("Fine for speeding is 500$");
                }
            }
        }
    }
}
