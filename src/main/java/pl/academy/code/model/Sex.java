package pl.academy.code.model;

public enum Sex {
    MEN("Men"),
    WOMAN("Woman"),
    OTHER("Other");

    String value;
    String cos;
    int cos2;
    double jahsdgf;

    Sex(String value) {
        switch (value) {
            case "Men":
                this.value = value;
                this.cos = "jgsfjgads";
                this.cos2 = 6;
                this.jahsdgf = 5.5;
                break;
            case "Woman":
                // wyliczenia
                break;
            case "asg":
                //wyliczenia
        }
    }
}
