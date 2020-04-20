package 卷积码;
import java.io.*;
public class juanji{
public static void main(String[] args){
	String s1="";
	int h=0,p=0,f=0,n=1,g=0;
	System.out.println("欢迎使用(2,1,3)卷积码编码器，生成矩阵为：");
	System.out.println("|11 01 11 11            |");
	System.out.println("|   11 01 11 11         |");
	System.out.println("|      11 01 11 11      |");
	System.out.println("|         11 01 11 11   |");
	System.out.println("|            11 01 11 11|");
	for(;;){
		System.out.println("请输入二进制信息码元：");
		try{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=(input.readLine());
		int k=s.length();
		s1=s;
		char my[]=s.toCharArray();
		
		for(int i=0;i<k;i++){
			if((my[i]!='0')&&(my[i]!='1')){n=0;break;}
			else n=1;
		        }
		}
		catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		if(n==1)break;
		else {System.out.println("您输入的信息码元不正确，请重新输入！");continue;}
		}
	     char a[]=s1.toCharArray();
	     h=s1.length();
	     System.out.print("编码器收到的信息码元为：");
	     for(int i=0;i<h;i++)System.out.print(a[i]);
	     p=h+6;
	     f=(h+3)*2;
	     int d[];
	     d=new int[f];
	     int b[];
	     b=new int[p];
	     int c[];
	     c=new int[h];
	     for(int i=0;i<h;i++){
	    	 if(a[i]=='1')c[i]=1;
	    	 else c[i]=0;
	     }
	    
	     for(int i=0;i<p;i++){
	    	 if((i<=2)||(i>=(p-3)))b[i]=0;
	    	 else b[i]=c[i-3];
	     }
	     for(int i=3;i<p;i++){
	    	 d[g]=b[i]^b[i-2]^b[i-3]; g++;
	         d[g]=b[i]^b[i-1]^b[i-2]^b[i-3];g++;
	     }
	     System.out.println();
	     System.out.print("编码器输出为:");
	     for(int i=0;i<f;i++)System.out.print(d[i]);
	     System.out.println();
	     System.out.print("移位寄存器已清零！");
	     for(;;);
	}
	
}

