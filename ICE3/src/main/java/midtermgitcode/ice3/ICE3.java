/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package midtermgitcode.ice3;

/**
 *
 * @author Spiol
 */
public class ICE3 {

    public static void main(String[] args) {
        

        LittleGirl girl = new LittleGirl();
        Bakery bakery = new Bakery(girl);

        // Start clients’ random activities
        girl.startClientsDoingActivities();

        // Start bakery thread
        bakery.start();
    }
    
}
