package practice;

public class Example_6 {
	public static void main(String args[]) {
		
		Car tesla=new Car();
		Car hundae=new Car(4,220.9,true);
		
		MODEL rambo = new MODEL();
		MODEL porche = new MODEL(5,215.4,true,2,4,true);
		
		System.out.println();
		System.out.println("Car : tesla");
		System.out.println("MAXSIZE:" + tesla.GetSize());
		System.out.println("MAXSPEED:" + tesla.GetMaxSpeed());
		
		System.out.println();
		System.out.println("Car : hundae");
		System.out.println("MAXSIZE:" + hundae.GetSize());
		System.out.println("MAXSPEED:" + hundae.GetMaxSpeed());
		
		System.out.println();
		System.out.println("Car : rambo");
		System.out.println("MAXSIZE:" + rambo.GetSize());
		System.out.println("MAXSPEED:" + rambo.GetMaxSpeed());
		System.out.println("MODE:" + rambo.GetMODE());
		System.out.println("COLOR:" + rambo.GetCOLOR());
		
		System.out.println();
		System.out.println("Car : porche");
		System.out.println("MAXSIZE:" + porche.GetSize());
		System.out.println("MAXSPEED:" + porche.GetMaxSpeed());
		System.out.println("MODE:" + porche.GetMODE());
		System.out.println("COLOR:" + porche.GetCOLOR());
		
	}
}
