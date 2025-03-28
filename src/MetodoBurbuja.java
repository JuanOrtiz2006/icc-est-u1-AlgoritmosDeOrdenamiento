public class MetodoBurbuja {

    public int[] ordenar(int array[], boolean isDes) {
        int n = array.length;
        int aux;
        int comparacion = 0, cambios = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                comparacion++;
                if (isDes && array[i] < array[j] || !isDes && array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                    cambios++;
                }
            }
        }
        imprimirArray(array); // Mostrar el estado actual del arreglo
        return new int[]{comparacion, cambios};
    }

    public void conPasos(int array[], boolean isDes) {    
        int n = array.length;
        int aux;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparando " + array[i] + " con " + array[j]);
                if (isDes && array[i] < array[j] || !isDes && array[i] > array[j]) {
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                    System.out.println("Intercambiando " + array[i] + " con " + array[j]);
                }
                imprimirArray(array); // Mostrar el estado actual del array
            }
        }
    }

    public void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? " " : ""));
        }
        System.out.println("]");
    }
}