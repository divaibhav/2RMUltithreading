/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 3:26 PM
 */
package revisit.thread;

public class MyThread extends Thread{
    public void run(){
        System.out.println("my thread implementation");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sleep completed");
    }
}
