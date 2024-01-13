package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DERS 10 HW 7

        HW7_DERS10.Planets[] planets = HW7_DERS10.Planets.values();

        System.out.println("Distances from the Sun (in kilometers):");
        for (HW7_DERS10.Planets planet : planets) {
            System.out.println(planet.name() + " : " + planet.getDistanceFromSun());
        }

        // Example: Calculate distance between Earth and Mars
        double distanceEarthToMars = getDistanceBetweenPlanets(HW7_DERS10.Planets.EARTH, HW7_DERS10.Planets.MARS);
        System.out.println("Distance between Earth and Mars: " + distanceEarthToMars + " kilometers");
    }



    private static double getDistanceBetweenPlanets(HW7_DERS10.Planets planet1, HW7_DERS10.Planets planet2) {
        double distance1 = planet1.getDistanceFromSun();
        double distance2 = planet2.getDistanceFromSun();

        return Math.abs(distance1 - distance2); //mesafeler arası hesaplama




















        /*  DERS 6 HW 5
        Muhasebe departmanı için personelin çalıştığı gün bilgisini girdiğinde bu girilen gün üzerinden maaşını hesaplayan ve
         eğer personelin o ay için çalıştığı gün sayısı 25’ten fazla ise fazla olan her gün için ekstra 1000TL prim veren metodu yazınız

        System.out.println("*******************************");
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
 */
    }
}