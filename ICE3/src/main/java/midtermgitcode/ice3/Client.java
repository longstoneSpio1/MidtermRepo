package midtermgitcode.ice3;

import java.util.Random;

public class Client {

	public String name;
	public Random rand = new Random();

	/**
	 * 
	 * @param name
	 */
	public Client(String name) {
		// TODO - implement Client.Client
		this.name = name;
	}

	public void doRandomActivity() {
		// TODO - implement Client.doRandomActivity
                
		switch (rand.nextInt(5)) {
            case 0 -> System.out.println(name + " cleaning the barn.");
            case 1 -> System.out.println(name + " walking the animals.");
            case 2 -> System.out.println(name + " churning butter.");
            case 3 -> System.out.println(name + " washing his truck.");
            case 4 -> System.out.println(name + " and Paula line dancing.");
	}
                
        }

	public void breadReady() {
		// TODO - implement Client.breadReady
		System.out.println("******* delivered bread to " + name);
	}

}