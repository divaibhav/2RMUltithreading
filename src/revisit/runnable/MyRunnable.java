/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 3:11 PM
 */
package revisit.runnable;

public class MyRunnable implements Runnable {
    public void run(){
        System.out.println("my runnable implementation");
        //asking thread to wait for 10000 ms by calling sleep()
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep completed");
    }
}
