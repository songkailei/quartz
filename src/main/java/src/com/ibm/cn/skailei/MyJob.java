package src.com.ibm.cn.skailei;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class MyJob {
	
	 public void execute() {  
	        System.out.print("visit url: http://down.mumayi.com/881267 ->");  
	  
	        get("http://down.mumayi.com/881267");
	  
	        System.out.println("<- See result.");  
	 }  
	 
	 /**
	  *  visit some URL 
	  */
	 public void get(String uri) {
		 try {
             URL url = new URL(uri);
             URLConnection URLconnection = url.openConnection();  
             HttpURLConnection httpConnection = (HttpURLConnection)URLconnection;  
             int responseCode = httpConnection.getResponseCode();  
             if (responseCode == HttpURLConnection.HTTP_OK) {  
                 System.out.println("成功");
//                 InputStream urlStream = httpConnection.getInputStream();  
//                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlStream));  
//                 String sCurrentLine = "";  
//                 String sTotalString = "";  
//                 while ((sCurrentLine = bufferedReader.readLine()) != null) {  
//                     sTotalString += sCurrentLine;  
//                 }  
//                 System.err.println(sTotalString);
//                    //假设该url页面输出为"OK"  
//                if (sTotalString.equals("OK")) {
//                } else {
//                 }  
             }else{
                 System.err.println("失败");
              }
         } catch (Exception e) {
             // TODO Auto-generated catch blockeb
             e.printStackTrace();
         }  
	 } 

}
