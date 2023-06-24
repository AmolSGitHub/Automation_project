package java1;

  class Child_class extends Parent_class
  {
	  public void demo()
		 {
			 
			 System.out.println("hii");
			
		 }
	  public static void main(String1[] args)
	  {

		 Child_class var = new Child_class();
		 var.demo();
		  Parent_class ref=var;
		 ref.demo();
		 
	}
  }