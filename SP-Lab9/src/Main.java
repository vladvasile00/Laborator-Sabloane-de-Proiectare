import models.*;
import services.*;

public class Main {
    public static void main(String[] args) throws Exception {
        OpenCommand openCommand = new OpenCommand("Titlu");

        Section sectionToSave = new Section("Capitolul 14");
        sectionToSave.add(new Paragraph("Capitol adaugat printr-un Command"));
        SaveCommand saveCommand = new SaveCommand(sectionToSave);

        StatisticsCommand statisticsCommand = new StatisticsCommand();

        openCommand.execute();
        saveCommand.execute();
        statisticsCommand.execute();
    }
}