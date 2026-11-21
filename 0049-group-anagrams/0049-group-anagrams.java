
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Create a HashMap
        // Key = sorted string
        // Value = list of original strings
        HashMap<String, List<String>> map = new HashMap<>();

        // Traverse every string
        for (String s : strs) {

            // Convert string into character array
            char[] arr = s.toCharArray();

            // Sort the characters
            Arrays.sort(arr);

            // Convert sorted character array back to String
            String key = new String(arr);

            // If key does not exist, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original string to its corresponding group
            map.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}
