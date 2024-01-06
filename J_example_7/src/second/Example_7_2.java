package second;

//저번 수업에 객체배움
//오늘 수업 추상화 -> public, private 배울것
//생성자-> 같은 이름 다형성
//자바는 public, private를 선언을 안해주면 모두 public이된다 , c++은 반대

import java.util.Scanner;

public class Example_7_2 {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		
		Television SStv = new Television(); // 생성자 1번을 사용해서 만든것
		Television LGtv = new Television(15,25,false); // 생성자 2번을 사용해서 만든것

		OLED HDtv = new OLED();
		OLED SKtv = new OLED(17, 27, false,      4, 5, true);
		//앞의 세개는 television에 대한 속성 뒤에 세개는 OLED에 대한 속성
		
		
		//Television 생성자 1번을 사용해서 만든것
		System.out.println();
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.GetChannel());
		System.out.println("Volume = " + SStv.GetVolume());
		SStv.PrintClassName();
		
		//Television 생성자 2번을 사용해서 만든것
		System.out.println();
		System.out.println("LGtv:");
		System.out.println("Channnel Number = " + LGtv.GetChannel());
		System.out.println("Volume = " + LGtv.GetVolume());
		LGtv.PrintClassName();
		
		System.out.println();
		System.out.println("HDtv:");
		System.out.println("Channnel Number = " + HDtv.GetChannel());
		System.out.println("Volume = " + HDtv.GetVolume());
		System.out.println("USB = " + HDtv.GetUSB());
		System.out.println("HDMI = " + HDtv.GetHDMI());
		HDtv.PrintClassName();
		
		System.out.println();
		System.out.println("SKtv:");
		System.out.println("Channnel Number = " + SKtv.GetChannel());
		System.out.println("Volume = " + SKtv.GetVolume());
		System.out.println("USB = " + SKtv.GetUSB());
		System.out.println("HDMI = " + SKtv.GetHDMI());
		SKtv.PrintClassName();
	}
}






/*
*객체 지향 언어의 특징
*(1) 캡슐화 (2) 추상화 (3) 다형성 (4) 상속->객체지향에서 가장 중요하다 
*class 클래스 이름{
*	맴버 변수들; ->정보
*	
*	맴버 함수들;
*}
*/
