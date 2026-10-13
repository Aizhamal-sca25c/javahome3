import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for(int i=a ; i<=b; i+=2){
            System.out.print(i + " ");
        }


    }
}
