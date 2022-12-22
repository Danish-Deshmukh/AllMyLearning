public class JavaNumberPattern {
    public static void main(String[] args) {
        int i,j;
        for (i=1; i<=5; i++){ //raws
            for (j=1; j<=i; j++){ // column
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
