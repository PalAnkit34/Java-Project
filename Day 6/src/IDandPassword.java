import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String> loginfo = new HashMap<String,String>();

    IDandPassword(){
        loginfo.put("Pal Ankit","Pal123");
        loginfo.put("Pal Aakash","Pal@123");
        loginfo.put("Pal Minakshi","Pal123##");
    }
    protected HashMap<String, String> getLoginfo() {
        return loginfo;
    }
}
