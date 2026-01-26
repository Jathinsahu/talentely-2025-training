import java.util.Scanner;
public class subsequence {
    String word,sub;
    subsequence(String word,String sub){
        this.word = word;
        this.sub = sub;
    }


    boolean findSubsequence(int wordIndex,int subIndex){

        if(subIndex >= sub.length()) return true;
        if(wordIndex >= word.length()) return false;
        for(int i = wordIndex;i<word.length();i++){
            if(word.charAt(i)==sub.charAt(subIndex)){
                if(findSubsequence(i+1,subIndex+1)) return true;
            }
        }
        return false;
    }




}
