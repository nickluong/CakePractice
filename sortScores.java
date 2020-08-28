public class Solution {

    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        // sort the scores in O(n) time

        // 0 to highest possible score
        int[] scoreCounts = new int[highestPossibleScore+1];

        // populate scoreCounts
        for(int score : unorderedScores) {
            scoreCounts[score]++;
        }

        int[] sortedScores = new int[unorderedScores.length];
        int currentSortedIndex = 0;

        // for each item in scoreCounts
        for (int score = highestPossibleScore; score >= 0; score--) {
            int count = scoreCounts[score];
    
            // for the number of times the item occurs
            for (int occurrence = 0; occurrence < count; occurrence++) {
    
                // add it to the sorted array
                sortedScores[currentSortedIndex] = score;
                currentSortedIndex++;
            }
        }
        

        return sortedScores;
    }
}