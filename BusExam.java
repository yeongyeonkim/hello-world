package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		BusExam gasStation = new BusExam();
		Bus bus = new Bus();
		
		gasStation.fill(bus);		
	}
	public void fill(Bus bus) {
		bus.gas += 10;
		System.out.println("�⸧�� "+bus.gas+"���� ����ֽ��ϴ�.");
	}
}
