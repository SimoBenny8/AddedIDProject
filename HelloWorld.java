import java.util.logging.Logger;

public class HelloWorld {
	
	 private static final Logger logger1 = Logger.getLogger(HelloWorld.class.getName());
	 private String name = "Giorgio";
	 public static void main(String[] args) {
		
		 logger1.info("ciao" + name);
		 	

	}


}
