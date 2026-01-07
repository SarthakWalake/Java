
class DuplicatePrint{
    public static void main(String [] args)
    {
        String str = "hello world";
      
        char [] ch = str.toCharArray();
        boolean[] visted = new boolean[ch.length];

        for(int i =0;i<ch.length;i++)
        {
            if(visted[i]) continue;
        
       int count = 1;

        for(int j = i+1;j<ch.length;j++)
        {  
            if(ch[i] == ch[j])
                {
                    count++;
                    visted[j] = true;
                }
        }
        if(count>1)
        {
            System.out.println(ch[i]+" = "+count);
        } 
        }
    }
}