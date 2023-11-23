/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;

/**
 *
 * @author Luis
 */
    public class InsertionSort {
        
        
        /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Arreglo original:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nArreglo ordenado:");
        printArray(arr);
    }

    // Método para imprimir los elementos de un arreglo
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Método para realizar el ordenamiento por inserción
    static void insertionSort(int arr[]) {
        int n = arr.length;
        
        // Iterar sobre el arreglo desde el segundo elemento hasta el final
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Mover los elementos mayores que key a una posición adelante
            // de su posición actual en el arreglo ordenado
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Insertar key en la posición correcta
            arr[j + 1] = key;
        }
    }
}
