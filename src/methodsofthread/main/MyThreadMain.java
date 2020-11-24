/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 05-Nov-20
 *  Time: 11:34 AM
 */
package methodsofthread.main;

import methodsofthread.mythread.MyRunnable;
import methodsofthread.mythread.MyThread;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Runnable target = new MyRunnable();
        Thread runnableThread = new Thread(target);
        Thread myThread = new MyThread();

        //we will check the priority
        System.out.println("runnable priority = " + runnableThread.getPriority());
        System.out.println("mythread priority = " + myThread.getPriority());
        //now we want to print priority of current thread
        //getting the current thread reference
        Thread currentThread = Thread.currentThread();
        System.out.println("currentThread priority = " + currentThread.getPriority());

        //set the priority
        //runnableThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("runnable priority = " + runnableThread.getPriority());

        runnableThread.setName("Runnable_Thread");
        myThread.setName("My_Thread");
        myThread.start();
        //Thread.sleep(300);
        runnableThread.start();

        System.out.println("main is still executing");

    }
}
