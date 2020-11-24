/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 05-Nov-20
 *  Time: 12:07 PM
 */
package methodsofthread.util;

import javax.swing.*;

public class MyMessageUtility {
    //public static JFrame frame = new JFrame("MyFrame");
    public static synchronized void showMessage(String message){
        JOptionPane.showMessageDialog(null,message);
    }


    /*public static void showMessage(String message){
        System.out.println(message);
    }
    */
}
