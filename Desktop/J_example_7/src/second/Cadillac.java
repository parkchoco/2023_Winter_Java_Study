package second;

public class Cadillac implements INT_OperateCar{
	public void Start() {
		System.out.println("Cadillac is starting now.");
	}
	
	public void Stop() {
		System.out.println("Cadillac is stopping now.");
	}
	
	public void SetSpeed(int pSpeed) {
		System.out.println("Cadillac is changing speed to " + pSpeed + "mile/hour now.");
	}
	
	public void Turn(int pDegree) {
		System.out.println("Cadillac is turning by "+pDegree+"degree now.");
	}
}
