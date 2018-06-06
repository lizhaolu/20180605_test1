import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Date {
    public static void main(String[] args) {
        System.out.println("请依次输入年月日");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        if(year%4==0&&year/100!=0||year%400==0){
            if(month>2){
                day=day+1;
            }}
        switch (month){
            case 1:
                System.out.println(day); break;
            case 2:
                System.out.println(31+day);break;
            case 3:
                System.out.println(59+day);break;
            case 4:
                System.out.println(91+day);break;
            case 5:
                System.out.println(121+day);break;
            case 6:
                System.out.println(152+day);break;
            case 7:
                System.out.println(182+day);break;
            case 8:
                System.out.println(213+day);break;
            case 9:
                System.out.println(244+day);break;
            case 10:
                System.out.println(274+day);break;
            case 11:
                System.out.println(305+day);break;
            case 12:
                System.out.println(335+day);break;
            default:
                System.out.println("请输入正确的年月日");

        }
    }
}
