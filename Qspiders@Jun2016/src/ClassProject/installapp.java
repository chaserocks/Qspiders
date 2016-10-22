package ClassProject;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class installapp {
	public static void main(String[] args) throws ATUTestRecorderException, InterruptedException {
		ATUTestRecorder recorder=new ATUTestRecorder("E:\\SeleniumRecording\\","myrecording",false);
		recorder.start();
		Thread.sleep(1000040);
		recorder.stop();		
  }
}
