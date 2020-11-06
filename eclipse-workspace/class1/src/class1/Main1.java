package class1;

public class Main1 {

	   static {
	        orange = 25;
	    }
	    final static int orange;
	    static int banana;
	    static {
	        banana = orange * 2;
	    }
	    public static void main(String[] args) {
	        System.out.print(orange + " " + banana + " ");
	        banana = orange + banana;
	        System.out.print(banana);
	    }
}
