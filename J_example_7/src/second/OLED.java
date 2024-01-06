package second;
//부모 클래스 Television 자식 클래스 OLED
//상속 television이 가진 9개의 맴버변수를 OLED에 어떻게 가져올까?
//아래와 같이 extends Television를 추가해주면 된다.

//부모한테 받은 내용을 어떻게 변경할까? -> overriding
public class OLED extends Television {
	private int USB;//OLED에 USB코드가 몇개나 있나
	private int HDMI;//고화질 폰트 몇개나 있나
	private boolean XBOX;//게임기 코드가 있니 없니?
	
	//Constructor #1  - constructor without parameter 매개변수가 없는 생성자
	public OLED() {
		super();//부모에게 받는다->부모의 television()을 지칭
		
		USB=2;
		HDMI=3;
		XBOX=true;
	}
	
	//Constructor #2 - constructor with parameter 매개변수가 있는 생성자
	public OLED(int pChannel, int pVolume, boolean pOnOff,//위의 3개 부모꺼
			int pUSB, int pHDMI, boolean pXBOX){
		
		super(pChannel, pVolume, pOnOff);
		
		USB = pUSB;
		HDMI = pHDMI;
		XBOX = pXBOX;
	}
	
	
	int GetUSB() {
		return USB;
	}
	
	void SetUSB(int pUSB) {
		if(pUSB<0) pUSB=0;
		if(pUSB>5) pUSB=5;
		if((pUSB>=0) && (pUSB<=5)) USB=pUSB;
	}
	
	int GetHDMI() {
		return HDMI;
	}
	
	void SetHDMI(int pHDMI) {
		if(pHDMI<0) pHDMI=0;
		if(pHDMI>10) pHDMI=10;
		if((pHDMI>=0) && (pHDMI<=10)) HDMI=pHDMI;
	}
	
	boolean GetXBOX() {
		return XBOX;
	}
	
	void SetXBOX(boolean pXBOX) {
		XBOX = pXBOX;
	}
	
	//객체가 자기가 속한 클래스를 출력해봐라
	//overriding은 함수 내용만 다르고 전부 같아야한다 덮어씌운다.
	void PrintClassName(){
		System.out.println("Class Name = OLED");
	}
			
	
}
