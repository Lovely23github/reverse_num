
import java.util.Scanner;
public class Palind {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int reveNum=0;
        int org_num=num;
        while (num > 0) {
            int remainder = num % 10;
            reveNum = reveNum * 10 + remainder;
            num /= 10;
        }
        if (org_num==reveNum){
            System.out.println("Its a Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
        System.out.println("this is a Palindrome program");
    }

}
