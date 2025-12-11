/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hafta12;

/**
 *
 * @author metin
 */
public class TaskClass implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("i: " +i);
            /*
            if (i == 5) try {
                Thread.sleep(1000);     //thread bekletme
            } catch (InterruptedException ex) {
                System.getLogger(TaskClass.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
*/
            //Thread.yield(); //diğer Thread çalışması için zaman tanır.
        }
    }
    
}
