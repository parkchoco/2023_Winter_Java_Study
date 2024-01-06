package practice;

public class Car {
	protected int MaxSize;
	protected double MaxSpeed;
	protected boolean mode;
	
	Car() {
		MaxSize = 8;
		MaxSpeed = 249.5;
		mode = true;
	}
	
	Car(int setsize, double setmaxSpeed, boolean setmode) {
		MaxSize = setsize;
		MaxSpeed = setmaxSpeed;
		mode = setmode;
	}
	
	int GetSize(){
		return MaxSize;
	}
	
	void SetSize(int setsize) {
		if(4>=setsize) MaxSize = 4;
		if(10<=setsize) MaxSize = 10;
		if(setsize>4&&10>setsize) MaxSize=setsize;
		
	}
	
	double GetMaxSpeed() {
		return MaxSpeed;
	}
	
	void SetMaxSpeed(double setmaxspeed) {
		if(setmaxspeed>=300) MaxSpeed=300;
		if(setmaxspeed>=0&&300>=setmaxspeed) MaxSpeed=setmaxspeed;
	}
	
	boolean GetMode() {
		return mode;
	}
	
	void SetMode(boolean setmode) {
		mode=setmode;
	}
	

}
