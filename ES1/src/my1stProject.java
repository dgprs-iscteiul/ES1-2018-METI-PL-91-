public class my1stProject {
	public my1stProject(String name) {
		System.out.println("Passed Name is :" + name );
	}

	public static void main(String []args) {
		
		@SuppressWarnings("unused")
		my1stProject myProject = new my1stProject ("Test");
	}
}
