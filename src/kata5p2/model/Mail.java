package kata5P2.model;

public class Mail {
    private final String mail;

    public String getMail() {
        return mail;
    }

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        return mail.split("@")[1];
    }
}
