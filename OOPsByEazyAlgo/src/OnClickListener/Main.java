package OnClickListener;

public class Main {
    public static void main(String[] args) {
        Button btnLogin = new Button();

        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("User is Login");
            }
        });

        Button btnLogOut = new Button();

        btnLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("User is Logout");
            }
        });
    }
}
