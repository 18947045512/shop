package java枚举;
/**
 * 枚举是一个特殊的类
 * 不能创建对象，
 * 枚举还可以用在switch中	
 * @author 王帅
 *
 */
enum Sex{
	MAN,FEMALE
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sex.FEMALE);
		switch(Sex.FEMALE){
		case MAN:break;
		case FEMALE:break;
		}
		Sex s = Sex.valueOf("MAN");
		System.out.println(s);
		Sex[] allres = Sex.values();//获取枚举当中的所有元素，放在一个数组当中
		for (Sex sex : allres) {
			System.out.println(sex);
		}
	}

}
