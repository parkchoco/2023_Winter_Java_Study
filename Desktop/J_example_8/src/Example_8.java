//제네릭클래스?
//어레이 리스트? 다양한 종류의 자료형을 한꺼번에 사용할 수 있다.

import java.util.Scanner;
import java.util.*;
import java.util.Vector;

public class Example_8 {
	public static void main(String args[]) throws CloneNotSupportedException{
		Scanner scanner = new Scanner(System.in);
		
		Vector v = new Vector();
		int i;
		
		//벡터에 정수 실수 자료형까지 다양하게 들어갈수있다.
		v.add(10);
		v.add(15.5);
		v.add("Good Morning");
		//size()라는 멤버 함수가 있다
		//벡터의 크기를 사이즈를 통해 알 수 있다.
		System.out.println("Vector Size = " + v.size());
		System.out.println();
		//해당되는 내용을 뽑아오기 위해 get()을 사용
		for(i=0;i<=v.size()-1;i++) {
			System.out.println("Vector v[" + i + "] = " + v.get(i));
		}
		System.out.println();
		
		
		
		
		
		//중간에 끊어져서 1번 벡터와 2번 벡터 사이가 끊어져 그 사이 2번 자리에 Hello가 들어간다.
		v.add(2,"Hello");
		
		//size()라는 멤버 함수가 있다
		//벡터의 크기를 사이즈를 통해 알 수 있다.
		System.out.println("Vector Size = " + v.size());
		System.out.println();
		//해당되는 내용을 뽑아오기 위해 get()을 사용
		for(i=0;i<=v.size()-1;i++) {
		System.out.println("Vector v[" + i + "] = " + v.get(i));
		}
		System.out.println();
		
	}
}
