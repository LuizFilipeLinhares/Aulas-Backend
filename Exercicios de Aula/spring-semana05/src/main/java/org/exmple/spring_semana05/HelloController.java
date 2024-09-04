package org.exmple.spring_semana05;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.pdfbox.contentstream.PDContentStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDMMType1Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


@RestController
public class HelloController{

    @GetMapping("/ola")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/temperature")
    public Double tempconvert(@RequestParam Double fahrenheit){
        Double celcius = (fahrenheit - 32)*(5.0/9.0);

        return celcius;

    }

    @GetMapping("/pdf")
    public ResponseEntity<InputStreamResource> pdfGerator()throws IOException{
        PDDocument documento = new PDDocument();
        PDPage pagina = new PDPage();
        documento.addPage(pagina);

        PDPageContentStream writer = new PDPageContentStream(documento, pagina);
        String nome;
        writer.beginText();
        writer.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 16);
        writer.newLineAtOffset(20, 500);
        writer.showText("Olá "+ nome +"!");
        writer.newLineAtOffset(0, -30);
        writer.showText("Você está dentro do PDF");
        writer.endText();
        writer.close();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        documento.save(outputStream);
        byte[] binario = outputStream.toByteArray();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(binario);
        InputStreamResource resource = new InputStreamResource(inputStream);

        return ResponseEntity.status(201).contentType(MediaType.APPLICATION_PDF).body(resource);
    }

}
