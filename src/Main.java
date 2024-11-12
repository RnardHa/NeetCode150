import ArraysAndHashing.*;
import BinarySearch.*;
import HeapOrPriorityQueue.KClosestPointToOrigin;
import HeapOrPriorityQueue.KthLargestElementInArray;
import HeapOrPriorityQueue.LastStoneWeight;
import HeapOrPriorityQueue.TaskScheduling;
import LinkedList.*;
import SlidingWindow.*;
import Stack.*;
import Tree.*;
import TwoPointers.*;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 1;
        //ArraysAndHashing
        System.out.println(i++ + ". Contains duplicate: " + new ContainsDuplicate().solution());
        System.out.println(i++ + ". Is anagram: " + new IsAnagram().solution());
        System.out.println(i++ + ". Two integer sum: " + Arrays.toString(new TwoIntegerSum().solution()));
        System.out.println(i++ + ". Group anagram: " + new AnagramGroups().solution());
        System.out.println(i++ + ". Top k element in list: " + Arrays.toString(new TopKElementInList().solution()));
        System.out.println(i++ + ". Product except self: " + Arrays.toString(new ProductOfArrayExceptSelf().solution()));
        System.out.println(i++ + ". Valid sudoku: " + new ValidSudoku().solution());
        System.out.println(i++ + ". Longest consecutive sequence: " + new LongestConsecutiveSequence().solution());

        //Two Pointers
        System.out.println(i++ + ". Is Palindrome: " + new ValidPalindrome().solution());
        System.out.println(i++ + ". Two Integer sum two: " + Arrays.toString(new TwoIntegerSumTwo().solution()));
        // TODO: complete this
        System.out.println(i++ + ". Three sum: " + new ThreeSum().solution());
        System.out.println(i++ + ". Max water container: " + new MaxWaterContainer().solution());
        System.out.println(i++ + ". Trapping rain water: " + new TrappingRainWater().solution());
        System.out.println(i++ + ". Remove element: " + new RemoveElement().solution());
        System.out.println(i++ + ". Remove duplicate: " + new RemoveDuplicate().solution());

        //SlidingWindow
        System.out.println(i++ + ". Best time to buy and sell stock: " + new BestTimeToBuyAndSellStock().solution());
        System.out.println(i++ + ". Longest substring without duplicate: " + new LongestSubstringWithoutDuplicate().solution());
        System.out.println(i++ + ". Longest repeating substring with replacement: " + new LongestRepeatingSubstringWithReplacement().solution());
        System.out.println(i++ + ". Permutation string: " + new PermutationString().solution());
        // TODO: complete these 2
        System.out.println(i++ + ". Min window with characters: " + new MinWindowWithCharacters().solution());
        System.out.println(i++ + ". Sliding Window max: " + Arrays.toString(new SlidingWindowMax().solution()));

        //Stack
        System.out.println(i++ + ". Valid parentheses: " + new ValidParentheses().solution());
        System.out.println(i++ + ". Eval reverse polish notation: " + new EvalReversePolishNotation().solution());
        // TODO: complete this
        System.out.println(i++ + ". Generate parentheses: " + new GenerateParentheses().solution());
        System.out.println(i++ + ". Daily temperatures: " + Arrays.toString(new DailyTemperatures().solution()));
        // TODO: revisit these 2 qns
        System.out.println(i++ + ". Car fleet: " + new CarFleet().solution());
        System.out.println(i++ + ". Largest rectangle in histogram: " + new LargestRectangleInHistogram().solution());

        //BinarySearch
        System.out.println(i++ + ". Binary search: " + new BinarySearch().solution());
        System.out.println(i++ + ". Search 2d matrix: " + new Search2DMatrix().solution());
        System.out.println(i++ + ". Min eating speed: " + new MinEatingSpeed().solution());
        System.out.println(i++ + ". Min in rotated sorted arr: " + new FindMinInRotatedSortedArr().solution());
        // TODO: revisit these 2 qns
        System.out.println(i++ + ". Search in rotated sorted arr: " + new FindTargetInRotatedSortedArr().solution());
        System.out.println(i++ + ". Mid in 2 sorted arr: " + new MedianOf2SortedArr().solution());

        //LinkedList
        System.out.println(i++ + ". Reverse linked list: " + new ReverseLinkedList().solution().toList());
        System.out.println(i++ + ". Merge sorted linked list: " + new MergeTwoSortedLinkedList().solution().toList());
        System.out.println(i++ + ". Reorder linked list: " + new ReorderLinkedList().solution().toList());
        System.out.println(i++ + ". Remove nth from end: " + new RemoveNodeFromEndOfLinkedList().solution().toList());
        System.out.println(i++ + ". Add 2 numbers: " + new Add2Numbers().solution().toList());
        System.out.println(i++ + ". Linked list cycle: " + new LinkedListCycleDetection().solution());
        // TODO: complete these 2
        System.out.println(i++ + ". Find duplicate number: " + new FindDuplicateIntegerWithNoExtraSpace().solution());
        System.out.println(i++ + ". Merge k sorted lists: " + new MergeKSortedLists().solution());
        System.out.println(i++ + ". Reverse nodes in k group: " + new ReverseNodesInKGroup().solution());

        //Trees
        System.out.println(i++ + ". Invert binary tree: " + new InvertABinaryTree().solution());
        System.out.println(i++ + ". Depth of binary tree: " + new DepthOfBinaryTree().solution());
        System.out.println(i++ + ". Binary tree diameter: " + new BinaryTreeDiameter().solution());
        // TODO: revisit this
        System.out.println(i++ + ". Balanced binary tree: " + new BalancedBinaryTree().solution());
        System.out.println(i++ + ". Subtree if a binary tree: " + new SubtreeOfABinTree().solution());
        System.out.println(i++ + ". Binary tree level traversal: " + new BinaryTreeLevelOrderTraversal().solution());

        //Heap/PriorityQueue
        System.out.println(i++ + ". Last stone weight: " + new LastStoneWeight().solution());
        // TODO: revisit this
        System.out.println(i++ + ". K closest point to origin: " + Arrays.deepToString(new KClosestPointToOrigin().solution()));
        System.out.println(i++ + ". K largest in an array: " + new KthLargestElementInArray().solution());
        // TODO: revisit this
        System.out.println(i++ + ". Task scheduling: " + new TaskScheduling().solution());

        //Backtracking

        //Tries
        //Graphs
        //AdvancedGraphs
        //1-D DynamicProgramming
        //2-D DynamicProgramming
        //Greedy
        //Intervals
        //MathAndGeometry
        //BitManipulation



    }
}