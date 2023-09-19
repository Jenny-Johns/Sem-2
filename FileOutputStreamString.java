import java.io.FileOutputStream;
public class FileOutputStreamString
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\testouts.txt");
			String s="FileOutputStreamString";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}