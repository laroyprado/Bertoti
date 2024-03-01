package com.projetobancodedados.Bertoti.animal;

public record AnimalResponseDTO(Long Id,String nome, String especie, String descricao, Integer idade_meses, String cor, String linkFoto, String cidade) {

    public AnimalResponseDTO(Animal animal) {
        this(animal.getId(),animal.getNome(), animal.getEspecie(), animal.getDescricao(), animal.getIdade_meses(), animal.getCor(), animal.getLinkFoto(), animal.getCidade());
    }
}
