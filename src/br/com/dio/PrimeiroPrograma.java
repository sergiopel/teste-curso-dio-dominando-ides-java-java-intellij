// atalhos
// alt+inset em alguma pasta = insere arquivo
// public static void main = main + enter
// System.out.println() = sout + enter
// rodar pela primeira vez um programa = ctrl + shift + f10
// rodar pela segunda vez em diante = shift + f10
// alt+insert no editor = abre janela pra inserir algo
// comentar um bloco = ctrl + shift + barra(/)
// comentar linha a linha = ctrl + barra(/)
// quando dá falta de um import = alt + enter
// apagar imports não utilizados = ctrl + alt + o
// apagar linha = ctrl + y
// renomear algo projeto = clicar no item e shift + f6
// aumenta a tela do editor = shift + f12
// organiza a identação do código = ctrl + alt + l
// duplicar linha = ctrl + d
// trocar linha de lugar = ctrl + shift + seta pra cima ou pra baixo

// página com os principais atalhos:
//  www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea

// Como versionar com o git:
// 1 - clicar na aba VCS, e depois em 'Enable Version Control Integration', selecionar Git e Ok
// 2 - neste momento substituiu a aba VCS por git e ao abri-la, clicar na opção Commit ou ctrl+k
// 3 - digitar a mensagem do commit, marcar todos os arquivos  e clicar em 'Commit and Push'
// 4 -

package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }

}