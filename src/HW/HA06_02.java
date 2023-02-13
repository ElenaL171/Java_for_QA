package HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HA06_02 {
    static Random random = new Random();
    static List<Integer> list = new ArrayList<>();
    static  int n = 10;

    public static void main(String[] args) {
        for (int i = 0; i < n; i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        list.add(1000);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        boolean f=list.contains(1000);
        System.out.println(f);
    }
}
