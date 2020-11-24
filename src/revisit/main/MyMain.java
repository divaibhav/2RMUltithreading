/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 3:12 PM
 */
package revisit.main;

import revisit.runnable.MyRunnable;
import revisit.thread.MyThread;

public class MyMain {
    public static void main(String[] args) {
       /* // example of Runnable
       Runnable r = new MyRunnable();

        //creating a thread
        Thread t1 = new Thread(r);
        t1.setName("MyThread");
        t1.setPriority(Thread.MAX_PRIORITY);
        //thread state
        System.out.println(t1.getState());
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread");
*/
       /* //example of Thread
        Thread t2 = new MyThread();
        t2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

        */

        //multi threading using lambda expression
        Runnable runnable = () -> {
            System.out.println("multi threading lambda expression");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("sleep completed");
        };

        Thread t3 = new Thread(runnable);
        t3.start();

        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t3.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
