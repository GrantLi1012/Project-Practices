package Demo4;

public class Iterableinterface {

	public static void main(String[] args) {
		
		UrlLibrary library = new UrlLibrary();
		
		for(String html: library) {
			System.out.println(html.length());
			//System.out.println(url); 
		}
	}

}
