package mylifegit;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
                                                                                       
public class MyClock extends JLabel {
	private Timer timer;
	public MyClock()
	  {
		timer = new Timer();
		timer.schedule(new MyTask(),0,500);
      }
	private class MyTask extends TimerTask{
		@Override
		public void run() 
		  {
			Calendar now = Calendar.getInstance();  //取得本機預設時間
			int hh = now.get(Calendar.HOUR_OF_DAY);
			int mm = now.get(Calendar.MINUTE);
			int ss = now.get(Calendar.SECOND);
			setText(hh+":"+mm+":"+ss);
		  }	
	}
}
