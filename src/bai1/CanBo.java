package bai1;

public class CanBo {
   public String name;
   public int age;
   public String gender;
   public String address;

    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public CanBo() {

    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getGender() {

        return gender;
    }

    public String getAddress() {

        return address;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setAddress(String address) {

        this.address = address;
    }
}
