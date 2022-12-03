import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "F:\\Game\\";
        StringBuilder log = new StringBuilder();

        File dirSrc = new File(path + "src");
        if (dirSrc.mkdir()) {
            log.append("Каталог ").append(dirSrc).append(" создан\n");
        }
        else {
            log.append("Каталог ").append(dirSrc).append(" НЕ создан\n");
        }

        File dirRes = new File(path + "res");
        if (dirRes.mkdir()) {
            log.append("Каталог ").append(dirRes).append(" создан\n");
        }
        else {
            log.append("Каталог ").append(dirRes).append(" не создан\n");
        }

        File dirSavegames = new File(path + "savegames");
        if (dirSavegames.mkdir())
            log.append("Каталог ").append(dirSavegames).append(" создан\n");
        else
            log.append("Каталог ").append(dirSavegames).append(" НЕ создан\n");

        File dirTemp = new File(path + "temp");
        if (dirTemp.mkdir())
            log.append("Каталог ").append(dirTemp).append(" создан\n");
        else
            log.append("Каталог ").append(dirTemp).append(" НЕ создан\n");

        File dirMain = new File(path + "src\\main");
        if (dirMain.mkdir())
            log.append("Каталог ").append(dirMain).append(" создан\n");
        else
            log.append("Каталог ").append(dirMain).append(" НЕ создан\n");

        File dirTest = new File(path + "src\\test");
        if (dirTest.mkdir())
            log.append("Каталог ").append(dirTest).append(" создан\n");
        else
            log.append("Каталог ").append(dirTest).append(" НЕ создан\n");

        File dirDrawables = new File(path + "res\\drawables");
        if (dirDrawables.mkdir())
            log.append("Каталог ").append(dirDrawables).append(" создан\n");
        else
            log.append("Каталог ").append(dirDrawables).append(" НЕ создан\n");

        File dirVectors = new File(path + "res\\vectors");
        if (dirVectors.mkdir())
            log.append("Каталог ").append(dirVectors).append(" создан\n");
        else
            log.append("Каталог ").append(dirVectors).append(" НЕ создан\n");

        File dirIcons = new File(path + "res\\icons");
        if (dirIcons.mkdir())
            log.append("Каталог ").append(dirIcons).append(" создан\n");
        else
            log.append("Каталог ").append(dirIcons).append(" НЕ создан\n");

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

