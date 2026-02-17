class L3_p2 extends L3_p1{
	static int neu=5;
		public static void display(){
         System.out.println(view+neu);
	}	
	@Override
	public int show(){
	super.show();
	return (view+neu);
	}
	public void pearl(){
 	super.display();
	System.out.println("Iam B child of A");
	}
}
