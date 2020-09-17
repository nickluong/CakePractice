static void rearrangeArray(int arr[], int n) 
    {    
        // Sorting the array elements 
        Arrays.sort(arr); 
       
        int[] tempArr = new int[n]; // To store modified array 
          
        // Adding numbers from sorted array to  
        // new array accordingly 
        int ArrIndex = 0; 
       
        // Traverse from begin and end simultaneously  
        for (int i = 0, j = n-1; i <= n / 2 || j > n / 2; 
                                           i++, j--) { 
            if(ArrIndex < n) 
            { 
                tempArr[ArrIndex] = arr[i]; 
                ArrIndex++; 
            } 
              
            if(ArrIndex < n) 
            { 
                tempArr[ArrIndex] = arr[j]; 
                ArrIndex++; 
            } 
        } 
       
        // Modifying original array 
        for (int i = 0; i < n; i++) 
            arr[i] = tempArr[i]; 
    } 


/*
 * Complete the 'meanderingArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY unsorted as parameter.
 */

function meanderingArray(unsorted) {
    const sortedArr = quickSort(unsorted);
    const finishedArr = [];
    while (sortedArr.length) {
      const mostVal = sortedArr.shift();
      let leastVal;
      finishedArr.push(mostVal);
      if (sortedArr.length) {
        leastVal = sortedArr.pop();
        finishedArr.push(leastVal);
      }
    }
    return finishedArr;
  }
  
  function quickSort(data) {
    if (data.length <= 1) {
      return data;
    } else {
      const pivot = data[0];
      const lesser = data.filter(num => num < pivot);
      const equal = data.filter(num => num === pivot);
      const greater = data.filter(num => num > pivot);
      return quickSort(greater).concat(equal.concat(quickSort(lesser)));
    }
  }

   /*
     * Complete the 'minMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minMoves(List<Integer> arr) {
        // Write your code here
    
            int n = arr.size();
            int arrOfZeroes[] = new int[n];
            int arrOfOnes[] = new int[n];
            int i, count0 = 0, count1 = 0;
     
            arrOfZeroes[n - 1] = 1 - arr.get(n - 1);
            arrOfOnes[n - 1] = arr.get(n - 1) == 0 ? 0 : 1;
            for (i = n - 2; i >= 0; i--) {
                arrOfZeroes[i] = arrOfZeroes[i + 1];
                arrOfOnes[i] = arrOfOnes[i + 1];
                if (arr.get(i) == 0)
                    arrOfZeroes[i]++;
                if (arr.get(i) == 1)
                    arrOfOnes[i]++;
            }
     
            for (i = 0; i < n; i++) {
                if (arr.get(i) == 1)
                    count0 += arrOfZeroes[i];
                if (arr.get(i) == 0)
                    count1 += arrOfOnes[i];
            }
    
            return Math.min(count0, count1);
    
        }

        static long triplets(long t, List<Integer> d) {
        
            int count = 0;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < d.size(); i++) {
                int num = d.get(i);
                if (set.contains(num - t) && set.contains(num - 2 * t)) {
                    count++;
                }
                set.add(num);
            }
            
            return count;
        
        }

        static int beautifulTriplets(int t, List<Integer> d) {
            int res=0;
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<d.size();i++){
                set.add(d.get(i));
            }
            for(int j=0;j<arr.length-2;j++){
                if(set.contains(d.get(j)-t)&&set.contains(arr[j]+2*d)){
                    res++;
                }
            }
            return res;
        }


///////////////////////////////////////////
                      // Initialize result 
                      long ans = 0; 
                      int n = d.size();
              
                      Collections.sort(d);
                      
                      // Fix the first element as A[i] 
                      for (int i = 0; i < n-2; i++) 
                      { 
                         // Fix the second element as A[j] 
                         for (int j = i+1; j < n-1; j++) 
                         { 
                             // Now look for the third number 
                             for (int k = j+1; k < n; k++) 
                                 if ((d.get(i) < d.get(j)) && (d.get(j) < d.get(k))){
                                     if ((d.get(i) + d.get(j) + d.get(k)) <= t) ans++; 
                                 } 
                          }
                                 
                      } 
                      
                      return ans; 

                      /////////////////////////////////////////////////////

}