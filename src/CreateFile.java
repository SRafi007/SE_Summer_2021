import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  

public class CreateFile extends examp{
  public static void main(String[] args) {
   
	  CreateFile obj=new CreateFile("","","","");
	  obj.infor();
  }

@Override
public void infor() {
	// TODO Auto-generated method stub
	try {
	      File myObj = new File("filename.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
}

public CreateFile(String s,String s2,String s3,String s4)
{
	 try {
	      FileWriter myWriter = new FileWriter("filename.txt");
	      myWriter.write("customer information :"+s+"  "+s2+"   "+s3+".    service information"+s4);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    }
	 catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
}
}
