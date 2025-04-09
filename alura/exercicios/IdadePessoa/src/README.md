# IdadePessoa

Este projeto é um exercício simples em Java que demonstra o uso de:

- Encapsulamento com atributos privados
- Métodos getters e setters
- Construtores (com e sem parâmetros)
- Condicionais (`if/else`)
- Organização de classes e métodos

## 📘 Descrição

A classe `IdadePessoa` representa uma pessoa com `nome` e `idade`. Ela permite verificar, através do método `verificarIdade()`, se a pessoa é maior de idade (18 anos ou mais) ou menor.

## 💡 Exemplo de uso

```java
IdadePessoa pessoa = new IdadePessoa("Maria", 17);
pessoa.verificarIdade(); // Saída: Maria é menor de idade.