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
    System.out.printf("速度:"+speed);

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
class human extends animals{
    String sex;
    void show1(){
        super.show();
        System.out.println("性別:"+sex);
        

    }
}
class snow extends human{
    String skill;
    void show2(){
        super.show1();
        System.out.println("冰凍技能:"+skill);
        System.out.printf("\n");
    }
    double distance(double x){
        double total=x*speed*2;
        return total;
    }
    double distance(double x,double y){
        double total1=x*y*speed*2;
        return total1;
    }

}
public class A1083320_0331 {
    public static void main(String[] args){

        animals animal1=new animals();
        animals animal2=new animals();
        human human1=new human();
        human human2=new human();
        human human3=new human();
        snow snow1=new snow();
        
        
        animal1.name="雪寶";
        animal1.height=1.1;
        animal1.weight=52;
        animal1.speed=100;

        animal2.name="驢子";
        animal2.height=1.5;
        animal2.weight=99;
        animal2.speed=200;

        human1.name="阿克";
        human1.height=1.9;
        human1.weight=80;
        human1.speed=150;
        human1.sex="男";

        human2.name="漢斯";
        human2.height=1.8;
        human2.weight=78;
        human2.speed=130;
        human2.sex="男";

        human3.name="安那";
        human3.height=1.7;
        human3.weight=48;
        human3.speed=120;
        human3.sex="女";

        snow1.name="愛沙";
        snow1.height=1.7;
        snow1.weight=50;
        snow1.sex="女";
        snow1.skill="Yes";
        snow1.speed=120;
       
        
        showinfo();
        animal1.show();
        animal2.show();
        human1.show1();
        human2.show1();
        human3.show1();
        snow1.show2();

        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("請輸入雪寶跑的時間:");
        double time=input.nextDouble();
        System.out.print("請輸入雪寶的加速度:");
        double aspeed=input1.nextDouble();
        if(time==0){
            System.out.println("因為沒有時間而無法計算\n");
        }else if((time!=0 & aspeed==0)){
            System.out.println("雪寶所奔跑的距離(不計算加速度):"+animal1.distance(time)+"\n");
        }else if(time>0 & aspeed>0){
            System.out.println("雪寶所奔跑的距離:"+animal1.distance(time,aspeed)+"\n");
        }
        
        //input.close();
        //input1.close();

        Scanner input2=new Scanner(System.in);
        Scanner input3=new Scanner(System.in);
        System.out.print("請輸入驢子跑的時間:");
        double time1=input2.nextDouble();
        System.out.print("請輸入驢子的加速度:");
        double aspeed1=input3.nextDouble();
        if(time1==0){
            System.out.println("因為沒有時間而無法計算\n");
        }else if((time1!=0 & aspeed1==0)){
            System.out.println("驢子所奔跑的距離(不計算加速度):"+animal2.distance(time1)+"\n");
        }else if(time1>0 & aspeed1>0){
            System.out.println("驢子所奔跑的距離:"+animal2.distance(time1,aspeed1)+"\n");
        }
       
        //input2.close();
        //input3.close();


        Scanner input8=new Scanner(System.in);
        Scanner input9=new Scanner(System.in);
        System.out.print("請輸入阿克跑的時間:");
        double time5=input8.nextDouble();
        System.out.print("請輸入阿克的加速度:");
        double aspeed5=input9.nextDouble();
        if(time5==0){
            System.out.println("因為沒有時間而無法計算\n");
        }else if((time5!=0 & aspeed5==0)){
            System.out.println("阿克所奔跑的距離(不計算加速度):"+human1.distance(time5)+"\n");
        }else if(time5>0 & aspeed5>0){
            System.out.println("阿克所奔跑的距離:"+human1.distance(time5,aspeed5)+"\n");
        }

        Scanner input10=new Scanner(System.in);
        Scanner input11=new Scanner(System.in);
        System.out.print("請輸入漢斯跑的時間:");
        double time6=input10.nextDouble();
        System.out.print("請輸入漢斯的加速度:");
        double aspeed6=input11.nextDouble();
        if(time6==0){
            System.out.println("因為沒有時間而無法計算\n");
        }else if((time6!=0 & aspeed6==0)){
            System.out.println("漢斯所奔跑的距離(不計算加速度):"+human2.distance(time6)+"\n");
        }else if(time6>0 & aspeed6>0){
            System.out.println("漢斯所奔跑的距離:"+human2.distance(time6,aspeed6)+"\n");
        }

        Scanner input4=new Scanner(System.in);
        Scanner input5=new Scanner(System.in);
        System.out.print("請輸入安那跑的時間:");
        double time3=input4.nextDouble();
        System.out.print("請輸入安那的加速度:");
        double aspeed3=input5.nextDouble();
        if(time3==0){
            System.out.println("因為沒有時間而無法計算\n");
        }else if((time3!=0 & aspeed3==0)){
            System.out.println("安那所奔跑的距離(不計算加速度):"+human3.distance(time3)+"\n");
        }else if(time3>0 & aspeed3>0){
            System.out.println("安那所奔跑的距離:"+human3.distance(time3,aspeed3)+"\n");
        }

        //input4.close();
        //input5.close();

        Scanner input6=new Scanner(System.in);
        Scanner input7=new Scanner(System.in);
        System.out.print("請輸入愛沙跑的時間:");
        double time4=input6.nextDouble();
        System.out.print("請輸入愛沙的加速度:");
        double aspeed4=input7.nextDouble();
        if(time4==0){
            System.out.println("因為沒有時間而無法計算\n");
        }else if((time4!=0 & aspeed4==0)){
            System.out.println("愛沙所奔跑的距離(不計算加速度):"+snow1.distance(time4)+"\n");
        }else if(time4>0 & aspeed4>0){
            System.out.println("愛沙所奔跑的距離:"+snow1.distance(time4,aspeed4)+"\n");
        }
        
        //input6.close();
        //input7.close();

    }
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
        System.out.println("\n");
    } 
    

}
