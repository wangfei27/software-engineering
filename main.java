package ruanjiangongcheng;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class main {
    /*private char[] a={0,1,'.'};*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个128位的二进制浮点数");
        String firstNumber=input.next();
        boolean firstboolean=isFloating(firstNumber);

        System.out.println("请输入第二个128位的二进制浮点数");
        String twoNumber=input.next();
        boolean twoboolean=isFloating(twoNumber);

        if(firstboolean && twoboolean){
            System.out.println("相加的结果是：");
            System.out.println(Add(firstNumber,twoNumber));
        }

    }
    public static boolean isFloating(String floatingNumber) {
        int point = 0;
        char allNumber[] =floatingNumber.toCharArray() ;
        for (int i = 0; i < floatingNumber.length(); i++) {
            /*String str=String.valueOf(allNumber[i]);*/
            /*!str.equals(0) &&!str.equals(1) &&!str.equals(".")*/
            char[] a={'0','1','.'};
            if (allNumber[i] != a[0] && allNumber[i] != a[1] && allNumber[i] != a[2]) {
                System.out.println("这不是个二进制浮点数"+allNumber[i]);
                i = floatingNumber.length();
                return false;
            }
                if (allNumber[i] == a[2]) {
                    if (i == 0 || i == floatingNumber.length() - 1) {
                        System.out.println("这不是一个浮点数");
                        i = floatingNumber.length();
                        return false;
                    } else {
                        point = point + 1;
                    }
                }
                if (point > 1) {
                    System.out.println("这不是一个浮点数");
                    i = floatingNumber.length();
                    return false;
                }
            }
            if (point == 0) {
                if (floatingNumber.length() > 128) {
                    System.out.println("这不是一个128位的浮点数");
                    return false;
                }
            } else if (point == 1) {
                if (floatingNumber.length() > 129) {
                    System.out.println("这不是一个128位的浮点数");
                    return false;
                }
            }
         return true;
        }



    public static String Add(String firstNumber,String twoNumber){
        char[] a={'0','1','.'};
        char[] add=new char[256];
        char[] addfirst=new char[256];
        char[] addtwo=new char[256];
        add[128]=a[2];//".".charAt(0)
        int firstPoint=128;
        int twoPoint=128;
        char firstNumberChar[]=firstNumber.toCharArray();
        char twoNumberChar[]=twoNumber.toCharArray();
        for(int i=0;i<firstNumber.length();i++){
            /*String str=String.valueOf(firstNumberChar[i]);*/
            if(firstNumberChar[i]==a[2]){
                firstPoint=i;
            }
        }
        for(int i=0;i<twoNumber.length();i++){
            /*String str=String.valueOf(twoNumberChar[i]);*/
            if(twoNumberChar[i]==a[2]){
                twoPoint=i;
            }
        }
        for(int i=0;i<firstPoint;i++){
            addfirst[127-i]=firstNumberChar[firstPoint-1-i];
        }
        if(firstPoint!=128){
            for (int i=firstPoint+1;i<firstNumber.length();i++){
                addfirst[128+i-firstPoint]=firstNumberChar[i];
            }
        }
        for(int i=0;i<256;i++){
            /*String first=String.valueOf(addfirst[i]);*/
            if(addfirst[i]!=a[0] && addfirst[i]!=a[1] && addfirst[i]!=a[2]){
                addfirst[i]=a[0];
            }
        }

        for(int i=0;i<twoPoint;i++){
            addtwo[127-i]=twoNumberChar[twoPoint-i-1];
        }
        if(twoPoint!=128){
            for (int i=twoPoint+1;i<twoNumber.length();i++){
                addtwo[128+i-twoPoint]=twoNumberChar[i];
            }
        }
        for(int i=0;i<256;i++){
            /*String two=String.valueOf(addtwo[i]);*/
            if(addtwo[i]!=a[0] && addtwo[i]!=a[1] && addtwo[i]!=a[2]){
                addtwo[i]=a[0];
            }
        }

        int correctCarry=0;
        for(int i=127;i>=0;i--){
            if(addfirst[i]==a[0] && addtwo[i]==a[0] && correctCarry==0){
                add[i]=a[0];
                correctCarry=0;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[0] && correctCarry==0){
                add[i]=a[1];
                correctCarry=0;
            }
            else if(addfirst[i]==a[0] && addtwo[i]==a[1] && correctCarry==0){
                add[i]=a[1];
                correctCarry=0;
            }else if(addfirst[i]==a[0] && addtwo[i]==a[0] && correctCarry==1){
                add[i]=a[1];
                correctCarry=0;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[1] && correctCarry==0){
                add[i]=a[0];
                correctCarry=1;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[0] && correctCarry==1){
                add[i]=a[0];
                correctCarry=1;
            }else if(addfirst[i]==a[0] && addtwo[i]==a[1] && correctCarry==1){
                add[i]=a[0];
                correctCarry=1;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[1] && correctCarry==1){
                add[i]=a[1];
                correctCarry=1;
            }
        }

        int negativeCarry=0;

        for(int i=129;i<256;i++){
            if(addfirst[i]==a[0] && addtwo[i]==a[0] && negativeCarry==0){
                add[i]=a[0];
                negativeCarry=0;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[0] && negativeCarry==0){
                add[i]=a[1];
                negativeCarry=0;
            }
            else if(addfirst[i]==a[0] && addtwo[i]==a[1] && negativeCarry==0){
                add[i]=a[1];
                negativeCarry=0;
            }else if(addfirst[i]==a[0] && addtwo[i]==a[0] && negativeCarry==1){
                add[i]=a[1];
                negativeCarry=0;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[1] && negativeCarry==0){
                add[i]=a[0];
                negativeCarry=1;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[0] && negativeCarry==1){
                add[i]=a[0];
                negativeCarry=1;
            }else if(addfirst[i]==0 && addtwo[i]==a[1] && negativeCarry==1){
                add[i]=a[0];
                negativeCarry=1;
            }else if(addfirst[i]==a[1] && addtwo[i]==a[1] && negativeCarry==1){
                add[i]=a[1];
                negativeCarry=1;
            }
        }


        return String.valueOf(add);
    }
}
