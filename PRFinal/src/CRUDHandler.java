import java.io.*;
import java.util.Arrays;
import java.util.List;

public class CRUDHandler {
    BufferedReader csvReader = new BufferedReader(new FileReader("PRFinal/src/DB.txt"));
    String[] data;
    String row;
    CRUDHandler() throws IOException {

    }

    void catDB() throws IOException {
        while ((row = csvReader.readLine()) != null) {
            data = row.split(";");
            System.out.println("Current array index value, toString: " + Arrays.toString(data));
            System.out.println("The value itself, a row: " + row);
        }
    }

    void getSomeStringByIndex(String i) throws IOException {
        while ((row = csvReader.readLine()) != null) {
            data = row.split(";");
            System.out.println(data);
            System.out.println(row);
            /*if (String.toString(data)[0] == i) {
                System.out.println("It's here!");
            } else {
                System.out.println("Not here!");
            }*/

        }
    }

    void getSomeStringByIndex(int i) throws IOException {
        String index = Integer.toString(i);
        while ((row = csvReader.readLine()) != null) {
            data = row.split(";");
            System.out.println(Arrays.toString(data));
            if (data[0].equals(index)) {
                System.out.println("It's here!: " + row);
            } else {
                System.out.println("Not here!");
            }

        }
    }

    void insertData(String[] data) throws IOException {
        FileWriter csvWriter = new FileWriter("PRFinal/src/DB.txt", true);
        for (String rowData : data) {
            csvWriter.append(String.join(";", rowData));
            csvWriter.append(";");
        }

        csvWriter.append("\n");
        csvWriter.flush();
        csvWriter.close();

        //https://stackabuse.com/reading-and-writing-csvs-in-java/
        }

        int createLatestIndexForNewEntry() throws IOException {
            int index = 0;
            while ((row = csvReader.readLine()) != null) {
                if (row.equals("")) {
                    continue;
                }
                index++;
            }
            return index;
        }
    }







