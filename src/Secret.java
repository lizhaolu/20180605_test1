import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Secret {
    public void secret(){
        int zs;
        int jm=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要加密的数");
        zs=sc.nextInt();
        jm=(int)((zs*10+5)/2+3.14159);
        System.out.println("加密后的数字是"+jm);
    }
}
