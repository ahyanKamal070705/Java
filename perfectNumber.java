import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
          int sum=0;
         int n = sc.nextInt();
         for (int i =1; i<n;i++){
             if(n%i==0){
                sum=sum+i;
             }
         }  

         if(sum==n){
            System.out.println("perfect number");
         } else{
            System.out.println("not");
         }
    }
}
