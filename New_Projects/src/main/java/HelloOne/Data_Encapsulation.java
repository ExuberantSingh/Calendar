package HelloOne;

public class Data_Encapsulation {

	private static String geekName ;
	
	public String getName() {
		return geekName;
	}
	
	public void setName(String newName) {
		geekName = newName;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_Encapsulation obj = new Data_Encapsulation();
		obj.setName("Gunveer Singh");
		System.out.println("Customer Name : " + obj.getName());
		
	}

}
