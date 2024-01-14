public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long SumOfNonUnique(int[] data) {
        long sum = 0;
        boolean[] counted = new boolean[data.length];

        for (int i = 0; i < data.length; i++) {
            if (!counted[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < data.length; j++) {
                    if (data[i] == data[j] && !counted[j]) {
                        sum += data[j];
                        counted[j] = true;
                        isDuplicate = true;
                    }
                }
                if (isDuplicate) {
                    sum += data[i]; // Add the current element as well if it's a duplicate
                }
            }
        }

        return sum;

    }


    /**
     * work main with vinnie.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] test1 = {3};
        System.out.println("Test 1: " + SumOfNonUnique(test1));

        int[] test2 = {3, 2};
        System.out.println("Test 2: " + SumOfNonUnique(test2));

        int[] test3 = {2, 3, 2};
        System.out.println("Test 3: " + SumOfNonUnique(test3));

        int[] test4 = {2, 4, 2, 1, 4, -5, 4};
        System.out.println("Test 4: " + SumOfNonUnique(test4));

        int[] test5 = {1, 1, 1, 2, 3, 3, 4, 5, 5, 5, 5};
        System.out.println("Test 5: " + SumOfNonUnique(test5));
    }
    /*
    TODO: Bonus Points. Add your answer here.
    ok
     */
}