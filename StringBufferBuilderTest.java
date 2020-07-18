package cn.ekgc.bmdsjoop.String;

import org.junit.Test;

public class StringBufferBuilderTest {
    /**
     *String,StringBufffer,StringBuilder三者的使用区别
     *String    不可变的字符序列
     * StringBuffer     可变的字符序列 线程安全的效率低
     * StringBuilder      可变的字符序列   jdk5.0新增的线程不安全的效率高
     *
     * 增：append
     * 删：delete
     * 改：setCharAt，replace
     * 查：charAt
     * 插入： insert
     * 长度： length
     */
    @Test
    public void test(){
        StringBuffer n = new StringBuffer("abcde");
        n.append(1);
        n.append("1");//增
        System.out.println(n);
        n.delete(2,4);//删
        System.out.println(n);
        n.replace(2,4,"123");//改
        System.out.println(n);
        n.insert(2,"jqk");//插
        System.out.println(n);
        n.reverse();//翻转
        System.out.println(n);
        int i = n.indexOf("j");//返回当前字符串第一次出现的位置
        System.out.println(i);
        String sub = n.substring(2, 5);//返回当前位置的字符串
        System.out.println(sub);
        char a=n.charAt(5);//返回当前索引位置的字符串
        System.out.println(a);
        n.setCharAt(5,'i');//替换当前索引位置的字符串
        System.out.println(n);
        System.out.println(n.toString());


    }



}
