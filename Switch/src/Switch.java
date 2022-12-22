public class Switch {

    public static void main(String[] args) {


         int switchValue = 7;

         switch (switchValue){
             case 1:
                 System.out.println("Value was 1");
                 break;
             case 2:
                 System.out.println("Value was 2");
                 break;
             case 3: case 4: case 5:
                 System.out.println("Was a 3 , 4 , or 5 ");
                 System.out.println("Actually it is a " + switchValue);
                 break;
             default:
                 System.out.println("Was not 1,2,3,4 or 5 ");
                 System.out.println("Your Value is "+ switchValue);
                 break;
         }
        char switchValue1 = 'A';
        switch (switchValue1){
            case 'A':
                System.out.println("Value Was A ");
                break;
            case 'B': case  'C': case 'D': case 'E':
                System.out.println("Value has B , C , D  and E");
                System.out.println("And your value is "+ switchValue1);
                break;
            default:
                System.out.println("Not found anything ");
        }
        String month = "JanUary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }

}
