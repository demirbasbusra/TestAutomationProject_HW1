package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Muhasebe departmanı için personelin çalıştığı gün bilgisini girdiğinde bu girilen gün üzerinden maaşını hesaplayan ve
         eğer personelin o ay için çalıştığı gün sayısı 25’ten fazla ise fazla olan her gün için ekstra 1000TL prim veren metodu yazınız
         */
        System.out.println("DERS 6 ÖDEV 5");
        Scanner scanner = new Scanner(System.in);
        int workDayNumber = scanner.nextInt();
        int salary;
        System.out.println("Maaş Hesaplaması İçin Personelin Çalıştığı Gün Sayısını Giriniz : "+ workDayNumber);
        if(workDayNumber > 25){
            int prim = (31 - workDayNumber) * 1000;
            salary = workDayNumber*500;
            salary += prim;
            System.out.println("Çalışılan Gün sayısını Giriniz : " + workDayNumber);
            System.out.println("Primli Maaş Ödemesi : " + salary );
        }
        else{
            System.out.println("Çalışılan her gün için ödenen ücret 500 Türk Lirasıdır, Bilginize :))");
            salary = workDayNumber*500;
            System.out.println("Primsiz Maaş Hesaplaması : " + salary);

        }

    }
}