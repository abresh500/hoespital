public class Patient extends Person {

    private String diagnosis;
    private int roomNumber;

    public Patient(String firstName, String lastName, int age, String diagnosis, int roomNumber) {
        super(firstName, lastName, age);
        this.diagnosis = diagnosis;
        this.roomNumber = roomNumber;
    }


    public String getDiagnosis() {
        return diagnosis;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Room Number: " + roomNumber);
    }
}