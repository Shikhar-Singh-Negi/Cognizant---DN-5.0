public class EmailNotificationService implements Notificationservice {
    public void sendOTP(String medium) {
       System.out.println("Sending OTP via Email");

    }

    public void sendTransactionReport(String medium) {
        System.out.println("Sending Transaction Report via Email");
    }
}
