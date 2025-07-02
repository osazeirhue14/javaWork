package practice;

public class Car {
	String model;
	int price;
	Engine engine;
	
	Car(String model, int price, String engineType){
		this.model = model;
		this.price=price;
		this.engine = new Engine(engineType);
	}
	
	void start() {
		this.engine.start();
	}
	void stop() {
		this.engine.stop();
	}

}
