class Solution {
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            encoded.append(s.length())
                   .append('#')
                   .append(s);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);

            int length = Integer.parseInt(
                str.substring(i, hashIndex)
            );

            i = hashIndex + 1;
            result.add(str.substring(i, i + length));
            i += length;
        }

        return result;
    }
}