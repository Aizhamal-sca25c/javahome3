import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for(int i=a; i<=b; i++){
            int k =(int) Math.sqrt(i);

            if (k * k==i){
                System.out.println(i + "  ");
            }
        }


    }
}
