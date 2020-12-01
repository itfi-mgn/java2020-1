package lesson11a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ZipTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[]	content = null;
		
		try(final OutputStream		baos = new ByteArrayOutputStream()) {
			try(final GZIPOutputStream	gzos = new GZIPOutputStream(baos)) {
			
				gzos.write("text string".getBytes());
				gzos.flush();
//				gzos.finish();
			} // close();
			content = ((ByteArrayOutputStream)baos).toByteArray();
			System.err.println("COntent="+baos.toString());
		}

		try(final InputStream		bais = new ByteArrayInputStream(content);
			final GZIPInputStream	gzis = new GZIPInputStream(bais)) {
			byte[]	buffer = new byte[100];
			int	len;
			
			while ((len = gzis.read(buffer)) > 0) {
				System.err.println("Len="+len+", content="+new String(buffer,0,len));
			}
		}
	}

}
