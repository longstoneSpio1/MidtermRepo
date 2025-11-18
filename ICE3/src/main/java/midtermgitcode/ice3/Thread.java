package midtermgitcode.ice3;

public class Thread {

private boolean isRunning = false;

    public void start() {
        if (!isRunning) {
            isRunning = true;
            // Simulate calling run in a new thread
            run();
        }
    }

    public void run() {
        // Default implementation does nothing
        System.out.println("Thread.run() called");
    }
    
    public static void sleep(long millis) {
        try {
            java.lang.Thread.sleep(millis);
        } catch (InterruptedException e) {
            
        }
    }
    
    
    
    
}