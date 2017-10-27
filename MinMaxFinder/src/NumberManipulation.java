import java.util.Arrays;

public class NumberManipulation {
    double[] array;
    double sum;

    void setArray(double...newArray){
        array = newArray;
    }

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
        NumberManipulation arrayTwo = new NumberManipulation();
        arrayTwo.setArray(25,15,30,-5,8,100);
        arrayTwo.findMaximum();
        arrayTwo.findMinimum();
        arrayTwo.multiplyBy2();
        arrayTwo.average();
    }
}
