package InterstingCodes;

public class DesignClock {

	public static void main(String[] args) {
		int hour = 0;
	    int minute = 0;
	    int second = 0;

	    try {
	      while (true) {
	        //clear output screen
	        System.out.println("\033[H\033[2J");
	        System.out.flush();

	        System.out.printf("%02d : %02d : %02d ", hour, minute, second);

	        second++;

	        if (second == 60) {
	          minute += 1;
	          second = 0;
	        }
	        if (minute == 60) {
	          hour += 1;
	          minute = 0;
	        }
	        if (hour == 24) {
	          hour = 0;
	          minute = 0;
	          second = 0;
	        }

	        Thread.sleep(1000);
	      }
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
	}
	


