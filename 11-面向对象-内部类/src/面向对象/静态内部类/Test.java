package 面向对象.静态内部类;
/**
 * 静态内部类：在内部类前面加上static
 * 
 * 1.静态内部类不需要创建外部对象
 * Outter.Inner in = new Outter.Inner();
 * 2.在静态内部类中，没有外部类的引用
 * 
 * 3.静态内部类可以访问外部类的静态成员
 * 
 * 4.访问静态内部类中的静态成员
 * Outter.Inner.color
 * 5.静态内部类中可以定义静态成员，也可以定义非静态成员。
 * @author 王帅
 *
 */
class Outter{
	 static String name = "sef";
	 int age = 19;
	static class Inner{
		static String color = "black";
		void test(){
			System.out.println(name);
			System.out.println(new Outter().age);
		}
	}
	
}
public class Test {

	public static void main(String[] args) {
			//创建静态内部类
			Outter.Inner in = new Outter.Inner();
			in.test();
			
			//访问静态类中的静态成员
			System.out.println(Outter.Inner.color);
	}

}
