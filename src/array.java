import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner Nikhil = new Scanner(System.in);
        int size = Nikhil.nextInt();
        int[] yuvaraj = new int[size];
        // for input
        for (int i=2;i<size;i++){
            yuvaraj[i]=Nikhil.nextInt();
        }
//        System.out.println(yuvaraj[3]);
        // for output
        for (int i=0;i<size;i++){
            System.out.println(yuvaraj[i]);
        }
    }
}