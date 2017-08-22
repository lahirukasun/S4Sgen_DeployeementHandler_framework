package depyeement_handler;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dh_test {

    public static void main(String[] args) {
        
        test("openBrowser_in_googleChrome");
        test("run");
        //run_webBrowser("");
        test("openBrowser_in_googleChrome");
        //test("openBrowser_in_internetExplora");
    }

    public static void test(String temp) {

        Runtime runtime = Runtime.getRuntime();
        try {
            ProcessBuilder pb=new ProcessBuilder("cmd","/c",temp+".bat");
            File dir =new File("G:\\S4Sgen\\system_resource\\");
            pb.directory(dir);
        
            Process p1=pb.start();
            
            //Process p1 = runtime.exec("cmd /c start G:\\S4Sgen\\system_resource\\"+temp+".bat");
            //Process p1 = runtime.exec("cmd /c start gulp server");
           InputStream is = p1.getInputStream();
            int i = 0;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
            //}
            // catch (IOException ioException) {
            //   System.out.println(ioException.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(dh_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public static void run_webBrowser(String browser){
    
        
    
    }

    
}
