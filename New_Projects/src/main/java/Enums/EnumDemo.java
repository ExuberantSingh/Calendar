package Enums;

public class EnumDemo {
	


		   public static void main(String args[]) {

		      System.out.println("CellPhone List:");
		      for(Mobile m : Mobile.values()) {
		         System.out.println(m + " costs " + m.showPrice() + " dollars");
		      }

		      Mobile ret = Mobile.Nokia;
		      System.out.println("The ordinal is = " + ret.ordinal());
		      System.out.println("MobileName = " + ret.name());                      
		   }
		}




