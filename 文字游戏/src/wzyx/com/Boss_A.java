package wzyx.com;
//A������
public class Boss_A extends Boss{
	char x = 'A';
	String Bossname[] = {"ħ��ʯ�����","��๳������","������ħ����","Ѫ�ǵ�������","�𱳻Ĺ�Գ��"};
	int ph;//����ֵ
	int lv;//�ȼ�
	int gjl;//������
	int fyl;//������
	int sbz;//����ֵ
	String name;
	//���ع������������������
	int sjjy(char x){
		if(x == 'A'){
			int jy = (int)(Math.random()*50+100);
			return jy;
		}
		return 0;
	}
	String getName(){
		int i = (int)(Math.random()*Bossname.length);
		name = this.Bossname[i];
		return name;
	}
	public Boss_A() {
		this.ph = (int)(Math.random()*100+200);
		this.lv = (int)(Math.random()*6+15);
		this.gjl = (int)(Math.random()*31+50);
		this.fyl = (int)(Math.random()*16+20);
		this.sbz = (int)(Math.random()*10+1);
	}
	public char getX() {
		return x;
	}
	public int getPh() {
		return ph;
	}
	public int getLv() {
		return lv;
	}
	public int getGjl() {
		return gjl;
	}
	public int getFyl() {
		return fyl;
	}
	public int getSbz() {
		return sbz;
	}
	public void setBossname(String[] bossname) {
		Bossname = bossname;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public void setGjl(int gjl) {
		this.gjl = gjl;
	}
	public void setFyl(int fyl) {
		this.fyl = fyl;
	}
	public void setSbz(int sbz) {
		this.sbz = sbz;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setX(char x) {
		this.x = x;
	}
	void show(Boss b){
		Yzdl.zdxx.setText(Yzdl.zdxx.getText()+Yzdl.hh+"������:"+Yzdl.b_name+Yzdl.hh+"�ȼ�:"
		+b.getLv()+Yzdl.hh+"Ѫ��:"+b.getPh()+Yzdl.hh+"������:"
		+b.getGjl()+Yzdl.hh+"������:"+b.getFyl()+Yzdl.hh+"����ֵ:"+b.getSbz());
	}
}
