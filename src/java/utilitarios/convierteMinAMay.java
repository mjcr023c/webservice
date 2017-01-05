package utilitarios;

public class convierteMinAMay {
    public String convierteaMayuscula(String word) {
        boolean esValidaLaPalabra = true;
        boolean esUnNumero = esNumerico(word);
        if (esUnNumero == true) {
            return "400 bad-request ";
        } else if (word.length() > 4) {
            esValidaLaPalabra = false;
            return "400 bad-request ";
        } else {
            return word.toUpperCase();
        }
    }

    private boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
