package cn.ekgc.bmdsjoop.String;

import org.junit.Test;
//String的使用

public class StringTest {

    /*
    String 表示字符串，使用一对""引起表示
    1.String声明final的不可被继承
    2.String实现Serializable接口，表示可序列化的
            实现了Comparable接口，表示String可以比较大小
    3.String内部定义了final char value[]，value用于存储字符串数据
    4.String代表不可变的字符序列，简称不可变的特性

    * */
    @Test
    public void test1(){
        String s1 ="abc";
        String s2="abc";
        s1="hello";
        System.out.println(s1);
        System.out.println(s2);
    }
}
