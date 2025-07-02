package practice;

public class Engine {
	String type;
	
	Engine(String type){
		this.type=type;
	}
	void start() {
		System.out.println("You have started the "+this.type+" engine");
	}
	void stop() {
		System.out.println("You have stopped the "+this.type+" engine");
	}

}
