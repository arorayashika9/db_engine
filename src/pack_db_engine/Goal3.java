package pack_db_engine;



	import java.io.*;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class Goal3 {

		public void Goal_head() {
		       //String csvFile = "/home/sapient/Documents/workspace-sts-3.9.2.RELEASE/db_engine/src/pack_db_engine/ipl.csv";
		        BufferedReader br = null;
		        String csvSplitBy = ",";

		        try {
		        	String strArray[] = new String[18];
		        	String strArray1[] = new String[18];
	                String heading=null;
	                String type=null;
		            br = new BufferedReader(new FileReader("ipl.csv"));
		            heading = br.readLine();
		            type = br.readLine();
		            strArray= heading.split(csvSplitBy);
		            strArray1= type.split(csvSplitBy);
		            for(int i=0;i<strArray.length;i++)
		            { 
		            	System.out.print(strArray[i]+":- "); 
		            	try
		            	{   
		            	    Integer.parseInt(strArray1[i]);
		            	    System.out.println("Number");
		            	}
		            	catch(NumberFormatException e)
		            	{
		            	Pattern p=Pattern.compile("[0-9]+-[0-9]+-[0-9]+");
		            	Matcher m= p.matcher(strArray1[i]);
		            	Boolean a=m.matches();
		            	if(a.equals(true))
		            	System.out.println("Date");
		            	else
		            	System.out.println("String");
		            	}
		            	catch(ArrayIndexOutOfBoundsException e)
		            	{
		            		System.out.println("NULL");
		            	}
		            }
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally {
		            if (br != null) {
		                try {
		                    br.close();
		                } catch (IOException e) {
		                    e.printStackTrace();
		                }
		            }
		        }

		}

	}


