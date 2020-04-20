package test.Work;

public class Worker {
	    public String name;    //姓名
	    private int age;    //年龄
	    //定义带有一个参数的构造方法
	    public Worker(String name)
	    {
	        this.name=name;
	    }
	    //定义带有两个参数的构造方法
	    public Worker(String name,int age)
	    {
	        this.name=name;
	        this.age=age;
	    }
	    public String toString()
	    {
	        return"大家好！我是新来的员工，我叫"+name+"，今年"+age+"岁。";
	    }
	}


