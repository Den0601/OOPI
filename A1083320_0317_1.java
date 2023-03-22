import java.util.*;
import java.util.Scanner;

public class A1083320_0317_1{
    public static void main (String[] args){
        System.out.printf("請輸入n值:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.printf("請輸入m值:");
        Scanner input1=new Scanner(System.in);
        int m=input1.nextInt();
        int [][] array=new int[n][m];
        for(int i=1;i<=n;i++){
            for(int s=1;s<=m;s++){
                int o=i*s;
                array[i-1][s-1]=o;
                //System.out.print(o);
            }
        }
        for(int [] a:array){
            System.out.println("");
            for(int b:a){
                System.out.print(+b+" ");
            }

        }

    }
}