package test;

 abstract class Lianxi08 {
	//抽象方法没有实现，子类必须实现
	abstract  void shout();
	
	public void run() {
		System.out.println("跑啊跑！");
	}
}

class Dog extends Lianxi08{
	@Override
	public void shout() {
		System.out.println("汪汪");
	}
}

