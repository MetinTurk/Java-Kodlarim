/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hafta12;

/**
 *
 * @author metin
 */
public class Hafta12 {

    public static void main(String[] args) {
        TaskClass task1 = new TaskClass();
        TaskClass1 task2 = new TaskClass1();
        TaskClass2 task3 = new TaskClass2();


        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);


        //t1.start();
        t2.start();
        //t3.start();

        //thread paralel programlaam bir işlemi parçalara bölme birden fazla işi aynı anda yapma . işlemci çekirdeklerine işleri dağıtma .
        //Runable : thread çalıştırmka için kullanılır.
        
        
    }
}
