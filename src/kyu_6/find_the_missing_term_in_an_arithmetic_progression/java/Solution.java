package kyu_6.find_the_missing_term_in_an_arithmetic_progression.java;

public class Solution {
    public static int findMissing(int[] numbers) {
        int firstEl;
        int lastEl;
        int s;
        int sum = 0;
        int missingNumber;
        firstEl = numbers[0];
        lastEl = numbers[numbers.length - 1];
        if ((firstEl + lastEl) % 2 == 0) {
            s = (firstEl + lastEl) / 2;
            s = s * (numbers.length + 1);
        } else {
            s = (numbers.length + 1) / 2;
            s = (firstEl + lastEl) * s;
        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum = sum + numbers[i];
        }
        missingNumber = s - sum;

        return missingNumber;
    }
}

