package second;

import java.util.Scanner;

import java.util.Vector;

public class Example_8_3 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner scanner = new Scanner(System.in);
		//Ŭ������ Ŭ���� ������ ��ȣ�ۿ��� �԰� -> �������̽�
		
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
