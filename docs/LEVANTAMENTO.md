# Levatamento de Requisitos

## Visão Geral
<p>
Este documento tem como objetivo descrever o processo de levantamento
de requisitos para o desenvolvimento de um sistema de análise de dados de arrecadação de receitas municipais.
</p>



## Descrição do problema
Existe uma grande dificuldade em encontrar dados atualizados e de forma organizada sobre a arrecadação de receitas municipais.
Com isso surge a necessidade de um sistema que possa coletar, organizar e analisar esses dados de forma a facilitar a análise acerca desses dados.


## Descrição dos processos
Como ciclo de vida geral do processo temos uma parte de parametrização

### Detalhamento dos processos

### APIs utilizadas

### Entradas e saídas esperadas

### API banco do brasil
[API BB](https://demonstrativos.apps.bb.com.br/arrecadacao-federal/listar)

- Divisão por tipo de receita
- Divisão por meses

- Criar grupos (Associações)
- Criar municipios (Adicionar população OPICIONAL)


### Informações
- Receita= Todos os créditos - Redutores
- Deducao fundeb
- Líquido

### Comparações (em relação ao líquido)
- Comparar com mês no anterior
- Comparar com mesmo mês no ano anterior
- Acumalado no mesmo período do ano anterior
- Acumalado em periodo especifico (OPCIONAL)
- Análise per capita (comparativo utilizando população) (OPCIONAL)
 





