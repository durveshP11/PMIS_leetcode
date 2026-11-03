import java.util.*;

class Solution {
    public int countLargestGroup(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            // Calculate digit sum
            while(num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        int max = 0;
        int count = 0;

        for(int value : map.values()) {

            if(value > max) {
                max = value;
                count = 1;
            }
            else if(value == max) {
                count++;
            }
        }

        return count;
    }
}