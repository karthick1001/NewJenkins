package helloworld;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseClick 
{
	public static void main(String args[]) throws InterruptedException
	{
		Robot bot;
		try {
			bot = new Robot();
			for(int i =0;;i++)
			{
			bot.mouseMove(100, 200);    
		    	bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		   	bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(20000);
			bot.mouseMove(300, 100);    
		    	bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		   	bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(20000);
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
