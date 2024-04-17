import java.util.Scanner;
public class breakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println("the Output is:" +" " + n);
            
        }
        System.out.println("programe ended");
    }
}
