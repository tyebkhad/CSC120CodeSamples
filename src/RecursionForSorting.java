import java.util.ArrayList;
public class RecursionForSorting {
    /**
     * Selection Sort - get min element and swap it to front of list until end of list
     *      runtime of O(n^2)
     *
     * Merge Sort - break up into smaller lists then recursively merge them
     *      merge step takes place in O(n) time
     *      total runtime is O(nlog(n))
     *      base case --> length of one returns list
     *
     * Quick Sort
     *      rearrange so left half has small elements and right half has large ones
     *      1) pick a pivot element and partition around it
     *      2) sort left and right recursively
     *      worst case is O(n^2) but average of O(nlog(n))
     *
     * Insertion Sort
     *      1) recursively sort all but the first element
     *      2) insert the first element into the sorted list
     *      runtime O(n^2)
     *
     * Instrumenting --> putting trackers in code (ie comparisons in sort methods)
     */

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(6);
        nums.add(12);
        nums.add(2);
        System.out.println(nums);

        System.out.println(nums);
    }
}
