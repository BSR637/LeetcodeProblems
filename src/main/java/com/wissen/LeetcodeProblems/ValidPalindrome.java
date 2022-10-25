package com.wissen.LeetcodeProblems;

public class ValidPalindrome {
	   public boolean isPalindrome(String s) {
	        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
	        System.out.println(s);
	        int i=0, j = s.length()-1;
	        while(i<=j)
	        {
	            if(s.charAt(i) != s.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
}
