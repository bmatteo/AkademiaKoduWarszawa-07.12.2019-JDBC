package pl.academy.code.model;

public class BmiRecord {
    private int id;
    private int weight;
    private int height;
    private String sex;
    private double bmi;

    public BmiRecord() {

    }
    public BmiRecord(int weight, int height, String sex, double bmi) {
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.bmi = bmi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }


}
