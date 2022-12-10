package app.financeiramente.ofxparser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

@SpringBootApplication
public class OfxParserApplication {

	public static void main(String[] args) throws IOException, JAXBException {
		SpringApplication.run(OfxParserApplication.class, args);
		teste2();
	}

	public static void teste() throws IOException{

		String filename = "C:\\Users\\danie\\OneDrive\\Área de Trabalho\\NU_813781109_01NOV2022_19NOV2022.ofx";

		String teste = "12345";


//		try (Stream<String> streams = Files.lines(Paths.get(filename))) {
//			List<String> lines = streams.toList();
//			Map<Integer, Map<String, String>> transactions = new LinkedHashMap<>();
//			ObjectMapper mapper = new ObjectMapper();
//			List<Transaction> transactionList = new ArrayList<>();
//			AtomicReference<Integer> index = new AtomicReference<>(0);
//
//
//			for (int i = 0; i < lines.size(); i++) {
//				if (lines.get(i).equals("<STMTTRN>")) {
//					Map<String, String> m = new LinkedHashMap<>();
//
//					lines.subList(i + 1, i + 6).forEach(t -> {
//						String type = t.split(">")[0].split("<")[1].toLowerCase();
//						String value = t.split(">")[1].split("<")[0].toLowerCase();
//
//						if(type.equals("dtposted")) {
//							value = value.substring(0, 14);
//						}
//
//						m.put(type, value);
//					});
//
//					transactions.put(index.get(), m);
//					index.getAndSet(index.get() + 1);
//				}
//			}
//
//			transactions.forEach((i, value) -> {
//				transactionList.add(mapper.convertValue(value, Transaction.class));
//			});
//
//			System.out.println(transactionList);
//
//		}
	}


	public static void teste2() throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(Transaction.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Transaction transaction = (Transaction) jaxbUnmarshaller.unmarshal(new File("C:\\Users\\danie\\OneDrive\\Área de Trabalho\\copia.ofx"));
		System.out.println(transaction);
	}

}
