public static int longestIncreasingSubarray(int[] arr) {
    int maxLength = 1; // initialize the max length as 1
    int currentLength = 1; // initialize the current length as 1
    int indexToDelete = -1; // initialize the index to delete as -1
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > arr[i-1]) { // if the current element is greater than the previous element
            currentLength++; // increase the current length
        } else {
            if (indexToDelete == -1) { // if no index has been marked for deletion yet
                indexToDelete = i-1; // mark the previous index as the one to delete
            } else {
                // if an index has already been marked for deletion, check if the current sequence is longer than the previous one
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1; // reset the current length to 1
            }
        }
    }
    // check if the last sequence is the longest
    if (currentLength > maxLength) {
        maxLength = currentLength;
    }
    return maxLength;
}
