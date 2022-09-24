import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner N=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=N.nextInt();
        if(num%2==0){
            System.out.println("given number is not valid");
        }
        else if(num>=10){
            System.out.println("given number is not valid");
        }
        else{
            System.out.println("given number is valid");
        }
    }
}