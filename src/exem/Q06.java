package exem;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Q06 {
	
		public static void main(String[] args) throws Exception {
			try {
			    URL url = new URL("http://www.ex-em.com/");
			 
			    URLConnection urlCon = url.openConnection();
			 
			    System.out.println("urlCon.getContentType() : " + urlCon.getContentType());
			    System.out.println("urlCon.getContent() : " + urlCon.getContent());
			    System.out.println("urlCon.getContentEncoding() : " + urlCon.getContentEncoding());
			    Map<String, List<String>> map = urlCon.getHeaderFields();
			 
			    Iterator<String> iterator = map.keySet().iterator();
			    while (iterator.hasNext()) {
			        String key = iterator.next();
			        System.out.println("Header Info : " + key + " = " + map.get(key));
			    }
			 
			} catch (MalformedURLException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}

		}
	}

