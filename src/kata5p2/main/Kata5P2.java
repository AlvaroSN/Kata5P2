package kata5P2.main;
import java.io.IOException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;

public class Kata5P2 {
    
    public static void main(String[] args) throws IOException {
        Kata5P2 kata5P2 = new Kata5P2();
        kata5P2.control();
    }
    
    private String filename;
    private List<Mail> mailList;
    private HistogramDisplay histoDisplay;
    
    private void control() throws IOException {
        input();
        process();
        output();
    }
    
    private void input(){
        filename = "/Users/ALVARO/Desktop/Uni/IS2/Kata5P2/email.txt";
    }
    
    private void process() throws IOException {
        mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        histoDisplay = new HistogramDisplay(histogram);
    }
    
    private void output(){
        histoDisplay.execute();
    }
    
}
