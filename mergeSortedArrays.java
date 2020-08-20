public static int[] mergeArrays(int[] myArray, int[] alicesArray) {

    int[] mergedArray = new int[myArray.length + alicesArray.length];

    int currentIndexAlices = 0;
    int currentIndexMine   = 0;
    int currentIndexMerged = 0;

    while (currentIndexMerged < mergedArray.length) {
        int firstUnmergedAlices = alicesArray[currentIndexAlices];
        int firstUnmergedMine = myArray[currentIndexMine];

        // case: next comes from my array
        if (firstUnmergedMine < firstUnmergedAlices) {
            mergedArray[currentIndexMerged] = firstUnmergedMine;
            currentIndexMine++;

        // case: next comes from Alice's array
        } else {
            mergedArray[currentIndexMerged] = firstUnmergedAlices;
            currentIndexAlices++;
        }

        currentIndexMerged++;
    }

    return mergedArray;
}