
public class Reminder extends Note {
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "note='" + getNote() + '\'' +
                "time='" + time + '\'' +
                '}';
    }

    private String time;
}
