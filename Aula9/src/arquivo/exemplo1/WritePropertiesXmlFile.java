package arquivo.exemplo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class WritePropertiesXmlFile {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			properties.setProperty("codigo1", JOptionPane.showInputDialog("Nome 1"));
			properties.setProperty("codigo2", JOptionPane.showInputDialog("Nome 2"));
			properties.setProperty("codigo3", JOptionPane.showInputDialog("Nome 3"));

			File file = new File("nomes.xml");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.storeToXML(fileOut, "Cadastro Nomes");
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}