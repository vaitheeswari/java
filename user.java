import java.io.*;
import java.net.*;
public class user {
	public static void main(String[] args) throws Exception
	{
		long end;
		String frame,f1name;
		int size=0;
		String option;
		DataInputStream in=new DataInputStream(system.in);
		socket cs=new socket("localhost",6789);
		DataInputStream inp=new DataInputStream(cs.getInputstream());	
		System.out.println("A.ULOAD");
		System.out.println("B.DOWNLOAD");
		System.out.println("Enter the optoin:");
		option=in.readLine();
		PrintStream out;
		out.write(option+"\n");
		if(option.compareTo("A")==0)
			
		{
			System.out.println("Enter the filename:");
			f1name=in.readLine();
			System.out.println("Enter the file name to be saved :");
			f1name=in.readLine();
			out.write(f1name+"\n");
			byte b[]=new byte[400];
			inp.read(b);
			File f=new File(f1name);
			FileOutputStream fo=new FileOutputStream(f1name);
			fo.write(b);
			fo.close();
			
			out.write(b);
			System.out.println("UPLOADED!!!!!!!");
		}
		else if(option.compareTo("B")==0)
		{
			System.out.println("Enter the filename:");
			f1name=in.readLine();
			System.out.println("Enter the file name to be saved in server:");
			f1name=in.readLine();
			out.write(f1name+"\n");
			File f=new File(f1name);
			FileInputStream fi=new FileInputStream(f1name);
			size=fi.available();
			byte b[]=new byte[size];
			fi.read(b);
			fi.close();
			out.write(b);
			System.out.println("DOWNLOADED!!!!!!!");
		}
		else
		{
			System.out.println("Enter valid option");
			
		}
		cs.close();
		end=System.currentTimeMillis();
	}

}
