package wzyx.com;
//怪物类
public class Boss {
	String Bossname[] = {};
	int ph;//生命值
	int lv;//等级
	int gjl;//攻击力
	int fyl;//防御力
	int sbz;//闪避值
	String name;
	char x;
	String getName(){
		int i = (int)(Math.random()*Bossname.length);
		name = this.Bossname[i];
		return name;
	}
	int sjjy(char x){
		if(x == 'C'){
			int jy = (int)(Math.random()*10+20);
			return jy;
		}
		return 0;
	}
	public String[] getBossname() {
		return Bossname;
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
	public char getX() {
		return x;
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
		
	}
}
