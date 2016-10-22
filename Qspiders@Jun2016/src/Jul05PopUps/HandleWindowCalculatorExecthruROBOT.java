package Jul05PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class HandleWindowCalculatorExecthruROBOT {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	Runtime.getRuntime().exec("C://Windows//system32//calc.exe");
	
	Robot rb=new Robot();
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_6);
	rb.keyRelease(KeyEvent.VK_6);
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_MINUS);
	rb.keyRelease(KeyEvent.VK_MINUS);
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_5);
	rb.keyRelease(KeyEvent.VK_5);
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
}


