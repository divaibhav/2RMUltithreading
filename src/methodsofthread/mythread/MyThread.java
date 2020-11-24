/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 05-Nov-20
 *  Time: 11:32 AM
 */
package methodsofthread.mythread;

import methodsofthread.util.MyMessageUtility;

import javax.swing.*;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            MyMessageUtility.showMessage("My Thread");
            /*try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
