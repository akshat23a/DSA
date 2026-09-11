class Solution {
    public String sortSentence(String s) {
        String []words=s.split(" ");
        String[]str= new String[words.length];
        for(String word:words){
            int pos=word.charAt(word.length()-1)-'0';
            word=word.substring(0,word.length()-1);
            str[pos-1]=word;
        }
        return String.join(" ",str);
        }
        
    }
