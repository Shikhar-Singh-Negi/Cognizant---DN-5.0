public class Main {
    public static void main(String[] args) {

        Notificationservice notification = new EmailNotificationService();

        notification.sendOTP("Email");
        notification.sendTransactionReport("Email");
    }
}