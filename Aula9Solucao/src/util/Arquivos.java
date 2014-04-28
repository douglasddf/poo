/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import modelos.Aluno;

/**
 *
 * @author douglasdanieldelfrari
 */
public final class Arquivos {

    private static final String NOME_ARQUIVO_SERIALIZADO = "arquivos/aluno_";
    private static final String ARQUIVO_BANCO_DADOS_XML = "alunos.xml";

    private Arquivos() {

    }

    public static void gravarAlunoEmArquivo(final Aluno aluno) {

    	ObjectOutputStream obj = null;
    	FileOutputStream arqGravar = null;
    	
        try {

            // Gera o arquivo para armazenar o objeto
            arqGravar = new FileOutputStream(
                    NOME_ARQUIVO_SERIALIZADO + aluno.getCodigo());

            // inserir objetos
            obj = new ObjectOutputStream(arqGravar);

            // Gravar o objeto no arquivo
            obj.writeObject(aluno);

            System.out.println("Objeto gravado com sucesso! -> "+aluno);

        } catch (Exception e) {
        	
            e.printStackTrace();
            
        } finally {
        	
        	try {
        		if (obj != null) {
        			obj.flush();
    				obj.close();
        		}
				
        		if (arqGravar != null) {
        			arqGravar.flush();
    				arqGravar.close();
        		}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
           
        }
    }

	public static Aluno recuperarAlunoDeArquivo(final int codigo) {

		Aluno aluno = null;
		FileInputStream arqRead = null;
		ObjectInputStream objRead = null;

		try {

			// Carrega o arquivo
			arqRead = new FileInputStream(NOME_ARQUIVO_SERIALIZADO + codigo);

			// recuperar os objetos do arquivo
			objRead = new ObjectInputStream(arqRead);
			aluno = (Aluno) objRead.readObject();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				if (objRead != null) {
					objRead.close();
				}

				if (arqRead != null) {
					arqRead.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return aluno;
	}

    /**
     * Salva os dados em arquivo. Porém, coloca no arquivo somente os novos que
     * estao na memoria.
     *
     * @param alunos lista com dados da memoria
     * @param listaAlunosArquivo lista de dados que foram lidos no arquivo
     */
    public static void salvarAlunos(final ArrayList<Aluno> alunos,
            final ArrayList<Aluno> listaAlunosArquivo) {

        if (alunos.size() == 0) {
            System.err.println("NAO TEM DADOS PARA SALVAR");
            return;
        }

        FileInputStream fileInput = null;
        FileOutputStream fileOut = null;

        try {

            Properties properties = new Properties();
            ;
            File file = new File(ARQUIVO_BANCO_DADOS_XML);
            if (file.isFile()) {
                System.out.println("lendo arquivo: " + file.getAbsolutePath());

                fileInput = new FileInputStream(file);
                properties.loadFromXML(fileInput);

                // somente adicionar os novos
                for (Aluno aluno : alunos) {
                    if (!listaAlunosArquivo.contains(aluno)) {
                        properties.setProperty(Aluno.CODIGO + aluno.getCodigo(), "" + aluno.getCodigo());
                        properties.setProperty(Aluno.NOME + aluno.getCodigo(), aluno.getNome());
                        properties.setProperty(Aluno.EMAIL + aluno.getCodigo(), aluno.getEmail());
                        properties.setProperty(Aluno.LOGIN + aluno.getCodigo(), aluno.getLogin());
                        properties.setProperty(Aluno.SENHA + aluno.getCodigo(), aluno.getSenha());
                    }
                }

                atualizaContadorCodigos(alunos);

            } else {

                for (Aluno aluno : alunos) {
                    properties.setProperty(Aluno.CODIGO + aluno.getCodigo(), "" + aluno.getCodigo());
                    properties.setProperty(Aluno.NOME + aluno.getCodigo(), aluno.getNome());
                    properties.setProperty(Aluno.EMAIL + aluno.getCodigo(), aluno.getEmail());
                    properties.setProperty(Aluno.LOGIN + aluno.getCodigo(), aluno.getLogin());
                    properties.setProperty(Aluno.SENHA + aluno.getCodigo(), aluno.getSenha());
                }
            }

            // salva no XML
            fileOut = new FileOutputStream(file);

            Date myDate = new Date();
            String simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(myDate);
            System.out.println("Dados Salvos: " + simpleDateFormat);

            properties.storeToXML(fileOut, "ultima atualizacao: " + simpleDateFormat);

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo ainda nao existe: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fileInput != null) {
                    fileInput.close();
                }

                if (fileInput != null) {
                    fileOut.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Recupera os dados armazenados em arquivo XML e retorna um
     * {@link ArrayList}.
     *
     * @return uma lista de objetos armazenados em arquivo.
     */
    public static ArrayList<Aluno> recuperarAlunos() {

        ArrayList<Aluno> alunos = new ArrayList<>();
        FileInputStream fileInput = null;

        try {
            File file = new File(ARQUIVO_BANCO_DADOS_XML);
            fileInput = new FileInputStream(file);

            System.out.println("lendo arquivo existente: " + file.getAbsolutePath());

            Properties properties = new Properties();
            properties.loadFromXML(fileInput);

            int size = properties.size();

            // percorre a lista 
            for (int i = 1; i <= size; i++) {

                // se contem uma chave inicial, obtem os dados restantes desta mesma chave 
                if (properties.containsKey(Aluno.CODIGO + i)) {
                    // cria objeto
                    Aluno alunoAtual = new Aluno();
                    // seta objeto com os dados do arquivo
                    alunoAtual.setCodigo(Integer.parseInt(properties.getProperty(Aluno.CODIGO + i)));
                    alunoAtual.setNome(properties.getProperty(Aluno.NOME + i));
                    alunoAtual.setEmail(properties.getProperty(Aluno.EMAIL + i));
                    alunoAtual.setLogin(properties.getProperty(Aluno.LOGIN + i));
                    alunoAtual.setSenha(properties.getProperty(Aluno.SENHA + i));

                    // seta o ArrayList com objeto novo
                    alunos.add(alunoAtual);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("ARQUIVO NAO EXISTE AINDA: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fileInput != null) {
                    fileInput.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        atualizaContadorCodigos(alunos);

        return alunos;
    }

    private static void atualizaContadorCodigos(ArrayList<Aluno> alunos) {
        // atualizar contador de codigo de aluno
        int contadorAtual = alunos.size() + 1;
        Aluno.setContador(contadorAtual);
    }

    public static String convertPasswordToMD5(String password)
            throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));

        return String.format("%32x", hash);
    }
    
    
    public static void main(String[] args) {
		try {
			// Gravando exemplos de teste
			
//			Aluno aluno1 = new Aluno("Nome 1", "email1@teste.com", "login1", convertPasswordToMD5("senha1"));
//			Aluno aluno2 = new Aluno("Nome 2", "email2@teste.com", "login2", convertPasswordToMD5("senha2"));
//			
//			gravarAlunoEmArquivo(aluno1);
//			gravarAlunoEmArquivo(aluno2);

			// recuperando da pasta arquivos
			
			File file = new File("arquivos");
			if (file.isDirectory()) {
				System.out.println("eh pasta");
				
				String[] files = file.list();
				if (files.length != 0) {
				
					ArrayList<Aluno> alunos = new ArrayList<Aluno>();
					
					for (int i = 0; i < files.length; i++) {
						System.out.println(files[i]);
						
						int index = files[i].indexOf("_");
						String codigo = files[i].substring(index+1);
						System.out.println(codigo);
						
						Aluno aluno = recuperarAlunoDeArquivo(Integer.parseInt(codigo));
						if (aluno != null) {
							alunos.add(aluno);
						}
					}
					
					for (Aluno aluno : alunos) {
						System.out.println(aluno);
					}
					
				}
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
