package string_methods;

public class stringprograms {

	public static void main(String[] args) {
		 String str="QspiDERSQ";
		 //finding the index values
		 int index=str.indexOf('R');
		 System.out.println("index value is "+index);
		 System.out.println();
		 
		 //finding the character at position
		 char ch=str.charAt(7);
		 System.out.println("charater is "+ch);
		 
		 //converting into lower case
		 String s=str.toLowerCase();
		 System.out.println("convert to lower case "+s);
  		 
		 
		 //converting to upper case
		 String s1=str.toUpperCase();
		 System.out.println("convert upeer case "+s1);
		 
		 //converting the string into array
		 char[] s2=str.toCharArray();
		 for (int i = 0; i < s2.length; i++) {
			
			System.out.println(s2[i]);
		}
		 //concading the two string
		 String s3=str.concat(" jspiders");
		 System.err.println("concatination of a two strings is "+s3);
		 
		 
		 //replace
		 String str4=str.replace('p', 'N');
		 System.out.println(str4);
		 System.err.println(str.replace("Qsp","JSP"));
		 System.out.println(str.replaceAll("Q", "J"));
		 
		 //sub String 
		 
		 String str5=str.substring(0, 3);
		 System.out.println(str5);
		 System.out.println(str.substring(6));
		 
		 
		 //split
		 String st="hello good morning";
				 String[] str6=st.split(" ");
				 String[] str7=st.split("o");
				 for (int i = 0; i < str6.length; i++) {
					// System.out.println(str6[i]);
					 System.out.println(str7[i]);
				}
				 
				 
				 //comapreTo will compares the character
				 
				 String st1="rba";
				 int str8=st1.compareTo("a");
				 System.out.println(str8);
		 
				 
				 //strip will removes the space first and last
				 
				 String st2="  hiiii    ";
				 String str9=st2.strip();
				 System.out.println(str9);
				 
				 
				 //contains
				 
				 boolean str0=str.contains(str);
				 System.out.println(str0);
				 
				 
				 
	}

}
