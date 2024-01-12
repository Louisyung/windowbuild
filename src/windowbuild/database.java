package windowbuild;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;


public class database
{
    private String userName;
    private String password;
    private static String path = "C:\\Users\\USER\\eclipse-workspace\\windowbuild\\database\\";
    private String path2 = "C:\\Users\\USER\\eclipse-workspace\\windowbuild\\userdata\\";
    
   
    public void Users(String userName)throws Exception {
    	this.path+=userName+".json";
		Object ob = new JSONParser().parse(new FileReader(path));
		
    	// typecasting ob to JSONObject建立 json物件，要做轉乘json的功能
        JSONObject js = (JSONObject) ob;
            
        //System.out.println("theuserName:"+this.userName+"thepassword:"+this.password);
        this.userName = userName;
        this.password = (String) js.get("password");
	}
    public boolean Login(String userName ,String checkpassword) 
    {
    	boolean check=false;
    	System.out.print("userName:"+userName+","+"checkpassword:"+checkpassword);
    	if((userName == null || userName.trim().isEmpty()) && (checkpassword == null || checkpassword.trim().isEmpty()))
    		JOptionPane.showMessageDialog(null,"欄位不能為空");
    	else if(userName == null || userName.trim().isEmpty())
    		JOptionPane.showMessageDialog(null,"用戶名稱不能為空");
    	else if(checkpassword == null || checkpassword.trim().isEmpty())
    		JOptionPane.showMessageDialog(null,"用戶密碼不能為空");
    	else
    	{
	    	try 
	    	{
	    		Users(userName);
	    		if(this.password.equals(checkpassword)) 
	    		{
	    			System.out.println("Access");
	    			JOptionPane.showMessageDialog(null, "成功登入");
	    			check=true;
	    		}
	    		else 
	    		{
	    	   		System.out.println("Default");
	    	   		JOptionPane.showMessageDialog(null, "密碼錯誤，請重新輸入");
	    	    }
	    	}
	    	
	    	catch(Exception e) 
	    	{
	    		System.out.println("Can't find");
	    		JOptionPane.showMessageDialog(null, "無法搜尋到此使用者");
	    	}	
	    	/*if (check) 
	    	{
	            try 
	            {
	                userNow(this.userName);
	            } 
	            catch (Exception e) 
	            {
	                e.printStackTrace();
	            }
	        } */ 
    	}
    	return check;
    }
    public static void Register(String userName, String password) 
    {
        JSONObject js = new JSONObject();

        //Inserting key-value pairs into the json object
        js.put("userName", userName);
        js.put("password", password);
        js.put("point",0);
        
        System.out.println(js.toString());
        try 
        {
        	FileWriter file = new FileWriter(path);
            file.write(js.toJSONString());
            System.out.println("register");
            file.close();
        } 
        catch (IOException e) 
        {
        	System.out.println("Nregister");
        	e.printStackTrace();
        }
    }
    //public void findUser(String userName)
}
