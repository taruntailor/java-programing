/*Hotal rom bokking systeam: creat a class with a hotal rom class with the room number and 
occupancy status. implement a method to book the room if it us available */


package dec_22_questiom;
class HotalRoom{

	int availableroom = (int) Math .random()*100;
    int room;
    
    void room () {
    	this.room=room;
    }
    
    	
    void Myroom(int room){
    	this.room=room;
    }
    void Display() {
    	if(availableroom==room) {
    		System.out.println(room+"room is available ");
    	}else {
    		System.out.println(room+": room is not available ");

		}
    }
}
public class Ques020 {
	public static void main(String[] args) {
		
		HotalRoom h2 = new HotalRoom();
		h2.room=100;
		h2.Display();
		HotalRoom h3 = new HotalRoom();
        h3.Myroom(15);;
		h3.Display();
		
		
	}

}
