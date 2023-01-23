public class Sheep extends DomesticAnimals {
    private int age;
    private int weigth;
    private String gender;
    private String nicName;

    public Sheep(int age, int weigth, String gender, String nicName) {
        this.age = age;
        this.weigth = weigth;
        this.gender = gender;
        this.nicName = nicName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", weigth=" + weigth +
                ", gender='" + gender + '\'' +
                ", nicName='" + nicName + '\'' +
                '}';
    }
}
