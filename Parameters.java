class Email {
    public void sendEmail(String emailId, String subject) {
        System.out.println("Sending email to: " + emailId);
        System.out.println("Subject: " + subject);
    }
}


class PhoneCall {
    public void makeCall(String mobileNum, String name, String countryCode) {
        System.out.println("Calling " + name + " at number: " + countryCode + " " + mobileNum);
    }
}


class Login {
    public void performLogin(String email, String password) {
        System.out.println("Logging in with email: " + email);
        System.out.println("Password: " + password);
    }
}

public class Parameters {
    public static void main(String[] args) {
        
        Email email = new Email();
        email.sendEmail("bharatipatgar@.com", "Meeting");

        
        PhoneCall phoneCall = new PhoneCall();
        phoneCall.makeCall("7777777777", "Bharati", "+91");

        
        Login login = new Login();
        login.performLogin("madhu@gmail.com", "password123");
    }
}
