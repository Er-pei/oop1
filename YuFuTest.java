package cn.ekgc.bmdsjoop.String;


import java.util.Date;

public class YuFuTest {
    public static void main(String[] args) {
        //Date类存在偏移量问题
        Date date1 = new Date( 1900 -1900,1 - 1,1,0,0,0);
        Date date2=new Date(2020 - 1900,1 - 1,8,0,0,0);
        System.out.println(date1);

        System.out.println(date2.getTime()-date1.getTime());
        if ((date2.getTime()-date1.getTime())/(1000*60*60*24)%5+1>3){
            System.out.println("晒网");
        }else {
            System.out.println("打鱼");
        }
    }
}

