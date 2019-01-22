package javaAlgorthims;

public class ArrayStructuresV2 {
    private int[] thearray = new int[50];
    private int arraySize = 10;

    public void generateArray() {
        for (int i = 0; i < arraySize; i++) {
            thearray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void pritnArrya() {
        for (int i = 0; i < arraySize; i++) {
            System.out.println("---------");
            System.out.print(" | " + i + " | ");
            System.out.print(thearray[i] + " | ");
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        ArrayStructures array = new ArrayStructures();
        array.generateRandomArray();
        array.printArray();
    }
}
