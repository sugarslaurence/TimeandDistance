package timeanddistance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class GetLatLongs {
    
    ArrayList<String> LatLongValue (ArrayList<String[]> value) {
            //Value represents the array known as FileLines in CSVReader class
        ArrayList<String> DistanceList = new ArrayList<>();
                
            for (int i = 0; i < value.size(); i++) {
            //System.out.println(i);
                String[] country1 = value.get(i);
                //Country1 represents the array representing a row of value. i = 0 represents the first row
                Double lat1 = Double.parseDouble(country1[0]);
                Double lon1 = Double.parseDouble(country1[1]);
            
                for (int m = 0; m < value.size() - i - 1 ; m++) {
                    String[] country2 = value.get(m + i + 1);
                    Double lat2 = Double.parseDouble(country2[0]);
                    Double lon2 = Double.parseDouble(country2[1]);
                
                    
                    final int R = 6371; // Radius of the earth in km. If final assigned, it can never be changed

                    double latDistance = Math.toRadians(lat2 - lat1); //converts an angle measured in degrees to an approximately equivalent angle measured in radians. The conversion from degrees to radians is generally inexact.
                    double lonDistance = Math.toRadians(lon2 - lon1);

                    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) 

                             + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) 

                             * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);

                    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

                    double distanceInKm = R * c; // convert to meters
                    double distanceInM = R * c * 1000; // convert to meters
                    //System.out.println(distanceInKm);
                    //return Math.sqrt(distanceInM);
            
                    String sDistanceInKm = Double.toString(distanceInKm);
                    //System.out.println(sDistanceInKm);
                    DistanceList.add(sDistanceInKm);
            
            
            //System.out.println(lat1 + ", " + lon1 + ", " + lat2 + ", " + lon2);
            
            }
            
            }
            //System.out.println(DistanceList);
            return DistanceList;
    }
    
}
