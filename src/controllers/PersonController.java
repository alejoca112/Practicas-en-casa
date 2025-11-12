package controllers;
import models.Person;

public class PersonController {
    

    public void bubbleSortByPerson(Person[] persona){

        for(int i = 0; i < persona.length ; i++){
            boolean swapped = false;
            for(int j = 0; j < persona.length -1 -i; j++){
                if(persona[j].getNombre().compareTo(persona[j+1].getNombre()) > 0){
                    Person temp = persona[j];
                    persona[j] = persona[j+1];
                    persona[j+1] = temp;
                    swapped = true;

                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public void bubbleSortByAge(Person[] persona){
        for(int i = 0; i < persona.length; i++){
            boolean swapped = false;
            for(int j = 0; j < persona.length - 1; j++){
                if(persona[j].getEdad() > persona[j+1].getEdad()){
                    Person temp = persona[j];
                    persona[j] = persona[j+1];
                    persona[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public void insertionSortByPerson(Person[] persona){
        for(int i = 1; i < persona.length ; i++){
            Person key = persona[i];

            //Izquierda
            int j = i -1;
            //Bucle de desplazamaiento
            // Mientras haya cartas a la izquierda (j >= 0) Y
            // la carta de la izquierda (personas[j]) sea mayor que nuestra "key"
            while (j >=0 && persona[j].getNombre().compareTo(key.getNombre()) > 0){
                //Desplaza la carta hacia la derecha
                persona[j+1] = persona[j];
                //Mueve una carta hacia la izquierda
                j = j-1;
            }
            //Encuentra el hueco se inserta la key
            persona[j+1] = key;
        }
    }

    public void insertionSortByAge(Person[] persona){
        for(int i = 1; i < persona.length; i++){
            Person key = persona[i];

            int j = i -1;

            while(j >= 0 && persona[j].getEdad() > key.getEdad()){
                persona[j+1] = persona[j];

                j = j-1;
            }
            persona[j+1] = key;
        }
    }

    public void printArray(Person[] persona){
        System.out.print("[ ");
        for(int i = 0; i < persona.length; i++){
            System.out.println(persona[i]);
        }
        System.out.println(" ]");
    }
}
