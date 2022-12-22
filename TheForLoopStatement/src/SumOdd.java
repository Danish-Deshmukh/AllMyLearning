public class SumOdd {
//    Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
//    The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
//    It should call the method isOdd to check if each number is odd.
//    The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
//    If those conditions are not satisfied return -1 from the method to indicate invalid input.
    public static void main(String[] args) {
        System.out.println(sumOdd(3,6));
    }
    public static boolean isOdd (int number){
        if(number<0){
            return false;
        }
        if (number %2 !=0){
            return true;
        }else {
            return false;
        }
    }
    public static int sumOdd(int start,int end){
        if((end<start) || (start<0) || (end<0)){
            return -1;
        }
        int sum = 0;
        for(int i=start; i<=end; i++){
            boolean isod = isOdd(i);
            if (isod==true){
                sum = sum +i;
            }
        }return sum;

    }
}
