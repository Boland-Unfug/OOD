package templatemethodpattern;

public class LongestPalindromFinder extends StringProcessor{
    
    @Override
    public String process(String t) {
        String[] words = t.split(" ");
        String longestWord = null;
        int longestLength = 0;
        for(String w: words)
        {
            if(w.length() >= longestLength && isPalindrome(w))
            {
                longestWord = w;
                longestLength = w.length();
            }
        }
        return "The longest palindrome in the text is: " + longestWord;
    }
    
    public boolean isPalindrome(String s){
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return true;
        }
        else{
            return false;
        }
    }
}