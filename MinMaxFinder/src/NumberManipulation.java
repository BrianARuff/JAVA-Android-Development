import java.util.Arrays;

public class NumberManipulation {
    double[] array = {3, 4, 66, 25, -55, 12};
    double sum;
    double sumOfMultiples;

    void findMinimum() {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
        }
        System.out.println(
                "Minimum number is " + array[0]
        );
        System.out.println('\n');
    }

    void findMaximum() {
        Arrays.sort(array);
        {
            for (int i = 0; i < array.length; i++) {
            }
            System.out.println(
                    "Maximum number is " + (array[array.length - 1])
            );
            System.out.println('\n');
        }
    }


    void average() {
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(
                "The average is " + (sum = sum / array.length)
        );
        System.out.println('\n');
    }

    void multiplyBy2() {
        for (double item: array) {
            System.out.println(item+" doubled = "+item*2 + '\n');
        }
    }
}

class ArrayNumbersSorted {
    public static void main(String[] args) {
        NumberManipulation arrayOne = new NumberManipulation();
        arrayOne.findMinimum();
        arrayOne.findMaximum();
        arrayOne.average();
        arrayOne.multiplyBy2();
    }
}
