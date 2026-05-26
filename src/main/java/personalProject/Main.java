package personalProject;
import java.util.Scanner;

public class Main {
    static void main() {
        boolean exit = false;
        Scanner selectedOption;
        int[] array;
        int arraySize;
        int option;
        while(!exit){
            System.out.println("Please enter the size of your array:");
            selectedOption = new Scanner(System.in);
            arraySize = selectedOption.nextInt();

            array = new int[arraySize];

            for(int i = 0; i < arraySize; i++){
                System.out.println("Please enter the number '" + (i+1) + "' element of your array: ");
                selectedOption = new Scanner(System.in);
                array[i] = selectedOption.nextInt();
            }
            System.out.println("Please choose your desired operation by inputting its number: \n1.Insertion Sort \n2.Selection Sort \n3.Bubble Sort \n4.Linear Search \n5.Binary Search\n0.Exit\n");
            selectedOption = new Scanner(System.in);
            option = selectedOption.nextInt();
            switch (option) {
                case 0:
                    exit = true;
                case 1:
                    System.out.println("You choose Insertion Sort!");
                    InsertionSort(array);
                    System.out.println("If you would like to exit the application type 0, if not, type anything else!");
                    selectedOption = new Scanner(System.in);
                    option = selectedOption.nextInt();
                    if(option == 0){
                        exit = true;
                    }
                    break;
                case 2:
                    System.out.println("You choose Selection Sort!");
                    SelectionSort(array);
                    break;
                case 3:
                    System.out.println("You choose Bubble Sort!");
                    BubbleSort(array);
                    break;
                case 4:
                    System.out.println("You choose Linear Search!");
                    LinearSearch(array);
                    break;
                case 5:
                    System.out.println("You choose Binary Search!");
                    BinarySearch(array);
                    break;
                default:
                    System.out.println("You did not enter any of the valid options, please try again.");
                    break;
            }
        }
    }

    static void InsertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static void SelectionSort(int[] array) {

    }
    static void BubbleSort(int[] array) {

    }
    static void LinearSearch(int[] array) {

    }
    static void BinarySearch(int[] array) {

    }
}
