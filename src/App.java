/**
 * Joanne's Array Demo
 */

 public class App {
    public static void main(String args[]) throws Exception {        

            // index direct access
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);

            // access by iterating
            for(int i=0; i< args.length; i++){
            System.out.println(args[i]);
        }    
    }
}
