import java.util.HashMap;
import java.util.Map;

public class romantoInt {
        public int romanToInt(String s) {
        Map<Character, Integer> h = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = h.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? h.get(s.charAt(i + 1)) : 0;
            ans += (curr < next) ? -curr : curr;
        }
        return ans;
    }
}
