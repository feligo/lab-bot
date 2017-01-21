package hello.suribot.response;

import java.util.ArrayList;
import java.util.List;

public class Response {

	private String message;
	private String urlImage;
	private List<String> listChoice;
	
	public Response(){}
	
	public Response(String message){
		this.message = message;
	}
	
	public Response(String message, List<String> listChoice){
		this.message = message;
		this.listChoice = listChoice;
	}
	
	public Response(String message, String urlImage){
		this.message = message;
		this.urlImage = urlImage;
	}
	
	public Response(String message, String urlImage, List<String> listChoice){
		this.message = message;
		this.urlImage = urlImage;
		this.listChoice = listChoice;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void addNewTextAtTheBegin(String text){
		if(message!=null) message=text+message;
		else message = text;
	}
	
	public void addNewTextAtTheEnd(String text){
		if(message!=null) message+=text;
		else message = text;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public List<String> getListChoice() {
		return listChoice;
	}

	public void setListChoice(List<String> listChoice) {
		this.listChoice = listChoice;
	}
	
	public void addChoice(String newChoice){
		if(listChoice!=null)listChoice.add(newChoice);
		else{
			listChoice=new ArrayList<>();
			listChoice.add(newChoice);
		}
	}
}