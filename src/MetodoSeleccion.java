public class MetodoSeleccion {
    public int[] ordenar(int array[], boolean isDes) {
        int comparaciones = 0, cambios = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                comparaciones++;
                if ((isDes && array[j] > array[index]) || (!isDes && array[j] < array[index])) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                cambios++;
            }
        }
        imprimirArray(array);
        return new int[]{comparaciones, cambios};
    }    
    
    public void pasos(int array[], boolean isDes) {
        int n = array.length;
        int aux;
        int min;

        for (int i = 0; i < n - 1; i++) {
            min = i;
            System.out.println("Iteración " + (i + 1) + ":");
            for (int j = i + 1; j < n; j++) {
                System.out.println("Comparando " + array[j] + " con " + array[min]);
                if (isDes && array[j] > array[min] || !isDes && array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                System.out.println("Intercambiando " + array[i] + " con " + array[min]);
                aux = array[min];
                array[min] = array[i];
                array[i] = aux;
            }
            imprimirArray(array); // Mostrar el estado actual del array
        }
    }

    public void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
