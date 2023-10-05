package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private final List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsRemover = new ArrayList<>();
        for (Item itemR : itemList) {
            if (itemR.getNome().equalsIgnoreCase(nome)) {
                itemsRemover.add(itemR);
            }
        }
        itemList.removeAll(itemsRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Item itemC : itemList) {
            double valorItem = itemC.getPreco() * itemC.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(this.itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompra{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Lapis", 12.0, 1);
        carrinhoDeCompra.exibirItens();
    }

}
