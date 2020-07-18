package cn.ekgc.bmdsjoop.String;

import org.junit.Test;

import java.util.Date;

public class Datetest {
    @Test
    public void test(){//获取时间戳
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
    @Test
    public void test1(){
        //toString() 显示当前时间，年月日时分秒
        //getTime()  获取当前Date对象的时间戳
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());//1594351784229L
        //创建指定毫秒数的Date对象
        Date date2 = new Date(1594351784229L);
        System.out.println(date2);
        //创建sql.Date对象
        java.sql.Date date3=new java.sql.Date(1594351784229L);
        System.out.println(date3);
        //将java.util.Date对象转化为java.sql.Date对象
        Date date4 = new Date();
        java.sql.Date date5 = new java.sql.Date(date4.getTime());
        System.out.println(date5);
    }

}
