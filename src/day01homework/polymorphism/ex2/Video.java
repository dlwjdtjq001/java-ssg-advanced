package day01homework.polymorphism.ex2;

public class Video extends Content{
    private String genre;

    public Video(String title, String genre){
        super(title);
        this.genre = genre;
    }
    @Override
    public void totalPrice() {
        switch(this.genre){
            case "new" : this.setPrice(2000);
            break;
            case "comic" : this.setPrice(1500);
            break;
            case "child" : this.setPrice(1000);
            break;
            default: this.setPrice(500);
        }
    }
}
