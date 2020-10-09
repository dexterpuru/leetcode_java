class Solution {
    public boolean detectCapitalUse(String word) {
        
        // Converting the given string into uppercase
        String s1 = word.toUpperCase();

        // Converting the given string into lowercase
        String s2 = word.toLowerCase();

        // Storing the result whether the first character is uppercase or not
        boolean s3 = Character.isUpperCase(word.charAt(0));

        /* Storing the substring from position 1 to the length of the input string because
            there cannot be any uppercase letter from position 1 to the length of the input string*/
        String s4 = word.substring(1,word.length()).toLowerCase();
        
        // If the two conditions are true, then it is a valid Capital String
        if (word.equals(s1) || word.equals(s2))
        {
            return true;
        }

        /* Here we are checking whether there are any capital letters from position 1 to the length of the input string,
        ```if there are then it is not a valid Capital String */
        else if(s3 && s4.equals(word.substring(1,word.length())))
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}