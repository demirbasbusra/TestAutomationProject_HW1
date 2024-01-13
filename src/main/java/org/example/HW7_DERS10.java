package org.example;

public class HW7_DERS10 {
    public enum Planets {
        MERCURY(50.000),
        VENUS(100.000),
        EARTH(150.000),
        MARS(200.000),
        JUPITER(700.000),
        SATURN(800.000),
        URANUS(900.000),
        NEPTUNE(950.000),
        PLUTON(980.000);

        private double distanceFromSun;

        Planets(double distanceFromSun) {
            this.distanceFromSun = distanceFromSun;
        }

        public double getDistanceFromSun() {
            return distanceFromSun;
        }

    }
}
