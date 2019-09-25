package 面向对象.内部类;

/**
 * 成员：
 * 字段
 * 方法
 * 内部类
 * 
 * 内部类：定义在类中的类
 * 
 * 为什么要使用内部类
 * 1、增强封装性，把内部类隐藏在外部类当中，不允许其他类访问这个内部类。
 * 2、增加代码维护性。
 * 3、内部类可以直接访问外部类当中的成员。
 * 
 * 
 * 内部类划分：
 * 1、实例内部类：直接定义在类中的类，前面没有任何修饰符。
 * 2、静态内部类：在内部类前面加上static
 * 3、局部内部类：定义在方法内的内部类
 * 4、匿名内部类：局部内部类的一种特殊情况。
 * 
 * 外部类的修饰符只能有两个：
 * public 或者默认修饰符
 * 
 * 内部类可以使用多个修饰符
 * @author 王帅
 *
 */

class Out{//外部类
	String name = "zs";
	
	
	class In{//内部类
		void test(){
			System.out.println(name);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
