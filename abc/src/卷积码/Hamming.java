/**
 * 
 */
package 卷积码;
import java.io.*;
/**
 * @author 海小飞
 *
 */
public class Hamming {
	public static void main(String[] args){
	int r[]={0,0,0};
	String s1="",s2="";
	int n=1,n1=1,mt=0,mt1=0;
	
	System.out.println("(7，4)汉明码编码器，生成矩阵为：");
	System.out.println("|1 0 0 0 1 1 1|");
	System.out.println("|0 1 0 0 1 1 0|");
	System.out.println("|0 0 1 0 1 0 1|");
	System.out.println("|0 0 0 1 0 1 1|");
	
	
	for(;;){
		System.out.println("请输入4位二进制信息码元：");
		try{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=(input.readLine());
		int k=s.length();
		s1=s;
		char my[]=s.toCharArray();
		for(int i=0;i<k;i++){
			if((my[i]!='0')&&(my[i]!='1')){n=0;break;}
			else if(k!=4)n=0;
			else n=1;
		        }
		
		}
		catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		if(n==1)break;
		else {System.out.println("您输入的码元格式或者长度不正确，请重新输入！");continue;}
		}
	char a[]=s1.toCharArray();
    int c[];
    c=new int[4];
	for(int i=0;i<4;i++){
   	 if(a[i]=='1')c[i]=1;
   	 else c[i]=0;
    }
	r[2]=c[0]^c[2]^c[3];
	r[1]=c[0]^c[1]^c[3];
	r[0]=c[0]^c[1]^c[2];
	System.out.print("编码器收到的信息码元为:");
	for(int i=0;i<=3;i++){
		System.out.print(c[i]);
	}
	System.out.println();
	System.out.print("编码器输出的码子为:");
	int d[];
    d=new int[7];
	for(int i=0;i<7;i++){
		if(i<4)d[i]=c[i];
		else d[i]=r[i-4];
	}
	for(int j=0;j<7;j++){
		System.out.print(d[j]);
	}
	System.out.println();
	System.out.println("(7，4)汉明码译码器");
	for(;;){
		System.out.println("请输入经过信道后的码字：");
		try{
		BufferedReader input1=new BufferedReader(new InputStreamReader(System.in));
		String s0=(input1.readLine());
		int k1=s0.length();
		mt1=k1;
		s2=s0;
		char m[]=s0.toCharArray();
		
		for(int i=0;i<k1;i++){
			if((m[i]!='0')&&(m[i]!='1')){n1=0;break;}
			else if(k1!=7)n1=0;
			else n1=1;
		        }
		
		}
		catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		if(n1==1)break;
		else {System.out.println("您输入的码元格式或者长度不正确，请重新输入！");continue;}
		}
	
	char a1[]=s2.toCharArray();
    int c1[];
    c1=new int[7];
	for(int i=0;i<7;i++){
   	 if(a1[i]=='1')c1[i]=1;
   	 else c1[i]=0;
    }
	int s[]={0,0,0};
	s[0]=c1[0]^c1[1]^c1[2]^c1[4];
	s[1]=c1[0]^c1[1]^c1[3]^c1[5];
	s[2]=c1[0]^c1[2]^c1[3]^c1[6];
	System.out.print("译码器接收到的码字为：");
	for(int i=0;i<7;i++){
		System.out.print(c1[i]);
		}
	System.out.println();
	if((s[0]==0)&&(s[1]==0)&&(s[2]==1))c1[6]=c1[6]^1;
	else if((s[0]==0)&&(s[1]==1)&&(s[2]==0))c1[5]=c1[5]^1;
	else if((s[0]==1)&&(s[1]==0)&&(s[2]==0))c1[4]=c1[4]^1;
	else if((s[0]==0)&&(s[1]==1)&&(s[2]==1))c1[3]=c1[3]^1;
	else if((s[0]==1)&&(s[1]==0)&&(s[2]==1))c1[2]=c1[2]^1;
	else if((s[0]==1)&&(s[1]==1)&&(s[2]==0))c1[1]=c1[1]^1;
	else if((s[0]==1)&&(s[1]==1)&&(s[2]==1))c1[0]=c1[0]^1;
	else ;
	System.out.print("译码器输出为：");
	for(int i=0;i<7;i++){
		System.out.print(c1[i]);
		}
	for(;;);
	
}
}