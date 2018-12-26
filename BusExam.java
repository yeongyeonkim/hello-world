package javaStudy;

public class BusExam {

	public static void main(String[] args) {
		BusExam gasStation = new BusExam();
		Bus bus = new Bus();
		
		gasStation.fill(bus);		
	}
	public void fill(Bus bus) {
		bus.gas += 10;
		System.out.println("기름이 "+bus.gas+"리터 들어있습니다.");
	}
}
