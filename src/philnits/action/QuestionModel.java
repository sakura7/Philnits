package philnits.action;

public class QuestionModel {
	private String questionText;
	private String[] choices;
	private char answer;
	
	public QuestionModel(String qText, String[] choices, char answer){
		this.questionText = qText;
		this.choices=new String[5];
		this.answer = answer;
		
		for(int i=0; i<choices.length; i++){
			this.choices[i]=choices[i];
		}	
	}
	
	public String getQuestionText(){
		return this.questionText;
	}
	
	public String[] getChoices(){
		return this.choices;
	}
	
	public String getChoice(int i){
		String choice="null";
		if(i>0 && i<5)
			choice= this.choices[i];
		return choice;
	}
	
	public char getAnswer(){
		return this.answer;
	}
	
	
	
	

	
}
