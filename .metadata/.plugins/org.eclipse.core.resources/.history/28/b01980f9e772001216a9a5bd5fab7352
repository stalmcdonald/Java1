//**************************************
// Name: CONTACT BOOK APP(CORE JAVA TINY PROJECT)
// Description:A SIMPLE CONTACT BOOK APPLICATION YOU CAN USE TO MANAGE YOUR CONTACTS AND DETAILS...
GUI VERSION COMING SOON!!
// By: Thejwal P
//
//This code is copyrighted and has// limited warranties.Please see http://www.Planet-Source-Code.com/vb/scripts/ShowCode.asp?txtCodeId=7088&lngWId=2//for details.//**************************************

//dob:petname:tag:address:email1,email2,email3..:ph1,ph2,...:crtdate
import java.util.*;
import java.io.*;
import java.text.*;
public class ContactsApp {
public static void main(String[] args) 
{
try
{
	int ch = 0;
int ch2 = 0;
Scanner sc = new Scanner(System.in) ;
boolean validFile = false;
Scanner stringReader = new Scanner(System.in);
String emailChoice = "";
String finalString = "";
System.out.println("\n\t\t\tCONTACTS APP");
System.out.println("--------------------------------------------------------------------------------");
while(ch != 4)
{
		System.out.println("\nPRESS 1 TO CREATE CONTACTS BOOK");
		System.out.println("PRESS 2 TO LOAD CONTACTS BOOK");
		System.out.println("PRESS 3 TO DELETE CONTACTS BOOK");
		System.out.println("PRESS 4 TO EXIT");
 		
		while(!sc.hasNextInt())
		{
			System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1 - 4");
			sc.nextLine();
		}
		
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1: System.out.println("\nENTER NAME OF CONTACTS BOOK TO CREATE WITHOUT ANY FILE EXTENSION");
			validFile = false;
			String contactBookName = "";
			while(!validFile)
			{
				 contactBookName = stringReader.nextLine();
				 if(contactBookName.equals(""))
				 {
				 	System.out.println("\nCONTACT BOOK NAME CANNOT BE EMPTY");
				 	System.out.println("\nENTER NAME OF CONTACTS BOOK TO CREATE WITHOUT ANY FILE EXTENSION");
				 	continue;
				 }
					if(!(contactBookName.contains("/")||contactBookName.contains("\\")||contactBookName.contains(":")||
					contactBookName.contains("*")||contactBookName.contains("?")||contactBookName.contains("/")||
					contactBookName.contains("\"")||contactBookName.contains("<")||contactBookName.contains(">")||
					contactBookName.contains("|")))
					{
						String extension[] = contactBookName.split(".");
						contactBookName = contactBookName + ".txt";
						File contactBook = new File(contactBookName);
						if(!contactBook.exists())
						{
							System.out.println("\nNEW CONTACTS BOOK CREATED::"+contactBookName);								
							validFile = true;
						}
						else
						{
							System.out.println("\nA CONTACTS BOOK WITH NAME "+contactBookName+" ALREADY EXISTS\nPLEASE ENTER A DIFFERENT NAME" );
						}
							
					}
						
					else
					{
						System.out.println("\nFILE NAME CANNOT CONTAIN : /,\\,\",*,?,<,>,|");
						System.out.println("\nENTER NAME OF CONTACTS BOOK TO CREATE WITHOUT FILE EXTENSION ");
					}
			}
					
					contactBookOperations(contactBookName);
					break;
					
					
			case 2: contactBookName = "";
					
					System.out.println("\nENTER NAME OF CONTACTS BOOK WITHOUT EXTENSION TO LOAD");
					contactBookName = stringReader.nextLine();
					
					while(true)
					{
						if(contactBookName.equals(""))
						{
							System.out.println("\nCONTACT BOOK NAME CANNOT BE EMPTY ");
							
						}
						else
						{
							break;
						}
					}
					contactBookName += ".txt";
					File contactBook = new File(contactBookName);
					if(!contactBook.exists())
					{
						System.out.println("\nA CONTACT BOOK WITH NAME "+contactBookName+" DOES NOT EXIST");
					}
					else
					{
						contactBookOperations(contactBookName);
					}
					break;
					
			case 3: contactBookName = "";
					
					System.out.println("\nENTER NAME OF CONTACTS BOOK WITHOUT EXTENSION TO DELETE");
					contactBookName = stringReader.nextLine();
					
					
						if(contactBookName.equals(""))
						{
							System.out.println("\nCONTACT BOOK NAME CANNOT BE EMPTY ");
							
						}
						
					contactBookName += ".txt";
					 contactBook = new File(contactBookName);
					if(!contactBook.exists())
					{
						System.out.println("\nA CONTACT BOOK WITH NAME "+contactBookName+" DOES NOT EXIST");
					}
					else
					{
						contactBook.delete();
						System.out.println("\nA CONTACT BOOK "+contactBookName+" DELETED");
					}
					
					break;
					
			case 4: System.out.println("\nOK BYE");
					break;
					
			default: System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1 - 4");
					 break;
					
					
		}
		
	}
}
catch(Exception e)
{
	System.out.println("gone");
	e.printStackTrace();
	System.out.println(e);
}
 } 
public static void contactBookOperations(String contactBookName)throws IOException
{
	FileWriter fr = new FileWriter(contactBookName,true);
BufferedReader fileReader = new BufferedReader(new FileReader(contactBookName));
BufferedWriter fileWriter = new BufferedWriter(fr);
	
	String address = "";
	
	String name = "";
	boolean validName = false;
	
	String dateOfBirth = "";
	boolean dateValid = false;
 	
 	String petName = "";
 		
 	int tag = 0;
 	String contactType = "";
 	boolean invalidTag = false;
 	
 	boolean moreEmail = false;
 	String email = "";
 	String emailChoice = "";
 	
 	boolean morePhone = true;
 	String phoneChoice = "";
 	String phoneList = "";
 	long phoneNum = 0;
 	
	int choice = 0;
	ArrayList nameList = new ArrayList(); // arrayList to hold names of contacts in the file...
	Scanner sc = new Scanner(System.in);
	
	String searchString = "";
	
	Scanner stringReader = new Scanner(System.in);
	String line = "";
	String totalDetails = "";
	//System.out.println(fileReader);
	while(choice!=6)
	{
		System.out.println("\nPRESS 1 TO ADD CONTACT");
		System.out.println("PRESS 2 TO EDIT CONTACT");
 		System.out.println("PRESS 3 TO REMOVE CONTACT");
		System.out.println("PRESS 4 TO LIST CONTACTS");
	System.out.println("PRESS 5 TO SEARCH CONTACT");
	System.out.println("PRESS 6 TO GO BACK");
						
	while(!sc.hasNextInt())
	{
		System.out.println("\nENTER ONLY INTEGERS IN THE RANGE 0 - 6");
		sc.next();
	}
						
	choice = sc.nextInt();
	 switch(choice)
 
 {
 	//ADD A NEW CONTACT........
	case 1:// add contact option.............
			// add name
			dateValid = false;
			invalidTag = true;
			moreEmail = true;
			morePhone = true;
			email = "";
			phoneList = "";
			nameList.clear();
			System.out.println("\nENTER NAME OF THE PERSON");
			validName = false;
			fileReader = new BufferedReader(new FileReader(contactBookName));
			while(!validName)
			{
			
				name = stringReader.nextLine();			// read contact name from user
				name = name.trim();
				if(name.equals(""))
				{
					System.out.println("\nNAME OF THE PERSON CANNOT BE BLANK\nENTER NAME OF THE PERSON");
					continue;
				}
				
				while( ((line=fileReader.readLine())!=null))	 // read till end of file
				{
					String s = line.substring(0,line.indexOf('='));	// add each name that exists in the file
					if(!nameList.contains(s))
					{
						nameList.add(s);
					}
				}
				//System.out.println(nameList);			
				if(nameList.contains(name)) 	//if name already exists, print error message
				{
					System.out.println("\nA CONTACT WITH NAME "+name+ " ALREADY EXISTS.");
					System.out.println("\nPLEASE ENTER ANOTHER NAME TO ADD");
				
				}
			
				else
				{
					validName = true;
					nameList.add(name);
				}
			}
			//date of birth
			System.out.println("\nENTER DATE OF BIRTH OF THE PERSON IN DD/MM/YYYY FORMAT EG: 10/10/2011");
			while(!dateValid)
			{
				dateOfBirth = stringReader.nextLine();//doubt? next() skips next scan...			
					dateValid = isValidDate(dateOfBirth);
					if(!dateValid)
					{
						System.out.println("\nINVALID DATE...ENTER DATE OF BIRTH OF THE PERSON IN DD/MM/YYYY FORMAT EG: 10/10/2011");
					}
				}
				
			
			//	System.out.println(dateOfBirth);
				//add contact type
				System.out.println("\nENTER PET NAME OF THE PERSON OR ENTER TO SKIP");
			petName = stringReader.nextLine();
			
			System.out.println("\nCHOOSE CONTACT TYPE...");
			System.out.println("\nPRESS 1 FOR FAMILY");
			System.out.println("PRESS 2 FOR FRIENDS");
			System.out.println("PRESS 3 FOR COLLEAGUES");
			System.out.println("PRESS 4 FOR OTHERS");
			
			while(!sc.hasNextInt())
			{
				System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1 - 3");
				sc.nextLine();
			}
			tag = sc.nextInt();
			
			while(invalidTag)
			{
			
				switch(tag)
				{
					case 1: 
							contactType = "family";
							invalidTag = false;
							break;
					case 2:
							contactType = "friend";
							invalidTag = false;
							break;
					case 3:
							contactType = "colleague";
							invalidTag = false;
							break;
					case 4:
							contactType = "others";
							invalidTag = false;
							break;
					default:
							System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1-4");
							invalidTag = true;
							break;
				}
			}
			//System.out.println(contactType);
			System.out.println("\nENTER ADDRESS IN ONE LINE");
			address = stringReader.nextLine();
			//System.out.println(address);
			while(moreEmail)
			{
				System.out.println("\nENTER EMAIL ADDRESS OR PRESS ENTER TO SKIP");
				email = email+","+stringReader.nextLine();
				//System.out.println(email);
				if(!(email.trim()).equals(","))
				{
				
					System.out.println("\nTO ADD EMAIL PRESS y..TO STOP ADDING EMAIL PRESS ANY OTHER KEY");
					emailChoice = stringReader.nextLine();
				
					if(emailChoice.equals("y")||emailChoice.equals("Y"))
					{
						moreEmail = true;
					}
					else
					{
						moreEmail = false;
					}
				}
				else
				{
					moreEmail = false;
				}
			}
			email = email.substring(1,email.length());
			//System.out.println(email);
					
			
			while(morePhone)
			{
				System.out.println("\nENTER PHONE NUMBER");
				
				while(!sc.hasNextLong())
				{
					System.out.println("\nONLY VALID PHONE NUMBERS ALLOWED");
					sc.next();
				}
				phoneNum = sc.nextLong();
				phoneList = phoneList+","+phoneNum;
				
				sc.nextLine();		//doubt? not included: doesnt read phonechoice.....
				
				System.out.println("\nPRESS y TO ADD MORE PHONE NUMBERS ELSE PRESS ANY OTHER KEY");
				phoneChoice = sc.nextLine();
				
				if(phoneChoice.equals("y")||phoneChoice.equals("Y"))
				{
					morePhone = true;
				}
				else
				{
					morePhone = false;
				}
			}
			phoneList = phoneList.substring(1,phoneList.length());
			System.out.println("["+name+","+petName+","+contactType+","+address+","+dateOfBirth+","+email+","+phoneList+"]");
			totalDetails = name+"="+dateOfBirth+":"+petName+":"+contactType+":"+address+":"+email+":"+phoneList+":"+new Date();
			fileWriter.write(totalDetails);
			fileWriter.newLine();
			fileWriter.flush();
			System.out.println("\nCONTACT ADDED SUCCESFULLY");
			break;
//EDITING A CONTACT
	case 2: String editName = "";
				String details = "";
				String line3 = "";
				String[] detailParts;
				String newDob = "";
				String newPetName = "";
				String newAddress = "";
				String newContactType = "";
				String newEmail = "";
				String newPhone = "";
				String newString = "";
				String name3 = "";
				choice = 0;
				nameList.clear();
				String[] parts ;
				fileReader = new BufferedReader(new FileReader(contactBookName));
				while( ((line=fileReader.readLine())!=null))	 // read till end of file
			{
				String s = line.substring(0,line.indexOf('='));	// add each name that exists in the file
				if(!nameList.contains(s))
				{
					nameList.add(s);
				}
			}
				BufferedReader editReader = new BufferedReader(new FileReader(contactBookName));
				dateValid = false;
				invalidTag = true;
				String editContact = "";
				System.out.println("\nENTER THE CONTACT TO BE EDITED");
				editName = stringReader.nextLine();
				if(!nameList.contains(editName))
				{
					System.out.println("\nA CONTACT WITH NAME "+editName+" DOES NOT EXIST");
				}
				
				else
				{
					while((line3=editReader.readLine())!=null)
					{
						//System.out.println(line3);
						name3 = line3.substring(0,line3.indexOf("="));
					if(!name3.equals(editName))
					{
						newString = newString+line3+System.getProperty("line.separator");
					}
					else
					{
						 editContact = line3;
					}
			
					} 
					
					
				details = editContact.substring(editContact.indexOf("=")+1,editContact.length());
					detailParts = details.split(":");
					newDob = detailParts[0];
					newPetName = detailParts[1];
					newContactType = detailParts[2];
					newAddress = detailParts[3];
					newEmail = detailParts[4];
					newPhone = detailParts[5];
							
					while(choice!=7)
					{
						System.out.println("\nPRESS 1 TO CHANGE DATE OF BIRTH");
						System.out.println("PRESS 2 TO CHANGE PET NAME");
						System.out.println("PRESS 3 TO CHANGE CONTACT TYPE");
						System.out.println("PRESS 4 TO CHANGE ADDRESS");
						System.out.println("PRESS 5 TO ADD EMAIL");
						System.out.println("PRESS 6 TO ADD PHONE NUMBER");
						System.out.println("PRESS 7 TO GO BACK");
						System.out.println("ENTER CHOICE");
						
						while(!sc.hasNextInt())
						{
							System.out.println("ENTER ONLY INTEGERS IN THE RANGE 1-7");
							sc.nextLine();
						}
						
						choice = sc.nextInt();							
						switch(choice)
						{
						
							case 1:
							System.out.println("\nENTER DATE OF BIRTH OF THE PERSON IN DD/MM/YYYY FORMAT EG: 10/10/2011");
						while(!dateValid)
						{
							newDob = stringReader.nextLine();//doubt? next() skips next scan...			
								dateValid = isValidDate(newDob);
								if(!dateValid)
								{
									System.out.println("\nINVALID DATE...ENTER DATE OF BIRTH OF THE PERSON IN DD/MM/YYYY FORMAT EG: 10/10/2011");
								}
							}
							break;
								
							case 2:
							System.out.println("\nENTER NEW PET NAME OF THE PERSON OR ENTER TO SKIP");
						newPetName = stringReader.nextLine();
							break;
						
							case 3:	
							System.out.println("\nCHOOSE CONTACT TYPE...");
						System.out.println("PRESS 1 FOR FAMILY");
						System.out.println("PRESS 2 FOR FRIENDS");
						System.out.println("PRESS 3 FOR COLLEAGUES");
						System.out.println("PRESS 4 FOR OTHERS");
						while(!sc.hasNextInt())
						{
							System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1 - 3");
							sc.nextLine();
						}
						tag = sc.nextInt();
			
						while(invalidTag)
						{
			
							switch(tag)
							{
								case 1: 
								newContactType = "family";
								invalidTag = false;
								break;
											
								case 2:
								newContactType = "friend";
								invalidTag = false;
								break;
										
								case 3:
								newContactType = "colleague";
								invalidTag = false;
								break;
										
								case 4:
								newContactType = "others";
								invalidTag = false;
								break;
										
								default:
								System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1-3");
								invalidTag = true;
								break;
							}
						}	
						break;	
									
						case 4:
						System.out.println("\nENTER NEW ADDRESS IN ONE LINE");
						newAddress = stringReader.nextLine();
						break;
								
						case 5:
						moreEmail = true;
						while(moreEmail)
						{
							System.out.println("\nENTER EMAIL ADDRESS OR PRESS ENTER TO SKIP");
							newEmail = newEmail+","+stringReader.nextLine();
							//System.out.println(email);
							if(!(newEmail.trim()).equals(","))
							{
				
								System.out.println("TO ADD EMAIL PRESS y..TO STOP ADDING EMAIL PRESS ANY OTHER KEY");
								emailChoice = stringReader.nextLine();
				
								if(emailChoice.equals("y")||emailChoice.equals("Y"))
								{
									moreEmail = true;
								}
								else
								{
									moreEmail = false;
								}	
							}
							else
							{
								moreEmail = false;
							}
						}
								
						break;
								
						case 6:
						morePhone = true;
						while(morePhone)
						{
							System.out.println("\nENTER PHONE NUMBER");
							while(!sc.hasNextLong())
							{
								System.out.println("\nONLY VALID PHONE NUMBERS ALLOWED");
								sc.next();
							}
							phoneNum = sc.nextLong();
							newPhone = newPhone+","+phoneNum;
							sc.nextLine();		//doubt? not included: doesnt read phonechoice.....
							System.out.println("\nPRESS y TO ADD MORE PHONE NUMBERS ELSE PRESS ANY OTHER KEY");
							phoneChoice = sc.nextLine();
							if(phoneChoice.equals("y")||phoneChoice.equals("Y"))
							{
								morePhone = true;
							}
							else
							{		
								morePhone = false;
							}
						}
						phoneList = phoneList.substring(1,phoneList.length());
						break;
								
						case 7: System.out.println("["+editName+","+newPetName+","+newContactType+","+newAddress+","+newDob+","+newEmail+","+newPhone+"]");
						String newDetails = editName+"="+newDob+":"+newPetName+":"+newContactType+":"+newAddress+":"+newEmail+":"+newPhone+":"+new Date();
						newString = newString+newDetails+System.getProperty("line.separator");
						BufferedWriter editWriter = new BufferedWriter(new FileWriter(contactBookName));
						editWriter.write(newString);
						editWriter.close();
						break;
								
						default:
						System.out.println("\nENTER ONLY INTEGERS IN THE RANGE 1-7");
						break;
									
					}
									
					}
					
					
				}
				//dob:petname:tag:address:email1,email2,email3..:ph1,ph2,...:crtdate
			break;
					
case 3: 	// REMOVING A CONTACT
			BufferedReader removalReader = new BufferedReader(new FileReader(contactBookName));
			String name2 = "";
			String line2 = "";
			String nameRemoved = "";
			String finalString = "";
			
			System.out.println("\nENTER THE NAME TO BE REMOVED");
			nameRemoved = stringReader.nextLine();
			
			if(!nameList.contains(nameRemoved))
			{
				System.out.println("\nA CONTACT WITH NAME "+nameRemoved+" DOES NOT EXIST\n");
			}
			else
			{
				while((line2=removalReader.readLine())!=null)
				{
					name2 = line2.substring(0,line2.indexOf("="));
					if(!name2.equals(nameRemoved))
					{
						finalString = finalString+line2+System.getProperty("line.separator");
					}
				}
				
				BufferedWriter removalWriter = new BufferedWriter(new FileWriter(contactBookName));
				removalWriter.write(finalString);
				removalWriter.close();
				System.out.println("CONTACT "+nameRemoved+" REMOVED ");
			}
			break;
		//LISTING ELEMENTS			
case 4: int listChoice = 0;
		BufferedReader listReader = new BufferedReader(new FileReader(contactBookName));
		parts = null;
		TreeMap nameDetailMap = new TreeMap();
		String line4 = "";
		
		while(listChoice!= 5) 
		{
			System.out.println("\nPRESS 1 TO DISPLAY CONTACTS BY ALPHABETICAL ORDERING OF NAMES");
				System.out.println("PRESS 2 TO DISPLAY CONTACTS BY CREATED DATE");
				System.out.println("PRESS 3 TO DISPLAY CONTACTS BY TAG");
				System.out.println("PRESS 4 TO DISPLY CONTACTS BY TOTAL STRING LENGTH");
				System.out.println("PRESS 5 TO GO BACK");
				
				System.out.println("ENTER CHOICE");
				
				while(!sc.hasNextInt()) 
				{
					System.out.println("ENTER ONLY INTEGERS IN THE RANGE 1-5");
					sc.next();
				}
				
				listChoice = sc.nextInt();
				
				switch(listChoice)
				{
					//ORDERING CONTACTS BY ALPHABETICAL ORDERING OF NAMES.............. 
					case 1: 
					
					listReader = new BufferedReader(new FileReader(contactBookName));
					System.out.println("\nCONTACTS BELOW ARE LISTED IN ALPHABETICAL ORDERING OF NAMES");
					System.out.println("-----------------------------------------------------------");
					line4 = "";
					parts = null;
					while((line4 = listReader.readLine())!=null)
					{
						parts = line4.split("=");
						nameDetailMap.put(parts[0],parts[1]);
					}
					
					Collection c = nameDetailMap.keySet();
					Iterator it = c.iterator();
					
					while(it.hasNext())
					{
						String s = (String)it.next();
						System.out.println("\n\n"+s);
						System.out.println("---------------------------------");
						System.out.println(nameDetailMap.get(s));
					}
					break;
					
					
					//ORDERING CONTACTS BY CREATED DATE.............. 
					case 2:
					System.out.println("\nCONTACTS BELOW ARE LISTED IN ORDER OF CREATED DATES");
					System.out.println("--------------------------------------------------------");
					BufferedReader br = new BufferedReader(new FileReader(contactBookName));
					line4 = "";
					String date = "";
					String[] part;
					TreeMap tm = new TreeMap();
					while((line4 = br.readLine())!=null)
					{
						part = line4.split(":");
						String h = (part[6]+":"+part[7]+":"+part[8]);
						Date d = new Date(h);
						tm.put(d,line4);
			
					}
					Collection c1 = tm.keySet();
					//System.out.println(c1);
					Iterator it1 = c1.iterator();
					
					while(it1.hasNext())
					{
						String s = it1.next()+"";
						//System.out.println(s);
						System.out.println("\n\n"+s);
						System.out.println("---------------------------------");
						System.out.println(tm.get(new Date(s)));
					}
					break;
					
					////ORDERING CONTACTS BY TAG.............. 
					//dob:petname:tag:address:email1,email2,email3..:ph1,ph2,...:crtdate
					case 3:
					System.out.println("\nCONTACTS BELOW ARE LISTED ACCORDING TO TAGS");
					System.out.println("--------------------------------------------------------");
					ArrayList familyList = new ArrayList();
					ArrayList friendsList = new ArrayList();
					ArrayList colleaguesList = new ArrayList();
					ArrayList othersList = new ArrayList();
					line4 = "";
					parts = null;
					br = new BufferedReader(new FileReader(contactBookName));
					while((line4=br.readLine())!=null)
					{
						parts = line4.split(":");
						String relation = parts[2];
						
						if(relation.equals("family"))
						{
							familyList.add(line4);
						}
						else if(relation.equals("friend"))
						{
							friendsList.add(line4);
						}
						else if(relation.equals("colleague"))
						{
							colleaguesList.add(line4);
						}
						else
						{
							othersList.add(line4);
						}
					}
					
					if(!familyList.isEmpty())
					{
						System.out.println("\nFAMILY CONTACTS\n----------------------------");
						for(Object s: familyList)
						{
							System.out.println("\n"+(String)s);
						}
					}
					
					if(!friendsList.isEmpty())
					{
						System.out.println("\nFRIEND CONTACTS\n----------------------------");
						for(Object s: friendsList)
						{
							System.out.println("\n"+(String)s);
						}
					}				
					if(!colleaguesList.isEmpty())
					{
						System.out.println("\nCOLLEAGUE CONTACTS\n----------------------------");
						for(Object s: colleaguesList)
						{
							System.out.println("\n"+(String)s);
						}
					}
					
					if(!othersList.isEmpty())				
					{
						System.out.println("\nOTHER CONTACTS\n----------------------------");
						for(Object s: othersList)
						{
							System.out.println("\n"+(String)s);
						}
					}
					break;
					//ORDERING BY LENGTH
					case 4:
					System.out.println("CONTACTS BELOW ARE LISTED IN INCREASING ORDERING OF LENGTH");
					System.out.println("-------------------------------------------------");
					line4 = "";
					br = new BufferedReader(new FileReader(contactBookName));
					TreeMap lengthMap = new TreeMap();
					
					while((line4=br.readLine())!=null)
					{
						lengthMap.put(line4.length(),line4);
					}
					
					for(Object s : lengthMap.keySet())
					{
						Integer i = (Integer)s;
						System.out.println("\n"+lengthMap.get(i));
					}
					break;
					
					case 5:
					break;
					
					default :
					System.out.println("\nENTER ONLY INTEGERS IN THE RANGE 1-5");
					break;
				}
			
			}
		break;
//SEARCH CONTACTS BOOK...
case 5:
String[] details1 = null;
line4 = "";
searchString = "";
parts = null;
String addedDetails = "";
	fileReader = new BufferedReader(new FileReader(contactBookName));
	System.out.println("ENTER THE STRING TO BE SERCHED FOR IN THE CONTACTS BOOK");
	searchString = stringReader.nextLine();
	ArrayList nameMatchList = new ArrayList();
	ArrayList emailMatchList = new ArrayList();
	ArrayList tagMatchList = new ArrayList();
	ArrayList addressMatchList = new ArrayList();
	ArrayList dobMatchList = new ArrayList();
	ArrayList phoneMatchList = new ArrayList();
	ArrayList petNameMatchList = new ArrayList();
	String addedString = "";
	while((line4=fileReader.readLine())!=null)
	{
			parts = line4.split("=");
			name = parts[0];
			details1 = parts[1].split(":");
			dateOfBirth = details1[0];
			petName = details1[1];
			contactType = details1[2];
			address = details1[3];
			email = details1[4];
			phoneList = details1[5];
			addedString = "";
			//System.out.println("name = "+name+" dateOfbirth = "+dateOfBirth+" petName ="+petName+" contactType ="+contactType+"address ="+address+"email ="+email+"phoneList ="+phoneList);
			
			if(name.contains(searchString))
			{
				addedString = "<"+name+" --> "+dateOfBirth+" - "+petName+" - "+contactType+" - "+address+" - "+email+" - "+phoneList+">";
				nameMatchList.add(addedString);
			}
			
			if(dateOfBirth.contains(searchString))
			{
				addedString = "<"+dateOfBirth+" --> "+name+" - "+petName+" - "+contactType+" - "+address+" - "+email+" - "+phoneList+">";
				dobMatchList.add(addedString);
			}
			
			if(petName.contains(searchString))
			{
				addedString = "<"+petName+" --> "+name+" - "+dateOfBirth+" - "+contactType+" - "+address+" - "+email+" - "+phoneList+">";
				petNameMatchList.add(addedString);
			}
			
			if(contactType.contains(searchString))
			{
				addedString = "<"+contactType+" --> "+name+" - "+dateOfBirth+" - "+petName+" - "+address+" - "+email+" - "+phoneList+">";
				tagMatchList.add(addedString);
			}
			
			if(address.contains(searchString))
			{
				addedString = "<"+address+" --> "+name+" - "+dateOfBirth+" - "+contactType+" - "+petName+" - "+email+" - "+phoneList+">";
				addressMatchList.add(addedString);
			}
			
			if(email.contains(searchString))
			{
				addedString = "<"+email+" --> "+name+" - "+dateOfBirth+" - "+contactType+" - "+petName+" - "+address+" - "+phoneList+">";
				emailMatchList.add(addedString);
			}
			
			if(phoneList.contains(searchString))
			{
				addedString = "<"+phoneList+" --> "+name+" - "+dateOfBirth+" - "+contactType+" - "+petName+" - "+address+" - "+email+">";
				phoneMatchList.add(addedString);
			}
			
	}
	System.out.println("\n<TOTAL NUMBER OF MATCHES = "+(nameMatchList.size()+dobMatchList.size()+petNameMatchList.size()+tagMatchList.size()+addressMatchList.size()+emailMatchList.size()+phoneMatchList.size()+">"));
	if(!nameMatchList.isEmpty())
	{
		System.out.println("\nTOTAL NUMBER OF NAMES THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+nameMatchList.size()+"\n");
		System.out.println("\nTHE NAMES OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
		System.out.println("--------------------------------------------------------------------------------\n");
		
		for(Object o: nameMatchList)
		{
			System.out.println((String)o+"\n");
		}
		
	}
if(!dobMatchList.isEmpty())
	{
		System.out.println("\nTOTAL NUMBER OF DOBS' THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+dobMatchList.size()+"\n");
		System.out.println("\nTHE DOB'S OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
		System.out.println("--------------------------------------------------------------------------------\n");
		
		for(Object o: dobMatchList)
		{
			System.out.println((String)o+"\n");
		}
		
	}	
	if(!petNameMatchList.isEmpty())
	{
		System.out.println("\nTOTAL NUMBER OF PET NAMES THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+petNameMatchList.size()+"\n");
		System.out.println("\nTHE PET NAMES OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
		System.out.println("--------------------------------------------------------------------------------\n");
		
		for(Object o: petNameMatchList)
		{
			System.out.println((String)o+"\n");
		}
		
	}
	if(!tagMatchList.isEmpty())
	{
		System.out.println("\nTOTAL NUMBER OF TAGS THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+tagMatchList.size()+"\n");
		System.out.println("\nTHE TAGS OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
		System.out.println("--------------------------------------------------------------------------------\n");
		
		for(Object o: tagMatchList)
		{
			System.out.println((String)o+"\n");
		}
	}
	if(!addressMatchList.isEmpty())
	{
			System.out.println("\nTOTAL NUMBER OF ADDRESSES THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+addressMatchList.size()+"\n");
			System.out.println("\nTHE ADDRESSES OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
			System.out.println("--------------------------------------------------------------------------------\n");
		
			for(Object o: addressMatchList)
			{
				System.out.println((String)o+"\n");
			}
		}
		if(!emailMatchList.isEmpty())
		{
			System.out.println("\nTOTAL NUMBER OF EMAILS THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+emailMatchList.size()+"\n");
			System.out.println("\nTHE EMAIL'S OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
			System.out.println("--------------------------------------------------------------------------------\n");
		
			for(Object o: emailMatchList)
			{
				System.out.println((String)o+"\n");
			}
		}
		if(!phoneMatchList.isEmpty())
		{
			System.out.println("\nTOTAL NUMBER OF PHONE NUMBERS THAT MATCH WITH THE SEARCH STRING "+searchString+" = "+phoneMatchList.size()+"\n");
			System.out.println("\nTHE PHONE NUMBERS OF THE FOLLOWING CONTACTS MATCHES WITH THE SEARCH STRING ");
			System.out.println("--------------------------------------------------------------------------------\n");
		
			for(Object o: phoneMatchList)
			{
				System.out.println((String)o+"\n");
			}
		}
				 
break;
case 6:
break;
		
default: System.out.println("\nENTER ONLY INTEGERS IN THE RANGE 1-6");
			break;
 }
 }
} 
public static boolean isValidDate(String dob)
{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date testDate = null;
	
	try
	{
		testDate = sdf.parse(dob);
	}
	
	catch (ParseException e)
{
 
 return false;
}
if(!sdf.format(testDate).equals(dob))
	{
		return false;
	}
	
	return true;
	
}
} 				
