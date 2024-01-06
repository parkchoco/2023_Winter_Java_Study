package second;

import java.util.Scanner;

import java.util.Vector;

public class Example_8_3 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner scanner = new Scanner(System.in);
		//클래스와 클래스 사이의 상호작용의 규격 -> 인터페이스
		
		INT_OperateCar BMW_car = new BMW();
		INT_OperateCar Cadillac_car = new Cadillac();
		
		BMW_car.Start();
		BMW_car.SetSpeed(100);
		BMW_car.Turn(50);
		BMW_car.Stop();
		
		Cadillac_car.Start();
		Cadillac_car.SetSpeed(150);
		Cadillac_car.Turn(-40);
		Cadillac_car.Stop();
	}
}
