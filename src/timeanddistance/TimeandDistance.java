package timeanddistance;

//Git initialise location: /Users/laurencesugars/NetBeansProjects/TimeandDistance

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class TimeandDistance {


    public static void main(String[] args) throws IOException  {

        String file_Name = "/Users/laurencesugars/Documents/importCSV.csv";
        
        CSVReader file = new CSVReader (file_Name);
        
        ArrayList<String[]> fileLines = file.OpenFile();
        //System.out.println(fileLines.size());

        //---------------------------------------------------------------//
        //Prints out array fileLines
        
        for (int i = 0; i < fileLines.size(); i++) {
            String[] country = fileLines.get(i);

                for (int j = 0; j < country.length; j++) {
                    //System.out.print(country[j]);
                    if (j < country.length - 1) {
                        //System.out.print(", ");
                    }
                }
                
                //System.out.println();
            }
        
        //---------------------------------------------------------------//
        //Retrieves specific elements of array and prints
        
        for (int i = 0; i < fileLines.size(); i++) {
            String[] country = fileLines.get(i);
            
                for (int j = 0; j < country.length; j++) {
                    
                    if (j == 0|| j == 1 || j==4) {
                    //System.out.print(country[j]);                   

                    if (j < 3) {
                        //System.out.print(", ");
                         }
                    }
                   
                }
                //System.out.println();
            }
        
        //---------------------------------------------------------------//
        //Passes Lat/Longs to LatLong Reader Method to calculate the distance between Lat/Longs
        
        GetLatLongs array = new GetLatLongs ();
        
        ArrayList<String> arrayResponse = array.LatLongValue(fileLines);
        
          for (int i = 0; i < arrayResponse.size(); i++) {
              System.out.println(arrayResponse.get(i));
                
        //---------------------------------------------------------------//
        
        
            }
    
    }
        
        
    }
    

