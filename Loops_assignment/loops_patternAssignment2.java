public class loops_patternAssignment2 {
    public static void main(String[] args) {
        int n=10;
        // 2) write a program to print traingle using star pattern programming logic
        for (int i=0; i<n;i++ ) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("nnnnn");
            // wap to print ?
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                if (i==0 || j==0|| i==n-1 || j==n-1
                    || i+j<=(n-1)/2 || j-i>=(n-1)/2)  {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            System.out.println();
        }
    }
}
