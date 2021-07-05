package wzyx.com;
//玩家信息类
public class Player {
//	static String job[] = {"剑士","骑士","弓箭手","刺客"};
	int maxph;
	int ph;//生命值
	int lv;//等级
	int gjl;//攻击力
	int fyl;//防御力
	int sbz;//闪避值
	int jy;//角色当前的经验
	int jyt;//角色的经验条
	int job;
	String name,jobname;
	public Player() {
		this.maxph = 100;
		this.ph = 100;
		this.lv = 1;
		this.gjl = 10;
		this.fyl = 10;
		this.sbz = 5;
		this.jy = 0;//角色当前的经验
		this.jyt = 100;//角色的经验条
	}
	//角色升级方法
	void sj(int jy,int jyt){
		if(jy >= jyt){
			this.lv += 1;
			this.maxph += 10;
			this.gjl += 5;
			this.fyl += 5;
			this.sbz += 1;
			this.jy = 0;
			if(!(this.lv>=1 && this.lv<=5)){
				if(this.lv>=6 && this.lv<=10)
					this.jyt = 150;
				else
					this.jyt = 200;
			}
			Yzdl.zdxx.setText(Yzdl.zdxx.getText()+"您已经升级！"+Yzdl.hh);
			show(Yzdl.user);
		}
	}
	
	//角色受伤方法
	void kx(int gjl){
		if(gjl-this.fyl > 0)
			this.ph -= (gjl-this.fyl);
		else
			this.ph -= 1;
	}
	
	//攻击方法
	int gj(int ph,int fyl,int sbz){
		int i = (int)(Math.random()*10+1);
		int num = 0;
		if(this.sbz > sbz){
			if(i <= 9 || num%3 == 0){
				if(this.gjl-fyl > 0)
					ph -= (this.gjl-fyl);
				else
					ph -= 1;
			return ph;
			}else{
				num++;
				return ph;
			}
		}else if(i >= 6 || num%3 == 0){
				if(this.gjl-fyl > 0)
					ph -= (this.gjl-fyl);
				else
					ph -= 1;
			return ph;
			}else{
				num++;
				return ph;
			}
	}
	
	//撤退方法
	String ct(){
		String str = "你撤离了战斗,血量已恢复至满状态!"+Yzdl.hh;
		return str;
	}
	
	//是否活着判断
	String Ifswpd(int ph){
		String str = "您已受重伤,请撤离战斗！"+Yzdl.hh;
		String str_1 = "战斗结束！您已恢复最大生命值"+ph+"点"+Yzdl.hh;
		String str_2 = "您当前生命值："+ph+"点"+Yzdl.hh;
		if(ph <=0)
			return str;
		else if(ph == maxph)
			return str_1;
		else
			return str_2;
	}
	
	//显示角色信息
	void show(Player user){
		int sjjy = user.jyt - user.jy;
		if(sjjy <= 0)
			sjjy = 0;
		char hh = '\n';
			Yzdl.zdxx.setText(Yzdl.zdxx.getText()+hh+user.name+"|角色信息|"
			+hh+"职业:"+user.jobname+hh+"等级:"+user.lv+hh+"生命值:"+user.ph+hh+"攻击力:"+user.gjl+hh+
			"防御力:"+user.fyl+hh+"闪避:"+user.sbz+hh+"当前经验值:"+user.jy+hh+
			"升级还需:"+sjjy+"点经验"+hh);
	}
}
