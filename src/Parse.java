import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parse{
	public static void main(String[] args){
		int N=13733; //Number of rows in the data set
		int n=21; //Number of columns in the data set
		Product[] product=new Product[N]; //To store products
		String[] lineSplit=new String[n]; //To store categories

		try{
			BufferedReader reader=new BufferedReader(new FileReader("data.csv"));
			String line=reader.readLine(); //Getting the line with headers out of the way and initializing the string

			for(int i=0;i<N;i++){
				line=reader.readLine();
				lineSplit=line.split(","); //This array now carries information of the current selected product
				
				//The following calls the class's constructor to store the current selected product
				product[i]=new Product(lineSplit[0],lineSplit[1],lineSplit[2],lineSplit[3],lineSplit[4],lineSplit[5],lineSplit[6],lineSplit[7],lineSplit[8],lineSplit[9],lineSplit[10],lineSplit[11],lineSplit[12],lineSplit[13],lineSplit[14],lineSplit[15],lineSplit[16],lineSplit[17],lineSplit[18],lineSplit[19],lineSplit[20]);
			}
			reader.close();
		}

		catch(IOException ioe){
			ioe.printStackTrace(); 
		}
	}
}