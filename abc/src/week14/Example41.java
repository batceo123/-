package week14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Example41 {
public static void main(String[] args) {
	//TOOD Auto-generated method stub
	
	//1.创建所需要的所有组件
	//1.1所有容器
	JFrame win=new JFrame("增加学生基本信息");
	JPanel panelCenter=new JPanel();//中间区域
	JPanel panelBottom=new JPanel();//下面区域
	JPanel panelTop=new JPanel();
	
	JPanel panelCenterId=new JPanel();//中间区域
	JPanel panelCenterGender=new JPanel();//中间区域
	JPanel panelCenterFavorite=new JPanel();//中间区域
	JPanel panelCenterProvince=new JPanel();//中间区域	
	
	
	//创建所有的组件
	JLabel lbTitle=new JLabel("学生信息录入");
	Font JLabel=new Font("宋体",Font.PLAIN,20);
	lbTitle.setFont(JLabel);
	lbTitle.setForeground(Color.red);
	JLabel lbId=new JLabel("学号:");
	JLabel lbGender=new JLabel("性别:");
	JLabel lbFavorite=new JLabel("爱好:");
	JLabel lbProvince=new JLabel("省份:");
	
	JTextField tfId=new JTextField(10);
	JRadioButton rbMale=new JRadioButton("男");
	JRadioButton rbFemale=new JRadioButton("女");
	ButtonGroup groupGender=new ButtonGroup();
	groupGender.add(rbMale);
	groupGender.add(rbFemale);
	
	JCheckBox cbFav1=new JCheckBox("唱歌");
	JCheckBox cbFav2=new JCheckBox("旅游");
	JCheckBox cbFav3=new JCheckBox("学习");
	JCheckBox cbFav4=new JCheckBox("编程");
	
	JComboBox cbProvince= new JComboBox();
	cbProvince.addItem("湖北");
	cbProvince.addItem("湖南");
	cbProvince.addItem("重庆");
	cbProvince.addItem("上海");
	
	JButton btOk=new JButton("确定");
	JButton btCancel=new JButton("取消");
	JButton btExit=new JButton("退出");
	
	//创建布局对象
	BorderLayout borderLayout=new BorderLayout();
	FlowLayout flowLayout=new FlowLayout();
	flowLayout.setAlignment(flowLayout.LEFT);
	GridLayout gridLayout=new GridLayout(4,1);
	
	
	//为容器设置布局
	win.setLayout(borderLayout);
	panelCenter.setLayout(gridLayout);
	panelBottom.setLayout(flowLayout);
	

	panelCenterId.setLayout(flowLayout);
	panelCenterGender.setLayout(flowLayout);
	panelCenterFavorite.setLayout(flowLayout);
	panelCenterProvince.setLayout(flowLayout);
	
	
	//将组件增加到对应的容器中
	
	win.add(panelTop,BorderLayout.NORTH);
	win.add(panelCenter,BorderLayout.CENTER);
	win.add(panelBottom,BorderLayout.SOUTH);
	
	panelTop.add(lbTitle);
	panelCenter.add(panelCenterId);
	panelCenter.add(panelCenterGender);
	panelCenter.add(panelCenterFavorite);
	panelCenter.add(panelCenterProvince);
	
	panelCenterId.add(lbId);
	panelCenterId.add(tfId);
	
	panelCenterGender.add(lbGender);
	panelCenterGender.add(rbMale);
	panelCenterGender.add(rbFemale);
	
	panelCenterFavorite.add(lbFavorite);
	panelCenterFavorite.add(cbFav1);
	panelCenterFavorite.add(cbFav2);
	panelCenterFavorite.add(cbFav3);
	panelCenterFavorite.add(cbFav4);
	
	panelCenterProvince.add(lbProvince);
	panelCenterProvince.add(cbProvince);
	
	panelBottom.add(btOk);
	panelBottom.add(btCancel);
	panelBottom.add(btExit);
	
	//设置窗体大小位置
	win.setBounds(100,50,800,500);
	//显示窗体
	win.setVisible(true);
	
	}
}
