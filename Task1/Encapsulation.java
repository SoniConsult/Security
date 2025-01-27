class Student{
    private int id ;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String Name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setId(112);
        s1.setName("Soni Rathore");
        int id=s1.getId();
        String name= s1.getName();
        System.out.println("Id : "+id+" , "+"Name "+name);

    }
}