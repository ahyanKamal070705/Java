import java.util.Scanner;
public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if(n%10==0){
             continue;      //aage ka code nai chalra direct naya iteration start
            }
            System.out.println("the Output is:" +" " + n);
            
        }
        
    }
}
