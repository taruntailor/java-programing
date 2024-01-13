/*music play list  clasas: creat platylist  class for a music player that stores a list of song 
 * titles add. method to add a song to playlist. 
 * */

package dec_22_questiom;

class Playlist{
	String title;
	
	void music() {
		this.title=title;
	}
	void music(String title) {
		this.title=title;
	}
	void display() {
		System.out.println("palay the song :"+title);
	}
}

public class ques017 {
public static void main(String[] args) {
	Playlist p1 = new Playlist();
	p1.title=("banjara");
	p1.display();
	
	Playlist p2 = new Playlist();
	p2.music("raama");
	p2.display();
}

}
