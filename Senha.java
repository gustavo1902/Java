import java.security.SecureRandom;

// Tamanho da senha
int tamanhoSenha = 8;

// Conjunto de caracteres para usar na senha
String caracteresSenha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

// Gerar um gerador de números aleatórios seguro
SecureRandom random = new SecureRandom();

// Criar um array de caracteres para armazenar a senha
char[] senha = new char[tamanhoSenha];

// Gerar a senha
for (int i = 0; i < tamanhoSenha; i++) {
  senha[i] = caracteresSenha.charAt(random.nextInt(caracteresSenha.length()));
}

// Converter a senha para uma string
String senhaString = new String(senha);

// Imprimir a senha gerada
System.out.println("Senha gerada: " + senhaString);
