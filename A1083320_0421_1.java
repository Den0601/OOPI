import java.util.*;
import java.util.Scanner;

public class A1083320_0421_1{
    public static void main (String[] args){

        System.out.printf("請輸入電子信箱:\n");
        Scanner input=new Scanner(System.in);
        String email=input.nextLine();
        if(email.matches("[a-z0-9]*[@]{1}[a-z]*[.]{1}[c]{1}[o]{1}[m]{1}")){
            System.out.println("信箱符合格式!");
        }else{
            System.out.println("信箱不符合格式!");
        }

    }
}
