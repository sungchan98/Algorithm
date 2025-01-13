import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        String[] filteredArray = Arrays.stream(answer)
                                 .filter(s -> !s.isEmpty())
                                 .toArray(String[]::new);
        
        Arrays.sort(filteredArray);
        return filteredArray;
    }
}