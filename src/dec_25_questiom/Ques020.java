/*Hotal rom bokking systeam: creat a class with a hotal rom class with the room number and 
occupancy status. implement a method to book the room if it us available */
package dec_25_questiom;
class HotalRoom{

	int availableroom = (int) Math .random()*100;
    int room;
    
     HotalRoom () {
    	this.room=room;
    }
    
    	
     HotalRoom(int room){
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
		HotalRoom h1=new HotalRoom(15);
		h1.Display();
	}

}
