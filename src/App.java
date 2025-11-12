import models.Person;
import controllers.PersonController;
public class App {

    
    public static void main(String[] args ){
        System.out.println("Bienvenido");

        //int[] numeros = {10, 34, 1, 12, 0, -7, 145};
        //int[] numeros1 = {11, -3, -78, 19, 2, -8, 20, -4};

        //String[] nombres = {"Paul", "Ana", "Azul", "Geovanny", "Alejandro"};

        //BubbleSort bubbleSort = new BubbleSort();
        //BubbleSort bubblePersona = new BubbleSort();

        //System.out.println("Array Desordenado: ");

        //bubbleSort.printArray(numeros);
        //bubbleSort.bubbleSort(numeros);

        //System.out.println("Array Ordenado: ");

        //bubbleSort.printArray(numeros);

        //System.out.println("Nombres Desordenados : ");
        //bubblePersona.printArray(nombres);
        //bubblePersona.bubbleSortByName(nombres);

        //System.out.println("Nombres Ordenados: ");
        //bubblePersona.printArray(nombres);

        //System.out.println("Imprimir con pasos el sort numeros");
        //bubbleSort.printArray(numeros1);
        //bubbleSort.bubbleSort(numeros1, true);
        //System.out.println("Imprimir pasos del Bubble Sort: ");
        //bubbleSort.printArray(numeros1);

        PersonController bubbleSort = new PersonController();
        Person[] persona ={
            new Person("Paul", 25),
            new Person ("Geova",12),
            new Person("Marti",45),
            new Person("Lulu",34),
        };

        System.out.println("Nombres Desordenado: ");
        bubbleSort.printArray(persona);
        //bubbleSort.bubbleSortByPerson(persona);
        bubbleSort.insertionSortByPerson(persona);
        System.out.println("Nombres Ordenado: ");
        bubbleSort.printArray(persona);
        System.out.println("Edades desordenado: ");
        bubbleSort.printArray(persona);
        //bubbleSort.bubbleSortByAge(persona);
        bubbleSort.insertionSortByAge(persona);
        System.out.println("Edades Ordenado: ");
        bubbleSort.printArray(persona);
        
 
    }
}    
