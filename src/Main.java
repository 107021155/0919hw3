import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("國文成績:");
        System.out.println("英文成績:");
        System.out.println("數學成績:");
        float a = scn. nextFloat();
        float b = scn. nextFloat();
        float c = scn. nextFloat();
        float d = a+b+c;
        float e = (a+b+c)/3;
        System.out.println("總分:"+d);
        System.out.println("平均:"+e);

    }
}
