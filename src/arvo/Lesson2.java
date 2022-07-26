package arvo;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        talk();
        System.out.println("some changes");
        talkEvenMore();
        System.out.println("should be in 'Not main' branch");
        System.out.println("commited in Not main branch but merged");

    }

    public static void talk() {
        System.out.println("Hello");

    }
    public static void talkEvenMore(){
        System.out.println("Even more changes");
    }
}


