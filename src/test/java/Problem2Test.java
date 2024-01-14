import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                {-1,10,5,3,6},
                {8,2,5,4,7,10},
                {1,2,3,4},
                {4,6,3,5,8},
                {10,5,3,7,2},
                // TODO: add more test case inputs
        };
        int[][] expects = {
                {1, 2, 3},
                {-1,3,5,6,10},
                {2,4,5,7,8,10},
                {1,2,3,4},
                {3,4,5,6,8},
                {2,3,5,7,10},
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays

        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            // TODO: add a call to your bubble sort function here

            for (int j = 0; j < inputs[i].length; j++) {

                // this checks whether the actual result matches the expects result
                // note the use of assertArrayEquals instead of assertEquals here
                // less code == less chance of mistake
                assertArrayEquals(expects[i], inputs[i]);
            }
        }
    }
}
