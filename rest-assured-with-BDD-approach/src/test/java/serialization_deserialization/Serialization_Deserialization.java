package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SD implements Serializable{
	int i, j;
	SD(){ }
	SD(int i, int j){
		this.i=i;
		this.j=j;
	}
}

/*
 .serialization:-process of converting an Object from java supported form to either File or Network Supported form
 .de-serialization:-process of converting Object from either File or Network supported form into java supported form.
 */

public class Serialization_Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SD sd1=new SD(5,10);
		SD sd2;
		//serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(sd1);
		
		//deserialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		sd2=(SD) ois.readObject();
		System.out.println(sd2.i+"   "+sd2.j);	

	}
}
