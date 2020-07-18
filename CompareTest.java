package cn.ekgc.bmdsjoop.String;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    /**
     *Comparable接口的使用
     像String，包装类等实现了Comparable接口，重写了comparableTo(obj)方法，给出了比较两个对象大小的方式
      重写compareTo(obj)的规则
     如果当前对象this大于形参对象obj，则返回正整数
     如果当前对象this小于形参对象obj，则返回负整数
     如果当前对象this等于形参对象obj，则返回零
     */

    @Test
    public void Test1(){
        String[] str1 = new String[]{ "DD","MM","AA","GG","BB","JJ","CC"};
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));


    }
    /*
    * 商品类
    *
    * */
    public class Goods implements Comparable  {
        private String name;
        private double price;

        public Goods() {
        }

        public Goods(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            System.out.println("**********");
            if (o instanceof Goods){
                Goods goods=(Goods) o;
                if (this.price>goods.price){
                    return -1;
                }else if (this.price<goods.price){
                    return 1;
                }else {
                       return this.name.compareTo(goods.name);
                    }
//                return Double.compare(this.price,goods.price);
            }
            throw new RuntimeException("传入数据类型异常！");
        }
    }
    @Test
    public void Test2(){
        Goods[] arr =new Goods[5];
        arr[0] = new Goods("联想",34);
        arr[1] = new Goods("戴尔",42);
        arr[2] = new Goods("惠普",16);
        arr[3] = new Goods("小米",50);
        arr[4] = new Goods("华为",34);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
    @Test
    public void Test3(){
        String[] arr = new String[]{ "DD","MM","AA","GG","BB","JJ","CC"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
                throw new RuntimeException("输入的数据类型有误！！");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
