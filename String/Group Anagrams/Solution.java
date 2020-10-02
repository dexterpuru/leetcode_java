class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //Every group of anangrams have some key which is sorted string of
        //that group. So will create a map of that sorted string and a list of
        //strings which is anagram to that key
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s:strs){//Iterate through every string
            
            //changing s to character array
            char charArray[] = s.toCharArray();
            
            //sorting
            Arrays.sort(charArray);
            
            //converting character array to string
            String sorted = new String(charArray);
            
            if(!map.containsKey(sorted)){
                map.put(sorted,new LinkedList<>());//Intializing list as LL
            }
            
            //adding s to that sorted key
            map.get(sorted).add(s);
        }
        
        //map.values() give the set but we have to convert list
        return new LinkedList<>(map.values());
    }
}