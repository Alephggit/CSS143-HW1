public class Problem1 {

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {
        int start = 0;
        int end = data.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (data[mid] == target) {
                return mid;
            }

            if (data[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; //
    }
    // TODO: answers "how would you prove your code is correct?". "ChatGPT says so" doesn't count as a good answer.

    // TODO: remove all the comment of "TODOs" and "Placeholder" once the homework is done. In other files too.
    //ok
}
