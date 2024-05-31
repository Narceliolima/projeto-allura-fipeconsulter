# FIPE Consulter | Desafio de Projeto Allura

Aplicação para consultas da Tabela Fipe, tabela que expressa a média de preços para pagamentos a vista na revenda de veículos para o consumidor final e pessoa física no mercado nacional, um parametro para as negociações ou avaliações.

A interação com o programa é feito de modo textual via console, o usuário insere primeiramente o tipo de veículo que ele deseja consultar:

```
========================//========================
Bem vindo ao FIPE Consulter

Digite o numero do veiculo que deseja consultar
-------------------------------------------------
|1 - Carros					|
|2 - Caminhoes					|
|3 - Motos					|
-------------------------------------------------
========================//========================
```
Depois será impressa uma lista com as possiveis fabricantes para consulta, então o usuário digita uma das fabricantes da lista:

```
Segue a baixo a fabricante dos possiveis Carros para consulta.
-------------------------------------------------
| 		Acura 				|
| 		Agrale 				|
| 		Alfa Romeo 			|
| 		AM Gen 				|
| 		Asia Motors 			|
...

```

Depois o usuário insere o fabricante do modelo que busca, e será impresso todos os modelos disponíveis daquela fabricante:

```
========================//========================
Segue a baixo o modelo dos possiveis Carros para consulta.
-------------------------------------------------
|A-10 2.5/4.1 |>>> Numero:926
|A-10 De Luxe 2.5/4.1 |>>> Numero:927
|A-20 Custom Std. CD/ De Luxe CD |>>> Numero:928
|A-20 Custom/ C-20 Luxe 4.1 |>>> Numero:929
|A-20 Custom/ C-20 S 4.1 |>>> Numero:930
...
```

Então o usuário procura na lista impressa o modelo que busca, e então insere o numero disponibilizado na lista para a consulta de mais detalhes sobre o modelo:

```
[Nome=Celta 1.4/ Super/ Energy 1.4 8V 85cv 3p, Ano=2007, Custo=R$ 16.765,00, Combutivel=Gasolina]
[Nome=Celta 1.4/ Super/ Energy 1.4 8V 85cv 3p, Ano=2006, Custo=R$ 16.296,00, Combutivel=Gasolina]
[Nome=Celta 1.4/ Super/ Energy 1.4 8V 85cv 3p, Ano=2005, Custo=R$ 15.898,00, Combutivel=Gasolina]
[Nome=Celta 1.4/ Super/ Energy 1.4 8V 85cv 3p, Ano=2004, Custo=R$ 14.042,00, Combutivel=Gasolina]
```

Esse projeto é uma proposta de desafio lançado ao decorrer do meu curso na plataforma da Allura.
Projeto feito puramente em Java.

## ⚙ Requisitos

 - [Biblioteca do google para manipulação de JSON](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)

## 🖇Referência

 - [Site para consulta da tabela Fipe](https://veiculos.fipe.org.br/)
 - [Base utilizada para consulta da tabela Fipe](https://deividfortuna.github.io/fipe/)
 - [Git da referencia do desafio](https://github.com/alura-cursos/3257-java-desafio/blob/main/README.md)
