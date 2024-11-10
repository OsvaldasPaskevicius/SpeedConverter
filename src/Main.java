
public class Main {
    public static long toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        }

        double milesPerHour = kilometresPerHour / 1.60934;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometresPerHour);
            System.out.println(kilometresPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}

