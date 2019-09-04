package Demo2;


class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		throw new Exception("Oh no!");
	}
	
}

public class App {

	public static void main(String[] args) {
		//try with resources
		try(Temp temp = new Temp()){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
