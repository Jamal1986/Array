import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] values = new int[20];
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for(int i = 0;i<values.length;i++){
            System.out.println("Print the value of z["+i+"]");
            values[i] = s.nextInt();

            if(values[i]>0){
                positive++;
            }
            else if(values[i]<0){
                negative++;
            }
            else{
                zero++;
            }
            if(values[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        for(int i=0; i<values.length; i++){
            System.out.print(values[i] + "\t");
        }
        System.out.println("\nPositive : "+positive+"\nNegative : "+negative+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);
    }

}
