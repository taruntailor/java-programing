//email sender class: write  an email class with semder and recipient attibutes implement 
//a method to send mail

package dec_22_questiom;

class EmailSender{

	 String sender;
	 String recipient;
	 
	 
	 void EmailSender() {
		 this.recipient=recipient;
		 this.sender=sender;
	 }
	 void Emil(String sender,String recipirnt) {
		 this.recipient=recipient;
		 this.sender=sender;
	 }
	 void Display() {
		 System.out.println("send by :"+sender+"\n"+"recive ny :"+recipient);
	 }
}

public class ques015 {
	public static void main(String[] args) {
		EmailSender e1 = new EmailSender();
		e1.sender=("taruntailor8@gmail.com");
		e1.recipient=("tops@hmail.com");
		e1.Display();
		EmailSender e2 = new EmailSender();
        e2.Emil("ronny9@gamil", "topsgmail"); 
        e2.Display();

	}

}
