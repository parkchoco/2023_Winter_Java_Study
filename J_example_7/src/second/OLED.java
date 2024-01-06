package second;
//�θ� Ŭ���� Television �ڽ� Ŭ���� OLED
//��� television�� ���� 9���� �ɹ������� OLED�� ��� �����ñ�?
//�Ʒ��� ���� extends Television�� �߰����ָ� �ȴ�.

//�θ����� ���� ������ ��� �����ұ�? -> overriding
public class OLED extends Television {
	private int USB;//OLED�� USB�ڵ尡 ��� �ֳ�
	private int HDMI;//��ȭ�� ��Ʈ ��� �ֳ�
	private boolean XBOX;//���ӱ� �ڵ尡 �ִ� ����?
	
	//Constructor #1  - constructor without parameter �Ű������� ���� ������
	public OLED() {
		super();//�θ𿡰� �޴´�->�θ��� television()�� ��Ī
		
		USB=2;
		HDMI=3;
		XBOX=true;
	}
	
	//Constructor #2 - constructor with parameter �Ű������� �ִ� ������
	public OLED(int pChannel, int pVolume, boolean pOnOff,//���� 3�� �θ�
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
	
	//��ü�� �ڱⰡ ���� Ŭ������ ����غ���
	//overriding�� �Լ� ���븸 �ٸ��� ���� ���ƾ��Ѵ� ������.
	void PrintClassName(){
		System.out.println("Class Name = OLED");
	}
			
	
}
