class Solution {
    public boolean checkIfPangram(String sentence) {
        int seen = 0;
        for(char c : sentence.toCharArray()){
            int c1 = c-'a';
            seen |= 1<<c1;
        }
        return seen == ((1<<26)-1);
    }
}