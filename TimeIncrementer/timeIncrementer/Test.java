
public class Test {

	public static void main(String[] args) {
		System.out.println("Test case 1:");
		TimeIncrementer first = new TimeIncrementer(12,30,30);
		first.Display(true,false);

		System.out.println("Test case 2:");
		TimeIncrementer second = new TimeIncrementer(12,30,30);
		second.Display(false,true);

		System.out.println("Test case 3:");
		TimeIncrementer third = new TimeIncrementer(12,30,30);
		third.Display(true,true);

		System.out.println("Test case 4:");
		TimeIncrementer fourth = new TimeIncrementer(9,20,10);
		fourth.Increment("h");
		fourth.Display(true,true);

		System.out.println("Test case 5:");
		TimeIncrementer fifth = new TimeIncrementer(5,45,50);
		fifth.Increment("m");
		fifth.Display(true,true);

		System.out.println("Test case 6:");
		TimeIncrementer sixth = new TimeIncrementer(0,3,24);
		sixth.Increment("s");
		sixth.Display(true,true);

		System.out.println("Test case 7:");
		TimeIncrementer seventh = new TimeIncrementer(10,20,30);
		seventh.Increment("s");
		seventh.Increment("m");
		seventh.Increment("h");
		seventh.Display(true,true);

		System.out.println("Test case 8:");
		TimeIncrementer eighth = new TimeIncrementer(10,20,9);
		eighth.Decrement("h");
		eighth.Display(true,true);

		System.out.println("Test case 9:");
		TimeIncrementer ninth = new TimeIncrementer(15,45,5);
		ninth.Decrement("m");
		ninth.Display(true,true);

		System.out.println("Test case 10:");
		TimeIncrementer tenth = new TimeIncrementer(24,3,37);
		tenth.Decrement("s");
		tenth.Display(true,true);

		System.out.println("Test case 11:");
		TimeIncrementer eleventh = new TimeIncrementer(20,7,56);
		eleventh.Decrement("s");
		eleventh.Decrement("m");
		eleventh.Decrement("h");
		eleventh.Display(true,true);

		System.out.println("Test case 12:");
		TimeIncrementer twelfth = new TimeIncrementer(22,23,44);
		twelfth.Increment("h");
		twelfth.Increment("h");
		twelfth.Increment("h");
		twelfth.Display(true,true);

		System.out.println("Test case 13:");
		TimeIncrementer thirteenth = new TimeIncrementer(12,57,30);
		thirteenth.Increment("m");
		thirteenth.Increment("m");
		thirteenth.Increment("m");
		thirteenth.Display(true,true);

		System.out.println("Test case 14:");
		TimeIncrementer fourteenth = new TimeIncrementer(21,6,57);
		fourteenth.Increment("s");
		fourteenth.Increment("s");
		fourteenth.Increment("s");
		fourteenth.Display(true,true);

		System.out.println("Test case 15:");
		TimeIncrementer fifteenth = new TimeIncrementer(3,40,25);
		fifteenth.Decrement("h");
		fifteenth.Decrement("h");
		fifteenth.Decrement("h");
		fifteenth.Display(true,true);

		System.out.println("Test case 16:");
		TimeIncrementer sixteenth = new TimeIncrementer(18,2,56);
		sixteenth.Decrement("m");
		sixteenth.Decrement("m");
		sixteenth.Decrement("m");
		sixteenth.Display(true,true);

		System.out.println("Test case 17:");
		TimeIncrementer seventeeth = new TimeIncrementer(9,38,2);
		seventeeth.Decrement("s");
		seventeeth.Decrement("s");
		seventeeth.Decrement("s");
		seventeeth.Display(true,true);

		System.out.println("Test case 18:");
		TimeIncrementer eighteenth = new TimeIncrementer(8,59,59);
		eighteenth.Increment("s");
		eighteenth.Increment("m");
		eighteenth.Increment("h");
		eighteenth.Display(true,true);

		System.out.println("Test case 19:");
		TimeIncrementer nineteenth = new TimeIncrementer(8,0,0);
		nineteenth.Decrement("s");
		nineteenth.Decrement("m");
		nineteenth.Decrement("h");
		nineteenth.Display(true,true);

		System.out.println("Test case 20:");
		TimeIncrementer twentieth = new TimeIncrementer(0,30,30);
		twentieth.Decrement("h");
		twentieth.Display(true,true);
		return;
	}

}