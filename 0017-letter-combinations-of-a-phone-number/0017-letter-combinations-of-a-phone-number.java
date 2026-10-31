class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder current = new StringBuilder();
        Solve(0,digits,current,ans,keypad);
        return ans;
    }
    private void Solve(int index, String digits, StringBuilder current, List<String> ans, String[] keypad){
       if(index==digits.length()){
        ans.add(current.toString());
        return;
       }  
       int digit = digits.charAt(index)-'0';
       String letters = keypad[digit];
       for(char ch : letters.toCharArray()){
           current.append(ch);
        Solve(index+1,digits,current,ans,keypad);
        current.deleteCharAt(current.length()-1); //backtrack.
       }
    }
}