import java.util.Arrays;

public class warmUp {

    static int findThreeSums(int[] array){
        if(array == null || array.length < 3){
            throw new IllegalArgumentException("Please provide a array with 3 elements as least!");
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] == array[i + 1]){
                throw new IllegalArgumentException("Duplicated elements detected at " + i + "and" + (i + 1));
            }
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int index = Arrays.binarySearch(array,j+1,array.length,-array[i]-array[j]);
                if(index > j && index < array.length){
                    count++;
                }
            }
        }
        return count;
    }

    static Range findMaxAndMin(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Please provide a valid array!");
        }

        int max = array[0];
        int min = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        System.out.printf("Max: %d, Min: %d%n",max,min);
        return new Range(min,max);
    }

}
