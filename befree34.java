package mylife;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class befree34 extends JFrame implements ActionListener{
	
	private JButton open,save,exit;
	private JTextArea edit;     //讓他擁有 edit
	private int count;
	
	public befree34(){
		super("My Window App"); //呼叫父類別的建構式
		//目標:設置視窗
		
		setSize(640,480);		//設置視窗大小
		setVisible(true);       //是否能不能顯示視窗
		setDefaultCloseOperation(EXIT_ON_CLOSE); //完全直接結束視窗
		open = new JButton("open");//            
		save = new JButton("save");//  			 設置按鈕
		exit = new JButton("exit");//
		edit = new JTextArea();
		
		setLayout(new BorderLayout());		//視窗設計師
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);
		top.add(save);			//在TOP裡面的添加按鈕
		top.add(exit);  
		add(top,BorderLayout.NORTH);
		add(edit,BorderLayout.CENTER);
	
//執行區:
		open.addActionListener(this);				//第一種 把類別寫在外面  共用類別
		save.addActionListener(this);
		open.addActionListener(new MyListener()); // 第二種 把類別寫在裡面
		open.addActionListener(new mylife.MyListener()); 
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
			}
		});
	}
///	
	private void doOpen(){
		System.out.println("InnerListener");
		
	}
	public static void main(String[] args) {   //以下執行區塊
		new befree34();
	}
	class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("MyListener" + count++);			//執行越接近的類別
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(open)){
			System.out.println("open");
		}
		else if (event.getSource().equals(save))
		{
			System.out.println("save");
		}
	}

}
class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("MyListener1");
		
	}
	
}