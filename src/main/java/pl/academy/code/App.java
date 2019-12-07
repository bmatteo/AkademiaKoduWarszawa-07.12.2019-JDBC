package pl.academy.code;

import pl.academy.code.model.BmiRecord;
import pl.academy.code.repositories.BmiRepository;

public class App {
    public static void main(String[] args) {
        BmiRepository.connect();

        BmiRecord record =
                new BmiRecord(80, 180, "Woman", 28.50);

        BmiRepository.addBmiToDb(record);

        BmiRecord record2 =
                new BmiRecord(80, 180, "Woman", 28.50);

        BmiRepository.addBmiToDb(record2);
    }
}
