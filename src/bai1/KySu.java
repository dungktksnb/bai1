package bai1;

public class KySu extends CanBo{
    String trainingIndustry;
    public KySu(){

    }

    public KySu(String name, int age, String gender, String address, String trainingIndustry) {
        super(name, age, gender, address);
        this.trainingIndustry = trainingIndustry;
    }

    public KySu(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }
}
