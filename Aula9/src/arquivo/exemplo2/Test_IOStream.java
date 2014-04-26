package arquivo.exemplo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test_IOStream {

	private static final String NOME_ARQUIVO_SERIALIZADO = "obj_pessoa.dat";

	public static void main(String[] args) throws IOException {

		CriandoArquivo();

		Serializando();
		Deserializando();

	}

	public static void LendoArquivo() throws IOException {
		// FileInputStream encontra o arquivo e retorna um byte em formato
		// Unicode;
		InputStream is = new FileInputStream("pessoa.txt");
		// O StreamReader l? o unicode e Traduz, transformando-o em um
		// caractere.
		InputStreamReader isr = new InputStreamReader(is);
		// o BufferedReader apenas concatena cada caractere traduzido pelo
		// StreamReader
		BufferedReader br = new BufferedReader(isr);
		// lemos apenas a primeira linha,
		// o metodo le a primeira linha e muda o cursor para a proxima linha,

		String s = br.readLine();

		// caso ele chegue ao fim do reader ele devolve null.
		// ent?o enquanto ele for diferente de null lemos todas as linhas.
		while (s != null) {
			System.out.println(s);
			// l? a linha e aponta o cursor para a proxima linha
			s = br.readLine();

			// pode usar tratamento dos erros, try catch alem de enviar as
			// exceptions para o Throw...
		}
		br.close();

	}

	public static void CriandoArquivo() throws IOException {
		File f = new File("saida.txt");
		OutputStream os = new FileOutputStream(f.getPath());
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		// pode usar tratamento dos erros, try catch...
		bw.write("Testando");
		System.out.println("Arquivo criado com sucesso em:\n" + f.getPath());
		bw.close();
	}

	public static void Serializando() {
		Pessoa pessoa = new Pessoa("Joao", "do Morro");

		try {

			// Gera o arquivo para armazenar o objeto
			FileOutputStream arqGravar = new FileOutputStream(
					NOME_ARQUIVO_SERIALIZADO);

			// inserir objetos
			ObjectOutputStream obj = new ObjectOutputStream(arqGravar);

			// Gravar o objeto no arquivo
			obj.writeObject(pessoa);

			obj.flush();
			obj.close();
			arqGravar.flush();
			arqGravar.close();

			System.out.println("Objeto gravado com sucesso!");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void Deserializando() {
		System.out.println("Objeto recuperado:");
		try

		{

			// Carrega o arquivo

			FileInputStream arqRead = new FileInputStream(
					NOME_ARQUIVO_SERIALIZADO);

			// recuperar os objetos do arquivo

			ObjectInputStream objRead = new ObjectInputStream(arqRead);
			System.out.println(objRead.readObject());
			
			objRead.close();
			arqRead.close();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

}
