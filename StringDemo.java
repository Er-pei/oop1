package cn.ekgc.bmdsjoop.String;

public class StringDemo {
    //找到两个字符串的最大相同子串
    public static String getMaxSameString(String str1, String str2){
        String maxStr1 =(str1.length()>=str2.length())? str1:str2;
        String minStr1 =(str1.length()<str2.length())? str1:str2;
        int length=minStr1.length();
        for (int i=0;i<length;i++){
            for (int x=0,y=length-i;y<=length;x++,y++){
                String subString=minStr1.substring(x,y);
                if (maxStr1.contains(subString)){
                    return subString;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str1="abcdehello123";
        String str2="aehello";
        String str3=getMaxSameString(str1,str2);
        System.out.println(str3);
    }
}
