package cn.ekgc.bmdsjoop.String;

import org.junit.Test;

import java.util.Arrays;

public class StringMethodTest {
    @Test
    public void test1(){
        String s1 ="helloworld";
        System.out.println(s1.length());//length()字符串长度
        System.out.println(s1.charAt(9));//charAt()返回某索引处的字符
        System.out.println(s1.isEmpty());//isEmpty()判断是否是空字符串
    }
    @Test
    public void test2(){
        String str1 ="abc123";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));

    }
    @Test
    public void test3(){
        String str2= "abcd123";
        char[] chars = str2.toCharArray();
        System.out.println(chars);
    }
}
