
public class test {
	public static void main(String []args) {
		//System.err.println(String.class.getClassLoader());
		Class t = test.class;
		System.out.println(t.getClassLoader());
	}
}
