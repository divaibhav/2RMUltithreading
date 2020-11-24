/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 05-Nov-20
 *  Time: 11:31 AM
 */
package methodsofthread.mythread;

import methodsofthread.util.MyMessageUtility;

import javax.swing.*;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            MyMessageUtility.showMessage("Runnable");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
