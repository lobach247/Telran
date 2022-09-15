public class SwictchCase {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 10;
        int max;

        max = ((n1 < n2) && (n1 > 5)) ? (n1 - n2) : (n1 + n2);

        if ((n1 < n2) && (n1 > 5)) {
            max = n1 - n2;
        } else {
            max = n1 + n2;
        }
        max = (n1 > n2) ? n1 : n2;


    }

      /*  int x = 1;

        if (x == 2) {
            System.out.println();
        }
        if (x == 2) {
            System.out.println();

            if (x == 3) {
                System.out.println();
            }
            if (x == 4) {
                System.out.println();
            }
        }


        switch (x) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println();
                int y = 2;
                switch (y){
                    case 1:
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        break;
                }
                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            default:
                System.out.println();
        }
        System.out.println();

   /* String string = "Kiril";
        switch (string) {
        case "Artem":
        case "Kiril":
        case "Vova":
            System.out.println("Appreciate for bragade № 5");
            break;
        case "Boris":
            System.out.println("Money for Ivan");
            break;
        default:
            System.out.println("Money for nobody");*/
    }
/* String result = switch (name) {
            case "Artem" -> "Money for Artem";
            case "Kiril" -> "Money for Kiril";
            case "Vova" -> "Money for Vova";
            case "Boris" -> "Money for Boris";
            default -> "Money for nobody";
        };
        System.out.println(result);
*/
    /*   String name = "Kiril";
        String result = "";


        switch (name) {
            case "Artem":
            case "Kiril":
            case "Vova":
                System.out.println("Appreciate for bragade № 5");
                break;
            case "Boris":
                System.out.println("Money for Ivan");
                break;
            default:
                System.out.println("Money for nobody");
        }
        System.out.println(result);
        };
*/
    /*  Variant 1
        result = switch (name) {
            case "Artem", "Kiril", "Vova" -> "Appreciate for bragade № 5";
//        Variant 2
        result = switch (name) {
            case "Artem", "Kiril", "Vova" -> {
                System.out.println("Appreciate for bragade № 5");
                yield "Appreciate for bragade № 5";
            }
            case "Boris" -> "Money for Boris";
            default -> "Money for nobody";
        };
        //        Variant 2
        result = switch (name) {
            case "Artem", "Kiril", "Vova" -> {
                System.out.println("Appreciate for bragade № 5");
                yield "Appreciate for bragade № 5";
            }
            case "Boris" -> "Money for Boris";
            default -> "Money for nobody";
        };
String result = switch
От Starta University всем 01:09 PM
        String name = "Kiril";
        String result = "";


        switch (name) {
            case "Artem":
            case "Kiril":
            case "Vova":
                System.out.println("Appreciate for bragade № 5");
                break;
            case "Boris":
                System.out.println
//        Variant 1
        result = switch (name) {
            case "Artem", "Kiril", "Vova" -> "Appreciate for bragade № 5";
            case "Boris" -> "Money for Boris";
            default -> "Money for nobody";
        };
        System.out.println(result);

*/

