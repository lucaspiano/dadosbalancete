package br.gov.cvm.dadosbalancete.connection;

import org.apache.commons.io.FileUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class ConnectionGenerator {

    private static String FILE_NAME = "balancete_fi_202008.zip";

    private String address = "http://dados.cvm.gov.br/dados/FI/DOC/BALANCETE/DADOS/";

    public void getFile() throws IOException {
        URL url = new URL(address + FILE_NAME);

        File file = new File("C:\\Users\\lucaspiano\\Downloads\\" + FILE_NAME);

        FileUtils.copyURLToFile(url, file);
    }
}
