package midtermgitcode.ice3;

import java.util.Random;

public class Bakery extends Thread {

	public LittleGirl girl;

	/**
	 * 
	 * @param littleGirl
	 */
	public Bakery(LittleGirl littleGirl) {
		// TODO - implement Bakery.Bakery
		girl = littleGirl;
	}
        
        @Override
	public void run() {
		// TODO - implement Bakery.run
		Random rand = new Random();

        while (true) {
            try {
                // Sleep between 1 to 10 seconds
                Thread.sleep(1000 + rand.nextInt(9000));
            } catch (Exception exception) {
                System.out.println("Exception: " + exception.getMessage());
            }

            girl.breadReady();
        }
    }
	

}