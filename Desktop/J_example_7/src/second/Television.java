package second;

//부모 클래스 Television 자식 클래스 OLED
//상속 television이 가진 9개의 맴버변수를 어떻게 가져올까?

public class Television implements Cloneable {//implements Cloneable를 추가 ->클론함수를 위해
	//멤버 변수
	//멤버함수에서 변수의 값을 지키거나 설정가능
	protected int channel;	//(1~50)
	protected int volume;		//(0~100)
	protected boolean onoff;
	//부모 클래스이기 때문에 protected로 설정해준다.
	
	//Constructor #1  - constructor without parameter 매개변수가 없는 생성자
	Television() {
		channel = 10;
		volume = 20;
		onoff = true;
	}
	
	//위 아래 함수의 이름이 같을 수 있지만 내용이 달라야함, 구분가능하게
	
	//Constructor #2 - constructor with parameter
	Television(int pChannel, int pVolume, boolean pOnOff) {
		channel = pChannel;
		volume = pVolume;
		onoff = pOnOff;
	}

	
	//멤버 함수
	int GetChannel() {//Get은 멤버변수를 가져오는것
		return channel;
	}
	
	//돌료줄게 없으므로 void 
	//GetChannel은 값을 가져오고 set은 설정한다
	void SetChannel(int pChannel) {
		if(pChannel<1) channel=1;
		if(pChannel>50) channel=50;
		if((pChannel>=1)&&(pChannel<=50)) channel=pChannel;
	}
	
	int GetVolume(){
		return volume;
	}
	
	void SetVolume (int pVolume){
		if(pVolume<0) volume=0;
		if(pVolume>100) volume=100;
		if((pVolume>=0)&&(pVolume<=100)) volume=pVolume;
	}
	
	boolean GetOnOff(){
		return onoff;
	}
	
	void SetOnOff(boolean pOnOff) {
		onoff = pOnOff;
	}
	
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}//주소가 겹치지 않도록 함수를 설정
	
	//객체가 자기가 속한 클래스를 출력해봐라
	void PrintClassName(){
		System.out.println("Class Name = Television");
	}
	
}
