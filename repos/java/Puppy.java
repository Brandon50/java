public class Puppy { 
   int puppyAge;
   
   public Puppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name choesn is :" + name );
   }
   
   public void setAge( int age ) {
       puppyAge = age;
   }
   
   public int getAge( ) { 
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }
   
   public static void main(String []a) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );
      
      /* Call another class method to get puppy's age */
      myPuppy.setAge( 2 );
      
       /* Call another class method to get puppy's age */
      myPuppy.setAge( );
      
      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}
      
