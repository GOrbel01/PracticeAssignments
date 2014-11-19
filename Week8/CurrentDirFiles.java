import java.io.File;

public class CurrentDirFiles
{
    public static void main(String[] args)
    {
        CurrentDirFiles cdfScr = new CurrentDirFiles();
        cdfScr.launch();
    }
    
    public void launch()
    {
        String[] filesInDir = getFiles();
        print(filesInDir);
    }
    
    public String[] getFiles()
    {
        String dir = "." + File.separator;
        File fileDir = new File(dir);
        
        return fileDir.list();
    }
    
    public void print(String[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
    }
}