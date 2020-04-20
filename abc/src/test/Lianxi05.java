package test;

public class Lianxi05 {
	
   public String name;
   public void name(String name) {
	   this.name=name;
   }

public void pupAge(){
      int age = 0;
      age = age + 7;
      System.out.println(name+ "的年龄是" + age);
   }
   
   
   public static void main(String[] args){
	   Lianxi05 test = new Lianxi05();
	   test.name("小狗");
      test.pupAge();
   


}
}
