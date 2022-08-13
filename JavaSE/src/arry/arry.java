package arry;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class arry {
    public static void main(String[] args) {
        int[] a;
        int[] b = {1,2,3,4};
        a = abc(b);
        System.out.println(b[0]);
        System.out.println(a[1]);
    }
    public static int[]  abc(int []b){
        int a[] = {7,8};
        b[0] = 5;
        return a;
    }
}
