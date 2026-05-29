public class Doctor extends Person {
    private String specialization;
    private String experience;

    public Doctor(String firstName, String lastName, int age,
                  String specialization, String experience) {
        super(firstName, lastName, age);
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getSpecialization() { return specialization; }
    public String getExperience() { return experience; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public void setExperience(String experience) { this.experience = experience; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience);
    }
}