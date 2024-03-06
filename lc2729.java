class Solution {
    public boolean isFascinating(int n) {
        
        int n1=2*n;
        int n2=3*n; 
        
        //adding given number (n1 and n2) in string format
        String concat=n+""+n1+n2;
        
        
        for(char c='1';c<='9';c++){
            int count=0;
        for(int i=0;i<concat.length();i++){
            char ch=concat.charAt(i);
            
            if(ch==c)
            count++;
        }
   //if character appeared more than once or not appeared at all the trend broken
            if(count>1||count==0)
                return false;
        }
        return true;
    }
}
