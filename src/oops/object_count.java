package oops;
 class obj{
		static int count = 0;
		obj(){
			count++;
			System.out.println(obj.count);

		}
 }
public class object_count {
public static void main(String[] args) {
     
	obj o1 = new obj();
	obj o2 = new obj();


	
}
}
