public class CommandLine {

    public static void main(String[] args) {
        Done done = new Done();
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " +  args[i]);
        }
        System.out.println(done.x);
    }
}

class Done {
    String x;
    Done() {
        x = "Done!";
    }
}
