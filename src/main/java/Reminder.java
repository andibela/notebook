import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Reminder extends Note {
    private LocalDateTime time;
//    public String getTime() {
//        return time;
//    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }


    public void setTime(String strTime) {
//        this.time = time;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:crmm");
        this.time = LocalDateTime.parse(strTime, fmt);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "note='" + getNote() + '\'' +
                "time='" + time + '\'' +
                '}';
    }

//    private String time;
}
