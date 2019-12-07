package pl.academy.code.repositories;

import pl.academy.code.model.BmiRecord;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BmiRepository {
    public static Connection connection = null;

    public static void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            BmiRepository.connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/bmi" +
                            "?user=root&password=");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addBmiToDb(BmiRecord bmiRecord) {
        try {
            String sql = "INSERT INTO tbmirecord (weight, height, sex, bmi)" +
                    " VALUES (?, ?, ?, ?)";

            PreparedStatement zapytanie =
                    BmiRepository.connection.prepareStatement(sql);
            zapytanie.setInt(1, bmiRecord.getWeight());
            zapytanie.setInt(2, bmiRecord.getHeight());
            zapytanie.setString(3, bmiRecord.getSex());
            zapytanie.setDouble(4, bmiRecord.getBmi());

            zapytanie.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<BmiRecord> getDataFromDb() {
        List<BmiRecord> resultList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tbmirecord";

            PreparedStatement zapytanie =
                    BmiRepository.connection.prepareStatement(sql);

            ResultSet wynikZapytania = zapytanie.executeQuery();

            while (wynikZapytania.next()) {
                int id = wynikZapytania.getInt("id");
                int weight = wynikZapytania.getInt("weight");
                int height = wynikZapytania.getInt("height");
                String sex = wynikZapytania.getString("sex");
                double bmi = wynikZapytania.getDouble("bmi");

                BmiRecord bmiRecord = new BmiRecord();

                bmiRecord.setId(id);
                bmiRecord.setWeight(weight);
                bmiRecord.setHeight(height);
                bmiRecord.setSex(sex);
                bmiRecord.setBmi(bmi);

                resultList.add(bmiRecord);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultList;
    }
}
