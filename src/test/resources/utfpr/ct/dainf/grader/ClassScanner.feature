Feature: Avalia a Prática 3.2 de IF62C-Fundamentos de Programação 2
    Como professor da disciplica de Fundamentos de Programação 2
    Quero avaliar a prática 3.2
    A fim de verificar a compreensão dos estudantes

    Background:
        Given the maximum grade is 100
        Given the main class is 'Pratica33'
        Given I set the script timeout to 3000
        Given I evaluate 'import utfpr.ct.dainf.grader.*'
        Given I evaluate 'import java.util.regex.*'
    
    Scenario: Verifica se a classe Pratica33 classe existe no pacote padrão e contem o método main (10 pontos)
        Given I report 'Iniciando avaliação...'
        Given I report 'Avaliando item 2...'
        Given class 'Pratica33' exists somewhere store class in <mainClass>
        Given the class <mainClass> is in the 'default' package
        And class <mainClass> has 'public' modifier
        Then award 5 points
        Given class <mainClass> declares 'main(java.lang.String[])' method save in <mainMethod>
        And method <mainMethod> returns type 'void'
        And member <mainMethod> has 'public' modifier
        And member <mainMethod> has 'static' modifier
        Then award 5 points

    Scenario: Verifica se a classe Matriz classe existe no pacote utfpr.ct.dainf.if62c.pratica (10 pontos)
        Given class 'Matriz' exists somewhere store class in <matrizClass>
        Then award 5 points
        Given the class <matrizClass> is in the 'utfpr.ct.dainf.if62c.pratica' package
        And class <matrizClass> has 'public' modifier
        Then award 5 points

    Scenario: Verifica se o método soma foi corretamente implementado (30 pontos)
        Given I report 'Avaliando item 3...'
        Given class <matrizClass> declares 'soma(utfpr.ct.dainf.if62c.pratica.Matriz)' method save in <somaMethod>
        And member <somaMethod> has 'public' modifier
        And method <somaMethod> returns type 'utfpr.ct.dainf.if62c.pratica.Matriz'
        Then award 10 points
        Given expression 'TestUtils.somaMatrizTest(3, 2)' evaluates to <true>
        Then award 20 points

    Scenario: Verifica se o método prod foi corretamente implementado (30 pontos)
        Given I report 'Avaliando item 4...'
        Given class <matrizClass> declares 'prod(utfpr.ct.dainf.if62c.pratica.Matriz)' method save in <somaMethod>
        And member <somaMethod> has 'public' modifier
        And method <somaMethod> returns type 'utfpr.ct.dainf.if62c.pratica.Matriz'
        Then award 10 points
        Given expression 'TestUtils.prodMatrizTest(3, 2)' evaluates to <true>
        Then award 20 points

    Scenario: Verifica se exibe o valor calculado (20 pontos)
        Given I report 'Avaliando item 5...'
        Given I evaluate 'testMain = new Pratica33()'
        Given I set output to <testOut>
        And I evaluate 'testMain.main(new String[0])'
        And I set output to <default>
        And <testOut> matches regex '^.*\d+.*$' with 'Pattern.DOTALL' option
        Then award 20 points

    Scenario: Report final grade.
        Given I report grade formatted as 'FINAL GRADE: %.1f'
