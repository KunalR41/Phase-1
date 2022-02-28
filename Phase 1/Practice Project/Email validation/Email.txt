package Ass2;


import java.util.regex.Pattern;
import java.util.*;

 class EmailID
{
	public static boolean isValid(String emailId)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&-]+)@." +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (emailId == null) {
			return false;
		}
		else
		{
		return pat.matcher(emailId).matches();
		}
	}
}

public class Email {
	
	public static void main(String[] args)
	{
		ArrayList<String> emailId = new ArrayList<>();
			
		emailId.add("kunalraskar01@gmail.com");
		emailId.add("query.learn@compony.in");
		emailId.add("LIC.org.ltd");
		emailId.add("kunalraskar002@gmail.com");
		
			
		for(String i: emailId) 
			if (EmailID.isValid(i)) {
				System.out.println(i + " : is  not valid Email addresss.");
			}
				else
				{
				System.out.println(i + " : is  valid email address.");
				}
		}
	}

