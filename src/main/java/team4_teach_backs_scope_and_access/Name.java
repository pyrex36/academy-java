package team4_teach_backs_scope_and_access;

public class Name {
	//class level scope 
	private String first;
	    public String last;

	    //Method level scope
	    public Name(String theFirst, String theLast) {
	        String firstName = theFirst;
	        
	        // Block level scope
	        first = firstName;
	        last = theLast;
	     }

}
