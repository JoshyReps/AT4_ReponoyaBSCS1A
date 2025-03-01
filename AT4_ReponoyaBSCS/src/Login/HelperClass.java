package Login;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public abstract class HelperClass {
   
    //these fields are again derived from the `login` class's values, which
    //basically means we are accessing the same reference of the same parse json file.
    private static final JSONObject user = login.record;
    private static final JSONArray users = login.userlist;
    private static final String FILE_PATH = login.filepath;
    
    //This is the overloaded version of the save file,just pass the `users` as 
    //the argument, meaning, it's the actual main JSONArray with no direct modification.
    public static void saveFile(){
        saveFile(users);
    }
    
    //this method is the main save file method which takes in a JSONArray which will
    //be the same main `users` JSONArray, however, with a direct modification, and it will basically
    //save the file with those said modification to the json file.
    public static void saveFile(JSONArray users){
        
            try(FileWriter writer = new FileWriter(FILE_PATH)){
                user.put("users", users);
                writer.write(user.toJSONString());
            }
            catch(Exception e){
                System.out.println("file not found...");
            }
    }
    
    //this method will essentially find and return the JSONObject of an account in
    //the json file so long as the String argument exists as a field value of the
    //`username` of atleast one of the accounts i nthe JSONFile.
    public static JSONObject findID(String userID){
        
        //this basically retursn null when userID is empty so that we don't have
        //to run the for loop.
        if(userID.isBlank()) return null;
        
        //when the argument is not blank, then we basically loop through the elements
        //of the main users JSONArray to find a match and return the account with the match
        //username/userID.
        for(Object o : users) {
            JSONObject jo = (JSONObject) o;
            String userIDJo = (String) jo.get("username");
            if(userID.equals(userIDJo)) {
                return jo;
            }
        }
        
        //if no account in the json file match the userID argument as one of the entry
        //of the accounts in the json file, then we return null.
        return null;
    }
}
