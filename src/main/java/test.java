import java.io.File;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file = new File("G:\\lvm\\temp\\48\\eiaas-paas-document-1-1.glodon.com");
        for(File cfile:file.listFiles()){
        	System.out.println(cfile.getName());
        }
	}

}
