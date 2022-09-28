public class SecondLevel {
    public static void main(String[] args) {
        int hour = 22;
        boolean singing = true;
        System.out.println(checkNeighbor(6, true));
        System.out.println(checkNeighbor(8, true));
        System.out.println(checkNeighbor(6, false));
    }

    public static boolean checkNeighbor(int hour, boolean singing) {
        if (singing == true && (hour < 7 || hour > 20)) {
            return true;
        } else {
            if (singing == false) {
                return false;
            } else {
                return false;
            }
        }
    }
}
