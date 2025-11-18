package midtermgitcode.ice3;

public class LittleGirl {

	public Client[] clients = new Client[2];
	private int nextClient=0;

	public LittleGirl() {
		// TODO - implement LittleGirl.LittleGirl
		clients[0] = new Client("Peter");
                clients[1] = new Client("Paula");
	}

	public void breadReady() {
		// TODO - implement LittleGirl.breadReady
		clients[nextClient].breadReady();
                nextClient = (nextClient + 1) % clients.length;
	}

	public void startClientsDoingActivities() {
		// TODO - implement LittleGirl.startClientsDoingActivities
		// Print continuous random activities
            new Thread() {
                @Override
                public void run() {
                    while (true) {
                       Thread.sleep(1000);
                       for (Client c : clients) {
                       c.doRandomActivity();
                        }   

                
                   
                }
             }
        
     
        }.start();
    }    

}