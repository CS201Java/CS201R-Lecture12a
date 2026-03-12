public class Pet{
    private String petName;
    private String petType;

    public Pet(String n, String t){
        petName = n;
        petType = t;
    }
    public String getPetName(){return petName;}
    public String getPetType(){return petType;}

    public String toString(){
        return petName + " the " + petType;
    }
}