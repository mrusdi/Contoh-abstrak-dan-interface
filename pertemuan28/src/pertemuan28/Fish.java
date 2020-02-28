package pertemuan28;

public class Fish extends Animal implements Pet {
    String name;
    public Fish(){
        super(0);
    }
    
    void eat(){
        System.out.println("Ikan sedang makan");
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void play() {
        System.out.println("Ikan sedang bermain");
    }
    
    public void walk() {
        System.out.println("Ikan tidak berjalan"+"tapi berenang");
    }
}
