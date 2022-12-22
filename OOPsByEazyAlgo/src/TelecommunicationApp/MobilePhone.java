package TelecommunicationApp;

public class MobilePhone implements Telephone {

    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;
    private boolean isAnswer;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone Powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            isAnswer = true;
            System.out.println("Answering the Mobile phone");
            isRinging = false;
        } else {
            System.out.println("The mobile is Power off ");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if ((phoneNumber == myNumber) && isPowerOn ) {
            if (isAnswer){
                isRinging = true;
                System.out.println("Phone ringing");
                isRinging = false;
            }
        }
        else {
            System.out.println("The Number you have dial is wrong");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
