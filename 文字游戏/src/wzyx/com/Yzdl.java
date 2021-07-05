package wzyx.com;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Yzdl extends JFrame {

	private JPanel contentPane;
	private JTextField UserName,passWord;
	private JPanel panel,panel_1;
	private JLabel lblNewLabel;
	public static JTextArea zdxx;
	public static char hh = '\n';
	public static Player user;
	private JDialog jd,jd_2;
	private JTextField zcUserName;
	private JTextField zcPassword;
	private JLabel label_3;
	private JButton btnNewButton_3,btnNewButton_4,btnNewButton_5,
	btnNewButton_6,btnNewButton_7,btnNewButton_8;
	private JLabel lblNewLabel_3;
	private JTextField zhUserName;
	private JTextField zhPassword;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3;
	private ButtonGroup group;
	static String b_name;
	static char b_x;;
	static Boss b;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yzdl frame = new Yzdl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Yzdl() {
		setTitle("勇者大陆");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new HomePanel();
//		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1920, 1080);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\u89D2\u8272\u540D\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 25));
		label.setForeground(new Color(245, 245, 245));
		label.setBounds(721, 450, 100, 21);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 25));
		label_1.setForeground(new Color(245, 245, 245));
		label_1.setBounds(721, 515, 100, 21);
		panel.add(label_1);
		panel.setLayout(null);
		
		JLabel label_2 = new JLabel("欢迎来到勇者大陆！");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("宋体", Font.BOLD, 60));
		label_2.setForeground(new Color(255, 255, 102));
		label_2.setBounds(521, 271, 800, 58);
		panel.add(label_2);
		
		JButton btnNewButton = new JButton("登录游戏");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(51, 0, 153));
		btnNewButton.setBounds(721, 593, 150, 39);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				log_game(e);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("注册");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(new Color(51, 0, 153));
		btnNewButton_1.setBounds(969, 593, 150, 39);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jd.setVisible(true);
			}
		});
		panel.add(btnNewButton_1);
		
		UserName = new JTextField();
		UserName.setFont(new Font("宋体", Font.PLAIN, 20));
		UserName.setBounds(845, 450, 233, 26);
		panel.add(UserName);
		UserName.setColumns(10);
		
		passWord = new JPasswordField();
		passWord.setFont(new Font("宋体", Font.PLAIN, 20));
		passWord.setBounds(845, 515, 233, 26);
		panel.add(passWord);
		passWord.setColumns(10);
		
		label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		label_3.setForeground(Color.RED);
		label_3.setBounds(745, 721, 357, 33);
		panel.add(label_3);
		
		btnNewButton_3 = new JButton("忘记密码");
		btnNewButton_3.setForeground(new Color(51, 0, 153));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 25));
		btnNewButton_3.setBounds(845, 663, 150, 39);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jd_2.setVisible(true);
			}
		});
		panel.add(btnNewButton_3);
		
		panel_1 = new HomePanel();
//		panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBounds(0, 0, 1920, 1080);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(153, 51, 0));
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel.setBounds(780, 10, 400, 30);
		lblNewLabel.setVisible(false);
		panel_1.add(lblNewLabel);
		
		zdxx = new JTextArea();
		zdxx.setFont(new Font("Monospaced", Font.PLAIN, 25));
		zdxx.setBounds(200, 45, 850, 950);
		 zdxx.setEditable(false);//设置文本框为可编辑
		
		zdxx.setLineWrap(true);//如果内容过长，自动换行
		
		//以下四行代码为zdxx添加垂直滚动条
		JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(150, 45, 850, 950);
        panel_1.add(scrollPane_1);
//        zdxx.getDocument().addDocumentListener(new DocumentListener() {
//			@Override
//			public void removeUpdate(DocumentEvent e) {
////				public void insertUpdate(DocumentEvent e)：监听文本内容的插入
////				public void removeUpdate(DocumentEvent e)：监听文本内容的删除
////				public void changedUpdate(DocumentEvent e)：监听文本属性的变化
//			}
//			@Override
//			public void insertUpdate(DocumentEvent e) {
//			}
//			@Override
//			public void changedUpdate(DocumentEvent e) {
//			}
//		});
        scrollPane_1.setViewportView(zdxx);
        group = new ButtonGroup();
        rdbtnNewRadioButton = new JRadioButton("剑士");
        rdbtnNewRadioButton.setBackground(new Color(153, 51, 0));
        rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEADING);
        rdbtnNewRadioButton.setForeground(Color.WHITE);
        rdbtnNewRadioButton.setFont(new Font("宋体", Font.PLAIN, 20));
        rdbtnNewRadioButton.setBounds(1000, 100, 80, 27);
        rdbtnNewRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showzy(e);
			}
		});
        panel_1.add(rdbtnNewRadioButton);
        
        rdbtnNewRadioButton_1 = new JRadioButton("骑士");
        rdbtnNewRadioButton_1.setBackground(new Color(153, 51, 0));
        rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.LEADING);
        rdbtnNewRadioButton_1.setForeground(Color.WHITE);
        rdbtnNewRadioButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
        rdbtnNewRadioButton_1.setBounds(1000, 150, 80, 27);
        rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showzy(e);
			}
		});
        panel_1.add(rdbtnNewRadioButton_1);
        
        rdbtnNewRadioButton_2 = new JRadioButton("弓箭手");
        rdbtnNewRadioButton_2.setBackground(new Color(153, 51, 0));
        rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.LEADING);
        rdbtnNewRadioButton_2.setForeground(Color.WHITE);
        rdbtnNewRadioButton_2.setFont(new Font("宋体", Font.PLAIN, 20));
        rdbtnNewRadioButton_2.setBounds(1090, 100, 100, 27);
        rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showzy(e);
			}
		});
        panel_1.add(rdbtnNewRadioButton_2);
        
        rdbtnNewRadioButton_3 = new JRadioButton("刺客");
        rdbtnNewRadioButton.setBackground(new Color(153, 51, 0));
        rdbtnNewRadioButton_3.setBackground(new Color(153, 51, 0));
        rdbtnNewRadioButton_3.setHorizontalAlignment(SwingConstants.LEADING);
        rdbtnNewRadioButton_3.setForeground(Color.WHITE);
        rdbtnNewRadioButton_3.setFont(new Font("宋体", Font.PLAIN, 20));
        rdbtnNewRadioButton_3.setBounds(1090, 150, 80, 27);
        rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showzy(e);
			}
		});
        panel_1.add(rdbtnNewRadioButton_3);
        
        group.add(rdbtnNewRadioButton);
        group.add(rdbtnNewRadioButton_1);
        group.add(rdbtnNewRadioButton_2);
        group.add(rdbtnNewRadioButton_3);
        
        btnNewButton_5 = new JButton("开始冒险");
        btnNewButton_5.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_5.setBackground(Color.LIGHT_GRAY);
        btnNewButton_5.setBounds(1010, 300, 150, 40);
        btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ksmx(e);
				}
				
			});
        panel_1.add(btnNewButton_5);
        
        btnNewButton_6 = new JButton("发起进攻");
        btnNewButton_6.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_6.setBackground(Color.LIGHT_GRAY);
        btnNewButton_6.setBounds(1180, 300, 150, 40);
        btnNewButton_6.setVisible(false);
        btnNewButton_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fqjg(e);
				if(user.ph <= 0){
					btnNewButton_5.setText("继续冒险");
					btnNewButton_5.setVisible(false);
					btnNewButton_6.setVisible(false);
				}
			}
		});
        panel_1.add(btnNewButton_6);
        
        btnNewButton_7 = new JButton("战术撤退");
        btnNewButton_7.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_7.setBackground(Color.LIGHT_GRAY);
        btnNewButton_7.setBounds(1360, 300, 150, 40);
        btnNewButton_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				zdxx.setText(zdxx.getText()+hh+user.ct());
				btnNewButton_6.setVisible(false);
				btnNewButton_5.setText("继续冒险");
				btnNewButton_5.setVisible(true);
				user.ph = user.maxph;
			}
		});
        panel_1.add(btnNewButton_7);
        
        btnNewButton_8 = new JButton("角色信息");
        btnNewButton_8.setBackground(Color.LIGHT_GRAY);
        btnNewButton_8.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_8.setBounds(1010, 250, 150, 40);
        btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				user.name = UserName.getText();
				user.show(user);
			}
		});
        panel_1.add(btnNewButton_8);
        
        JButton btnNewButton_9 = new JButton("保存游戏");
        btnNewButton_9.setBackground(Color.LIGHT_GRAY);
        btnNewButton_9.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_9.setBounds(1010, 400, 150, 40);
        btnNewButton_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				save_game(e);
			}
		});
        panel_1.add(btnNewButton_9);
        
        JButton btnNewButton_10 = new JButton("怪物信息");
        btnNewButton_10.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_10.setBackground(Color.LIGHT_GRAY);
        btnNewButton_10.setBounds(1360, 250, 150, 40);
        btnNewButton_10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				b.show(b);
			}
		});
        panel_1.add(btnNewButton_10);
        
		jd = new JDialog(this,"注册");
		jd.setBounds(650, 300, 500, 300);
		jd.setResizable(false);//设置对话框大小不可变
		jd.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("游戏名：");
		lblNewLabel_1.setBounds(100, 40, 100, 25);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		jd.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密码：");
		lblNewLabel_2.setBounds(100, 80, 100, 25);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		jd.getContentPane().add(lblNewLabel_2);
		
		zcUserName = new JTextField();
		zcUserName.setBounds(200, 40, 200,25);
		zcUserName.setFont(new Font("宋体", Font.PLAIN, 20));
		jd.getContentPane().add(zcUserName);
		zcUserName.setColumns(10);
		
		zcPassword = new JTextField();
		zcPassword.setBounds(200, 80, 200,25);
		zcPassword.setFont(new Font("宋体", Font.PLAIN, 20));
		jd.getContentPane().add(zcPassword);
		zcPassword.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("确认");
		btnNewButton_2.setBounds(200,150,100,25);
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg_game(e);
			}
		});
		jd.getContentPane().add(btnNewButton_2);
		
		jd_2 = new JDialog(this,"忘记密码");
		jd_2.setBounds(650, 300, 500, 300);
		jd_2.setResizable(false);//设置对话框大小不可变
		jd_2.getContentPane().setLayout(null);
		
		lblNewLabel_3 = new JLabel("游戏名:");
		lblNewLabel_3.setBounds(100, 40, 100, 25);
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 18));
		jd_2.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("找回的密码:");
		lblNewLabel_5.setBounds(100, 70, 100, 25);
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 18));
		jd_2.getContentPane().add(lblNewLabel_5);
		
		zhUserName = new JTextField();
		zhUserName.setBounds(200, 40, 200,25);
		zhUserName.setFont(new Font("宋体", Font.PLAIN, 18));
		jd_2.getContentPane().add(zhUserName);
		zhUserName.setColumns(10);
		
		zhPassword = new JTextField();
		zhPassword.setText("");
		zhPassword.setBounds(200, 70, 200,25);
		zhPassword.setFont(new Font("宋体", Font.PLAIN, 18));
		jd_2.getContentPane().add(zhPassword);
		zhPassword.setColumns(10);
		
		btnNewButton_4 = new JButton("确认找回");
		btnNewButton_4.setBounds(200,150,130,25);
		btnNewButton_4.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				password_zh(e);
			}
		});
		jd_2.getContentPane().add(btnNewButton_4);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(200, 100, 150, 25);
		jd_2.getContentPane().add(lblNewLabel_4);
		
	}
	//保存游戏
	protected void save_game(ActionEvent e) {
		Player user = Yzdl.user;
		FileOutputStream fos;
		DataOutputStream dos;
		String path_1 = "D:/勇者大陆/角色信息/"+user.name+".txt";
		try{
		fos = new FileOutputStream(path_1);
		dos = new DataOutputStream(fos);
		dos.writeInt(user.lv);
		dos.writeInt(user.ph);
		dos.writeInt(user.maxph);
		dos.writeInt(user.gjl);
		dos.writeInt(user.fyl);
		dos.writeInt(user.sbz);
		dos.writeInt(user.jy);
		dos.writeInt(user.jyt);
		dos.writeInt(user.job);
		dos.writeChars(user.name);
		
		fos.close();
		dos.close();
		}catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		zdxx.setText(zdxx.getText()+hh+"保存成功！"+hh);
	}

	//登录游戏事件
	protected void log_game(ActionEvent e) {
		FileInputStream fis;
		DataInputStream dis;
		String path_1 = "D:/勇者大陆/角色信息/"+UserName.getText()+".txt";
		FileReader fr;
		File file = new File(path_1);
		if(!file.exists()){
			label_3.setText("角色不存在");
			panel_1.setVisible(false);
		}else{
			try{
				fr = new FileReader("D:/勇者大陆/角色信息/"+UserName.getText()+"_password.txt");
				fis = new FileInputStream(path_1);
				dis = new DataInputStream(fis);
				char array[] = new char[1024];
				StringBuilder builder = new StringBuilder();
		        int count;
		        while ((count = fr.read(array)) != -1) {
		            builder.append(array, 0, count);
		        }
				if(passWord.getText().equals(builder.toString())){
					panel_1.setVisible(true);
					panel.setVisible(false);
					lblNewLabel.setVisible(true);
					lblNewLabel.setText(UserName.getText()+" 勇士欢迎你的到来!");
					user = new Player();
					try{
						user.lv = dis.readInt();
						user.ph = dis.readInt();
						user.maxph = dis.readInt();
						user.gjl = dis.readInt();
						user.fyl = dis.readInt();
						user.sbz = dis.readInt();
						user.jy = dis.readInt();
						user.jyt = dis.readInt();
						user.job = dis.readInt();
						String name = dis.readLine().toString();
						char name_ary[] = name.toCharArray();
						for(int i=0;i<name_ary.length;i++){
							if(i%2 != 0)
								user.name += name_ary[i];
						}
						if(user.job == 0){
							zdxx.setText(UserName.getText()+hh+"请选择您的职业"+hh);
							rdbtnNewRadioButton.setVisible(true);
							rdbtnNewRadioButton_1.setVisible(true);
							rdbtnNewRadioButton_2.setVisible(true);
							rdbtnNewRadioButton_3.setVisible(true);
						}else{
							rdbtnNewRadioButton.setVisible(false);
							rdbtnNewRadioButton_1.setVisible(false);
							rdbtnNewRadioButton_2.setVisible(false);
							rdbtnNewRadioButton_3.setVisible(false);
							switch(user.job){
							case 1:	user.jobname = "剑士";
							case 2:	user.jobname = "骑士";
							case 3:	user.jobname = "弓箭手";
							case 4:	user.jobname = "刺客";
							}
						}
					}catch (EOFException e2) {
						System.out.println("还未选择职业");
					}catch (IOException e5) {
						e5.printStackTrace();
					}catch (Exception e6) {
						e6.printStackTrace();
					}
					panel_1.setVisible(true);
				}
				else{
					label_3.setText("密码错误");
					panel_1.setVisible(false);
				}
				fis.close();
				dis.close();
			}catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

	//确认注册
	protected void reg_game(ActionEvent e) {
		Player user = new Player();
		FileOutputStream fos;
		DataOutputStream dos;
		FileWriter fw;
		File file;
		String path = "D:/勇者大陆/角色信息"; 
		String path_1 = "D:/勇者大陆/角色信息/"+zcUserName.getText()+".txt";
		file = new File(path);
		if(!file.exists()){//判断是否有该文件夹，如果没有则创建
			file.mkdirs();
		}
		try{
		fos = new FileOutputStream(path_1);
		dos = new DataOutputStream(fos);
		fw = new FileWriter("D:/勇者大陆/角色信息/"+zcUserName.getText()+"_password.txt",false);
		fw.write(zcPassword.getText());
		int job = 0;
		user.name = zcUserName.getText();
		String name = user.name;
		dos.writeInt(user.lv);
		dos.writeInt(user.ph);
		dos.writeInt(user.maxph);
		dos.writeInt(user.gjl);
		dos.writeInt(user.fyl);
		dos.writeInt(user.sbz);
		dos.writeInt(user.jy);
		dos.writeInt(user.jyt);
		dos.writeInt(job);
		dos.writeChars(name);
		
		fos.close();
		dos.close();//写入属性
		fw.close();//写入密码
		}catch (IOException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		jd.setVisible(false);
	}

	//密码找回方法
	protected void password_zh(ActionEvent e) {
		FileInputStream fis;
		DataInputStream dis;
		FileReader fr = null;
		File file = new File("D:/勇者大陆/角色信息/"+zhUserName.getText()+".txt");
		File file_password = new File("D:/勇者大陆/角色信息/"+zhUserName.getText()+"_password.txt");
		if(file.exists()){
		try{
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			fr = new FileReader(file_password);
			char array[] = new char[1024];
			StringBuilder builder = new StringBuilder();
	        int count;
	        while ((count = fr.read(array)) != -1) {
	            builder.append(array, 0, count);
	        }
//			System.out.println("密码"+builder.toString());
			zhPassword.setText(builder.toString());
			lblNewLabel_4.setText("找回成功！");
			
			fis.close();
			dis.close();
			fr.close();
		}catch (IOException e3) {
			// TODO: handle exception
			e3.printStackTrace();
		}
		}else{
			lblNewLabel_4.setText("游戏名不存在！");
		}
	}
	
	//开始冒险事件
	protected void ksmx(ActionEvent e) {
		int i = (int)(Math.random()*22);
		switch(i){
			case 0:{b = new Boss_A();
					b_name = b.getName();
					if(user.lv <= b.getLv()){
						zdxx.setText(zdxx.getText()+hh+"你遇上了强大的敌人！"+b_name+hh+"谨慎行事"+hh);
						break;
						}
					else{
						zdxx.setText(zdxx.getText()+hh+"你遇上了势均力敌的敌人！"+b_name+hh+"勇敢的发起进攻吧！"+hh);
						break;
						}
					}
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 1:{b = new Boss_B();
					b_name = b.getName();
					if(user.lv <= b.getLv()){
						zdxx.setText(zdxx.getText()+hh+"你遇上了强大的敌人！"+b_name+hh+"谨慎行事");
						break;
						}
					else{
						zdxx.setText(zdxx.getText()+hh+"你遇上了势均力敌的敌人！"+b_name+hh+"勇敢的发起进攻吧！");
						break;
						}
					}
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 8:{b = new Boss_C();
					b_name = b.getName();
					if(user.lv <= b.getLv()){
						zdxx.setText(zdxx.getText()+hh+"你遇上了强大的敌人！"+b_name+hh+"谨慎行事");
						break;
						}
					else{
						zdxx.setText(zdxx.getText()+hh+"你遇上了势均力敌的敌人！"+b_name+hh+"勇敢的发起进攻吧！");
						break;
					}
				}
			}
		btnNewButton_5.setVisible(false);
		btnNewButton_6.setVisible(true);
	}
	
	//选择职业方法
	protected void showzy(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == rdbtnNewRadioButton){// e.getSource()获取 到点击的控件名
			zdxx.setText(zdxx.getText()+UserName.getText()+"您成为了一名剑士！勇敢的去冒险吧！");
			user.jobname = rdbtnNewRadioButton.getText();
			user.job = 1;
			rdbtnNewRadioButton.setVisible(false);
			rdbtnNewRadioButton_1.setVisible(false);
			rdbtnNewRadioButton_2.setVisible(false);
			rdbtnNewRadioButton_3.setVisible(false);
		}
		else if (e.getSource() == rdbtnNewRadioButton_1){
			zdxx.setText(zdxx.getText()+UserName.getText()+"您成为了一名骑士！勇敢的去冒险吧！");
			user.jobname = rdbtnNewRadioButton_1.getText();
			user.job = 2;
			rdbtnNewRadioButton.setVisible(false);
			rdbtnNewRadioButton_1.setVisible(false);
			rdbtnNewRadioButton_2.setVisible(false);
			rdbtnNewRadioButton_3.setVisible(false);
		}
		else if (e.getSource() == rdbtnNewRadioButton_2){
			zdxx.setText(zdxx.getText()+UserName.getText()+"您成为了一名弓箭手！勇敢的去冒险吧！");
			user.jobname = rdbtnNewRadioButton_2.getText();
			user.job = 3;
			rdbtnNewRadioButton.setVisible(false);
			rdbtnNewRadioButton_1.setVisible(false);
			rdbtnNewRadioButton_2.setVisible(false);
			rdbtnNewRadioButton_3.setVisible(false);
		}
		else{
			zdxx.setText(zdxx.getText()+UserName.getText()+"您成为了一名刺客！勇敢的去冒险吧！");
			user.jobname = rdbtnNewRadioButton_3.getText();
			user.job = 4;
			rdbtnNewRadioButton.setVisible(false);
			rdbtnNewRadioButton_1.setVisible(false);
			rdbtnNewRadioButton_2.setVisible(false);
			rdbtnNewRadioButton_3.setVisible(false);
		}
	}
	
	//发起进攻事件
	protected void fqjg(ActionEvent e){
		int gwph;
		
		Calendar calendar = Calendar.getInstance();
		//固定搭配Calendar calendar = Calendar.getInstance();
		//创建时间对象
		int hour,minute,second;
		hour = calendar.get(Calendar.HOUR);//获取小时
		minute = calendar.get(Calendar.MINUTE);//获取分钟
		second = calendar.get(Calendar.SECOND);//获取秒
		String tims = hour+"时"+minute+"分"+second+"秒";
		int b_ph = b.getPh();
		int b_fyl = b.getFyl();
		int b_sbz = b.getSbz();
		gwph = user.gj(b_ph,b_fyl,b_sbz);
		if(gwph == b.getPh()){
			zdxx.setText(zdxx.getText()+hh+tims+hh+"攻击失败!敌方闪避成功"+hh);
			user.kx(b.getGjl());//角色扣血
			zdxx.setText(zdxx.getText()+user.Ifswpd(user.ph));
		}
		else if(gwph <= 0){
			zdxx.setText(zdxx.getText()+hh+tims+hh+"攻击成功!"+b_name+"已经死亡！"+hh);
			user.ph = user.maxph;
			int hdjy = b.sjjy(b.getX());
			zdxx.setText(zdxx.getText()+"获得"+hdjy+"点经验!"+hh);
			user.jy += hdjy;
			user.sj(user.jy, user.jyt);
			btnNewButton_5.setText("继续冒险");
			btnNewButton_5.setVisible(true);
			zdxx.setText(zdxx.getText()+user.Ifswpd(user.ph));
			btnNewButton_6.setVisible(false);
		}
		else{
			zdxx.setText(zdxx.getText()+hh+tims+hh+"攻击成功!敌方剩余血量:"+gwph+hh);
			user.kx(b.getGjl());//角色扣血
			zdxx.setText(zdxx.getText()+user.Ifswpd(user.ph));
		}
		b.setPh(gwph);
	}
}
