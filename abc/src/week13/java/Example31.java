package week13.java;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example31 {
    static String seq="0000";

    public static void main(String[]args) {
        String choice;
        String lsh;
        int i = 0;
        String name[]=new String[10000];
        int number[] = new int[10000];
        double[] price = new double[10000];
        double totalPrice = 0;
        int totalNumber=0;
        double sum=0;
        do {
            Scanner scan=new Scanner(System.in);
            System.out.println("请输入商品名称：");
            name[i]=scan.nextLine();
            System.out.println("请输入商品单价：");
            price[i]=scan.nextDouble();
            System.out.println("请输入商品数量：");
            number[i]=scan.nextInt();
            i++;
            lsh=generate();
            System.out.println("当前销售流水号为"+lsh);
            System.out.println("是否继续(y/n):");
            Scanner scan2=new Scanner(System.in);
            choice=scan2.nextLine();


        }
        while(choice.equals("y")) ;

        for (int j = 0;j <= i;j++ ){
            totalPrice += price[j] * number[j];
        }
        System.out.println("商品名称\t商品单价\t商品数量\t商品总价\t");
        for (int j = 0;j < i;j++){
            System.out.println(name[j]+"\t"+price[j]+"\t"+number[j]+"\t"+price[j] * number[j]+"\t");
        }
        for (int j = 0;j <= i;j++){
            totalNumber += price[j] * number[j];
            sum += number[j];
        }
        System.out.println("销售总量:"+sum);
        System.out.println("总销售额:"+totalNumber);
    }

    public static String generate() {
        String lsh;
        //
        Date now=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss D");
        String prefix=df.format(now);
        //
        int iSeq=Integer.parseInt(seq);
        iSeq=iSeq+1;
        seq=String.valueOf(iSeq);
        int count=4-seq.length();
        for(int i=0;i<count;i++) {
            seq="0"+seq;
        }
        lsh=prefix+seq;

        return lsh;
    }



}



