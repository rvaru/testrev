

public class Demo {
	   int Age;

	   public Demo(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is :" + name );
	   }

	   public void setAge( int age ) {
	      Age = age;
	   }

	   public int getAge( ) {
	      System.out.println("Person's age is :" + Age );
	      return Age;
	   }

	   public static void main(String []args) {
	      /* Object creation */
		   Demo demo = new Demo( "xyz" );

	      /* Call class method to set Person's age */
		   demo.setAge( 2 );

	      /* Call another class method to get Person's age */
		   demo.getAge( );

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + demo.Age );
	   }
	}
