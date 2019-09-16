class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int one = substringSearch(i, i, s);
            int two = substringSearch(i, i+1, s);
            int len = Math.max(one,two);

            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public int substringSearch(int c1, int c2, String s) {
        while (c1 >= 0 && c2<s.length() && s.charAt(c1) == s.charAt(c2)) {
            c1--;
            c2++;
        }
        return c2 - c1 - 1;
    }
}
