package interview;

public class encript {

    public static String[][] buildMatrix(String s, int r, int c){
        String[][] resultMatrix = new String[r][c];
        int index = 0;
        for(int i = 0; i<r;i++){
            for(int j=0;j<c;j++){
                resultMatrix[i][j] = ""+ s.charAt(index);
                index++;
                if(index==s.length()){
                    break;
                }
            }
            
        }
        return resultMatrix;
    }

    public static String buildString(String[][] m){
        String resultString = "";
        
        for(int i = 0; i<m[0].length; i++){
            for(int j = 0; j<m.length; j++){
                if(m[j][i]!=null){
                    resultString += m[j][i];
                }
                
            }
            resultString+= " ";
        }

        return resultString;
    } 

    public static String encriptString(String str){
        String encriptedString = "";
        int len = str.length();
        double root = Math.sqrt(len);
        int row = (int)Math.floor(root);
        int col = (int)Math.ceil(root);
        if (row * col < len) {
            row++;
        }
        // System.out.println("root : "+ root+ " floor : "+ floor+ " ceil : "+ ceil + " length : "+ str.length() );
        // if(row*col>= len){
        //     String[][] mat = buildMatrix(str, row, col);
        //     encriptedString = buildString(mat);
        // }

        String[][] mat = buildMatrix(str, row, col);
        encriptedString = buildString(mat);

        return encriptedString;
    }

    public static void main(String[] args) {
        // String str = "haveaniceday";
        // String str = "feedthedog";
        // String str = "chillout";

        String str = "ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots";
        

        
        System.out.println("Encripted Message : " + encriptString(str));
    }
    
}


// import java.util.*;

// public class GridEncryption {

//     public static String encryption(String s) {
//         // Step 1: Remove spaces
//         s = s.replaceAll(" ", "");
//         int L = s.length();

//         // Step 2: Compute rows and columns
//         int rows = (int) Math.floor(Math.sqrt(L));
//         int cols = (int) Math.ceil(Math.sqrt(L));

//         // If grid area is less than length, increase rows
//         if (rows * cols < L) {
//             rows++;
//         }

//         // Step 3: Fill the grid row by row
//         char[][] grid = new char[rows][cols];
//         int index = 0;
//         for (int r = 0; r < rows; r++) {
//             for (int c = 0; c < cols && index < L; c++) {
//                 grid[r][c] = s.charAt(index++);
//             }
//         }

//         // Step 4: Read column by column
//         StringBuilder encrypted = new StringBuilder();
//         for (int c = 0; c < cols; c++) {
//             for (int r = 0; r < rows; r++) {
//                 if (grid[r][c] != 0) { // Avoid default null char
//                     encrypted.append(grid[r][c]);
//                 }
//             }
//             encrypted.append(" ");
//         }

//         return encrypted.toString().trim(); // Remove last space
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter string to encrypt: ");
//         String input = scanner.nextLine();
//         String result = encryption(input);
//         System.out.println("Encrypted string:");
//         System.out.println(result);
//     }
// }

