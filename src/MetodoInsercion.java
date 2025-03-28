public class MetodoInsercion {
    public int[] ordenar(int array[], boolean isDes) {
        int n = array.length;
        int aux, j;
        int comparacion = 0, cambios = 0;

        for (int i = 1; i < n; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && ((isDes && array[j] < aux) || (!isDes && array[j] > aux))) {
                array[j + 1] = array[j];
                j = j - 1;
                comparacion++;
                cambios++;
            }
            array[j + 1] = aux;
            comparacion++;
        }
        imprimirArray(array);
        return new int[]{comparacion, cambios};
    }       

    public void pasos(int array[], boolean isDes) {
        int n = array.length;
        int aux;
        int j;
        for (int i = 1; i < n; i++) {
            aux = array[i];
            j = i - 1;
            System.out.println("Comparando " + aux + " con " + array[j]);
            while (j >= 0 && array[j] > aux && isDes || j >= 0 && array[j] < aux && !isDes) {

                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = aux;
            imprimirArray(array);
        }
    }   

    public void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? " " : ""));
        }
        System.out.println("]\n");
    }
    
}

