
package pertemuan28;

public class Cat extends Animal implements Pet {
    String name;
    public Cat() {
        this("");
    }
    public Cat (String name){
        super(4);
        this.name=name;
    }
    
    void eat() {
        System.out.println("Kucing sedang"+"memakan ikan");
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name;
    }
    public void play(){
            System.out.println("Kucing sedang bermain");
    }
    
}
