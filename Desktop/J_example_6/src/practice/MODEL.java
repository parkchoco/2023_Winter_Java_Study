package practice;

public class MODEL extends Car {
	private int MODE;
	private int COLOR;
	private boolean TV;
	
	public MODEL() {
		super();
		
		MODE = 2;
		COLOR = 15;
		TV = false;
	}
	
	public MODEL(int setsize, double setmaxSpeed, boolean setmode,
			int pMODE, int pCOLOR, boolean pTV) {
		super(setsize, setmaxSpeed, setmode);
		
		MODE = pMODE;
		COLOR = pCOLOR;
		TV = pTV;
	}
	
	
	int GetMODE() {
		return MODE;
	}
	
	void SetMODE(int pMODE) {
		if(pMODE<0) pMODE=0;
		if(pMODE>3) pMODE=3;
		if((pMODE>=0) && (pMODE<=3)) MODE=pMODE;
	}
	
	int GetCOLOR() {
		return COLOR;
	}
	
	void SetCOLOR(int pCOLOR) {
		if(pCOLOR<0) pCOLOR=0;
		if(pCOLOR>20) pCOLOR=20;
		if((pCOLOR>=0) && (pCOLOR<=20)) COLOR=pCOLOR;
	}
	
	boolean GetTV() {
		return TV;
	}
	
	void SetXBOX(boolean pTV) {
		TV = pTV;
	}
}
