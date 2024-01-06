package second;

public class BMW implements INT_OperateCar{
	public void Start() {
		System.out.println("BMW is starting now.");
	}
	
	public void Stop() {
		System.out.println("BMW is stopping now.");
	}
	
	public void SetSpeed(int pSpeed) {
		System.out.println("BMW is changing speed to " + pSpeed + "mile/hour now.");
	}
	
	public void Turn(int pDegree) {
		System.out.println("BMW is turning by "+pDegree+"degree now.");
	}
}
