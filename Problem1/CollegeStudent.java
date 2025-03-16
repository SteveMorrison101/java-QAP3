public class CollegeStudent extends Student {
    private int year;
    private String major;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Get and set student year and major 
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}