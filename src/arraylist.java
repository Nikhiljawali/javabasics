import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.set(2,5);
        num.add(2,5);
        num.remove(0);
        int N=num.get(4);
        System.out.println(num);
        System.out.println(N);

    }
}
