package wzyx.com;
//C级怪物
public class Boss_C extends Boss{
	char x = 'C';
	String Bossname[] = {"枪兵", "戟兵", "弓箭兵", "狮鹫", "剑士",
			"十字军", "僧侣", "祭司", "骑兵", "骑士","半人马", "矮人",
			"木精灵", "飞马", "木卫士", "木战士", "独角兽",
			"小妖精", "石像鬼", "石像怪", "石人", "铁人", 
			"法师","狼虱","凤仆","凶猴","龙奴"};
	int ph;//生命值
	int lv;//等级
	int gjl;//攻击力
	int fyl;//防御力
	int sbz;//闪避值
	String name;
	//返回怪物死亡后的升级经验
	int sjjy(char x){
		if(x == 'C'){
			int jy = (int)(Math.random()*10+20);
			return jy;
		}
		return 0;
	}
		String getName(){
			int i = (int)(Math.random()*Bossname.length);
			name = this.Bossname[i];
			return name;
		}
		public Boss_C() {
			this.ph = (int)(Math.random()*41+40);
			this.lv = (int)(Math.random()*10+1);
			this.gjl = (int)(Math.random()*10+10);
			this.fyl = (int)(Math.random()*4+5);
			this.sbz = (int)(Math.random()*5+1);
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
