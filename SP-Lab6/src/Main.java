import models.*;
import services.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraful 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraful 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraful 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraful 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("Image1"));
        cap1.add(new Image("Image2"));
        cap1.addWithoutCopy(new Paragraph("Text"));
        cap1.add(new Table("Table 1"));
        RenderContentVisitor stats = new RenderContentVisitor();
        cap1.accept(stats);

        CountContentVisitor counter = new CountContentVisitor();
        cap1.accept(counter);
        counter.showCountStatistics();
    }
}