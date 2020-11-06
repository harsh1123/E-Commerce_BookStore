import java.util.ArrayList;
public class javaArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> List1=new ArrayList<>(5);
		System.out.println(List1.size());
		List1.add(1);
		System.out.println(List1.size());
		System.out.println(List1.get(0));
	}

}
