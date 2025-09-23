package tp8poo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiplicarPool {

    public static double[][] mult(double[][] A, double[][] B) {
        if (A[0].length != B.length) {
            System.out.println("Matrices no válidas para multiplicación");
            return null;
        }

        double[][] C = new double[A.length][B[0].length];

        int numHilos = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numHilos);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                executor.submit(new TareaMultiplicacion(A, B, C, i, j));
            }
        }

        executor.shutdown();

        try {
            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
            System.err.println("Hilo principal interrumpido: " + e.getMessage());
        }

        return C;
    }
}
