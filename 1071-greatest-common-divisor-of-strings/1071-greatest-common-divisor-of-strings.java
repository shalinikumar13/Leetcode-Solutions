class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        while (b != 0) {
             int temp = b;
             b = a % b;
             a = temp;
        }
        int gcd = a;
        String result = str1.substring(0, gcd);
      if ((str1 + str2).equals(str2 + str1)) {
    return result;
}

return "";
    }
}