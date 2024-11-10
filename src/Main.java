
public class Main {
    public static long toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        }

        double milesPerHour = kilometresPerHour / 1.60934;
        return Math.round(milesPerHour);
    }
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));

    }
}