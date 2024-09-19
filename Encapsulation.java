public class Encapsulation {
    private String name; //declare it variable
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name; //it will set the name with the same row
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args){
        Encapsulation person = new Encapsulation();
        person.setName("Atok");
        person.setAge(17);

        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
}
