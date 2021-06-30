package chernyh.company;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(600);

        System.out.println(box.add(new Cylinder(2.0, 2.0)));
        System.out.println(box.add(new Ball(3.2)));
        System.out.println(box.add(new Pyramid(30, 30)));




        // write your code here
    }
}
