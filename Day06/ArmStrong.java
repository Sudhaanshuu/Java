package Suku;

class ArmStrong {
    static String armstrongNumber(int n) {
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        int sumOfCubes = (hundreds * hundreds * hundreds) +
                (tens * tens * tens) +
                (units * units * units);

        if (sumOfCubes == n) {
            return "true";
        } else {
            return "false";
        }
    }
}
