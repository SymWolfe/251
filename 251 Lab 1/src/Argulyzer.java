/* CS 251.003
 Symantha Wolfe
 Tue, Aug 25, 2015 
*/

import java.util.Arrays;

public class Argulyzer {

    private String argulyze(String[] args) {
    	if(args.length < 1) return "none";
    	if(args.length == 1) return "one";
    	if(args.length == 2) {
    		Arrays.sort(args);//sorts from smallest (first in array) to largest (last in array)
    		return args[1]; // returns the end of the array (larger lexicographic word)
    	}
    	else{
    		String word = args[0]; 
    		for (String s : args){ 
    			if (s.length() < word.length()){ 
    				word = s; //keeps shortest word
    			}
    			if (s.length() == word.length()){ //handles two equally short words
    				if(s.compareTo(word) < 0){
    					word = s; // keeps smallest word
    				}
    			}
    		}  		
    		return word;
    	}
    }

    public static void main(String[] args) {
        Argulyzer a = new Argulyzer();
        System.out.println(a.argulyze(args));
    }

}
