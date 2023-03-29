import java.util.*;
import java.util.Scanner;

class animals{
    String name;
    double height;
    int weight;
    double speed;

public void show(){
    System.out.println("姓名:"+name);
    System.out.println("身高:"+height);
    System.out.println("體重:"+weight);
    System.out.println("速度:"+speed);
    System.out.println("\n");



}
double distance(double x,double y){
    double sum=x*y*speed;
    return sum;
}
double distance(double x){
    double sum1=x*speed;
    return sum1;
}

}
public class A1083320_0324_1 {
    public static void main(String[] args){
        animals animal1=new animals();
        animals animal2=new animals();
        animals animal3=new animals();
        animals animal4=new animals();
        
        animal1.name="雪寶";
        animal1.height=1.1;
        animal1.weight=52;
        animal1.speed=100;

        animal2.name="驢子";
        animal2.height=1.5;
        animal2.weight=99;
        animal2.speed=200;

        animal3.name="安那";
        animal3.height=1.7;
        animal3.weight=48;
        animal3.speed=120;

        animal4.name="愛沙";
        animal4.height=1.7;
        animal4.weight=50;
        animal4.speed=120;

        animal1.show();
        animal2.show();
        animal3.show();
        animal4.show();

        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("請輸入雪寶跑的時間:");
        double time=input.nextDouble();
        System.out.print("請輸入雪寶的加速度:");
        double aspeed=input1.nextDouble();
        System.out.println("雪寶所奔跑的距離:"+animal1.distance(time,aspeed)+"\n");
        System.out.println("雪寶所奔跑的距離(不計算加速度):"+animal1.distance(time)+"\n");
        //input.close();
        //input1.close();

        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        System.out.print("請輸入驢子跑的時間:");
        double time1=input2.nextDouble();
        System.out.print("請輸入驢子的加速度:");
        double aspeed1=input3.nextDouble();
        System.out.println("驢子所奔跑的距離:"+animal2.distance(time1,aspeed1)+"\n");
        System.out.println("驢子所奔跑的距離(不計算加速度):"+animal2.distance(time1)+"\n");
        //input2.close();
        //input3.close();

        Scanner input4=new Scanner(System.in);
        Scanner input5=new Scanner(System.in);
        System.out.print("請輸入安那跑的時間:");
        double time3=input4.nextDouble();
        System.out.print("請輸入安那的加速度:");
        double aspeed3=input5.nextDouble();
        System.out.println("安那所奔跑的距離:"+animal3.distance(time3,aspeed3)+"\n");
        System.out.println("安那所奔跑的距離(不計算加速度):"+animal3.distance(time3)+"\n");
        //input4.close();
        //input5.close();

        Scanner input6=new Scanner(System.in);
        Scanner input7=new Scanner(System.in);
        System.out.print("請輸入愛沙跑的時間:");
        double time4=input6.nextDouble();
        System.out.print("請輸入愛沙的加速度:");
        double aspeed4=input7.nextDouble();
        System.out.println("愛沙所奔跑的距離:"+animal4.distance(time4,aspeed4)+"\n");
        System.out.println("愛沙所奔跑的距離(不計算加速度):"+animal4.distance(time4)+"\n");
        //input6.close();
        //input7.close();

    }
}
