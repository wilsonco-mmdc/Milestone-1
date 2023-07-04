import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Task8{
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("employeedata.csv"))) {
            List<String[]> lines = reader.readAll();
            String[] headers = reader.readNext();
            String[] studentRecords;
            System.out.println(headers[0]);
            double totalHoursWorked = 0.0;
            /*
            while((studentRecords = reader.readNext()) != null)
            {
            	if(studentRecords[0].  )
            }*/
            
            // Iterate over lines starting from the second line (assuming the first line is header)
            for (int i = 1; i < lines.size(); i++) {
                String[] line = lines.get(i);

                if (line.length >= 2) {
                    String employeeName = line[0].trim();
                    double hoursWorked = Double.parseDouble(line[1].trim());

                    // Perform calculations for the employee
                    if (employeeName.equals("Crisostomo")) { // Replace "John" with the desired employee name
                        totalHoursWorked += hoursWorked;
                    }
                }
            }

            System.out.println("Total hours worked by John: " + totalHoursWorked);
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}





