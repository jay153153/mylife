package homework;

import java.awt.BorderLayout         ;
import java.awt.Color                ;
import java.awt.event.ActionEvent    ;
import java.awt.event.ActionListener ;

import java.io.BufferedReader        ;
import java.io.IOException           ;
import java.io.InputStreamReader     ;
import java.io.PrintWriter           ;
import java.net.Socket               ;

import javax.swing.JButton           ;
import javax.swing.JFrame            ;
import javax.swing.JPanel            ;
import javax.swing.JScrollPane       ;
import javax.swing.JTextArea         ;



public class chat 
{
	JFrame            frame         ;
	JScrollPane       scrollPane    ;
	JPanel            panel1,panel2 ;
	JTextArea         area1 ,area2  ;
	JButton           button        ;
	
	Socket            socket        ;
	PrintWriter       writer        ;
	InputStreamReader streamReader  ;
	BufferedReader    bufRead       ;
	Thread            readerThread  ;
	
	chat ()
	{
		gui() ;
	}
	
	void gui()
	{
		frame      = new JFrame("Chatroom")     ;
		panel1     = new JPanel()               ;
		panel2     = new JPanel()               ;
		scrollPane = new JScrollPane(panel1)    ;
		area1      = new JTextArea(10,40)       ;
		area2      = new JTextArea(10,40)       ;
		button     = new JButton("送出")         ;
		
		panel1.add(area1)  ;
		panel2.add(area2)  ;
		panel2.add(button) ;
		frame.add(BorderLayout.NORTH,scrollPane)     ;
		frame.add(BorderLayout.CENTER,panel2)        ;
		                             // R   G   B
		panel1.setBackground(new Color(250,235,215)) ;
		panel2.setBackground(new Color(250,235,215)) ;
		
		setNetworking() ;
		
		readerThread = new Thread(new IncomingReader()) ;
		readerThread.start() ;
		
		area1.setEditable(false) ; //設定文字區1為不可輸入
		frame.setSize(500,450)   ;
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE) ;
		frame.setVisible(true)   ;
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				send() ;
			}
		}) ;
		
	}
	
	void setNetworking()
	{
		try
		{
			socket = new Socket("127.0.0.1",5000) ;
			//user
			writer = new PrintWriter(socket.getOutputStream()) ;
			//server
			streamReader = new InputStreamReader(socket.getInputStream()) ;
			bufRead      = new BufferedReader(streamReader) ;
			
			System.out.println("Networking ok") ;
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;
		}
	}
	void send()
	{
		try
		{
			writer.println(area2.getText()) ;
			writer.flush() ;
//			writer.close() ;
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}
		
		area2.setText("") ;
		
	}
		
	class IncomingReader implements Runnable
	{
		public void run()
		{
			String message ;
			 
			try
			{
				while((message = bufRead.readLine()) != null)
				{
					System.out.println("read : " + message) ;
					area1.append(message + "\n");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace() ;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new chat() ;
	}

}