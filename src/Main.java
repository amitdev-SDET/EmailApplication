public class Main {
    public static void main(String[] args) {
        Email em1=new Email("Amit","Das");
        System.out.println(em1.showInfo());
        em1.changePassword("Amitdas@12345");
        System.out.println("============================");
        System.out.println(em1.showInfo());
    }
}