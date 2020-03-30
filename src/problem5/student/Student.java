
package problem5.student;
// to store student information and properties

public class Student {

    private String name;
    private int backLog;
    private int appearingCount;

    // constructor
    public Student(String name, int backLog, int appearingCount) {
        this.name = name;
        this.backLog = backLog;
        this.appearingCount = appearingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackLog() {
        return backLog;
    }

    public void setBackLog(int backLog) {
        this.backLog = backLog;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    public String toString() {
        return getName() + ": " + getBackLog() + "(" + getAppearingCount() + ")";
    }
}
