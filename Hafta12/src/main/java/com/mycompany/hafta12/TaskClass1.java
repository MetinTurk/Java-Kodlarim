/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hafta12;

/**
 *
 * @author metin
 */
public class TaskClass1 implements Runnable{

    @Override
    public void run() {
        Thread thread4 = new Thread(new TaskClass1());
        thread4.start();
             try {
             for (int i = 1; i <= 10; i++) {
             System.out.print (" " + i);
             if (i == 5) thread4.join();
            }
            }
             catch (InterruptedException ex) {
            }
    }
    
}
