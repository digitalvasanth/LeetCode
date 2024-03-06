class Solution {
    public int minimumLength(String s) {
        
        //intitalising counter variables
        int i=0;
        int j=s.length()-1;
        
      
            while((i<j)&&(s.charAt(i)==s.charAt(j)))
            {
                char current=s.charAt(i);
                
                while((i<=j)&&( s.charAt(i)==current))
                    i++;
            
                while((j>=i)&&(s.charAt(j)==current))
                     j--;
        
            }
        
        return Math.max(0,j-i+1);
    }
}
