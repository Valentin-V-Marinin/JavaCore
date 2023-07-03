package seminar5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Backup {

    public static int backupFiles(String pathToFolder){
        int result = 0;
        boolean backupFolderExists = true;
        try {
            File folder = new File(pathToFolder);
            File backupFolder = new File(pathToFolder + "\\backup");
            if (!folder.exists()) throw new WrongFolderNameException("There is no such folder!");
            if (!backupFolder.exists()) backupFolderExists = backupFolder.mkdir();
            if (backupFolderExists) {
                for (File file : folder.listFiles()) {
                    File copyfile = new File(backupFolder.getAbsolutePath() + "\\" + file.getName());
                    if (file.isFile()) Files.copy(file.toPath(), copyfile.toPath());
                }
            } else {
                throw new WrongFolderNameException("Backup folder does not exist!");
            }
        } catch (NullPointerException | WrongFolderNameException e) {
            result = 1;
            System.out.println(e.getMessage());
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}
