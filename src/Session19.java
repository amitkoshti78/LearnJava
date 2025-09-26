import java.io.*;

public class Session19 {

    public static void main(String[] args) {
        try {
            // text file
            String textFile = "/Users/amitkoshti/IdeaProjects/Java Session 1/src/mytextfile.txt";
            //String textFile = "C:\\java\\files\\mytextfile.txt";

            FileWriter my_file = new FileWriter(textFile, false);
            my_file.write("Hello Omkar, This is my first Python text file program");
            my_file.write("\n Writing file : Create file and if file exists, " );
            my_file.write("then it delete the contents of it and rewrites the file");
            my_file.close();

            FileWriter my_file_append = new FileWriter(textFile, true);
            my_file_append.write("\n This line appended at the end of file line number 3");
            my_file_append.write("\n The is end of file ");
            my_file_append.close();

            FileReader my_file_reader = new FileReader(textFile);
            int ch;
            System.out.println("\n ### Reading a file ####");
            while((ch = my_file_reader.read()) != -1) {
                System.out.print((char) ch);
            }
            my_file_reader.close();

        } catch(IOException err) {
            System.out.println("Error :" + err);
            err.printStackTrace();
        }

        // binary file

        String binary_file = "/Users/amitkoshti/IdeaProjects/Java Session 1/src/myBinary.bin";
        try {
            FileOutputStream bin_file = new FileOutputStream(binary_file);
            bin_file.write(new byte[] {68, 69, 70, '\n'});
            bin_file.write(new byte[]  {'B', 'I', 'N' , 'A',  'R', 'Y', '\n'});
            bin_file.write(new byte[]  {0b00010110, 0b01110010, 0b00110111});

            bin_file.close();

            

        } catch (IOException err1) {
            System.out.println("Error :" + err1);
            err1.printStackTrace();

        }
    }

}
