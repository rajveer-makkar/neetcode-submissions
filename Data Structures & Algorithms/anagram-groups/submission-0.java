class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length <= 1) {
            result.add(new ArrayList<>(Arrays.asList(strs)));
            return result;
        }

        boolean[] visited = new boolean[strs.length];

        for (int start = 0; start < strs.length; start++) {

            if (visited[start]) continue;

            List<String> bleh = new ArrayList<>();

            for (int i = start; i < strs.length; i++) {
                if (!visited[i] && isAnagram(strs[start], strs[i])) {
                    bleh.add(strs[i]);
                    visited[i] = true;
                }
            }

            result.add(bleh);
        }

        return result;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (char c : s.toCharArray())
            count[c - 'a']++;

        for (char c : t.toCharArray())
            count[c - 'a']--;

        for (int x : count)
            if (x != 0)
                return false;

        return true;
    }
}