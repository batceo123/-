package com.aaa;
import java.util.*;

public class shopping{
	public static void main(String[] args){
		Good good=new Good();
		good.Init();
		good.menu();
		good.choice();	
	}
}

class Good{
	//创建属性
	int[] id=new int[11];
	String[] name=new String[10];
	double[] price=new double[10];
	
	Scanner scanner=new Scanner(System.in);
	
	//初始化
	public void Init(){
		for(int i=0;i<10;i++){
			id[i]=i+1;
			name[i]="未上架";
			price[i]=0.0;
		}
	}
	
	
	//菜单
	public void menu(){
		System.out.println("***************欢迎使用007超市收银系统************");
		System.out.println("\t\t  1. 商品查看");
		System.out.println("\t\t  2. 商品上架");
		System.out.println("\t\t  3. 商品下架");
		System.out.println("\t\t  4. 商品购买");
		System.out.println("\t\t  5. 退出系统");
		System.out.println("**************************************************");
	}
	public void choice(){
		while(true){
			System.out.println("请输入您的选择");
			int choice=scanner.nextInt();
			switch(choice){
				case 1:checkGood();
				       menu();
				       break;
			    case 2:addGood();
				       checkGood();
				       menu();
				       break;
			    case 3:outGood();
				       checkGood();
				       menu();
				       break;
				case 4:checkGood();
				       buyGood();
					   menu();
				       break;
				case 5:quit();
				       break;
				default:System.out.println("您输入有误，请重新输入");
				       menu();
			}
		}		
	}
	
	 public void quit() {
        System.out.println("*******************************************************");
        System.out.println("                欢迎使用，下次再见                 ");
        System.out.println("*******************************************************");
        System.exit(0);
    }

	
	//添加商品
	public void addGood(){
		for(int i=0;i<10;i++){
		if(name[i]=="未上架"){
			System.out.println("现在已上架商品数目为: "+i+"，还有上架商品的空位有"+(10-i)+"个");
			System.out.println("现上架商品编号为："+(i+1));
			System.out.println("请输入上架商品的名称：");
			name[i]=scanner.next();
			System.out.println("请输入上架商品的价格: (格式：0.0)");
		    price[i]=scanner.nextDouble();
			System.out.println("继续上架商品-->1,结束上架-->0");
			int a=scanner.nextInt();
			if(a==0)
				break;
		}
		}
		System.out.println("上架成功！");	
	}
	
	
	//下架商品
	public void outGood(){
		System.out.print("请输入你想下架商品的编号: ");
		int outid=scanner.nextInt();
		name[outid-1]="未上架";
		price[outid-1]=0.0;
	}
	
	
	//商品查看
	public void checkGood(){
		System.out.println("\t商品编号\t商品名称\t商品价格");
		for(int i=0;i<10;i++)
			System.out.println("\t"+id[i]+"\t\t"+name[i]+"\t\t"+price[i]);
	}
	
	
	//商品购买
	public void buyGood(){
		double sum=0;
		//辅助打印清单的变量
		int[] paperid=new int[20];
		int[] papernum =new int[20];
		String[] papername=new String[20];
		double[] paperprice=new double[20];
		for(int j=0;j<20;j++){
			paperid[j]=0;
			papernum[j]=0;
			papername[j]="";
			paperprice[j]=0.0;
		}
		int j=0;
		//购买循环
		while(true){
			System.out.print("请输入商品编号：");
			int buyid=scanner.nextInt();
		    System.out.print("请输入商品件数：");
		    int num=scanner.nextInt();
			for(int i=0;i<10;i++){
				if(buyid==id[i]){
					sum=price[i]*num+sum;
					System.out.println("");
					System.out.println(name[i]+"已加入购物车 "+num+" 件");
					paperid[j]=buyid;
					papernum[j]=num;
					papername[j]=name[i];
					paperprice[j]=price[i];
					j++;
					}
				}
				System.out.println("");
				System.out.println("继续购买-->1,结束购买-->0");
				int a=scanner.nextInt();
				//打印清单
			    if(a==0){
					System.out.println("*********************购物清单************************");
					System.out.println("次序"+"\t商品名称"+"\t商品单价"+"\t商品个数");
					j=0;
					while(paperid[j]!=0){
						System.out.println(+(j+1)+" ."+"\t"+papername[j]+"\t\t"+paperprice[j]+"\t\t"+papernum[j]);
			            j++;
						}
						System.out.println("");
						System.out.println("总计: "+sum);
						System.out.println("**************************************************");
					break;
				}
				}
				}
	
}
