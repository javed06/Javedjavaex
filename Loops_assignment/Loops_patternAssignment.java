public class Loops_patternAssignment {
    public static void main(String[] args) {
        int n=16;
int fp=n/2;
int sp=n/2;
        // 1) WAP to print alphabets A,B,C,D,E,F,G,H using pattern programming logic
        for (int i=0;i<n;i++){  //A
            for (int j=0;j<n;j++){
                if (i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=(n-1)/2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j=0;j<n;j++){ //B
                if (i==0 && j>0 && j<n-2 || j==0 && i<=(n-1)/2 && i>0 || j==n-1 && i>0 && i<(n-2)/2 || i==(n-1)/2 && j<n-3
                   || j==0 && i>=(n-1)/2 || j==n-1 && i<n-1 && i>(n-1)/2 || i==n-1 && j<n-1){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j=0;j<n;j++){ //C
                if (i==0 && j>1 || j==0 && i>0 && i<n-1 || i==n-1 && j>1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for (int j=0;j<n;j++){ //D
                if (j==0 || i==0 && j<(n-1)/2 || j==(n-1)/2 && i<n-1 && i>0 || i==n-1 && j<(n-1)/2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j=0;j<n;j++){ //E
                if (j==0 || i==0 || i==(n-1)/2 || i==n-1 ) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j=0;j<n;j++){ //F
                if (j==0 || i==0 || i==(n-1)/2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j=0;j<n;j++){ //G
                if (i==0 && j>0 && j<n-1 || j==0 && i>0 && i<n-1 || i==n-1 && j<n-2 && j>0 || j==n-1 && i>=(n-1)/2 && i<n-1 || i==(n-1)/2 && j>3) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (int j=0;j<n;j++){ //H
                if (j==0 || i==(n-1)/2 || j==n-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
