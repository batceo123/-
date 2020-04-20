package day01;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Casasar extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label = new JLabel("Casesar加密解密演示");
	JTextArea plaint;
	JTextField keytext=new JTextField();
	JTextField plaintext=new JTextField();//明文框
	JTextField ciphertext=new JTextField();//密文框
	String filetext=null;
	JLabel plaintlabel=new JLabel("请输入明文plaintext:");
	JLabel cipherlabel=new JLabel("请输入密文ciphertext:");
	JLabel keylabel=new JLabel("请输入偏移量key:");
	JButton pButton=new JButton("加密");
	JButton cButton=new JButton("解密");
	JButton zButton=new JButton("重置");
	JButton eButton=new JButton("退出");
	JButton buttonField;
	JButton buttonFile;
	public Casasar() {
		super("经典加密算法");
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setBackground(Color.PINK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Casasar.class.getResource("/picture/4.jpg")));
		setBounds(100,100,500,375);


		getContentPane().setLayout(null);

		JLabel labelt = new JLabel("\u51EF\u6492\u52A0\u5BC6\u89E3\u5BC6\u6F14\u793A");
		labelt.setBackground(Color.WHITE);
		labelt.setFont(new Font("楷体", Font.PLAIN, 23));
		labelt.setForeground(Color.RED);
		labelt.setBounds(122, 26, 230, 45);
		getContentPane().add(labelt);
		buttonFile = new JButton("\u6587\u4EF6\u64CD\u4F5C");
		buttonFile.setIcon(null);
		buttonFile.setBackground(Color.YELLOW);
		buttonFile.setForeground(Color.RED);
		buttonFile.setFont(new Font("楷体", Font.PLAIN, 17));
		buttonFile.setBounds(164, 126, 120, 45);
		getContentPane().add(buttonFile);

		buttonField = new JButton("\u6587\u672C\u6846\u64CD\u4F5C");
		buttonField.setFont(new Font("宋体", Font.PLAIN, 15));
		buttonField.setBackground(Color.YELLOW);
		buttonField.setForeground(Color.RED);
		buttonField.setBounds(161, 214, 123, 45);
		getContentPane().add(buttonField);
		buttonFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().repaint();
				

				label.setFont(new Font("华文宋体", Font.PLAIN, 18));
				getContentPane().add(label);
				label.setForeground(Color.red);
				label.setBounds(150, 10, 250, 36);

				keylabel.setBounds(90, 50,130, 21);
				keylabel.setForeground(Color.red);
				keytext.setBounds(200, 50, 130, 21);
				getContentPane().add(keylabel);
				getContentPane().add(keytext);


				JLabel labelplaint=new JLabel("明 文信息：");
				labelplaint.setBounds(10,70, 78, 15);
				labelplaint.setForeground(Color.red);
				getContentPane().add(labelplaint);


				plaint=new JTextArea();
				plaint.setColumns(40);
				plaint.setRows(10);

				JScrollPane scrollpane=new JScrollPane();
				scrollpane.setViewportView(plaint);
				Dimension dime=plaint.getPreferredSize();
				scrollpane.setBounds(10, 90, dime.width, dime.height);
				getContentPane().add(scrollpane);

				pButton.setBounds(20, 300, 100, 23);
				cButton.setBounds(140, 300, 100, 23);
				zButton.setBounds(250, 300, 100, 23);
				eButton.setBounds(360, 300, 100, 23);

				pButton.setForeground(Color.RED);
				pButton.setText("打开文件");
				getContentPane().add(pButton);

				cButton.setForeground(Color.RED);
				cButton.setText("加密");
				getContentPane().add(cButton);
				zButton.setText("保存密文");
				zButton.setForeground(Color.RED);
				getContentPane().add(zButton);
				eButton.setText("清除信息");
				eButton.setForeground(Color.RED);
				getContentPane().add(eButton);
				pButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						JFileChooser fileChoose=new JFileChooser();
						fileChoose.setDialogTitle("打开文件");
						//fileChoose.setBackground(Color.blue);
						int result=fileChoose.showOpenDialog(pButton);
						if (result == JFileChooser.APPROVE_OPTION) {
							File file = fileChoose.getSelectedFile();
							
							BufferedReader reader=null;
							StringBuilder str=new StringBuilder();
							try{
								
								reader=new BufferedReader(new FileReader(file));

								String text=null;
								while((text=reader.readLine())!=null)
								{

									str.append(text+"\n");

								}
								
								plaint.setText(str.toString());
								reader.close();

							}catch(IOException e){
								JOptionPane.showMessageDialog(null, "打开文件失败");
							}

						}
					}
				});
				cButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try{
							int key=Integer.parseInt(keytext.getText());

							String text=plaint.getText();

							if(text.equals(""))
							{
								JOptionPane.showMessageDialog(null, "明文信息不能为空");

								plaint.requestFocus(true);

							}

							filetext=Encryption(key,text,0);
							JOptionPane.showMessageDialog(null, "加密完成");

						}catch(NumberFormatException et){
							JOptionPane.showMessageDialog(null, "请输入整数");
							keytext.requestFocus(true);

						}

					}
				});
				zButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(filetext=="")
						{
							JOptionPane.showMessageDialog(null,"文件未加密");
							return;
						}
						JFileChooser fileChoose=new JFileChooser();
						fileChoose.setDialogTitle("保存文件");
						int result=fileChoose.showSaveDialog(zButton);
						if (result == JFileChooser.APPROVE_OPTION) {
							File file = fileChoose.getSelectedFile();
							FileWriter fos;
							try {
								fos = new FileWriter(file);

								BufferedWriter bw=new BufferedWriter(fos);
								String stre[]=filetext.split("\n");

								for(int i=0;i<stre.length;i++)
								{
									System.out.println(stre[i]);
									bw.write(stre[i]);
									bw.newLine();
								}
								JOptionPane.showMessageDialog(null,"密文已保存");
								bw.close();
							}catch(IOException e){
								JOptionPane.showMessageDialog(null,"文件不存在");

							}

						}

					}
				});
				eButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						plaint.setText("");
						
						
					}
				});

				getContentPane().validate();	
			}

		});

		buttonField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().removeAll();
				getContentPane().repaint();

				getContentPane().setLayout(null);




				label.setFont(new Font("华文宋体", Font.PLAIN, 18));
				getContentPane().add(label);
				label.setForeground(Color.red);
				label.setBounds(120, 28, 250, 36);

				keylabel.setFont(new Font("华文宋体", Font.PLAIN, 18));
				keylabel.setForeground(Color.RED);
				keytext.setColumns(15);

				keylabel.setBounds(39, 83, 180, 18);
				keytext.setBounds(220,80,180,21);

				plaintlabel.setFont(new Font("华文宋体", Font.PLAIN, 18));
				plaintlabel.setForeground(Color.RED);

				plaintlabel.setBounds(39, 123, 180, 18);
				plaintext.setBounds(220, 120, 180, 21);

				cipherlabel.setFont(new Font("华文宋体", Font.PLAIN, 18));
				cipherlabel.setForeground(Color.RED);
				cipherlabel.setBounds(39, 160, 180, 18);
				ciphertext.setBounds(220, 162, 180, 21);
				getContentPane().add(keylabel);
				getContentPane().add(keytext);
				getContentPane().add(plaintlabel);
				getContentPane().add(plaintext);
				getContentPane().add(cipherlabel);
				getContentPane().add(ciphertext);
				pButton.setBounds(38, 230, 68, 23);
				cButton.setBounds(120, 230, 68, 23);
				zButton.setBounds(202, 230, 68, 23);
				eButton.setBounds(284, 230, 68, 23);

				pButton.setForeground(Color.RED);
				getContentPane().add(pButton);
				cButton.setForeground(Color.RED);
				getContentPane().add(cButton);
				zButton.setForeground(Color.RED);
				getContentPane().add(zButton);
				eButton.setForeground(Color.RED);
				getContentPane().add(eButton);

				pButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try{
							int key=Integer.parseInt(keytext.getText());

							String text=plaintext.getText();

							if(text.equals(""))
							{
								JOptionPane.showMessageDialog(null, "明文信息不能为空");
								plaintext.requestFocus(true);

							}

							ciphertext.setText(Encryption(key,text,0));

						}catch(NumberFormatException et){
							JOptionPane.showMessageDialog(null, "请输入整数");
							keytext.requestFocus(true);

						}

					}
				});
				cButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try{
							int key=Integer.parseInt(keytext.getText());

							String text=ciphertext.getText();

							if(text.equals(""))
							{
								JOptionPane.showMessageDialog(null, "密文信息不能为空");
								plaintext.requestFocus(true);

							}

							plaintext.setText(Encryption(key,text,1));

						}catch(NumberFormatException et){
							JOptionPane.showMessageDialog(null, "请输入整数");
							keytext.requestFocus(true);

						}

					}
				});
				zButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						keytext.setText("");
						ciphertext.setText("");
						plaintext.setText("");

					}
				});
				eButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						

					}
				});
				getContentPane().validate();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}
	/*加密解密算法
	 * SELECT=0时为加密,TEXT为明文
	 * SELECT=1时为解密,TEXT为密文
	 * KEY为偏移量
	 */	
	
	public String Encryption(int key,String text,int select)
	{
		StringBuilder str=new StringBuilder();
		char ch[],chtemp = 0;
		ch=text.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			key=key%26;
			if(ch[i]>=97&&ch[i]<=122)
			{
				if(select==0)
				{
					chtemp=(char)(((char)ch[i]-97+key)%26+97);
				}
				else
				{
					chtemp=(char)(((char)ch[i]-97-key+26)%26+97);
				}
			}
			else if(ch[i]>=65&&ch[i]<=90)
			{
				if(select==0)
				{ 


					chtemp=(char)(((char)ch[i]-65+key)%26+65);
				}
				else
				{
					chtemp=(char)(((char)ch[i]-65-key+26)%26+65);
				}
			}
			else
			{
				chtemp=ch[i];
			}

			str.append(chtemp);
		}


		return str.toString();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casasar ca=new Casasar();

		ca.setVisible(true);

	}
}
