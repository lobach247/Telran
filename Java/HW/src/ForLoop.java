public class ForLoop {
    public static void main(String[] args) {

        String[] mom = {"My", "mama", "and", "papa"};
        for (int i = 0; i < mom.length; i++) {
            char[] momArray = mom[i].toCharArray();
            for (int j = 0; j < momArray.length; j++) {
                System.out.print(momArray[j]);
            }
        }





        /*добавте внутренний цикл который будет выводить каждую букву каждого слова на экран. Используйте выражение  char[] momArray = mom.toCharArray(); для создания char массива из строки.
*/
/*String array[] = {"My", "mama", "and", "papa"};
for (String words : array){
    System.out.println(words);
}*/






/*for(int x = 5, y = 11; x<=11 ; x++ ){
    System.out.println("x = "+x+"   " +"y = "+ y);*/

/*for (int i = 1; i <= 5; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println('\n');
        }
*/
/*  for (<Тип элемента> <Имя перееменной, куда будет зваписываться очередной элемент> : <Название массива>) {
            System.out.println(<Элемент>);
        }
*/

       /* for (int a=1234; a <= 1241; a++ ){
            System.out.println(a);
        }*/
        //for (int i = 1; i<= 10; i++){
         //   System.out.println("hello");
        //}
        /*     int count = 0;
        String mom = "My mama and papa";
        char charForFind = 'a';
        char[] momArray = mom.toCharArray();
        for (int i = 0; i < momArray.length; i++) {
            if (momArray[i] == 'a') {
                count++;
                continue;
            }
        }
        System.out.println("We have " + count + " times a");
*/
       /* for (int i = 1; i<= 10; i++){

            if(i == 4) {
                continue;
            }
                System.out.println("we are on iteration number "+i);
            }*/


        }
    }
