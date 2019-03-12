package exercise.com.Count_SubArrays_With_Negative_Sums;

class ArrayExercise1 {

    private static boolean hasNagatives(int[] array) {
        for (int i1 : array) {
            if (i1 < 0) {
                return true;
            }
        }
        return false;
    }

    private static int splitInto(int[] array, int number) {
        int count = 0;
        int[] split = new int[number];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            int z = i;
            for (int j = 0; j < number; j++) {
                if (z >= array.length) {
                    sum = 0;
                    break;
                }
                split[j] = array[z];
                sum += split[j];
                z++;
            }
            if (sum < 0) {
                count++;
            }
        }
        return count;
    }

    static int countSubarraysWithNegativeSum(int[] array) {
        if (hasNagatives(array)) {
            int count = 0;
            for (int i = 1; i <= array.length; i++) {
                count += splitInto(array, i);
            }
            return count;
        } else {
            return 0;
        }
    }
}
