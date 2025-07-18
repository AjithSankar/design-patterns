package behavioral.observer;

public class Main {

    public static void main(String[] args) {


        Subject madanGowri = new SocialMediaInfluencer("Madan Gowri");
        Observer ajith = new Follower("Ajith");
        Observer magizh = new Follower("Magizh");

        madanGowri.subscribe(ajith);
        madanGowri.subscribe(magizh);

        madanGowri.post("What is generative AI?");

        madanGowri.unsubscribe(ajith);

        madanGowri.post("Java is the best programming language");

    }
}
