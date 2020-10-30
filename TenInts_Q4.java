import java.util.*;

public class TenInts_Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        int tenInts[] = new int[10];

        for (int i=0; i<tenInts.length; i++){
            tenInts[i] = 1 + r.nextInt(100);
            System.out.println("Slot " +i+ " contains " +tenInts[i]);
        }

    }

}
