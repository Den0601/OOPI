import java.util.*;
import java.util.Scanner;

public class A1083320_0421_2 {
    public static void main (String[] args){

        System.out.printf("請輸入詳細日期(包括年月日YYYY/MM/DD,MM/DD/YYYY):\n");
        Scanner input=new Scanner(System.in);
        String year=input.nextLine();
        if(year.matches("[0-9]{4}[/]{1}[0-9]{2}(/){1}[0-9]{2}") || year.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}")){
            System.out.println("日期符合格式!");
        }else{
            System.out.println("日期不符合格式!");
        }
        }
}
