public class PrintArryElementInJava {
    public static void main(String[] args) {
        int a[] = new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        for (int i=0; i<3; i++){
            System.out.println(a[i]);
        }
        System.out.println("*************************");
        System.out.println("For each loop ( especially for arrays )");
        for (int b:a){
            System.out.println(b);
        }
    }
}
