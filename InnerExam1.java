package javaStudy;
//내부 클래스
public class InnerExam1 {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();
		InnerExam1.Cal cal = t.new Cal();
		//바깥 클래스 타입.내부 클래스 타입
		cal.plus();
		System.out.println(cal.value);
	}
}
