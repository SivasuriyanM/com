package interview;

import java.util.*;
// import java.util.Arrays;
// import java.util.List;
//  Time complexity : O(n² * √N)
public class nPrimeSpiralPrint {
    public static int[][] primeNumber(int n){
        int[][] matrix = new int[n][n];
        int len = n*n;
        List<Integer> list = new ArrayList<>();
        int num = 2;
        int r =0, c= 0;
        while(list.size()<len){
            if(isPrime(num)){
                list.add(num);
                matrix[r][c]=num;
                c++;
                if(c == n){
                    c=0;
                    r++;
                }
            }
            num++;
        }

        return matrix;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n == 2) return true;
        
        if(n%2==0) return false;
        for(int i = 3; i*i<=n;i++){
            if(n%2==0) return false;
        }
        return true;
    }

    public static void spiralPrint(int[][] mat){
        // for(int i = 0; i<3;i++){
        //     for(int j= 0; j<3;j++){
        //         System.out.print(mat[i][j]+ " ");
        //     }
        // }
        int t = 0, b = mat.length -1, l = 0, r = mat[0].length -1;

        while(t<=b && l<=r){
            for(int i = l; i<=r;i++){
                System.out.print(mat[t][i]+" ");
            }
            t++;
            for(int i = t; i<=b; i++){
                System.out.print(mat[i][r] + " ");
            }
            r--;
            if(t<= b){
                for(int i = r; i>=l; i--){
                    System.out.print(mat[b][i] +" ");
                }
                b--;
            }
            if(l<=r){
                for(int i = b; i>=t; i--){
                    System.out.print(mat[i][l]+ " ");
                }
                l++;
            }
        }
    }
    
    public static void main(String[] args) {
      int [][]mat = primeNumber(5);  
    //   System.out.println(mat[0][0]);
      spiralPrint(mat);
    }
}
