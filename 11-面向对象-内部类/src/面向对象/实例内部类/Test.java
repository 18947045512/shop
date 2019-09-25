package 面向对象.实例内部类;
/**
 * 实例内部类：
 * 属于对象的内部类，不属于类的，不使用static修饰的
 * 在内部类当中不能有静态的成员。
 * 外部类不能直接访问内部类当中的成员
 * @author 王帅
 *
 */
class Outter{
	
	String name = "OUTNAME";
	void test(){
		//System.out.println(age);
	}
	
	class Inner{
		String name = "INNERNAME";
		int age = 10;
		void Test(){
			String name = "NAME";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter out1 = new Outter();
		//System.out.println(out1.name);
		//创建实例内部类
		//创建内部类对象当中，会有一个外部类的引用
		Outter.Inner in1 = out1.new Inner();
		in1.Test();
	}

}
