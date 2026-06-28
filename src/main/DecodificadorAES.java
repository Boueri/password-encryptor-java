import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DecodificadorAES {
    public static void main(String[] args) throws Exception {
        String senhaOriginal = "MinhaSenhaSecreta123";

        // 1. Gerar uma chave secreta (no mundo real, você deve salvar essa chave com segurança)
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256); // AES-256 bits
        SecretKey chaveSecreta = keyGen.generateKey();

        // 2. Codificar (Criptografar)
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, chaveSecreta);
        byte[] senhaCriptografadaBytes = cipher.doFinal(senhaOriginal.getBytes());
        String senhaCriptografadaBase64 = Base64.getEncoder().encodeToString(senhaCriptografadaBytes);
        
        System.out.println("Senha Criptografada (Base64): " + senhaCriptografadaBase64);

        // 3. DECODIFICAR (Descriptografar)
        cipher.init(Cipher.DECRYPT_MODE, chaveSecreta);
        byte[] bytesDecodificados = cipher.doFinal(Base64.getDecoder().decode(senhaCriptografadaBase64));
        String senhaDecodificada = new String(bytesDecodificados);

        System.out.println("Senha Decodificada com sucesso: " + senhaDecodificada);
    }
}