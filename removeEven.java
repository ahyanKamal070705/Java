
import java.util.Scanner;
public class removeEven {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int n =sc.nextInt();
    int store=0;
    int count=0;
    while(n>0){
        int temp=n%10;
        if(temp%2!=0){
           store=store+(temp* (int)Math.pow(10,count));
           
        count++;
        } 
        n=n/10;
         
    } System.out.println(store);
}
}
