// Define a class named "Main"
public class Main {

  // This is the main function where the program starts execution
  public static void main(String[] args) {

    // Create an array of integers
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    // Call the function to reorder the array, placing even numbers before odd numbers
    orderEvenBeforeOdd(array);

    // Loop through the array and print each number
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  // Define a function that takes an array and reorders it so that even numbers come before odd numbers
  public static void orderEvenBeforeOdd(int[] array) {

    // Initialize two pointers i and j to the start and end of the array
    int i = 0, j = array.length - 1;

    // Keep looping until i is less than j
    while (i < j) {

      // If the number at index i is even, move i to the right
      if (array[i] % 2 == 0) {
        i++;

      // If the number at index j is odd, move j to the left
      } else if (array[j] % 2 != 0) {
        j--;

      // Otherwise, swap the numbers at indices i and j
      } else {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        // Move both i and j towards the center
        i++;
        j--;
      }
    }
  }
}