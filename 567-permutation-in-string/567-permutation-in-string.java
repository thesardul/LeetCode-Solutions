class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 == 0) {
            return true;
        }
        if (l2 < l1) {
            return false;
        }

        int[] countMap = new int[26];
        for (int i = 0; i < l1; i++) {

            countMap[s1.charAt(i) - 'a']++;

            countMap[s2.charAt(i) - 'a']--;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (countMap[i] == 0) {
                count++;
            }
        }
        if (count == 26) {
            return true;
        }
        for (int i = l1; i < l2; i++) {
            int r = s2.charAt(i) - 'a';
            countMap[r]--;
            if (countMap[r] == 0) {
                count++;
            } else if (countMap[r] == -1) {
                count--;
            }

            int l = s2.charAt(i - l1) - 'a';
            countMap[l]++;
            if (countMap[l] == 0) {
                count++;
            } else if (countMap[l] == 1) {
                count--;
            }

            if (count == 26) {
                return true;
            }
        }

        return false;
    }
}