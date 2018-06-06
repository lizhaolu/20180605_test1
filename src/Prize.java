import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Prize {
    public void prize(){
        System.out.println("请输入四位会员卡号");
        Scanner sc=new Scanner(System.in);
        int card=sc.nextInt();
        int a=card/1000;
        int b=card%1000/100;
        int c=card%100/10;
        int d=card%10;
        int sum=a+b+c+d;
        System.out.println("会员卡号"+card+"各位之和："+(sum));
        if(sum > 20){
            System.out.println("是幸运客户吗？ true");
        }else {
            System.out.println("是幸运客户吗？ true");
        }
    }
}
