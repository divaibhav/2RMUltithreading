/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Nov-20
 *  Time: 12:42 PM
 */
package main;

import mythreads.MyThread;
import mythreads.MyThread2;

public class MyMain {
    public static void main(String[] args) {
        //step 2 reference of Runnable
        Runnable r = new MyThread();

        //step 3
        Thread t1 = new Thread(r);
        //step 4
        t1.start();
        Thread t2 = new MyThread2();
        t2.start();
        System.out.println(t1.isAlive());
    }
}
