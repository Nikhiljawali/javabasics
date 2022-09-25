import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        ArrayList<Integer> N=new ArrayList<Integer>();
        N.add(2);
        N.add(1);
        N.add(6);
        N.set(1,5);
        N.add(0,8);
        int num=N.get(3);
        System.out.println(num);
        System.out.println(N);
    }
}