public class FFF {
    public static int countDig(int n) {
    int last;
    int middle;
    int first;
    first=n/100;
    middle=(n-first*100)/10;
    last=n-first*100-middle*10;
    System.out.println(first+"  " +middle+" "+last );

    int reversed=last*100+middle*10+first;
    System.out.println(reversed);


        return last;
    }
}

