/*
 * @(#)EmailService.java
 * 
 * Copyright 2019 ZyTrust SA, Todos los derechos reservados.
 * ZT PROPRIETARIO/CONFIDENTIALIDAD. Su uso está sujeto a los
 * términos de la licencia adquirida a ZyTrust SA.
 * No se permite modificar, copiar ni difundir sin autorización
 * expresa de ZyTrust SA.
 */
package com.sw.banca.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.aspectj.apache.bcel.classfile.Module.Open;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;
import org.springframework.stereotype.Service;

import com.sw.banca.dto.Response;
import com.sw.banca.utils.ErroresEnum;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Service
public class OcrService {

	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	
	public Response<String> lecturaDocumento(byte[] buffer){
		
		
		Response<String> response = null;
		InputStream is = new ByteArrayInputStream(buffer);
		BufferedImage bi;
		try {
			bi = ImageIO.read(is);
		} catch (IOException e) {
			return new Response<>(ErroresEnum.FALLO_LECTURA_OCR);
		}
		  
		try {
			
			Tesseract tesseract = new Tesseract();
			String texto = tesseract.doOCR(new File("C:\\Users\\gjimenez\\Desktop\\prueba.jpeg"));
			response = new Response<>();
			response.setError(ErroresEnum.OK);
			response.setData(texto);
			return response;
		} catch (TesseractException e) {
			return new Response<>(ErroresEnum.FALLO_LECTURA_OCR);
			
		}
	}
	
	
	public static void main(String[] args) {
		Tesseract tesseract = new Tesseract();
		String texto;
		try {
	        
	        //FILTRADO DE COLOR
			Mat data = new Mat();
	        Mat source = HighGui. 
	        
	        
	        tesseract.setLanguage("spa");
	        tesseract.setOcrEngineMode(2);
	        tesseract.setDatapath("src/main/resources/tessdata");
	        texto = tesseract.doOCR(file);
			System.out.println("TEXTO : " + texto );
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
