/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space.crab8012;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jorda
 */
public class TimeCheckerThread extends Thread {

    public Date dNow = new Date();
    public SimpleDateFormat fu = new SimpleDateFormat("HH:mm");

    public void run() {

        while (true) {
            dNow = new Date();
            System.out.println("TimeCheck @ " + fu.format(dNow));
 
            if (MainFrame.times.contains(fu.format(dNow))) {
                System.out.println("Time Found: " + fu.format(dNow));
                MainFrame.timerTripped();
            }
            

            try {
                Thread.sleep(60000);
            } catch (Exception e) {
                System.out.println("ERROR SLEEPING");
            }
        }

    }
}
