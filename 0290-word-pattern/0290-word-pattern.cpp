// class Solution {
// public:
//     bool wordPattern(string pattern, string s) {
        
//     }
// };

class Solution {
public:
    bool wordPattern(string pattern, string str) {
        unordered_map<char, string> char_map;
        unordered_map<string, char> word_map;
        
        stringstream s(str);
        string word;
        int n = pattern.size(), i = 0;
        
        while(s >> word){
            if(i == n) return false;
            char c = pattern[i];
            if(char_map.count(c) != word_map.count(word)) return false;
            if(char_map.count(c)){
                if( (word_map[word] != c) || (char_map[c] != word)) return false;
            } else {
                char_map.insert({c, word});
                word_map.insert({word, c});
            }
            i++;
        }
        return i == n;
    }
};



// Java:
// -----
// class Solution {
//     public boolean wordPattern(String pattern, String str) {
//         Map<Character, String> char_map = new HashMap();
//         Map<String, Character> word_map = new HashMap();
        
//         int n = pattern.length(), i = 0;
//         String[] words = str.split(" ");
//         if(n != words.length) return false;
        
//         while(i < n){
//             char c = pattern.charAt(i);
//             String word = words[i];
//             if(char_map.containsKey(c) != word_map.containsKey(word)) return false;
//             if(char_map.containsKey(c)){
//                 if( (word_map.get(word) != c) || !(char_map.get(c).equals(word)) ) return false;
//             } else {
//                 char_map.put(c, word);
//                 word_map.put(word, c);
//             }
//             i++;
//         }
//         return i == n;
//     }
// }
