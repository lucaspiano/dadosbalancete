package br.gov.cvm.dadosbalancete.service;

import br.gov.cvm.dadosbalancete.connection.ConnectionGenerator;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DadosBalanceteService {
    private ConnectionGenerator connectionGenerator = new ConnectionGenerator();

    public void getResponse() throws IOException {
        connectionGenerator.getFile();
    }


}
