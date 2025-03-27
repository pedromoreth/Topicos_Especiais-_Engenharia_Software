interface EmailSender {
    void enviarEmail(String destinatario, String mensagem);
}

class GmailSender implements EmailSender {
    public void enviarEmail(String destinatario, String mensagem) {
        System.out.println("Enviando email via Gmail para " + destinatario + ": " + mensagem);
    }
}

class OutlookSender implements EmailSender {
    public void enviarEmail(String destinatario, String mensagem) {
        System.out.println("Enviando email via Outlook para " + destinatario + ": " + mensagem);
    }
}

class EmailService {
    private EmailSender sender;

    public EmailService(EmailSender sender) {
        this.sender = sender;
    }

    public void notificar(String destinatario, String mensagem) {
        sender.enviarEmail(destinatario, mensagem);
    }
}

public class DIPMain {
    public static void main(String[] args) {
        EmailService serviceGmail = new EmailService(new GmailSender());
        serviceGmail.notificar("cliente@gmail.com", "Bem-vindo ao nosso sistema!");

        EmailService serviceOutlook = new EmailService(new OutlookSender());
        serviceOutlook.notificar("cliente@outlook.com", "Bem-vindo ao nosso sistema!");
    }
}
