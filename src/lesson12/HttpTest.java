package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL	url = new URL("http://mail.ru");
		
		HttpURLConnection	conn = (HttpURLConnection)url.openConnection();

//		conn.setRequestMethod("DELETE");
		conn.setDoInput(true);
		conn.setDoOutput(true);

		conn.connect();
		conn.getOutputStream();
		conn.getInputStream();
		conn.getResponseCode();
		conn.getErrorStream();
		conn.disconnect();

		// com.sun.net.httpserver.HttpServer
		
//		try(final InputStream	is = url.openStream();
//			final Reader		rdr = new InputStreamReader(is);
//			final BufferedReader	brdr = new BufferedReader(rdr);) {
//			
//			String	s;
//			
//			while ((s = brdr.readLine()) != null) {
//				System.err.println(s);
//			}
//		}
	}

}
