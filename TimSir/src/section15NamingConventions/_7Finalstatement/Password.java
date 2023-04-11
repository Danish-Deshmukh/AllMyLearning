package section15NamingConventions._7Finalstatement;

public class Password {
    private static final int key = 89712837;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    public int encryptDecrypt(int password) {
        return password ^ key;
    }
    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }
    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        }
        else {
            System.out.println("Nope, you enter a wrong password");
            return false;
        }
//        return false;
    }
}
