import java.util.Scanner;

 
public class largestInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int var=0;
        int f =0;
        int lrg=0;
    for (int i=1; i<=4;i++){
        
        int n = sc.nextInt();
        if(f==0){
            var=n;
           f++;
        }else{
            if (var>n){
                f++;
            }
        }
 
    } 
      if(f>1){
        System.out.println("not a");
      }else{
        System.out.println("a");
      }
   
    }
    
}
