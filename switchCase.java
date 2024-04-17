import java.util.Scanner;
public class switchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you want to eat");
        String str = sc.nextLine();
        sc.close();
       switch (str){
        case "one":{
            System.out.println("burger");
            break;
        }
        case "two":{
            System.out.println("pakora");
            break;
        }
        default:{
            System.out.println("chal bhag kuch nai milega");
        }
       }
    }
}