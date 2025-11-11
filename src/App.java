public class App {
<<<<<<< HEAD
    
    public static void main(String[] args ){
        System.out.println("Bienvenido");

        int[] numeros = {10, 34, 1, 12, 0, -7, 145};
        int[] numeros1 = {11, -3, -78, 19, 2, -8, 20, -4};

        String[] nombres = {"Paul", "Ana", "Azul", "Geovanny", "Alejandro"};

        BubbleSort bubbleSort = new BubbleSort();
        BubbleSort bubblePersona = new BubbleSort();

        System.out.println("Array Desordenado: ");

        bubbleSort.printArray(numeros);
        bubbleSort.bubbleSort(numeros);

        System.out.println("Array Ordenado: ");

        bubbleSort.printArray(numeros);

        System.out.println("Nombres Desordenados : ");
        bubblePersona.printArray(nombres);
        bubblePersona.bubbleSortByPerson(nombres);

        System.out.println("Nombres Ordenados: ");
        bubblePersona.printArray(nombres);

        System.out.println("Imprimir con pasos el sort numeros");
        bubbleSort.printArray(numeros1);
        bubbleSort.bubbleSort(numeros1, true);
        System.out.println("Imprimir pasos del Bubble Sort: ");
        bubbleSort.printArray(numeros1);
        
        


=======
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando SortBubble");

        int[] numeros = {10, 0, -4, 7, 2, 19, 1};

        //crear un objeto sortBubble

        SortBubble metodo = new SortBubble();
        //Llama al metodo para ordenar
        metodo.sortBubble(numeros);


        //Imprime el arreglo
        System.out.print("Arreglo Ordenado");
        SortBubble.printArray(numeros);
>>>>>>> c0aa559a1bcead8f132396bf9a55e01a7f2efcfb
    }
}
