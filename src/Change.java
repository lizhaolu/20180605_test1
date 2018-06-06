/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Change {
    public void change(){
        int num1=10;
        int num2=20;
        int temp;

        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}
