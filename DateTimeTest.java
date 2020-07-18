package cn.ekgc.bmdsjoop.String;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {
    public static void main(String[] args) throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        //格式化  日期 ---> 字符串
        String sj=sdf.format(date);
        System.out.println(sj);

        String str = "20-7-10 下午11:48";
        Date date2 = sdf.parse(str);
        System.out.println(date2);

//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //要求字符串必须符合SimpleDateFormat的格式（通过构造器的形参来体现）
        Date date3 = new Date();
        String sj1 = sdf2.format(date3);
        System.out.println(sj1);

    }
}
