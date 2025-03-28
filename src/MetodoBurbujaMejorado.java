public class MetodoBurbujaMejorado {

    public int[] ordenar(int array[], boolean isDes) {
        int comparaciones = 0, cambios = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                comparaciones++;
                if (isDes && array[j] > array[j + 1] || !isDes && array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    cambios++;
                }
            }
        }
        imprimirArray(array); // Mostrar el estado actual del arreglo
        return new int[]{comparaciones, cambios};
    }

    public int[] conPasos(int array[], boolean isDes) {
        int comparaciones = 0, cambios = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                comparaciones++;
                System.out.println("Comparando " + array[j] + " con " + array[j + 1]);  
                if (isDes && array[j] > array[j + 1] || !isDes && array[j] < array[j + 1]) {
                    System.out.println("Intercambiando " + array[j] + " con " + array[j + 1]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    cambios++;
                    imprimirArray(array); // Mostrar el estado actual del arreglo
                }
            }
        }
        return new int[]{comparaciones, cambios};
    }

    public void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.println(" ");
    }

}
