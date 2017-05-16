
public class Note extends Record {
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                '}';
    }

    private String note;


}
