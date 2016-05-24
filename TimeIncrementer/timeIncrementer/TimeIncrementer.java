
public class TimeIncrementer {

	private int hour;
	private int minute;
	private int second;

	public TimeIncrementer(int hour, int minute, int second) throws IllegalArgumentException{
		if(hour > 24 || hour < 0){
			throw new IllegalArgumentException();
		}
		if(minute > 59 || minute < 0){
			throw new IllegalArgumentException();
		}
		if(second > 59 || second < 0){
			throw new IllegalArgumentException();
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	private void Update(){
		if(this.second == 60){
			this.second = 0;
			this.minute++;
		}
		if(this.minute == 60){
			this.minute = 0;
			this.hour++;
		}
		if(this.hour == 25){
			this.hour = 1;
		}
		if(this.second == -1){
			this.second = 59;
			this.minute--;
		}
		if(this.minute == -1){
			this.minute = 59;
			this.hour--;
		}
		return;
	}

	public void Display(boolean standard, boolean military){
		if(standard == true){
			System.out.print("Standard Time: ");
			if(this.hour<10){
				System.out.print("0");
			}
			System.out.print(this.hour+":");
			if(this.minute<10){
				System.out.print("0");
			}
			System.out.print(this.minute+":");
			if(this.second<10){
				System.out.print("0");
			}
			System.out.println(this.second);

		}
		if(military == true){
			System.out.print("Military Time: ");
			if(this.hour<10){
				System.out.print("0");
			}
			System.out.print(this.hour);
			if(this.minute<10){
				System.out.print("0");
			}
			System.out.print(this.minute);
			if(this.second<10){
				System.out.print("0");
			}
			System.out.println(this.second);
		}
		System.out.println();
		return;
	}

	public void Increment(String unit){
		if(unit.equals("h")==true || unit.equals("hour")==true){
			this.hour++;
		}
		else if(unit.equals("m")==true || unit.equals("minute")==true || unit.equals("min")==true){
			this.minute++;
		}
		else if(unit.equals("s")==true || unit.equals("second")==true || unit.equals("sec")==true){
			this.second++;
		}
		else{
			return;
		}
		Update();
		return;
	}
	public void Decrement(String unit){
		if(unit.equals("h")==true || unit.equals("hour")==true){
			if(this.hour == 0){
				return;
			}
			this.hour--;
		}
		else if(unit.equals("m")==true || unit.equals("minute")==true || unit.equals("min")==true){
			this.minute--;
		}
		else if(unit.equals("s")==true || unit.equals("second")==true || unit.equals("sec")==true){
			this.second--;
		}
		else{
			return;
		}
		Update();
		return;
	}

}