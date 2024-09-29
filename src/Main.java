
public class Main {
    public static void main(String[] args) {
        long[] z = new long[11];
        for (int i = 5; i < 15 + 1; i++) {
            z[i - 5] = i;
        }
        double[] x = new double[17];
        double minValue = -10;
        double maxValue = 7;
        for (int i = 0; i < 17; i++) {
            double k = Math.min(minValue + Math.random() * (maxValue - minValue + 1), 7);
            x[i] = k;
        }
        double[][] z1 = prog(x, z);
        vyvod(z1);


    }

    public static double first(double x1) {
        return Math.pow(((Math.sin(Math.pow((1 / 4 * (x1 - 1)), (x1))) + 1) / Math.tan(3 / x1)), Math.pow((0.5 / (1 / 2 + Math.pow((x1), (x1 / 4)))), 2));
    }

    public static double second(double x1) {
        return Math.asin(Math.pow(Math.E, Math.pow(-Math.sqrt(Math.abs(x1)), 1 / 3)));
    }

    public static double third(double x1) {
        return Math.pow(Math.log((Math.abs(x1))), 1 / 3);
    }

    public static double[][] prog(double[] x, long[] z) {
        double[][] z1 = new double[11][17];
        for (int i = 0; i < z1.length; i++) {
            if (z[i] == 11) {
                for (int j = 0; j < z1[i].length; j++) {
                    z1[i][j] = first(x[j]);
                }
            } else if (z[i] % 5 == 0 || z[i] == 13 || z[i] == 8) {
                for (int j = 0; j < z1[i].length; j++) {
                    z1[i][j] = second(x[j]);
                }
            } else {
                for (int j = 0; j < z1[i].length; j++) {
                    z1[i][j] = third(x[j]);
                }
            }
        }
        return z1;
    }

    public static void vyvod(double[][] z1) {
        for (int i = 0; i < z1.length; i++) {
            for (int j = 0; j < z1[i].length; j++) {
                System.out.print(String.format("%7.5f", z1[i][j]) + " ");
            }
            System.out.println();
        }
    }

}
