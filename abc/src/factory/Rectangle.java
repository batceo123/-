/**
 * 
 */
package factory;

/**
 * @author 海小飞
 *
 */
public class Rectangle implements Shape {  //创建实现shape接口的实体类Rectangle
	 
	   @Override
	   public void draw() {
	      System.out.println("画矩形");
	   }
	}
