import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja();
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();
        MetodoInsercion metodoInsercion = new MetodoInsercion();
        Scanner leer = new Scanner(System.in);

        boolean condicion = true;
        int[] resultados;

        while (condicion) {
            int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};
            System.out.println("Seleccione el método de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Selección");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = leer.nextInt();

            if (opcion == 5) {
                condicion = false;
                break;
            } else {
                System.out.print("¿Desea ver los pasos? (true/false): ");
                boolean pasos = leer.nextBoolean();

                System.out.print("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                char orden = leer.next().toUpperCase().charAt(0);
                boolean descendente = orden == 'D';

                switch (opcion) {
                    case 1:
                        System.out.println("--------------------------Método Burbuja----------------------------");
                        if (pasos) {
                            metodoBurbuja.conPasos(arreglo, descendente);
                        } else {
                            resultados = metodoBurbuja.BurbujaMejorado(arreglo);
                            System.out.println("Arreglo ordenado -> ");
                            metodoBurbuja.imprimirArray(arreglo);
                            System.out.println("Comparaciones Totales -> " + resultados[0]);
                            System.out.println("Cambios Totales -> " + resultados[1]);
                        }
                        break;
                    case 2:
                        System.out.println("--------------------------Método Selección----------------------------");
                        if (pasos) {
                            metodoSeleccion.pasos(arreglo, descendente);
                        } else {
                            resultados = metodoSeleccion.ordenar(arreglo, descendente);
                            System.out.println("Arreglo ordenado -> ");
                            metodoSeleccion.imprimirArray(arreglo);
                            System.out.println("Comparaciones Totales -> " + resultados[0]);
                            System.out.println("Cambios Totales -> " + resultados[1]);
                        }
                        break;
                    case 3:
                        System.out.println("--------------------------Método Inserción----------------------------");
                        if (pasos) {
                            metodoInsercion.pasos(arreglo, descendente);
                        } else {
                            resultados = metodoInsercion.ordenar(arreglo, descendente);
                            System.out.println("Arreglo ordenado -> ");
                            metodoInsercion.imprimirArray(arreglo);
                            System.out.println("Comparaciones Totales -> " + resultados[0]);
                            System.out.println("Cambios Totales -> " + resultados[1]);
                        }
                        break;
                    case 4:
                        System.out.println("--------------------------Burbuja Mejorado----------------------------");
                        resultados = metodoBurbuja.BurbujaMejorado(arreglo);
                        System.out.println("Arreglo ordenado -> ");
                        metodoBurbuja.imprimirArray(arreglo);
                        System.out.println("Comparaciones Totales -> " + resultados[0]);
                        System.out.println("Cambios Totales -> " + resultados[1]);
                        break;
                }
            }
        }
        leer.close();
    }
}
