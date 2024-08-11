package alljavamessage;

import java.io.*;
import java.text.MessageFormat;

public class message {
    public static void main(String[] ignoredArgs) throws IOException {
        String[] names={"Shri","Krishna","Radha"};
        BufferedWriter writer=new BufferedWriter(new FileWriter("new.txt"));
        writer.write(""" 
                shri krishna
                नैनं छिद्रन्ति शस्त्राणि नैनं दहति पावक:।
                न चैनं क्लेदयन्त्यापो न शोषयति मारुत॥""");
        for (String name : names){
            writer.write(MessageFormat.format("\n{0}", name));
        }
        writer.close();
    }
}
