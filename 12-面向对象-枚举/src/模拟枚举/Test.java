package 模拟枚举;
/**
 * 代码存在问题：
 * 1、代码逻辑不够清晰，通过定义常量类解决
 * 2、代码安全性不够，通过定义为类类型的参数，改变传递的数据类型
 * 3、代码不好看，美观度不够。
 * 
 * 从中引出枚举
 * @author 王帅
 *
 */
//定义一个星期几的常量类
class WeekDay {
	public static final WeekDay MONDAY = new WeekDay();
	public static final WeekDay TUESDAY = new WeekDay();
	public static final WeekDay WENDESDAY = new WeekDay();
	public static final WeekDay THURSDAY = new WeekDay();
	public static final WeekDay FRIDAY = new WeekDay();
	public static final WeekDay SATURDAY = new WeekDay();
	public static final WeekDay SUNDAY = new WeekDay();

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
