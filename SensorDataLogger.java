
public class SensorDataLogger {
    public static void logData(double primitiveTemp, Double objectTemp) {
        Double boxed = primitiveTemp; // Auto-boxing
        double unboxed = objectTemp; // Auto-unboxing

        System.out.println("Primitive Temperature: " + primitiveTemp);
        System.out.println("Wrapper Temperature: " + objectTemp);
        System.out.println("Auto-boxed: " + boxed);
        System.out.println("Auto-unboxed: " + unboxed);
    }

    public static void main(String[] args) {
        logData(36.5, 37.2);
    }
}
