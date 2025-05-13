import java.util.HashMap;

class hashmap {
    public static void main(String[] args) {
        String input = "ezhilfgh";
        int left = 0;
        int max = 0;
        int start = 0;
        HashMap<Character, Integer> position = new HashMap<>();

        for (int right = 0; right < input.length(); right++) {
            char current = input.charAt(right);

            if (position.containsKey(current)) {
                left = Math.max(left, position.get(current) + 1);
            }

            position.put(current, right);

            if (max < (right - left + 1)) {
                max = right - left + 1;
                start = left;
            }
        }

        System.out.println("Length: " + max);
        System.out.println("Substring: " + input.substring(start, start + max));
    }
}
