/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hafta5poli;

class Hayvan {
    Hayvan() {
        System.out.println("Hayvan yapılandırıcısı");
    }

    public void avYakala() {
        System.out.println("Hayvan avYakala");
    } 
}

class Kartal extends Hayvan {
    Kartal() {
        System.out.println("Kartal yapılandırıcısı");
    }

    @Override // Metodu ezdiğimizi belirtmek için bu anotasyonu eklemek iyi bir pratiktir.
    public void avYakala() {
        System.out.println("Kartal avYakala");
    }
}

class Timsah extends Hayvan {
    Timsah() {
        System.out.println("Timsah yapılandırıcısı");
    }

    @Override // Metodu ezdiğimizi belirtmek için bu anotasyonu eklemek iyi bir pratiktir.
    public void avYakala() {
        System.out.println("Timsah avYakala");
    }
}

public class Hafta5Poli {
    public static Hayvan rasgeleSec() {
        int sec = (int) (Math.random() * 3);
        Hayvan h = null;
        if (sec == 0) {
            h = new Hayvan();
        } else if (sec == 1) {
            h = new Kartal();
        } else if (sec == 2) {
            h = new Timsah();
        }
        return h;
    }

    public static void main(String[] args) {
        Hayvan[] h = new Hayvan[3];

        // diziyi doldur
        System.out.println("--- Dizi Dolduruluyor ---");
        for (int i = 0; i < 3; i++) {
            h[i] = rasgeleSec(); // upcasting
        }

        System.out.println("\n--- Metotlar Çağrılıyor ---");
        // dizi elemanlarini ekrana bas
        for (int j = 0; j < 3; j++) {
            h[j].avYakala(); // Dikkat!
        }
    }
}
