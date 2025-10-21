public class App {
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
    }
}
