class Solution {
    
    public List<Integer> findAnagrams(String str, String pattern) {
        
        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> char_frequency_hash = populateHashMapCharFrequency(pattern);
        int window_start_ptr = 0, window_end_ptr = 0, num_chars_matched = 0;

        for (; window_end_ptr < str.length(); window_end_ptr++) {

            char end_char = str.charAt(window_end_ptr);

            if (char_frequency_hash.containsKey(end_char)) {

                char_frequency_hash.put(end_char, char_frequency_hash.get(end_char) - 1);

                if (char_frequency_hash.get(end_char) == 0)
                    num_chars_matched++;
            }

            if (num_chars_matched == char_frequency_hash.size())
                result.add(window_start_ptr);

            if (window_end_ptr >= pattern.length() - 1) {

                char start_char = str.charAt(window_start_ptr++);

                if (char_frequency_hash.containsKey(start_char)) {
                    if (char_frequency_hash.get(start_char) == 0)
                        num_chars_matched--;

                    char_frequency_hash.put(start_char, char_frequency_hash.get(start_char) + 1);
                }
            }
        }

        return result;

    }

    // Helper method to convert the pattern string to a HashMap of the occurrence 
    // frequencies of each letter in the pattern.
    public static Map<Character, Integer> populateHashMapCharFrequency(String pattern) {

        Map<Character, Integer> hash = new HashMap<>();
        for (char character : pattern.toCharArray())
            hash.put(character, hash.getOrDefault(character, 0) + 1);

        return hash;
    }
}