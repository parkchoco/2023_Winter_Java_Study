
public class Television implements Cloneable {//implements Cloneable�� �߰� ->Ŭ���Լ��� ����
	//��� ����
	//����Լ����� ������ ���� ��Ű�ų� ��������
	int channel;	//(1~50)
	int volume;		//(0~100)
	boolean onoff;
	
	//��� �Լ�
	int GetChannel() {
		return channel;
	}
	
	//�����ٰ� �����Ƿ� void 
	//GetChannel�� ���� �������� set�� �����Ѵ�
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
	}//�ּҰ� ��ġ�� �ʵ��� �Լ��� ����
}
