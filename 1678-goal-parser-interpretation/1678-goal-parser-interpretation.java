class Solution {
    public String interpret(String command) {
        String s="";
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
                s=s+command.charAt(i);
            
             if(command.charAt(i)=='(' && command.charAt(i+1)==')')
                // s=s+command.charAt(i)+command.charAt(i+1);
                s=s+'o';
            
            if(command.charAt(i)=='a' && command.charAt(i+1)=='l') 
                s=s+command.charAt(i)+command.charAt(i+1);
            
        }
        return s;
        
    }
}