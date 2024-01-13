package inheritance;
class Product{
	double price;
}
class Electronics extends Product{
	String brand;
	String serialNo;
	
}
class Mobile extends Electronics{
	
	String modelNumber;
	String modelName;
	
	void display() {
		System.out.println("model name : "+modelName+" "+"brand : "+brand+" "+"price : "+price);
	}
	
}
public class MultiLevel {
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.modelName = "S-22";
		obj.modelNumber = "xxxxxx2323";
		obj.serialNo = "xxxxxxx111";
		obj.brand = "Samsung";
		obj.price = 54000.0;
		
		obj.display();
	}

}
