import ArraysAndHashing.*;
import SlidingWindow.BestTimeToBuyAndSellStock;
import SlidingWindow.LongestSubstringWithoutDuplicate;
import TwoPointers.*;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //ArraysAndHashing
        System.out.println("1. Contains duplicate: " + new ContainsDuplicate().solution());
        System.out.println("2. Is anagram: " + new IsAnagram().solution());
        System.out.println("3. Two integer sum: " + Arrays.toString(new TwoIntegerSum().solution()));
        System.out.println("4. Group anagram: " + new AnagramGroups().solution());
        System.out.println("5. Top k element in list: " + Arrays.toString(new TopKElementInList().solution()));
        System.out.println("6. Product except self: " + Arrays.toString(new ProductOfArrayExceptSelf().solution()));
        System.out.println("7. Valid sudoku: " + new ValidSudoku().solution());
        System.out.println("8. Longest consecutive sequence: " + new LongestConsecutiveSequence().solution());

        //Two Pointers
        System.out.println("9. Is Palindrome: " + new ValidPalindrome().solution());
        System.out.println("10. Two Integer sum two: " + Arrays.toString(new TwoIntegerSumTwo().solution()));
        // TODO: complete this
        System.out.println("11. Three sum: " + new ThreeSum().solution());
        System.out.println("12. Max water container: " + new MaxWaterContainer().solution());
        System.out.println("13. Trapping rain water: " + new TrappingRainWater().solution());

        //SlidingWindow
        System.out.println("14. Best time to buy and sell stock: " + new BestTimeToBuyAndSellStock().solution());
        System.out.println("15. Longest substring without duplicate: " + new LongestSubstringWithoutDuplicate().solution());

    }
}