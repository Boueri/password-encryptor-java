import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class VerificadorHash {
    
    // Método para gerar o Hash da senha (Irreversível)
    public static String gerarHash(String senha) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(senha.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hashBytes);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String senhaUsuario = "User123_Forte";
        
        // Simula o que vai para o Banco de Dados
        String hashNoBanco = gerarHash(senhaUsuario);
        System.out.println("Hash salvo no banco: " + hashNoBanco);

        // --- Simulação de Login ---
        String tentativaLogin = "User123_Forte"; // O que o usuário digitou
        String hashTentativa = gerarHash(tentativaLogin);

        // "Decodificação" por comparação
        if (hashNoBanco.equals(hashTentativa)) {
            System.out.println("Acesso Permitido! A senha está correta.");
        } else {
            System.out.println("Acesso Negado! Senha incorreta.");
        }
    }
}