class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer sb=new StringBuffer ();
        char[] ch=word1.toCharArray();
        char[] ch1=word2.toCharArray();
        for(int i=0;i < Math.min(ch.length, ch1.length);i++){
             sb.append(ch[i]);   
            sb.append(ch1[i]);
  
        }
        if(ch.length > ch1.length)
           for(int i = ch1.length; i < ch.length; i++) {
              sb.append(ch[i]);
              }
        if(ch.length<ch1.length){
            for(int i=ch.length;i<ch1.length;i++){
                sb.append(ch1[i]);
            }
        }


        String s=new String(sb);
        return s;
    }
}