package second;

//�θ� Ŭ���� Television �ڽ� Ŭ���� OLED
//��� television�� ���� 9���� �ɹ������� ��� �����ñ�?

public class Television implements Cloneable {//implements Cloneable�� �߰� ->Ŭ���Լ��� ����
	//��� ����
	//����Լ����� ������ ���� ��Ű�ų� ��������
	protected int channel;	//(1~50)
	protected int volume;		//(0~100)
	protected boolean onoff;
	//�θ� Ŭ�����̱� ������ protected�� �������ش�.
	
	//Constructor #1  - constructor without parameter �Ű������� ���� ������
	Television() {
		channel = 10;
		volume = 20;
		onoff = true;
	}
	
	//�� �Ʒ� �Լ��� �̸��� ���� �� ������ ������ �޶����, ���а����ϰ�
	
	//Constructor #2 - constructor with parameter
	Television(int pChannel, int pVolume, boolean pOnOff) {
		channel = pChannel;
		volume = pVolume;
		onoff = pOnOff;
	}

	
	//��� �Լ�
	int GetChannel() {//Get�� ��������� �������°�
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
	
	//��ü�� �ڱⰡ ���� Ŭ������ ����غ���
	void PrintClassName(){
		System.out.println("Class Name = Television");
	}
	
}
