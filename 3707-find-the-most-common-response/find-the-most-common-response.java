class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < responses.size(); i++) {

            Set<String> st = new HashSet<>();

            for (int j = 0; j < responses.get(i).size(); j++) {

                String word = responses.get(i).get(j);

                if (!st.contains(word)) {

                    if (hm.containsKey(word)) {
                        hm.put(word, hm.get(word) + 1);
                    } else {
                        hm.put(word, 1);
                    }

                    st.add(word);
                }
            }
        }

        int freq = Integer.MIN_VALUE;
        StringBuilder sm = new StringBuilder();

        for (String num : hm.keySet()) {

            if (hm.get(num) > freq) {
                freq = hm.get(num);
                sm.delete(0, sm.length());
                sm.append(num);
            } else if (hm.get(num) == freq) {

                if (sm.length() == 0 || num.compareTo(sm.toString()) < 0) {
                    sm.delete(0, sm.length());
                    sm.append(num);
                }
            }
        }

        return sm.toString();
    }
}