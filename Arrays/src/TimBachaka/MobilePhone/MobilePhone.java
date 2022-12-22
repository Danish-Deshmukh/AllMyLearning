package TimBachaka.MobilePhone;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone (String myNumber){

        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact contact) {

        return true;
    }
    public boolean updateContact (Contact oldContact,Contact newContact){
     return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

    }
}
//   4   2   1
//