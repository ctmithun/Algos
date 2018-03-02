 	package quicksort;
 	import java.io.File;
import java.util.Scanner;

 	public class Solution {

 	    static int waysToGiveACheck(char[][] board) {
 	        // Complete this function
 	        int kx = 0;
 	        int ky = 0;
 	        boolean isExit = false;
 	        for(int i = 0;i<8;i++) {
 	            for(int j = 0; j<8;j++) {
 	                if(board[i][j] == 'k') {
 	                    kx = i;
 	                    ky = j;
 	                    isExit = true;
 	                    break;
 	                }
 	            }
 	            if(isExit) {
 	                break;
 	            }
 	        }
 	        for(int j = 0 ; j< 8; j++){
 	            if(board[1][j] != '#') {
 	                //case1 knight
 	                if(kx == 1 && (Math.abs(ky - j) == 2)) {
 	                    return 1;
 	                }
 	                //straight check
 	                if(kx == 0 || ky == j) {
 	                    return 2;
 	                }
 	                //diagonal check
 	                if(kx == Math.abs(ky - j)) {
 	                    return 2;
 	                }
 	            }
 	        }
 	        return 0;
 	    }

 	    public static void main(String[] args) {
 	    	File f = new File("res.txt");
 	    	System.out.println(f.getFreeSpace());
 	    }
 	}
