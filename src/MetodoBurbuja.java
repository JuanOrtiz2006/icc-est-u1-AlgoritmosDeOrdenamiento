public class MetodoBurbuja {

    public void ordenar (int array[],boolean isDes){
        int n=array.length;
        int aux;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isDes==true && array[i]<array[j] || isDes==false && array[i]>array[j]) {
                    aux=array[j];
                    array[j]=array[i];
                    array[i]=aux;
                }
            }
        }

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

    public int[] BurbujaMejorado(int array[]) {
        int comparaciones = 0, cambios = 0;
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    cambios++;
                    swapped = true;
                }
            }
            if (!swapped) break;
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