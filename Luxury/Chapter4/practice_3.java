package Chapter4;
class Song {
	String country, title, artist;
	int year;
	public Song() {}
	public Song(String country, String title, String artist, int year) {
		this.artist = artist;
		this.country = country;
		this.title = title;
		this.year = year;
	}
	
	public void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	
}



public class practice_3 {
	public static void main(String[] args) {
		Song song = new Song("스웨덴", "Dancing quuen", "ABBA", 1978);
		song.show();
	}

}
