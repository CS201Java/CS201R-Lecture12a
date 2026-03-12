public class Teacher extends Staff{

    private String subject;
    public static int totalTeachers = 0;

    public Teacher(){
        super();
        type = 'T';
        subject = " ";
        totalTeachers++;
    }
    public Teacher(char t, String f, String l, int a, int h, double hr, String s){
        super (t, f, l, a, h, hr);
        subject = s;
        totalTeachers++;
    }

    public void setSubject(String s){subject = s;}
    public String getSubject(){return subject;}

    @Override
    public String toString(){
        String out = String.format("%-15s%-15s%5d      %-25s\n",fname,lname, age, subject);
        return out;
    }

}