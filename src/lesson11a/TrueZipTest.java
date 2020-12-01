package lesson11a;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class TrueZipTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		// 1. 'PK'
		// 2. <заголовок архива>
		// 3. <разделы архива>
		//	- описание раздела		'a/b' 'a/b/c'
		//  - содержимое раздела
		// 4. <оглавление архива>
		try(final OutputStream		baos = new FileOutputStream("d:/test.zip");
			final ZipOutputStream	zos = new ZipOutputStream(baos)) {

			ZipEntry	ze = new ZipEntry("part1");
			ze.setMethod(ZipEntry.DEFLATED);
			
			zos.putNextEntry(ze);
			
			Writer	wr = new OutputStreamWriter(zos);
			
			wr.write("test string");
			wr.flush();
			zos.closeEntry();
			
			ze = new ZipEntry("part2");
			ze.setMethod(ZipEntry.DEFLATED);
			
			zos.putNextEntry(ze);
			
			wr = new OutputStreamWriter(zos);

			wr.write("test string 2");
			wr.flush();
		}

		try(final InputStream		bais = new FileInputStream("d:/test.zip");
			final ZipInputStream	zis = new ZipInputStream(bais)) {

			ZipEntry	ze;
			
			while ((ze = zis.getNextEntry()) != null) {
				Reader	rdr = new InputStreamReader(zis);
				BufferedReader brdr = new BufferedReader(rdr);
				
				System.err.println("Part="+ze.getName()+", content="+brdr.readLine());
			}
		}
		
	}

}
