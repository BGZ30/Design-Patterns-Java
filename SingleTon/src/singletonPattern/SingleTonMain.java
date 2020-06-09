package singletonPattern;

public class SingleTonMain {

	public static void main(String[] args) {
		
		SingleTonLazy lazyObject1 = SingleTonLazy.getInstance();
		SingleTonLazy lazyObject2 = SingleTonLazy.getInstance();
		SingleTonLazy lazyObject3 = SingleTonLazy.getInstance();
		
		//SingleTonDoubleChecking ob = SingleTonDoubleChecking.getInstance();

	}

}
