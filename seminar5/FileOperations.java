package seminar5;

import java.io.*;

public class FileOperations {
    File file;

    public FileOperations() {
        file = new File("TicTacToe.txt");
    }

    public void writeFile(byte[] arr){

        try (FileWriter fileWriter = new FileWriter(file, false);) {
            for (byte b : arr) {
                fileWriter.write(b + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public byte[] readFile(){
        byte[] result = new byte[3];
        int counter = 0;
        try (FileReader fileReader = new FileReader(file);) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                result[counter] = Byte.valueOf(line);
                line = reader.readLine();
                counter++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

}
