package bai1;

public class NhanVien extends CanBo{
   private String word;
    public NhanVien(){

    }

    public NhanVien(String name, int age, String gender, String address, String word) {
        super(name, age, gender, address);
        this.word = word;
    }

    public NhanVien(String word) {

        this.word = word;
    }

    public String getWord() {

        return word;
    }

    public void setWord(String word) {

        this.word = word;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", word='" + word + '\'' +
                '}';


    }
}
