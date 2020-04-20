/**
 * 
 */
package test;

/**
 * @author 海小飞
 *判断101-200之间有多少个素数，并输出所有素数。
 */
public class Lianxi03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int count = 0;
		// TODO 自动生成的方法存根

		        //for循环遍历101-200
		        for(int i = 101; i < 200; i++)
		        {
		            boolean b = false;
		            
		            //内层循环判断i是否为素数
		            for(int j = 2; j <= i-1; j++) //除了1和他本身之外的数也就是(2,i-1)
		            {
		                
		                //除了1和它本身以外，如果i可以整除其他数就b = false
		                if( i % j == 0 )
		                {
		                    b = false;
		                    break;
		                }
		                
		                //如果不能整除就b = true
		                else
		                {   
		                    b = true;
		                }
		            }
		            
		            //如果b = true就打印出来
		            if(b == true)
		            {
		            	count ++;
		                System.out.println(i);
		            }
		        }
		        System.out.println("素数个数是："+count);
		    }		

	}


