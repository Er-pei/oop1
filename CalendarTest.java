package cn.ekgc.bmdsjoop.String;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    /*
    Calendar
    日历类的使用
    * */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        //get()
        int days1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,2);
        days1=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        days1=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days1);

        //getTime() 日历类改为Date类
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime() Date类改为日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);



    }
    @Test
    public void Test1(){
        /*
        LocalDate   代表IOS格式（yyyy-MM-dd）的日期，可以存储生日，纪念日等日期
        LocalTime   表示一个时间而不是日期
        LocalDateTime   是用米表示日期和时间的

         */
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,9,8,15,22,5);
        System.out.println(localDateTime1);
        System.out.println(localDateTime1.getDayOfMonth());
        //体现不可变性
        System.out.println(localDateTime1.withDayOfMonth(9));
        System.out.println(localDateTime1);

        System.out.println(localDateTime1.withDayOfYear(33));
        System.out.println(localDateTime1);
        Instant localDateTime2 = localDateTime1.atZone(ZoneId.systemDefault()).toInstant();

        System.out.println(localDateTime2.toEpochMilli());


    }
    @Test
    public void Test2(){
        //获取本初子午线对应点的标准时间
        Instant instant = Instant.now();
        //添加时间偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //获取瞬时点对应的毫秒数(1970-01-01 00:00:00开始的毫秒数)
        long l = instant.toEpochMilli();
        System.out.println(l);
        Instant instant1 = Instant.ofEpochMilli(1594714872527l);
        System.out.println(instant1);


    }
    /**
     * 格式化或者解析日期和时间
     * 类似于SimpleDateFormat
     */
    @Test
    public void Test3(){
        //方式一： 预定义
        DateTimeFormatter isoDateTime = DateTimeFormatter.ISO_DATE_TIME;
        //格式化 日期 --> 字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String s = isoDateTime.format(localDateTime);
        System.out.println(s);
        System.out.println(localDateTime);
        //解析 ：字符串 --> 日期
        TemporalAccessor parse = isoDateTime.parse("2020-07-15T12:45:24.077");
        System.out.println(parse);

        //方式二：本地方式的相关格式化 如：ofLocalizedDateTime()
        //FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String s1 = dateTimeFormatter.format(localDateTime);
        System.out.println(s1);
        //本地方式的相关格式化 如：ofLocalizedDate()
        //FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDate
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String s2 = dateFormatter.format(LocalDate.now());
        System.out.println(s2);
        //方式三：自定义格式 如ofPattern("yyyy-MM-dd hh:mm:ss E")
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String s3 = dateTimeFormatter1.format(LocalDateTime.now());
        System.out.println(s3);


        //解析：
        TemporalAccessor parse1 = dateTimeFormatter1.parse("2020-07-15 01:14:49");
        System.out.println(parse1);

    }

}
