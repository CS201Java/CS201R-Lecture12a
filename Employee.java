public class Employee extends Staff{
    private double vacaHours;

    public static int totalEmployees = 0;

    public Employee(){
        super();
        type = 'E';
        vacaHours = 0.0;
        totalEmployees++;
    }

    public Employee(char t, String f, String l, int a,
                    int h, double hr, double v){
        super(t, f, l, a, h, hr);
        vacaHours = v;
        totalEmployees++;
    }
    

    public void setVacaHours(double v){vacaHours = v;}
    public double getVacaHours(){return vacaHours;}

    @Override
    public String toString(){
        String out = String.format("%-15s%-15s%5d      %10.2f\n",fname,lname, age, vacaHours);
        return out;
    }
    
}
