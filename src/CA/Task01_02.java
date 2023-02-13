package CA;

import java.util.Random;

public class Task01_02 {
    public static int getSum(int[] arr){
        int sum = 0;
        int start = 0;
        int end= arr.length - 1;
        while (start<=end){
            if(start==end){
                sum=sum+arr[start];
                break;
            }
            //[1 2 3 4 5 6 7]
            sum=sum+(arr[start]+arr[end]);
            start++;
            end--;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] a={1, 2, 3, 4, 5, 6, 7};
        System.out.println(getSum(a));

        Random random = new Random();
        int s = random.nextInt();

        System.out.println(s);
    }
}
