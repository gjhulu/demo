package com.test.demo.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pdfController")
public class PDFController {
	//在线预览PDF文件 （不可用 待修改）
	@RequestMapping("/loadContract2")
	public ResponseEntity<byte[]> loadContract2() throws IOException {
		//response.setContentType("application/pdf");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>2");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		File file = new File("F:/testPdf.pdf");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len = inputStream.read(buffer)) != -1){
            out.write(buffer, 0, len);
        }
        
        byte[] bytes=out.toByteArray();
		final HttpHeaders headers = new HttpHeaders();
		   headers.setContentType(MediaType.valueOf("application/pdf"));
		   headers.setContentLength(bytes.length);
		   //headers.add(HttpHeaders.ACCEPT_RANGES,"bytes");
		  // headers.add(HttpHeaders.ACCEPT_RANGES, "bytes");
		   return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		//return null;
	}
	
	/**
	 * 跳转到PDF页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value ="/loanContract1")
	public String loanContract1(Model model) {
	  /* if (StringUtils.isEmpty(userId)  || StringUtils.isEmpty(borrowCode)) {
	      return "app/credit/canaLoanApplication/404Error";
	   }
	   Map<String,String> returnMap = canaApplyLoanService.investmentContractTemplate(userId,borrowCode,productTypeCode);
	   if( BizCodeType.IS_NO.getCode().equals(returnMap.get("flag"))){
	      return "app/credit/canaLoanApplication/404Error";
	   }*/
	  // model.addAttribute("fileId",returnMap.get("fileId")+".pdf");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>1");
	   return "pages/pdf/loanPdfContract";
	}
	
	//在线预览PDF文件
	@RequestMapping("/displayPDF")
    public void displayPDF(HttpServletResponse response) {
        try {
            File file = new File("F:/testPdf.pdf");
            FileInputStream fileInputStream = new FileInputStream(file);
            response.setHeader("Content-Disposition", "attachment;fileName=test.pdf");
           // response.setContentType("multipart/form-data");
            response.setContentType("application/pdf"); 
            OutputStream outputStream = response.getOutputStream();
            IOUtils.write(IOUtils.toByteArray(fileInputStream), outputStream);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
