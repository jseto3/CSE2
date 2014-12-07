//Jeffrey Seto
//December 1st, 2014
//CSE 002
//Matrix Sorter Java Program

//Sorts matrix

public class MatrixSorter {
    public static void main(String arg[]) {
        //add class and main method
        
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }   //end of main method
    
    public static int [][][] buildMat3d () {
        int[][][] a= new int [3][][];
        for (int i=0; i<a.length; i++) {
            a[i]= new int [3+2*i];
        }
        
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++){
                a[i][j]= new int [i+j+1];
            }    
        }
        
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++){
                for (int k=0; k<a[i][j].length; k++){
                    a[i][j][k]=(int)(Math.random()*99);
                }
            }
        }
        return a;
    }   //end of method
    
    public static void show (int[][][] b){
          for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int findMin(int [][][] a) {
        for (int i = 0; i < a.length; i++) { //rows
            for (int j = 0; j < a[i].length; j++) { //columns
                int min = j;
                for (int k = j; k < a[i].length; k++) {
                    if (a[i][min] > a[i][k]) {
                        min = k;
                    }
                }
                if (min != j) {
                    int temp = a[i][min];
                    a[i][min] = a[i][j];
                    a[i][j] = temp;
                }
            }
        }
    }
    
    public static int [][][] sort (int [][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}   //end of class