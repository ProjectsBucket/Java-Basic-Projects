// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Day1_SubArrayWithGivenSum{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            ArrayList<Integer> res = subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }
	
	 //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {  
        int sum = 0;
        
        // Your code here using 2 for loops
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<= n-1; i++) {
            sum = arr[i];
            for(int j = i+1; j<= n; j++) {
                
                if (sum == s) {
                    list.add(i+1);
                    list.add(j);
                    return list;
                }
                
                if (sum > s || j == n)
                    break;
                    
                 sum += arr[j]; 
            }
            sum = 0;
        }
        

}// } Driver Code Ends

        