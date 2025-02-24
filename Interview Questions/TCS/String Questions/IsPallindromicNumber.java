// TCS Technical Interview Coding Question (String Topic)
// 🔹 Problem:
// Given a string s, check if it is a valid palindrome by only considering alphanumeric characters and ignoring cases. Return true if it is a palindrome, otherwise return false.

// 💡 Constraints:

// The string may contain spaces, punctuation, and mixed-case letters.
// Ignore all non-alphanumeric characters.
// Example 1:
// 🔹 Input:
// s = "A man, a plan, a canal: Panama"
// Output:
// true


// 🔹 Explanation:
// After removing non-alphanumeric characters and converting to lowercase:
// "amanaplanacanalpanama" is a palindrome.



class IsPallindromicNumber {

    public static void main(String[] args) {
        IsPallindromicNumber palindromeChecker = new IsPallindromicNumber();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindromeChecker.isPalindrome(s)); // Output: true
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
