package com.question_4;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main{
    private static void rotateBy90(List<List<Integer>> mat,int n){
        
          for(int i= mat.size()-1; i>=0; i--)
           {
              String  bag= "";
             for(int j=0; j<mat.size(); j++)
              {
               bag= bag+mat+" ";
             }
System.out.println(bag);  
}
     
    }
    
    public static void main(String[] sabira) throws IOException{
        
        BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(sc.readLine().trim());
        
            List<List<Integer>> mat=new ArrayList<>();
        for(int i=0; i<n; i++){
                
           List<Integer> arr= Stream.of(sc.readLine().trim().split(" "))
                                .map(Integer::parseInt).collect(Collectors.toList());
            mat.add(arr);
            
            }
	       // System.out.println(mat);
	        
	       rotateBy90(mat,n);
	        

}

}

