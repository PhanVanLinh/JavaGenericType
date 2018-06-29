public class Main {

    public static void main(String[] args) {

    }

    void demo(Source<String> strs) {
        Source<Object> objects = strs; // !!! Not allowed in Java
        // ...
    }
}
