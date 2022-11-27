class Operacao {
    static void transfere(ori, des, int valor) {
        ori.debitar(valor);
        des.creditar(valor);
        
        Logador logador = new Logador();

        ori.getNumero();

        logador.imprimir("retirada", numeroContaORI, valor);

        des.getNumero();

        logador.imprimir("deposito", numeroContaDES, valor);
    }



    Conta ori = new Conta();
    Conta des = new Conta();
}