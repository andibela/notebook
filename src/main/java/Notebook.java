import asg.cliche.Command;

import java.util.ArrayList;

/**
 * Created by dianmink on 09-05-2017.
 */
public class Notebook {

    ArrayList<Record> records = new ArrayList<>();

    @Command
    public ArrayList<Record> list() {
        return records;

    }

    @Command
    public Record createPerson(String firstName, String lastName, String email, String address, String phone) {
        Person result = new Person();
//        records.size(); //can be used for autogeneration id but not so good

        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setPhone(phone);
        result.setEmail(email);
        result.setAddress(address);
        records.add(result); //add record to array list
        return result;

    }

    @Command
    public Record createNote(String note) {
        Note result = new Note();
        result.setNote(note);
        records.add(result);
        return result;

    }

    @Command
    public Record createReminder(String note, String time) {
        Reminder result = new Reminder();
        result.setTime(time);
        result.setNote(note);
        records.add(result);
        return result;
    }


//    @Command
//    public Record addphone(String firstName, String lastName, String phone, String email,String address){
//        Record result = new Record();
////        records.size(); //can be used for autogeneration id but not so good
//
//        result.setFirstName(firstName);
//        result.setLastName(lastName);
//        result.setPhone(phone);
//        result.setEmail(email);
//        result.setAddress(address);
//        records.add(result); //add record to array list
//        return result;

//    }
}
