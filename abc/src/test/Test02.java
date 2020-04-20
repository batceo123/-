package test;
public class Test02 {
	private static int j = 0;
	 
    private static Boolean methodB(int k) {
        j += k;     //methodB(4)相当于k=4;j=j+k=0+4=4
        return true;
    }
 
    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);  //中间为与计算符，执行完methodB(4)后，j = 4
        b = i < 10 || methodB(8);   //中间为或计算符，因为i < 10 已成立，不需要后续计算
 
    }
 
    public static void main(String args[]) {
        methodA(0);
        System.out.println(j);
    }
}