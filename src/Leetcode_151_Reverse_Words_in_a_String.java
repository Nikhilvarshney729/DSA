public class Leetcode_151_Reverse_Words_in_a_String {
    public String reverseWords(String s){
        String[] Words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = Words.length - 1;i >= 0;i--){
            result.append(Words[i] + " ");
        }
        return result.toString().trim();
    }
}
