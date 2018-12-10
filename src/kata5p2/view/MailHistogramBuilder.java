package kata5P2.view;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(mail1);
        }
        return histo;
    }

 
}
