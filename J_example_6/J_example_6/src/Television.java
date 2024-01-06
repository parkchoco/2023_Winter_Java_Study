
public class Television implements Cloneable {//implements Cloneable를 추가 ->클론함수를 위해
	//멤버 변수
	//멤버함수에서 변수의 값을 지키거나 설정가능
	int channel;	//(1~50)
	int volume;		//(0~100)
	boolean onoff;
	
	//멤버 함수
	int GetChannel() {
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
}
