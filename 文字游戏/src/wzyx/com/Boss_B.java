package wzyx.com;
//B¼¶¹ÖÎï
public class Boss_B extends Boss{
	char x = 'B';
	String Bossname[] = {"µØÓüÁÔÈ®", "ÈıÊ×ÁÔÈ®", "Ê³ÃÎ¶ñ¹í","³¤½Ç¶ñ¹í", "÷È»óĞ°Éñ", 
			"Ğ°»ğ¾«Áé", "ÁÒ»ğ¾«Áé", "¿ÖÑÀ¶ñÄ§", "¼â×¦¶ñÄ§","±ùµ¶÷¼÷Ã",
			"÷¼÷ÃÓÂÊ¿", "ºÚË®ĞĞÊ¬", "ÎüÑª½©Ê¬", "¶ñÓÄÁé", "Ä§Òõ»ê", "Ê³Ê¬¹í",
			 "·¨ÕÈÊ¬Î×","°µºÚÆïÊ¿", "¿Ö²ÀÆïÊ¿", "¹ÇÁú", "¹íÁú",
			"ºÚ°µÕÓÔóÈË", "µØÓü¶´Ñ¨ÈË", "Ó¥ÉíÅ®Ñı", "Ó¥ÉíÅ®Î×", "Ğ±ÑÛ", "¶¾ÑÛ",
			"ÃÀ¶ÅÉ¯", "Å£Í·¹Ö",};
	int ph;
	int lv;
	int gjl;
	int fyl;
	int sbz;
	String name;
	//·µ»Ø¹ÖÎïËÀÍöºóµÄÉı¼¶¾­Ñé
	int sjjy(char x){
		if(x == 'B'){
			int jy = (int)(Math.random()*30+50);
			return jy;
		}
		return 0;
	}
		String getName(){
			int i = (int)(Math.random()*Bossname.length);
			name = this.Bossname[i];
			return name;
		}
		public Boss_B() {
			this.ph = (int)(Math.random()*41+50);
			this.lv = (int)(Math.random()*10+6);
			this.gjl = (int)(Math.random()*31+20);
			this.fyl = (int)(Math.random()*20+5);
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
			Yzdl.zdxx.setText(Yzdl.zdxx.getText()+Yzdl.hh+"¹ÖÎïÃû:"+Yzdl.b_name+Yzdl.hh+"µÈ¼¶:"
			+b.getLv()+Yzdl.hh+"ÑªÁ¿:"+b.getPh()+Yzdl.hh+"¹¥»÷Á¦:"
			+b.getGjl()+Yzdl.hh+"·ÀÓùÁ¦:"+b.getFyl()+Yzdl.hh+"ÉÁ±ÜÖµ:"+b.getSbz());
		}
}
