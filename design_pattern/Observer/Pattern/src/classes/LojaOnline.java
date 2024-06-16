package classes;

import interfaces.Observador;

import java.util.ArrayList;
import java.util.List;

public class LojaOnline {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarNovoProduto(String novoProduto) {
        for (Observador observador : observadores) {
            observador.notificar(novoProduto);
        }
    }
}