package classses;

public class Manager {
	private int controllpoint=0;
	
	String text="";
	
	void print(String s) {
		text += s;
	}
	
	void Controller(String x) {
		switch(controllpoint) {
		case 0:
			writeTerminal(x);
			break;
		case 1:
			
		}
		
		
	}

	String writeTerminal(String past){
		text= "input: "+ past+"\n" ;
		try {
			double num = Integer.parseInt(past);
			for(double i=0; i < num; i++ ) {
			print(Double.toString(i)+"\n");}
		}catch(NumberFormatException e) {
			print("erro no input");
		}catch(NullPointerException e) {
			
		};
		return text;
	}
}
