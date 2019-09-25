package 面向对象.匿名内部类;


/**
 * 匿名内部类：
 * 就是一个没有名字的局部内部类
 * 匿名内部类没有构造器
 * 
 * new 父类的构造器 或 接口（）{
 * 内部的代码，new的时候就会被执行
 * }
 *
 *匿名内部类必须要有父类才行，或者是实现了接口
 */
//定义一个接口，接口没有构造器，就意味着不能创建对象
interface IUSB{
	void swapData();
}

//主板
class MotherBoard{
	//主板上可以有插口
	void pluginIn(IUSB u){
		u.swapData();
	}
}

class Printer implements IUSB{
	public void swapData(){
		System.out.println("打印");
	}
}
//键盘
class KeyBoard implements IUSB{
	public void swapData(){
		System.out.println("打字");
	}
}

//鼠标
class Mouse implements IUSB{
	 public void swapData(){
		System.out.println("鼠标移动");
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个键盘
		IUSB k1 = new KeyBoard();
		//定义一个鼠标
		IUSB m1 = new Mouse();
		//定义一个主板
		Printer p = new Printer();
		MotherBoard b1 = new MotherBoard();
		//主板上插口插鼠标
		b1.pluginIn(m1);
		//主板上插键盘
		b1.pluginIn(k1);
		
		//b1.pluginIn(p);
		b1.pluginIn(new IUSB(){
			public void swapData(){
				System.out.println("打印");
			}
		});
	}

}

