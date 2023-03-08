@desafio
Feature: Validação de Modal
  Aqui ficará a validação dos modals existentes no site da Getnet

  @scenario_desafio
  Scenario: Validar se modal de como ativar cartao SuperGet aparece
    Given o usuario acessar o site da GetNet
    And o usuario acessar o menu Conta SuperGet dentro do menu Mais Solucoes
    When o usuario clicar em Como ativar meu cartao SuperGet
    Then um modal aparece contendo a mensagem explitiva

