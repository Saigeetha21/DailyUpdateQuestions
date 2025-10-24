package feb29.staticbinding.com;
class Instrument{
	void play() {
		System.out.println("Instrument is playing");
	}
}
class Flute extends Instrument{
	void play() {
		System.out.println("Flute is playing");
	}
}
public class InstrumentMain {
	public static void main(String[] args) {
		Instrument i = new Instrument();
		i.play();//Static binding
		Instrument f = new Flute();
		f.play();//dynamic binding
	}

}
