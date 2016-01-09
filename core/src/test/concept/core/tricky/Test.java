package test.concept.core.tricky;

public class Test {
	 public static void main(String[] args) {
	        method(null);
	        print();
	    }
	    public static void method(Object o) {
	        System.out.println("Object impl");
	    }
	    public static void method(String s) {
	        System.out.println("String impl");
	    }
	    
	    public static void print(){
	    	long longWithL = 1000*60*60*24*365L;
	    	long longWithoutL = 1000*60*60*24*365;
	    	System.out.println(longWithL);
	    	System.out.println(longWithoutL);
	    }
}
