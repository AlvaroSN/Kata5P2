package kata5P2.main;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;
import kata5p2.view.MailListReaderBD;

public class Kata5P2 {
    
    public static void main(String[] args) throws IOException, SQLException {
        Kata5P2 kata5P2 = new Kata5P2();
        kata5P2.control();
    }
    
    private String filename;
    private List<String> mailList;
    private HistogramDisplay histoDisplay;
    
    private void control() throws IOException, SQLException {
        input();
        process();
        output();
    }
    
    private void input() throws SQLException {
        mailList = MailListReaderBD.read();
    }
    
    private void process() throws IOException {        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        histoDisplay = new HistogramDisplay(histogram);
    }
    
    private void output(){
        histoDisplay.execute();
    }
    
}
