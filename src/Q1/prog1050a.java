package Q1;

import java.io.*;
import java.util.*;
import java.text.*;

class SalesRecord{
    public String[] fields;
    public SalesRecord(String[]data) {fields = data;}
    public double getProfit() {return Double.parseDouble(fields[13]);}
    public double getUnitsSold() {return Double.parseDouble(fields[8]);}
}

public class prog1050a {
    public static List<SalesRecord> loadSalesData(String filepath){
        var records = new ArrayList<SalesRecord>();
        try {
            var file = new Scanner(new File(filepath));
            file
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
        return records;
    }


    public static void main(String[] args) {
        
    }
}
