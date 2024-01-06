
import java.util.Scanner;

public class Example_6 {
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		
		Television SStv = new Television();
		Television LGtv = new Television();

		
		//쌤성
		SStv.channel = 10;
		SStv.volume = 20;
		SStv.onoff = false;
		//삼성티비는 멤버 변수에 직접 값을 넣었다
		
		
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.channel);
		System.out.println("Volume = " + SStv.volume);
		
		
		//엘쥐
		//멤버 함수를 통해 변수에 값을 넣으면 관리가 편하다
		//삼성은 위와 같이 바로 설정함
		//Television에서 멤버 함수에서 범위를 설정하였으므로 값을 설정해준다
		LGtv.SetChannel(15);
		LGtv.SetVolume(25);
		LGtv.SetOnOff(true);
		
		System.out.println();
		System.out.println("LGtv:");
		System.out.println("Channnel Number = " + LGtv.channel);
		System.out.println("Volume = " + LGtv.volume);
		
		Television HDtv = (Television)SStv.clone();//삼성티비의 값을 현대티비에 넣는데 주소가 같아 값이 같아지는 것을 막기위해 (Television)와.clone()을 추가한다.
		
		System.out.println();
		System.out.println("HDtv:");
		System.out.println("Channnel Number = " + HDtv.channel);
		System.out.println("Volume = " + HDtv.volume);
		
		HDtv.SetChannel(35);
		HDtv.SetVolume(45);
		
		System.out.println();
		System.out.println("HDtv:");
		System.out.println("Channnel Number = " + HDtv.channel);
		System.out.println("Volume = " + HDtv.volume);
		
		//삼성이 현대의 값을 따라 값이 같아지는데 이유는 같은 주소를 공유하기 때문이다.
		System.out.println();
		System.out.println("SStv:");
		System.out.println("Channnel Number = " + SStv.channel);
		System.out.println("Volume = " + SStv.volume);
		
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
