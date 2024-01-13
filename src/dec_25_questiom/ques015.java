//email sender class: write  an email class with semder and recipient attibutes implement 
//a method to send mail
package dec_25_questiom;
class EmailSender{

	 String sender;
	 String recipient;
	 
	 
	  EmailSender() {
		 this.recipient=recipient;
		 this.sender=sender;
	 }
	  EmailSender(String sender,String recipirnt) {
		 this.recipient=recipient;
		 this.sender=sender;
	 }
	 void Display() {
		 System.out.println("send by :"+sender+"\n"+"recive ny :"+recipient);
	 }
}

public class ques015 {

	public static void main(String[] args) {
		EmailSender e1 = new EmailSender("ronny@gmail", "tops@gmail");
		e1.Display();
		
	}

}
