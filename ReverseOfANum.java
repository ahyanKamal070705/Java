import java.util.Scanner;
public class ReverseOfANum{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       sc.close();
       int temp;

       while(number>0){
         temp=number%10;
         System.out.print(temp+"");
         number=number/10;
       }

    }
}