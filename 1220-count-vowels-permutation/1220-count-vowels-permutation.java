class Solution {
 
        private Map<String,Long> map=new HashMap<>();
        private int MOD=1000000007;
        
        
           public int countVowelPermutation(int n) {
               long total=0;
               
                char[] charSet=new char[]{'a','e','i','o','u'};
              
               for(char c:charSet)
               {
                total =(total+helpaer(n-1,c))%MOD;
               }
               return (int)total;
    }
    public long helpaer(int reaminingChar,char prevChar)
    {
        if(reaminingChar ==0)  return 1;
        String key="" + reaminingChar+prevChar;
        if(map.containsKey(key))     return map.get(key);
        
        long total=0;
        switch(prevChar)
        {
                case 'a':total=(helpaer(reaminingChar-1,'e'))%MOD;
                break;
                
            case 'e':total=(helpaer(reaminingChar-1,'a') +  helpaer(reaminingChar-1,'i'))%MOD;
                break;
            
             case 'i':total=(helpaer(reaminingChar-1,'a')+
                             helpaer(reaminingChar-          1,'e')+
                             helpaer(reaminingChar-1,'o')+
                             helpaer(reaminingChar-1,'u'))%MOD;
                break;
            
                case 'o':total=(helpaer(reaminingChar-1,'i') + helpaer(reaminingChar-1,'u'))%MOD;
                break;
                            
                            
                case 'u':total=(helpaer(reaminingChar-1,'a'))%MOD;
                break;    
        }
                        
                            map.put(key,total);
                            return total;
    
    
    
}
                            }