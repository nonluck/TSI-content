package classses;

public class Manager {
	String text="";
	void print(String s) {
		text += s;
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
