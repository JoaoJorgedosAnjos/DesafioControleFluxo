public class ParametrosInvalidosException extends Exception{
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;
        for (int i = 0; i < contagem; i++);
        System.out.println(contagem);
    }
}
