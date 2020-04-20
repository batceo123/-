/**
 * 
 */
package test.Work;

/**
 * @author 海小飞
 *
 */
public class TestWorker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("-----------带有一个参数的构造方法-----------");
        //调用带有一个参数的构造方法，Staff类中的sex和age属性值不变
        Worker worker1=new Worker("张强");
        System.out.println(worker1);
        System.out.println("-----------带有两个参数的构造方法------------");
        //调用带有两个参数的构造方法，Staff类中的sex属性值不变
        Worker worker2=new Worker("李丽",25);
        System.out.println(worker2);

	}

}
