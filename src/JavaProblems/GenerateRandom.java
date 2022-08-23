package JavaProblems;

import java.nio.channels.NonWritableChannelException;
import java.util.Random;
import java.lang.Math;
public class GenerateRandom {
	public static void main(String[] args) {
		//by using random class
		Random rand = new Random();
		int abc = rand.nextInt(100);
		System.out.println(abc);
		
		//By using math class
		System.out.println(Math.random());//it take decimal num as random
		
	}

}
