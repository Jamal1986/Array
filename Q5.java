import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int tenInts[] = new int[1000];

        for (int i=0; i<tenInts.length; i++){
            for(int j=0; j <20; j++) {
                tenInts[i] = 10 + r.nextInt(90);
                System.out.print(tenInts[i] + "\t");
            }
            System.out.println();
        }

    }

}
