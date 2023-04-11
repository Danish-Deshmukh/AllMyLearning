package section15NamingConventions._3Scope;

public class ScopeCheck {
    public int publicVar = 0;
    final private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " +
                publicVar + " PrivateVar = " + privateVar);
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Times two is " + i + privateVar);
        }
    }
    class InnerClass{
        final private int privateVar = 1;
        public InnerClass() {
        }
        public void timesTwo() {
            int privateVar = 2;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " Times two is " + i + privateVar);
            }
        }
    }
}
