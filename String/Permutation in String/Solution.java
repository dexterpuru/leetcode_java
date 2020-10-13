class Solution {
    
    // Returns a character frequency hash map of given String s.
    public HashMap<Character, Integer> getCharFreqMap(String s) {
        
        HashMap<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }
        
        return charFreqMap;
    }
    
    // Sliding window approach.
    // -> Get character frequency map of s1.
    // -> Add characters of s2 to a window of size s1.length().
    // -> During addition of characters, take note of the 
    //    number of unique characters of s2 that match with those of s1.
    // -> If number of unique characters of the current window matches 
    //    with the size of the character frequency map, return true.
    // -> Else, slide the window, while adding/removing characters and 
    //    maintaining the numOfCharsMatched count.
    //    While doing so, if the numOfCharsMatched == charFreqMap.size() 
    //    at any point, then return true.
    // -> If we exit the loop without encountering the return statement, 
    //    return false.
    public boolean checkInclusion(String s1, String s2) {
        
        // s2.length() >= s1.length()
        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> charFreqMap = getCharFreqMap(s1);

        int numOfCharsMatched = 0;

        for (int i = 0; i < s1.length(); i++) {

            char c = s2.charAt(i);

            if (charFreqMap.containsKey(c)) {
                charFreqMap.put(c, charFreqMap.get(c) - 1);

                if (charFreqMap.get(c) == 0) {
                    numOfCharsMatched++;
                }
            }
        }

        if (numOfCharsMatched == charFreqMap.size())
            return true;

        for (int ptr1 = 0, ptr2 = s1.length(); ptr2 < s2.length(); ptr1++, ptr2++) {

            char charAtPtr1 = s2.charAt(ptr1);
            char charAtPtr2 = s2.charAt(ptr2);

            if (charFreqMap.containsKey(charAtPtr1)) {
                
                charFreqMap.put(charAtPtr1, charFreqMap.get(charAtPtr1) + 1);

                if (charFreqMap.get(charAtPtr1) == 1)
                    numOfCharsMatched --;
            }

            if (charFreqMap.containsKey(charAtPtr2)) {

                charFreqMap.put(charAtPtr2, charFreqMap.get(charAtPtr2) - 1);

                if (charFreqMap.get(charAtPtr2) == 0)
                    numOfCharsMatched++;
            }

            if (numOfCharsMatched == charFreqMap.size())
                return true;
        }

        return false;

    }
}
