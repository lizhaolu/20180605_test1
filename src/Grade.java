import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Grade {
    public void grade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("STB的成绩是");
        int stb=scanner.nextInt();
        System.out.println("Java的成绩是");
        int java=scanner.nextInt();
        System.out.println("SQL的成绩是");
        int sql=scanner.nextInt();

        System.out.println("-----------------------");
        System.out.println("STB\t\tJAVA\tSQL");
        System.out.println(stb+"\t\t"+java+"\t\t"+sql+"\t\t");
        System.out.println("-----------------------");

        System.out.println("JAVA和SQL的成绩差："+Math.abs(java-sql));
        System.out.println("3门课的平均分是"+(stb+java+sql)/3);


    }
}
