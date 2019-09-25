package 局部内部类;
/**
 * 局部内部类：
 * 定义在方法中的内部类
 * 1.不能使用一些修饰 public private
 * 2.局部内部只能在定义的方法中使用
 * 3.局部内部类当中不能包含静态变量
 * 4.局部内部类当中可以包含局部变量，使用的局部变量的实质是 final	常量
 * @author 王帅
 *
 */

class Outter{
	
	void myxq(){
		
		 final String name = "myxq";
		class Inner{
			 void test(){
				 System.out.println(name);
			 }
		}	 
			 Inner in = new Inner();
			 in.test();
			 
			 
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		new Outter().myxq();

	}

}
