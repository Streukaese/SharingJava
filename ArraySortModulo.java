public class Main {
public static void main(String[] args) {
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
orderEvenBeforeOdd(array);
for (int i : array) {
System.out.print(i + " ");
}
}

public static void orderEvenBeforeOdd(int[] array) {
int i = 0, j = array.length - 1;
while (i < j) {
if (array[i] % 2 == 0) {
i++;
} else if (array[j] % 2 != 0) {
j--;
} else {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
i++;
j--;
}
}
}
}
