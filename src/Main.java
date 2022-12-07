import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "F:\\Game\\";
        StringBuilder log = new StringBuilder();

        String [][] dirList = {{"src", "res", "savegames", "temp"},
                               {"main", "test"},
                               {"drawables", "vectors", "icons"}};

        for (String dir1: dirList [0]) {
            File dir = new File(path + dir1);
            if (dir.mkdir()) {
                log.append("Каталог ").append(dir).append(" создан\n");
            } else {
                log.append("Каталог ").append(dir).append(" НЕ создан\n");
            }
        }

        for (String dir2: dirList [1]) {
            File dir = new File(path + dirList[0][0] + "\\" + dir2);
            if (dir.mkdir()) {
                log.append("Каталог ").append(dir).append(" создан\n");
            } else {
                log.append("Каталог ").append(dir).append(" НЕ создан\n");
            }
        }

        for (String dir3: dirList [2]) {
            File dir = new File(path + dirList[0][1] + "\\" + dir3);
            if (dir.mkdir()) {
                log.append("Каталог ").append(dir).append(" создан\n");
            } else {
                log.append("Каталог ").append(dir).append(" НЕ создан\n");
            }
        }

        File mainJava = new File(path + "src\\main","Main.java");
        try {
            if (mainJava.createNewFile())
                log.append("Файл Main.java создан\n");
        } catch (IOException ex) {
            log.append("Файл Main.java НЕ создан\n");
                log.append(ex.getMessage());
        }

        File utilsJava = new File(path + "src\\main","Utils.java");
        try {
            if (utilsJava.createNewFile())
                log.append("Файл Utils.java создан\n");
        } catch (IOException ex) {
            log.append("Файл Utils.java НЕ создан\n");
            log.append(ex.getMessage());
        }

        File temp = new File(path + "temp","temp.txt");
        try {
            if (temp.createNewFile())
                log.append("Файл temp.txt создан\n");
        } catch (IOException ex) {
            log.append("Файл temp.txt НЕ создан\n");
            log.append(ex.getMessage());
        }

        try (FileWriter logs = new FileWriter(path + "temp\\temp.txt", false)){
            logs.write(String.valueOf(log));
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

