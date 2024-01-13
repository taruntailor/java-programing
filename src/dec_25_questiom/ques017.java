/*music play list  clasas: creat platylist  class for a music player that stores a list of song 
 * titles add. method to add a song to playlist. 
 * */
package dec_25_questiom;
class Playlist{
	String title;
	
	Playlist() {
		this.title=title;
	}
	Playlist(String title) {
		this.title=title;
	}
	void display() {
		System.out.println("palay the song :"+title);
	}
}
public class ques017 {
	public static void main(String[] args) {
		Playlist p1 = new Playlist("ram");
		p1.display();
	}

}
