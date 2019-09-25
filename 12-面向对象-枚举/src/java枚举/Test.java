package java枚举;
/**
 * 枚举：表示一个事件固定状态
 * java 枚举：是一个特殊的类，多个常量对象的组合。
 * 
 * 命名方式：
 * 
 * [修饰符] enum 枚举的名称{
 * 常量1，常量2，常量3}
 * 
 * 
 * 
 * 
 * 从中引出枚举
 * @author 王帅
 *
 */
//定义一个星期几的常量类
//因为枚举内部原本就是常量，所以直接命名就好，不用写数据类型。
enum WeekDay{
	 MONDAY,TUESDAY,WENDESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}


class Student {
	private WeekDay restDay;

	public WeekDay getRestDay() {
		return restDay;
	}

	public void setRestDay(WeekDay restDay) {
		this.restDay = restDay;
	}

	

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setRestDay(WeekDay.MONDAY);
		WeekDay res = stu.getRestDay();
		if(res == WeekDay.SATURDAY||res == WeekDay.SUNDAY){
			System.out.println("终于到了假期了！！");
		}else{
			System.out.println("天天996");
		}
	}

}
