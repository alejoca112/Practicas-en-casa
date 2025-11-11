public class SortBubble{

    //recordar en clases asi solo debe llamarse a los metodos no al main
  public void sortBubble(int[] numeros ) {
    System.out.println("Lamando a bubbleSort");
    System.out.println();
    
    for (int i = 0; i<numeros.length - 1; i++) {
        //aqui colocaremos el segundo for
        System.out.println("Pasando el numero " + (i+1));
        for (int j = 0; j < numeros.length -1 - i; j++) {
            System.out.println("Comparando " + numeros[j] + " con " + numeros[j+1]);
            if (numeros[j]>numeros[j+1]){
                int temp = numeros[j];
                numeros[j] = numeros[j+1];
                numeros[j+1]=temp;
                System.out.println("Pasada " + (i+1) + " completada");
            }
        }
    }

    System.out.println("El arreglo ha sido ordenado correctamente");

}
public static void printArray(int[] numeros) {
        System.out.print("[");
        for(int i=0; i<numeros.length;i++){
            if(i == numeros.length-1){
                System.out.print(numeros[i]);
            } else {
                System.out.print(numeros[i] + " , ");
            }
        }
        System.out.println(" ] ");
    }
}    