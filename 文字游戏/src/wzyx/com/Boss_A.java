package wzyx.com;
//A级怪物
public class Boss_A extends Boss{
	char x = 'A';
	String Bossname[] = {"魔眼石像鬼王","毒喙赤翎凤神","锋牙恶魔狼王","血角地狱龙帝","金背荒古猿神"};
	int ph;//生命值
	int lv;//等级
	int gjl;//攻击力
	int fyl;//防御力
	int sbz;//闪避值
	String name;
	//返回怪物死亡后的升级经验
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
		Yzdl.zdxx.setText(Yzdl.zdxx.getText()+Yzdl.hh+"怪物名:"+Yzdl.b_name+Yzdl.hh+"等级:"
		+b.getLv()+Yzdl.hh+"血量:"+b.getPh()+Yzdl.hh+"攻击力:"
		+b.getGjl()+Yzdl.hh+"防御力:"+b.getFyl()+Yzdl.hh+"闪避值:"+b.getSbz());
	}
}
