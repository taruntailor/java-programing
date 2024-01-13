package dec_18;


class Product {

	int id;
	String brandName;
	String desc;
	double mrp;
	int discount;
	
	
	double getSalePrice() {
		double disAmount = mrp*discount/100;
		return mrp - disAmount;
	}
	
	void showDetail() {
		// double salePrice = getSalePrice();
		System.out.println("id : "+id+"\n"+"brand name : "+brandName+"\n"+ "mrp : "+mrp+"\n"+"discount : "+ discount+"\n"+"sale price : "+getSalePrice());
	}

}

public class class_object {
	public static void main(String[] args) {

		// creating object
		Product p1 = new Product();
		p1.id = 111;
		p1.brandName = "Puma";
		p1.desc = "Printed cotton sweatshirt";
		p1.mrp = 2999.0;
		p1.discount = 60;

		Product p2 = new Product();
		p2.id = 222;
		p2.brandName = "Adidas";
		p2.desc = "Club tennis tank top";
		p2.mrp = 1199.0;
		p2.discount = 30;
		
		Product p3 = new Product();
		// Product p4 = null;							// object has not initialized (will thrown null pointer exception )
		
		// System.out.println("Brand Name : "+p2.brandName);
		p1.showDetail();
		p2.showDetail();
		p3.showDetail();
		
	//	note : we can call class properties without creating an object. it will throw NullPointerException
		
	}

}
