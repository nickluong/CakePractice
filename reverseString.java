import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static void reverse(char[] arrayOfChars) {

        // reverse input array of characters in place
        int leftIndex = 0;
        int rightIndex = arrayOfChars.length-1;
        
        while(leftIndex < rightIndex) {
            char temp = arrayOfChars[leftIndex];
            arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
            arrayOfChars[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        
    }
}