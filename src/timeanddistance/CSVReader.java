package timeanddistance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class CSVReader {
    
    private String path;
    
    //This method reads the text file and parses the data into an array called Text Data
    
    public CSVReader (String file_path) {
        
        path =  file_path;
        
    }
    
    public ArrayList<String[]> OpenFile () throws IOException {
    
        String line = " ";
        String cvsSplitBy = ",";
        ArrayList<String[]> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);
                countries.add(country);
                //adds every row of the CSV to an arrayList countries
                
                //System.out.println(country[1] +" "+ country[2] + " "+ country[3] + " " + country[4] +" "+ country[5]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
        
    }
}
