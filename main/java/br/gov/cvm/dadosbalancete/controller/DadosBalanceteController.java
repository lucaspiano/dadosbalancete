package br.gov.cvm.dadosbalancete.controller;

import br.gov.cvm.dadosbalancete.service.DadosBalanceteService;
import com.google.auto.service.AutoService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;

@RestController
@AutoService(FileSystemProvider.class)
public class DadosBalanceteController {

    private DadosBalanceteService dadosBalanceteService;

    private static String FILE_NAME = "balancete_fi_202008.zip";

    private String address = "http://dados.cvm.gov.br/dados/FI/DOC/BALANCETE/DADOS/balancete_fi_202008.zip";

    @Autowired
    public DadosBalanceteController(DadosBalanceteService dadosBalanceteService) {
        this.dadosBalanceteService = dadosBalanceteService;
    }

    @GetMapping(value = "/zip")
    public ResponseEntity<String> downloadFile(HttpServletResponse response) throws Exception {
        dadosBalanceteService.getResponse();
        return ResponseEntity.ok().body("File successfully downloaded!");
    }
}
