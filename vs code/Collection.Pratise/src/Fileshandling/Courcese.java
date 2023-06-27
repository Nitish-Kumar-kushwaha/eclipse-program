//

package Fileshandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Courcese {
    public void AddNewCourcese(String cname) throws IOException {
        FileWriter fw = new FileWriter("/home/nitish/Desktop/java-Eclipse /vs code/Collection.Pratise/src/Fileshandling/courcese.txt");
        fw.write(cname);
        fw.close();
        System.out.println("Courcese added");
    }

    public boolean searchCourcese(String cname) throws IOException {
        FileReader fr = new FileReader("/home/nitish/Desktop/java-Eclipse /vs code/Collection.Pratise/src/Fileshandling/courcese.txt");
        BufferedReader br = new BufferedReader(fr, 0);

        String str = br.readLine();
        while (str != null) {
            if (str.equalsIgnoreCase(cname)) {

            }
        }
        return true;
    }
}
