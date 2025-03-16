public class Demo {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("Before Move: " + mp);
        mp.move();
        System.out.println("After Move: " + mp);
    }
}