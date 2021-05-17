// Sum Exists in an Array -  two pointer technique
public boolean twoSum(int[] input, int targetValue) {
    int pointerOne = 0;
    int pointerTwo = input.length - 1;
    while (pointerOne < pointerTwo) {
        int sum = input[pointerOne] + input[pointerTwo];
        if (sum == targetValue) {
            return true;
        } else if (sum < targetValue) {
            pointerOne++;
        } else {
            pointerTwo--;
        }
    }
    return false;
}