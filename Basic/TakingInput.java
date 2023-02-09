import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int a=sc.nextInt();
        System.out.println(a);
        sc.nextLine();
        System.out.print("Enter Your name: ");
        String str=sc.nextLine();
        System.out.println(str);
    }
}