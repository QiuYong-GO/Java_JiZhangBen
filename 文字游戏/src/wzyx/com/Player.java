package wzyx.com;
//�����Ϣ��
public class Player {
//	static String job[] = {"��ʿ","��ʿ","������","�̿�"};
	int maxph;
	int ph;//����ֵ
	int lv;//�ȼ�
	int gjl;//������
	int fyl;//������
	int sbz;//����ֵ
	int jy;//��ɫ��ǰ�ľ���
	int jyt;//��ɫ�ľ�����
	int job;
	String name,jobname;
	public Player() {
		this.maxph = 100;
		this.ph = 100;
		this.lv = 1;
		this.gjl = 10;
		this.fyl = 10;
		this.sbz = 5;
		this.jy = 0;//��ɫ��ǰ�ľ���
		this.jyt = 100;//��ɫ�ľ�����
	}
	//��ɫ��������
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
			Yzdl.zdxx.setText(Yzdl.zdxx.getText()+"���Ѿ�������"+Yzdl.hh);
			show(Yzdl.user);
		}
	}
	
	//��ɫ���˷���
	void kx(int gjl){
		if(gjl-this.fyl > 0)
			this.ph -= (gjl-this.fyl);
		else
			this.ph -= 1;
	}
	
	//��������
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
	
	//���˷���
	String ct(){
		String str = "�㳷����ս��,Ѫ���ѻָ�����״̬!"+Yzdl.hh;
		return str;
	}
	
	//�Ƿ�����ж�
	String Ifswpd(int ph){
		String str = "����������,�볷��ս����"+Yzdl.hh;
		String str_1 = "ս�����������ѻָ��������ֵ"+ph+"��"+Yzdl.hh;
		String str_2 = "����ǰ����ֵ��"+ph+"��"+Yzdl.hh;
		if(ph <=0)
			return str;
		else if(ph == maxph)
			return str_1;
		else
			return str_2;
	}
	
	//��ʾ��ɫ��Ϣ
	void show(Player user){
		int sjjy = user.jyt - user.jy;
		if(sjjy <= 0)
			sjjy = 0;
		char hh = '\n';
			Yzdl.zdxx.setText(Yzdl.zdxx.getText()+hh+user.name+"|��ɫ��Ϣ|"
			+hh+"ְҵ:"+user.jobname+hh+"�ȼ�:"+user.lv+hh+"����ֵ:"+user.ph+hh+"������:"+user.gjl+hh+
			"������:"+user.fyl+hh+"����:"+user.sbz+hh+"��ǰ����ֵ:"+user.jy+hh+
			"��������:"+sjjy+"�㾭��"+hh);
	}
}
