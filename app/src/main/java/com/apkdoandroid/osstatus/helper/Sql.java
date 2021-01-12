package com.apkdoandroid.osstatus.helper;

public class Sql {
    private  static String sqlTabelaFrases = "CREATE TABLE IF NOT EXISTS "+Banco_BD.TABELA+" ( id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
            "autor VARCHAR(50), texto TEXT,categoria VARCHAR(50), data_hora DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, favorito INTEGER NOT NULL DEFAULT 0);";



    public static String getSqlTabelaFrases() {
        return sqlTabelaFrases;
    }
    public  static String carregarFrases1(){
        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES ('Lembre-se que se algum dia você precisar de ajuda, você encontrará uma mão no final do seu braço. À medida que você envelhecer, você descobrirá que tem duas mãos - uma para ajudar a si mesmo, e outra para ajudar aos outros.','Audrey Hepburn','Frases Perfeitas')\n" +
                ",('Que nossa amizade dure mais que a eternidade, e que a eternidade nunca acabe para que nós sempre possamos ser amigos.','Victoria silva','Frases Perfeitas')\n" +
                ",('As dificuldades devem ser usadas para crescer, não para desencorajar. O espírito humano cresce mais forte no conflito.','William Ellery Channing','Frases Perfeitas')\n" +
                ",('Os defeitos que nos tomam a alma são os mais difíceis de corrigir, pois já estão tão enraizados, devido nossa constante ignorância e persistência que, mesmo sendo atenuados com certa dose passageira de lucidez, eles teimam em voltar com mais vigor que antes.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('Como felizmente não tenho dom de ler pensamentos, não me preocupo em ter amigos, me preocupo em ser amigo. Dessa forma consigo abraçar a quem me detesta e ajudo quem não faria por minm o mesmo','Anônimo','Frases Perfeitas')\n" +
                ",('Beijo é igual a café, quanto mais quente melhor é.','Anônimo','Frases Perfeitas')\n" +
                ",('A própria vida é o mais alto e precioso de todos os tesouros do universo. Mesmo os tesouros do universo inteiro não podem igualar o valor de uma única vida humana. A vida é como uma chama, e o alimento como o óleo que lhe permite queimar.','Nitiren Daishonin','Frases Perfeitas')\n" +
                ",('Do mesmo modo que o campo, por mais fértil que seja, sem cultivo não pode dar frutos, assim é o espírito sem estudo.','Cícero','Frases Perfeitas')\n" +
                ",('A glória poderá até ser efêmera, mas estaremos vivendo muito mais intensamente, nos arriscando às grandes conquistas, mesmo expostos às derrotas, do que morrermos na obscuridade da inércia, de onde nunca teríamos como saborear o doce paladar de, pelo menos, termos chegado tão perto.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('Mesmo diante de tantos presentes natalinos recebidos, o mais precioso é o amor, a emoção dos encontros, e o esquecimento dos desencontros é a esperança renovada juntamente com a fé, e com ela a volta da certeza de sua presença.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('A não-violência não existe se apenas amamos aqueles que nos amam. Só há não-violência quando amamos aqueles que nos odeiam. Sei como é difícil assumir essa grande lei do amor. Mas todas as coisas grandes e boas não são difíceis de realizar? O amor a quem nos odeia é o mais difícil de tudo. Mas, com a graça de Deus, até mesmo essa coisa tão difícil se torna fácil de realizar, se assim queremos.','Mahatma Gandhi','Frases Perfeitas')\n" +
                ",('O economês a gente aprende na escola. Mas se não tomar cuidado, o economista acabará falando, escrevendo e pensando em economês para o resto da vida. Mesmo porque, o economês é uma varinha mágica. Aplicado com método, pode dar resposta a qualquer problema do vasto mundo da economia.','Joelmir Beting','Frases Perfeitas')\n" +
                ",('A melhor esposa do mundo é você e o coração mais apaixonado de sempre é o meu. Te amo, meu bem!','Anônimo','Frases Perfeitas')\n" +
                ",('Acredite em si mesmo em qualquer circunstância, pois você é o principal responsável pela sua felicidade.','Anônimo','Frases Perfeitas')\n" +
                ",('Meu amor por você é maior que qualquer montanha e mais profundo que qualquer ponto do oceano.','Anônimo','Frases Perfeitas')\n" +
                ",('Não faz sentido começar um ano novo se não for agradecendo pelo que tenho de mais importante na vida: vocês! Gratidão demais!','Anônimo','Frases Perfeitas')\n" +
                ",('Viver mais um dia lindo e abençoado sem agradecer a Deus é pecado. Eu Te agradeço, Senhor, por mais esta dádiva!','Anônimo','Frases Perfeitas')\n" +
                ",('Por este novo amanhecer, pela bênção de mais um dia, agradeço ao Senhor!','Anônimo','Frases Perfeitas')\n" +
                ",('Completei mais um ano de vida e quero muito agradecer a Deus, aos meus amigos e familiares por tudo que de bom me deram.','Anônimo','Frases Perfeitas')\n" +
                ",('A Deus entrego minha devoção, minha gratidão e todo meu apreço por mais um dia abençoado!','Anônimo','Frases Perfeitas')\n" +
                ",('Foi um ano de desafios e superação, mas agradeço por tudo, pois chego no meu novo ano mais forte do que nunca!','Anônimo','Frases Perfeitas')\n" +
                ",('Hoje só quero agradecer a Deus por acrescentar mais um ano à minha vida. Sei bem o tamanho da graça, por isso, feliz aniversário para mim!','Anônimo','Frases Perfeitas')\n" +
                ",('Agradeço a Deus por mais um ano de vida, por todas as bênçãos e também pelos momentos difíceis, pois é com eles que cresço e aprendo. Parabéns para mim!','Anônimo','Frases Perfeitas')\n" +
                ",('Este será mais um dia especial, daquelas dádivas de Deus que me ama e abençoa minha vida. Por isso e tantas coisas eu Te agradeço, Senhor.','Agradeço','Frases Perfeitas')\n" +
                ",('Agradeço por fazer parte de mais um dia que brilha graças ao esplendor do amor e da bondade de Deus.','Anônimo','Frases Perfeitas')\n" +
                ",('Mais um ano de vida e mais mil motivos para estar feliz! Agradeço a Deus por mais este ano que tantas alegrias trouxe à minha vida!','Anônimo','Frases Perfeitas')\n" +
                ",('Mais um ano fica para trás e mais uma vez tenho você a agradecer por ter sido tão espacial! Vocês fazem tudo ficar muito melhor!','Anônimo','Frases Perfeitas')\n" +
                ",('Agradeço por mais um ano de vida, por mais uma chance de ser feliz!','Anônimo','Frases Perfeitas')\n" +
                ",('Por mais alegria, ainda mais felicidades, sonhos realizados e muitas histórias para contar, agradeço por mais um ano!','Anônimo','Frases Perfeitas')\n" +
                ",('Não vou desperdiçar esta dádiva que é uma nova manhã. Ao Senhor agradeço por mais este presente.','Anônimo','Frases Perfeitas')\n" +
                ",('Não corro atrás nem me perco no caminho porque a estrada que percorro é da minha autoria.','Anônimo','Frases Perfeitas')\n" +
                ",('Acreditar em nós mesmos é a maior prova de amor que podemos oferecer ao mundo.','Anônimo','Frases Perfeitas')\n" +
                ",('Não se deixe levar pelo desânimo e jamais permita que um obstáculo impeça você de alcançar o sucesso.','Anônimo','Frases Perfeitas')\n" +
                ",('A felicidade surge quando um amor como nosso acontece. Te amo, meu bem!','Anônimo','Frases Perfeitas')\n" +
                ",('Esqueça o que passou, não se foque no que ainda não aconteceu. Procure que cada nova manhã seja um recomeço na sua vida. Bom dia!','Anônimo','Frases Perfeitas')\n" +
                ",('Vá em frente sem medo, porque viver será sempre o maior desafio da sua existência.','Anônimo','Frases Perfeitas')\n" +
                ",('Não sei se é paixão ou loucura, mas não consigo viver longe de você, meu amor!','Anônimo','Frases Perfeitas')\n" +
                ",('Agradeço do fundo do meu coração por todas as mensagens e todo carinho que recebi no meu aniversário. Vocês são incríveis!','Anônimo','Frases Perfeitas')\n" +
                ",('Palavras não são suficientes para expressar o sentimento de gratidão por todo o amor e carinho que recebi no meu aniversário. Vocês moram no meu coração!','Anônimo','Frases Perfeitas')\n" +
                ",('Vocês realmente sabem como fazer uma pessoa se sentir especial! Toda a minha gratidão pelas mensagens e votos de aniversário. Amo vocês!','Anônimo','Frases Perfeitas')\n" +
                ",('O carinho que ganhei de todos vocês no meu aniversário foi o melhor presente que poderia ter recebido. Muita gratidão por tudo!','Anônimo','Frases Perfeitas')\n" +
                ",('De perto ou de longe, vocês sabem como fazer uma pessoa se sentir especial. Agradeço profundamente pelo aniversário inesquecível!','Anônimo','Frases Perfeitas')\n" +
                ",('Meu Deus é bom e me abençoa com dias lindos e uma oportunidade única de viver ao lado de quem amo. Gratidão','Anônimo','Frases Perfeitas')\n" +
                ",('Eu Te agradeço, meu Deus, pelo dia mágico, cheio de bênçãos e dádivas por esta jornada de amor e alegria.','Anônimo','Frases Perfeitas')\n" +
                ",('Um novo dia, uma nova bênção de Deus e eu oro em agradecimento.','Anônimo','Frases Perfeitas')\n" +
                ",('De tudo que tenho para agradecer neste ano de vida, ter pessoas como vocês no meu caminho ainda é a maior!','Anônimo','Frases Perfeitas')\n" +
                ",('Hoje celebro o melhor ano da minha vida e agradeço a tudo e todos ao meu redor! Que doze meses mágicos eu vivi!','Anônimo','Frases Perfeitas')\n" +
                ",('Seus olhos serão sempre a minha luz, mesmo na mais completa escuridão, meu filho.','Anônimo','Frases Perfeitas')\n" +
                ",('Porque um sorriso deixa todo rosto e toda alma mais bonitos eu sorrio mesmo quando a vontade não é muita.','Anônimo','Frases Perfeitas')\n" +
                ",('O que é ser pai? É amar um ser mais que a si mesmo e ultrapassar qualquer barreira para proteger os filhos. Feliz dia dos pais!','Anônimo','Frases Perfeitas')\n" +
                ",('Eu agradeço por tudo que tenho, mesmo sonhando com mais, pois ingratidão não faz meu estilo!','Anônimo','Frases Perfeitas')\n" +
                ",('Para quem é filho único, um primo é a coisa mais próxima de um irmão. Mesmo sangue, família e união.','Anônimo','Frases Perfeitas')\n" +
                ",('Por mais que as palavras possam impressionar, só mesmo as atitudes são capazes de convencer.','Anônimo','Frases Perfeitas')\n" +
                ",('Na dúvida, sempre escolha o que lhe trouxer mais sorrisos, pois mesmo se não for como o esperado, você não perderá tão facilmente a sua alegria.','Anônimo','Frases Perfeitas')\n" +
                ",('Não dividimos mais o mesmo quarto, mas continuamos compartilhando tudo na vida. Feliz dia do irmão! Amo você!','Anônimo','Frases Perfeitas')\n" +
                ",('Salvar a natureza é mais do que um dever dos seres humanos, é um favor a ele mesmo.','Anônimo','Frases Perfeitas')\n" +
                ",('Nos teus braços conheci o mais genuíno amor e mesmo que não dure para sempre jamais me arrependerei dos anos que vivi como seu namorado.','Anônimo','Frases Perfeitas')\n" +
                ",('A certeza da sua amizade é determinante para me sentir em paz mesmo nos instantes mais duros da vida.','Anônimo','Frases Perfeitas')\n" +
                ",('Pior do que se decepcionar, é saber que nosso amor nunca mais voltará a ser o mesmo.','Anônimo','Frases Perfeitas')\n" +
                ",('Ficar solteiro é descobrir que um monte de pessoas se preocupam mais com seu futuro do que você mesmo.','Anônimo','Frases Perfeitas')\n" +
                ",('Mesmo gostando de você eu optei por gostar ainda mais de mim. Meu ex e amigo, eu torço pela sua felicidade!','Anônimo','Frases Perfeitas')\n" +
                ",('Pare e mude seu rumo porque para as coisas melhorarem você precisa dar mais e mais de você mesmo!','Anônimo','Frases Perfeitas')\n" +
                ",('Mesmo que tamanho ainda seja pequeno, já é mais que gigante em sentimento. \uD83D\uDC76❤️','Anônimo','Frases Perfeitas')\n" +
                ",('Pessoas positivas é o segredo das famílias mais felizes apenas é necessário que todos remem para o mesmo lado.','Anônimo','Frases Perfeitas')\n" +
                ",('Mesmo que hoje não seja o mais incrível dos dias, sempre podemos nos apoiar na esperança de que amanhã será melhor.','Anônimo','Frases Perfeitas')\n" +
                ",('Todas as situações, mesmo as mais terríveis, têm coisas positivas. Cabe-nos a nós descobrir o lado positivo de cada situação.','Anônimo','Frases Perfeitas')\n" +
                ",('Como é bom saber que posso contar com o seu apoio, mesmo nas situações mais delicadas. Além de minha cunhada você também é uma grande amiga!','Anônimo','Frases Perfeitas')\n" +
                ",('Se a gente falasse menos, talvez compreendesse mais.','Luiz Melodia','Frases Perfeitas')\n" +
                ",('A luz que emana de mim é poderosa demais e irá me iluminar mesmo diante dos caminhos mais escuros.','Anônimo','Frases Perfeitas')\n" +
                ",('Criatividade é permitir a si mesmo cometer erros. Arte é saber quais erros manter.','Scott Adams','Frases Perfeitas')\n" +
                ",('Os princípios mais importantes podem e devem ser inflexíveis.','Abraham Lincoln','Frases Perfeitas')\n" +
                ",('As dívidas são bonitas nos moços de vinte e cinco anos mais tarde, ninguém lhas perdoa.','Honoré de Balzac','Frases Perfeitas')\n" +
                ",('A dor possui um grande poder educativo: faz-nos melhores, mais misericordiosos, mais capazes de nos recolher em nós mesmos e persuade-nos de que esta vida não é um divertimento, mas um dever.','Cesare Cantú','Frases Perfeitas')\n" +
                ",('Ser você mesmo em um mundo que está constantemente tentando fazer de você outra coisa é a maior realização.','Ralph Waldo Emerson','Frases Perfeitas')\n" +
                ",('Quando, em seu desespero, não deixe de refletir com a sabedoria da natureza, onde esta consegue saciar a sede e fertilizar as florestas com suas águas cristalinas, depois da mais negra das tempestades','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('Uma alma nobre, sofre muito mais pelo peso das adversidades alheias, do que pelas próprias, pois ela não as carregam nos ombros, mas sim no coração. Um sofrimento físico passa, mas o coração não esquece.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('Geralmente erra mais quem decide cedo do que quem decide tarde mas, depois de tomada a decisão, é necessário recuperar o atraso da sua execução.','Francesco Guicciardin','Frases Perfeitas')\n" +
                ",('O avarento, por mais dinheiro que tenha guardado, aparenta viver sempre na pobreza. Ele nunca demonstrar o que possui, para deixar claro o fato de nada ter para doar.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('Por cultura entendo a mais intensa vida interior, a de mais batalha, a de mais inquietação, a de mais ânsia.','Miguel de Unamo','Frases Perfeitas')\n" +
                ",('O segredo no negócio é saber algo que mais ninguém sabe.',' Aristóteles Onassis','Frases Perfeitas')\n" +
                ",('Duvide de si mesmo e você duvidará de tudo que vê. Julgue a si mesmo e você verá juízes por toda parte. Mas se você ouve o som de sua própria voz, você consegue elevar-se acima da dúvida e do julgamento. E você consegue ver eternamente.','Nancy Kerrigan','Frases Perfeitas')\n" +
                ",('Teu beijo é mais lindo que o mar e céu, teu beijo é mais doce que o mel. Te abraço e o tempo parece voar teu beijo tem gosto de amor, então me beije por favor!','Anônimo','Frases Perfeitas')\n" +
                ",('O segredo está em mostrarmos à vida que somos mais duros do que ela.','Anônimo','Frases Perfeitas')\n" +
                ",('O mais importante da vida não é a situação em que estamos, mas a direção para a qual nos movemos.','Oliver Wendell Holmes','Frases Perfeitas')\n" +
                ",('Não generalize, bons conselhos existem, só depende de você saber a quem pedir, e ter o discernimento necessário para analisar sua opinião com a de outrem, pois por princípio a sua será sempre mais confiável.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('O homem é um animal com instintos primários de sobrevivência. Por isso, seu engenho desenvolveu-se primeiro e a alma depois, e o progresso da ciência está bem mais adiantado que seu comportamento ético.','Charles Chaplin','Frases Perfeitas')\n" +
                ",('Duas pessoas têm vivido em você por toda a sua vida. Uma é o ego, tagarela, exigente, histérico, calculista a outra é o ser espiritual escondido, cuja silenciosa voz de sabedoria você somente ouviu ou reparou raramente - você revela em si mesmo o seu próprio guia sábio','Sogyal Rinpoche','Frases Perfeitas')\n" +
                ",('Quem tem um amigo, mesmo que um só, não importa onde se encontre, jamais sofrerá de solidão poderá morrer de saudades, mas não estará só.','Amir Klink','Frases Perfeitas')\n" +
                ",('Em economia, é fácil explicar o passado. Mais fácil ainda é predizer o futuro. Difícil é entender o presente.','Joelmir Beting','Frases Perfeitas')\n" +
                ",('Não se engane, pois mesmo a morte, não quita todas as naturezas de dívidas, ainda poderá ter muito que acertar com aquele, que sempre esteve ao seu lado, dando lhe condições para quitares outras dívidas, e foste por ti ignorado.','Ivan Teorilang','Frases Perfeitas')\n" +
                ",('Mesmo caminhando entre espinhos e com muitas pedras nos caminhos continue caminhando com coragem e confie no poder Daquele que é maior. Tenha um maravilhoso dia!','Anônimo','Frases Perfeitas')\n" +
                ",('Aquele que se analisou a si mesmo, está deveras adiantado no conhecimento dos outros.','Denis Diderot','Frases Perfeitas')\n" +
                ",('Não espero socorro de Deus. Deus não existe para ficar tirando a gente de apuros. É para dividir prazeres e alegrias.','Amir Klink','Frases Perfeitas')\n" +
                ",('Mais um ano de vida é mais sabedoria e experiências vividas. Parabéns pelo seu aniversário e que complete muitos mais!','Anônimo','Frases Perfeitas')\n" +
                ",('Assim como os pássaros, precisamos aprender a superar os desafios que nos são apresentados, para alçarmos voos mais altos.','Dirk Wolter','Frases Perfeitas')\n" +
                ",('Mesmo que meu mundo pareça estar a desabar, eu não vou desistir, pois sei que Deus sempre cuidará de mim.','Anônimo','Frases Perfeitas')\n" +
                ",('Bom dia, princesa! Que nossa paixão evolua para algo maior e nossa união fique ainda mais forte.','Anônimo','Frases Perfeitas')\n" +
                ",('Talvez as melhores amizades sejam aquelas em que haja muita discussão, muita disputa e mesmo assim muito afeto.','George Eliot','Frases Perfeitas')\n" +
                ",('Mesmo quando vocês são derrotados podem criar uma causa para a vitória futura, e há ocasião sem que, embora vençam, podem criar uma causa para uma derrota futura.','Jossei Toda','Frases Perfeitas')\n" +
                ",('Na prosperidade é muito fácil encontrar amigos, na adversidade não há nada mais difícil.','Epiteto','Frases Perfeitas')\n" +
                ",('Escrevi o teu nome em todas as paredes do meu coração, em letras bem grandes. Assim, se alguém conseguir entrar, vai saber que ele já tem dono.','Anônimo','Frases de Amor')\n" +
                ",('Eu enfrentaria o mundo todo com uma só mão, se você me prometesse que estaria segurando a outra.','Anônimo','Frases de Amor')\n" +
                ",('Se um dia tiver que escolher entre o mundo e o amor lembre-se: se escolher o mundo ficará sem o amor, mas se escolher o amor com ele você conquistará o mundo.','Albert Einstein','Frases de Amor')\n" +
                ",('De noite sonho contigo, de dia penso em ti, esquecer-te não consigo desde o dia em que te vi.','Anônimo','Frases de Amor')\n" +
                ",('A distância me faz sofrer e às vezes me faz chorar, mas nada nesse mundo vai me fazer deixar de te amar.','Anônimo','Frases de Amor')\n" +
                ",('Se sentir um vento gelado passar, é um beijo meu que está indo aí só para lhe provocar frio e você me chamar para lhe aquecer com meu coração.','Anônimo','Frases de Amor')\n" +
                ",('Um momento não é tudo... Mas você é tudo em um só momento.','Anônimo','Frases de Amor')\n" +
                ",('Te amo, não somente pelo que és, mas pelo que sou quando estou contigo! Te amo, porque puseste a mão na minha alma e passaste por debaixo das minhas fraquezas e com teu amor fizeste sair à luz toda a beleza que ninguém antes de ti conseguiu encontrar.','Anônimo','Frases de Amor')\n" +
                ",('Não ame pela beleza, pois um dia ela acaba. Não ame por admiração, pois um dia você se decepciona. Ame apenas, pois o tempo nunca pode acabar com um amor sem explicação.','Madre Teresa de Calcutá','Frases de Amor')\n" +
                ",('As palavras podem te fazer sorrir, mas só o amor pode te fazer mudar.','Aristides Wanderley','Frases de Amor')\n" +
                ",('O amor verdadeiro é aquele que surge de repente, quando menos esperávamos, e fica para sempre.','Anônimo','Frases de Amor')\n" +
                ",('Se entre as rochas pode nascer uma flor, porque não da amizade um grande amor.','Anônimo','Frases de Amor')\n" +
                ",('A vida nos oferece muitos caminhos, mas apenas o que leva ao amor esconde a verdadeira felicidade.','Anônimo','Frases de Amor')\n" +
                ",('O amor não é feito de trocas de olhares mas de olharmos juntos na mesma direção.','Anônimo','Frases de Amor')\n" +
                ",('O amor não tem tempo para acontecer, só acontece uma vez, e não acaba, se você acha que ele já aconteceu e lamenta por ter acabado é por que ele nem começou.','Ivan Teorilang','Frases de Amor')\n" +
                ",('Não importa a distância que nos separa, mas sim o amor que nos une.','Anônimo','Frases de Amor')\n" +
                ",('O tempo apaga as feridas, mas não um grande amor. A distância separa dois corpos, mas não duas almas.','Anônimo','Frases de Amor')\n" +
                ",('Nunca chore por amor, pois quem realmente merecer suas lágrimas nunca lhe fará chorar!','Anônimo','Frases de Amor')\n" +
                ",('Não fico triste por não tê-la fisicamente, só o fato de tê-la em meu coração é o suficiente para suprir o amor que sinto por você!','Anônimo','Frases de Amor')\n" +
                ",('O amor é a única qualidade que muitos desejam mas poucos sabem usá-la.','José Aristides','Frases de Amor')\n" +
                ",('Basta um verdadeiro amor para unir o que antes foi quebrado.','José Aristides','Frases de Amor')\n" +
                ",('A maior dor do amor é quando sabemos que ele deve morrer, mas não temos coragem de matá-lo.',' Ewerson','Frases de Amor')\n" +
                ",('Liberdade! Não julgue um amor futuro pelo sofrimento de um passado. Os sentimentos devem estar sempre em liberdade!','Ewerson','Frases de Amor')\n" +
                ",('O primeiro amor é aquele que fere e não deixa cicatriz.','Osmar Sampaio de Almeida','Frases de Amor')\n" +
                ",('O amor se renova e fortalece no namoro do dia a dia.','Osmar Sampaio de Almeida','Frases de Amor')\n" +
                ",('Não importa se os olhos ou a mente não entendem, as razões do amor pertencem apenas ao coração.','Anônimo','Frases de Amor')\n" +
                ",('Não foi preciso muito para eu perceber que tudo ia dar em amor. Na verdade, me apaixonei por você desde nosso primeiro olhar.','Anônimo','Frases de Amor')\n" +
                ",('Quando eu falo “te amo!” eu falo verdade e quando eu sinto seu amor eu conheço o sentido da vida.','Anônimo','Frases de Amor')\n" +
                ",('O amor nem sempre traz prazer ou alegria, às vezes ele chega recheado de decepções e amarguras!','Anônimo','Frases de Amor')\n" +
                ",('O amor não é apenas um sentimento que nos faz felizes o amor é a própria personificação da felicidade e lutar por ele é desfrutar plenamente da vida.','Anônimo','Frases de Amor')\n" +
                ",('Amo-te com todo meu coração, toda minha alma, e assim será para sempre, pois amor tão grande não tem data para acabar.','Anônimo','Frases de Amor')\n" +
                ",('Não adianta procurar o amor, pois é ele quem nos encontra, quer estejamos preparados para ele ou não.','Anônimo','Frases de Amor')\n" +
                ",('O amor é como uma bolinha de mercúrio na mão. Se a palma ficar aberta, permanece. Tente apreendê-la que a verá escapar.','Dorothy Parker','Frases de Amor')\n" +
                ",('O amor faz despertar sorrisos em rostos tristes e dá vida a corações outrora quebrados.','Anônimo','Frases de Amor')\n" +
                ",('Nenhum amor é impossível de acontecer, e quanto mais proibido for, mais apetecível será!','Anônimo','Frases de Amor')\n" +
                ",('O amor é um sentimento grandioso demais para não ser eterno. Se não durou para sempre, então é porque não era amor.','Anônimo','Frases de Amor')\n" +
                ",('O verdadeiro amor nunca acaba e no coração de quem o sente ele é eterno como o tempo!','Anônimo','Frases de Amor')\n" +
                ",('Quando um amor morre, às vezes a nossa maior tristeza é saber que aquela pessoa que um dia amamos na verdade nunca existiu.','Anônimo','Frases de Amor')\n" +
                ",('Me sinto a pessoa mais sortuda do mundo por poder chamar você de meu namorado! Amo você, amor!','Anônimo','Frases de Amor')\n" +
                ",('Somos dois seres imperfeitos, mas que juntos fazem um amor perfeito. Te amo!','Anônimo','Frases de Amor')\n" +
                ",('Nesta e nas próximas vidas, você sempre será o meu grande amor.','Anônimo','Frases de Amor')\n" +
                ",('Nosso amor não é perfeito, mas são as suas imperfeições que o tornam tão especial e perfeito para nós.','Anônimo','Frases de Amor')\n" +
                ",('O amor pode ser incontrolável ele tanto provoca lágrima constante como risada sem fim.','Anônimo','Frases de Amor')\n" +
                ",('Só porque sinto amor por você, eu seria capaz de esperar uma vida inteira por um só minuto da sua atenção.','Anônimo','Frases de Amor')\n" +
                ",('O amor só faz sentido quando provoca felicidade e coloca o tempo todo sorrisos doces nos rostos dos apaixonados.','Anônimo','Frases de Amor')\n" +
                ",('Sei que é amor verdadeiro quando a despedida dói, e depois do adeus a alma continua chorando a cada memória revivida.','Anônimo','Frases de Amor')\n" +
                ",('O amor não é um sentimento de interesses egoístas. Quem ama de verdade, apenas espera receber manifestações de carinho similares às que se preocupa em dar.','Anônimo','Frases de Amor')\n" +
                ",('A distância põe o amor à prova, mas jamais consegue abalar aquele que é verdadeiro.','Anônimo','Frases de Amor')\n" +
                ",('O amor não é um estado da alma nem dois corações apaixonados, o amor é uma prova de vida.','Anônimo','Frases de Amor')\n" +
                ",('Não sou exigente tudo que peço da vida é que seu amor e sua companhia nunca me sejam negados.','Anônimo','Frases de Amor')\n" +
                ",('De todas as formas de amor a mais bela é a transmitida pelo coração sem necessidade de uma só palavra.','Anônimo','Frases de Amor')\n" +
                ",('O amor é a ponte de safena que mantém dois corações batendo juntos, não importa a distância.','Anônimo','Frases de Amor')\n" +
                ",('Podem falar que não vai dar certo e até que é proibido demais, mas nós sabemos que nosso amor é incondicional!','Anônimo','Frases de Amor')\n" +
                ",('Só quem conhece a saudade valoriza o amor de verdade. Até breve, meu bem!','Anônimo','Frases de Amor')\n" +
                ",('A vida me presenteou com um lindo amor que quero cuidar e preservar pelo resto dos meus dias.','Anônimo','Frases de Amor')\n" +
                ",('O amor supera tudo, seja uma briga de namorados ou uma prova de fogo entre casados.','Anônimo','Frases de Amor')\n" +
                ",('Nenhum amor é proibido se dois corações o permitirem.','Anônimo','Frases de Amor')\n" +
                ",('Nem a distância separa dois corações ligados pelo amor.','Anônimo','Frases de Amor')\n" +
                ",('Dizer que esquecemos um grande amor é mentir, pois algo tão intenso e verdadeiro nunca se apaga da memória e às vezes nem mesmo do coração.','Anônimo','Frases de Amor')\n" +
                ",('A maior loucura da vida é o amor e a maior loucura do amor é amar e ser amado!','Anônimo','Frases de Amor')\n" +
                ",('Quando o amor é verdadeiro, não existe distância que o enfraqueça, pessoas que o impeçam de crescer, nem tempo que o faça cair no esquecimento.','Anônimo','Frases de Amor')\n" +
                ",('Na batalha da vida, nosso amor é o cessar-fogo!','Anônimo','Frases de Amor')\n" +
                ",('Quando o amor é verdadeiro, nem a maior de todas as distâncias tem o poder de desestabilizar a sua existência.','Anônimo','Frases de Amor')\n" +
                ",('O Amor é como nossa sombra que nos cerca por toda a parte e nos segue por todo caminho.','Anônimo','Frases de Amor')\n" +
                ",('Prefiro ser louco de amor do que sóbrio de nada e isento de sentimentos!','Anônimo','Frases de Amor')\n" +
                ",('As mais perfeitas palavras de amor foram inspiradas pela beleza do seu sorriso.','Anônimo','Frases de Amor')\n" +
                ",('Sem loucura não há amor, porque amor é coisa de doido, de amante, de rebelde apaixonado.','Anônimo','Frases de Amor')\n" +
                ",('Meu amor por você é como visita de gente chata: nunca acaba!','Anônimo','Frases de Amor')\n" +
                ",('Quem inventou o amor deveria nos ter dado um coração maior, pois fica difícil conseguir conter no meu tudo aquilo que sinto por você.','Anônimo','Frases de Amor')\n" +
                ",('O amor eterno é aquele que dura para além da vida, e que perdura para além da eternidade.','Anônimo','Frases de Amor')\n" +
                ",('Seja maluco por um instante ou doido toda vida se for louco de amor por alguém.','Anônimo','Frases de Amor')\n" +
                ",('A distância faz sofrer um coração apaixonado, mas nada pode contra um amor que é forte e verdadeiro!','Anônimo','Frases de Amor')\n" +
                ",('O amor é o sentimento mais doce da vida! ??','Anônimo','Frases de Amor')\n" +
                ",('Eu olhei, eu escolhi, me apaixonei. Fiz de você o amor da minha vida!','Anônimo','Frases de Amor')\n" +
                ",('O nosso amor faz a vida valer a pena. ??','Anônimo','Frases de Amor')\n" +
                ",('Às vezes o amor se encontra no último lugar que pensamos procurar.','Anônimo','Frases de Amor')\n" +
                ",('Fizemos do amor nossa casa, e agora eu quero passar o resto da minha vida ao seu lado.','Anônimo','Frases de Amor')\n" +
                ",('O amor que sinto por você é o mais forte que existe e nada nem ninguém poderá apagar isso.','Anônimo','Frases de Amor')\n" +
                ",('Falam que nosso amor é proibido, mas não conhecem a liberdade com que nos amamos.','Anônimo','Frases de Amor')\n" +
                ",('Quem ama não só acredita no amor como também faz com que ele aconteça todos os dias na sua vida.','Anônimo','Frases de Amor')\n" +
                ",('De nada eu preciso se sempre a tiver ao meu lado. Meu amor, minha esposa, você é tudo para mim!','Anônimo','Frases de Amor')\n" +
                ",('Não importa se esse amor é proibido, até porque os milagres acontecem quando os desejamos intensamente!','Anônimo','Frases de Amor')\n" +
                ",('Amor de verdade dá risada junto, principalmente um do outro. ??','Anônimo','Frases de Amor')\n" +
                ",('Você é um amigo para todas as horas, um confidente dia após dia, o meu amor para toda vida!','Anônimo','Frases de Amor')\n" +
                ",('Meu amor, tudo que eu quero na vida é eu e você, dinheiro na conta, uma praia paradisíaca e nenhuma preocupação. Será que é pedir muito?','Anônimo','Frases de Amor')\n" +
                ",('É mais louco o que não ama do que o que prova o seu amor através de uma loucura.','Anônimo','Frases de Amor')\n" +
                ",('Lutar pelo amor é bom, mas alcançá-lo sem luta é melhor.','William Shakespeare','Frases de Amor')\n" +
                ",('Se o amor em si é já uma loucura e todos somos loucos, por que não cometer alguma loucura por amor?','Anônimo','Frases de Amor')\n" +
                ",('Não preciso ler a sua mão para ver quem aparece na sua linha do amor.','Anônimo','Frases de Amor')\n" +
                ",('Não importa se falam que seu amor é proibido, o que interessa é a verdade do seu sentimento!','Anônimo','Frases de Amor')\n" +
                ",('A decepção nos teus olhos diz tudo. Desculpa, amor. Não quero te ver assim triste nunca mais.','Anônimo','Frases de Amor')\n" +
                ",('O melhor modo de vida é respirar amor do início ao fim do dia.','Anônimo','Frases de Amor')\n" +
                ",('Não existem palavras para definir este sentimento nem meios para controlar este amor que sinto por você','Anônimo','Frases de Amor')\n" +
                ",('Não foi pela facilidade, mas sim pela força, que nosso amor prevaleceu.','Anônimo','Frases de Amor')\n" +
                ",('Sabemos que é amor quando perdemos a noção do tempo ao lado de alguém que queremos conosco para sempre.','Anônimo','Frases de Amor')\n" +
                ",('Para o amor da minha vida eu serei o melhor de mim mesmo e darei sempre minha alma e coração. Te amo, meu bem!','Anônimo','Frases de Amor')\n" +
                ",('É difícil superar um amor perdido, às vezes parece até impossível, mas com esperança e a atuação do tempo a felicidade acaba por aparecer.','Anônimo','Frases de Amor')\n" +
                ",('É mais louco o que ama em silêncio do que o que demonstra seu amor através da loucura dos instintos!','Anônimo','Frases de Amor')\n" +
                ",('Eu quero guardar você, cuidar o melhor que sei de você, pois nosso amor é o sentimento mais forte que existe na minha vida.','Anônimo','Frases de Amor')\n" +
                ",('Pode vir qualquer obstáculo, nosso amor irá superar tudo! ??','Anônimo','Frases de Amor')\n" +
                ",('Só o amor me faz sentir assim – desejar um segundo do seu abraço para depois não querer que ele tenha fim.','Anônimo','Frases de Amor')\n" +
                ",('Não permita que o avançar da idade retarde a intensidade das suas loucuras por amor!','Anônimo','Frases de Amor')\n" +
                ",('Não procure uma relação perfeita, as imperfeições do amor é que tornam tudo mais aliciante!','Anônimo','Frases de Amor')\n" +
                ",('Só me transformei na pessoa que sou hoje porque nosso amor foi capaz de me dar forças para superar minhas maiores dificuldades.','Anônimo','Frases de Amor')\n" +
                ",('Os momentos difíceis já não são mais intransponíveis pois tenho a força do seu amor para me ajudar a superá-los. Agradeço por ter você, meu amor!','Anônimo','Frases de Amor')\n" +
                ",('Amor perfeito não permite lágrima ou briga que não se transforme em sorriso ou paz!','Anônimo','Frases de Amor')\n" +
                ",('És tu, sempre foste tu, o grande amor da minha vida, o motivo maior da minha alegria. Amar-te é ser feliz!','Anônimo','Frases de Amor')\n" +
                ",('Acima de tudo, porém, revistam-se do amor, que é o elo perfeito.','Colossenses 3:14','Frases de Amor')\n" +
                ",('É uma história que não tem fim, esta de amor estre nós dois. Meu bem, você é tudo para mim!','Anônimo','Frases de Amor')\n" +
                ",('Será que o amor é assim tão invisível para algumas pessoas?','Anônimo','Frases de Amor')\n" +
                ",('Se o amor for verdadeiro será eterno, e pouco importa quantos desafios a vida lhe colocar!','Anônimo','Frases de Amor')\n" +
                ",('O amor é tão forte que as palavras parecem um grãozinho de areia nesse mar de emoções.','Anônimo','Frases de Amor')\n" +
                ",('Você foi embora, mas esse não é o meu fim, porque o amor que eu tinha de sobra, agora sobrou todo para mim.','Anônimo','Frases de Amor')\n" +
                ",('Loucura de amor é como crime em legítima defesa: até pode dar errado mas não tem como não cometer!','Anônimo','Frases de Amor')\n" +
                ",('Sempre achei que amor perfeito só existia em novela até ao momento que encontrei você!','Anônimo','Frases de Amor')\n" +
                ",('Nenhuma loucura é sinal de sanidade, nenhuma menos a que é cometida por amor!','Anônimo','Frases de Amor')\n" +
                ",('Se o amor é engraçado eu não sei, mas que nos faz ficar rindo como bobos, isso faz.','Anônimo','Frases de Amor')\n" +
                ",('Entre lágrimas e sorrisos eu prefiro força para superar qualquer prova de fogo que o amor me ofereça.','Anônimo','Frases de Amor')\n" +
                ",('Quando o amor é assim tão grande, não existe distância que o apague.','Anônimo','Frases de Amor')\n" +
                ",('Nosso amor não é proibido, até porque amor é liberdade, paz e felicidade.','Anônimo','Frases de Amor')\n" +
                ",('Nem muitas águas conseguem apagar o amor os rios não conseguem levá-lo na correnteza. Se alguém oferecesse todas as riquezas da sua casa para adquirir o amor, seria totalmente desprezado.','Cânticos 8:7 ','Frases de Amor')\n" +
                ",('Esse amor pode nunca mais voltar, mas você pode sempre se erguer e superar esta etapa tão difícil.','Anônimo','Frases de Amor')\n" +
                ",('Eu não sei se te amo, só sei que meu coração bate forte quando passas por mim. Será isto o amor?','Anônimo','Frases de Amor')\n" +
                ",('Nenhum amor verdadeiro vai ceder perante os obstáculos nem enfraquecer diante das proibições.','Anônimo','Frases de Amor')\n" +
                ",('Nenhum louco tem como justificar sua loucura, a não ser que a cometa por amor','Anônimo','Frases de Amor')\n" +
                ",('Eu sei que errei, mas não vou descansar até você me perdoar. Amor, por favor, me desculpe!','Anônimo','Frases de Amor')\n" +
                ",('Só o amor é eterno, tudo o resto são pormenores!','Anônimo','Frases de Amor')\n" +
                ",('A perfeição nunca me atraiu, prefiro um amor cheio de erro como o nosso do que algo exemplar com outra pessoa.','Anônimo','Frases de Amor')\n" +
                ",('Todo amor tem algo de proibido, não fosse ele tão apetecível.','Anônimo','Frases de Amor')\n" +
                ",('Todo amor verdadeiro vem acompanhado por um desejo intenso de sermos eternos ao lado de quem amamos.','Anônimo','Frases de Amor')\n" +
                ",('Quanto maior for a proibição no amor maior será o desejo de o viver!','Anônimo','Frases de Amor')\n" +
                ",('Amadurecer é também superar as mágoas e as dores do amor.','Anônimo','Frases de Amor')\n" +
                ",('Uma loucura de amor é mais saudável do que uma normalidade solitária.','Anônimo','Frases de Amor')\n" +
                ",('Aos olhos de muitos nosso amor pode ser proibido, mas nos nossos corações ele é legítimo e o melhor que me aconteceu na vida.','Anônimo','Frases de Amor')\n" +
                ",('Pensei errado, agi errado. Só lamento não poder voltar no tempo. Amor, por favor, me desculpe!','Anônimo','Frases de Amor')\n" +
                ",('Amor é para sentir e não para entender!','Anônimo','Frases de Amor')\n" +
                ",('As relações para serem saudáveis têm de conhecer loucuras e outras provas de amor.','Anônimo','Frases de Amor')\n" +
                ",('Há sempre uma saída para um romance que não deu certo, seja a passagem do tempo que tudo cura ou um amor maior que aparece.','Anônimo','Frases de Amor')\n" +
                ",('Peço desculpa. Você sabe a dimensão do meu amor e que tudo que fiz de errado foi sem intenção.','Anônimo','Frases de Amor')\n" +
                ",('Fui insensível, mas não tive intenção. Eu prometo não errar de novo, amor!','Anônimo','Frases de Amor')\n" +
                ",('Vale sempre a pena lutar para que o mundo seja um lugar com mais paz e amor.','Anônimo','Frases de Amor')\n" +
                ",('O amor materno é aquele que nunca nos abandona, não importa a distância ou o tempo.','Anônimo','Frases de Amor')\n" +
                ",('Se é amor que recebe, agradeça com mais e mais amor. Só assim vale a pena viver a vida!','Anônimo','Frases de Amor')\n" +
                ",('Uma parte de você está comigo, uma parte de mim está com você. Estamos longe, mas mais unidos que nunca, meu amor.','Anônimo','Frases de Amor')\n" +
                ",('Meus dias nunca mais foram os mesmo depois que você entrou na minha vida, pois o amor que você trouxe consigo fez de mim a pessoa mais feliz do mundo. Amo você, marido!','Anônimo','Frases de Amor')\n" +
                ",('O amor não é coisa do coração, mas sim do estômago, porque sempre que vejo você sinto dor de barriga!','Anônimo','Frases de Amor')\n" +
                ",('Agora que encontrei você, não abro mão deste amor único e verdadeiro!','Anônimo','Frases de Amor')\n" +
                ",('Prometo amar você com quase todo meu amor, porque tenho que guardar um espaço para o futebol, né. ??','Anônimo','Frases de Amor')\n" +
                ",('Esteja você perto ou longe, sorridente ou triste esteja como estiver, será sempre meu grande amor!','Anônimo','Frases de Amor')\n" +
                ",('Uma história de amor como a nossa merece ser para toda vida. ?','Anônimo','Frases de Amor')\n" +
                ",('Meus olhos foram criados apenas para te enxergar, meus lábios para te beijar e meu coração para te amar.','Anônimo','Frases de Amor')\n" +
                ",('Amar não é querer alguém construido, amar é construir alguém querido.','Anônimo','Frases de Amor')\n" +
                ",('Às vezes, aquilo que parece ser o fim é na verdade o recomeço de algo melhor para nós.','Anônimo','Frases de Amor')\n" +
                ",('O único momento que não estou pensando em você é quando estou dormindo, porque aí eu não estou pensando, estou sonhando.','Anônimo','Frases de Amor')\n" +
                ",('Ame quem te ama, não quem te faz sorrir, pois quem sorri te engana e quem te ama sofre por ti.','Anônimo','Frases de Amor')\n" +
                ",('Do seu lado a felicidade é meu destino. Te amo, meu bem! ???','Anônimo','Frases de Amor')\n" +
                ",('Se eu pudesse viveria minha vida novamente, só para poder encontrar você mais cedo, e assim amar você mais tempo!','Anônimo','Frases de Amor')\n" +
                ",('Certas coisas não devemos esconder, um lindo beijo ou até mesmo um olhar para outro ser seria igual tentar impedir a chuva de deixar de chover.','Bruna Becker','Frases de Amor')\n" +
                ",('Se quiser me reconquistar, não tente descobrir a razão que te levou a me perder, e sim a razão que me levou a te amar.','Diego Marchi','Frases de Amor')\n" +
                ",('Não se ama muito nem se ama pouco, simplesmente se ama!','Hugo Jambeiro','Frases de Amor')\n" +
                ",('A lição pincipal é saber que somente livres as pessoas são capazes de amar.','Anônimo','Frases de Amor')\n" +
                ",('Você é o ar que respiro, a água que bebo e o alimento do meu coração. E eu te amo cada vez mais, meu bem!','Anônimo','Frases de Amor')\n" +
                ",('O meu erro não foi te amar como eu amo, meu erro foi não dizer a tempo o quanto eu te amo!',' Gean Love','Frases de Amor')\n" +
                ",('Sem você minha vida seria um mar de nada e um show de silêncio. Eu te amo!','Anônimo','Frases de Amor')\n" +
                ",('Eu te amo como nunca pensei amar alguém e todos os dias encontro novas razões para esse sentimento aumentar.','Anônimo','Frases de Amor')\n" +
                ",('Ama quem te ama. Esquece quem te esqueceu, prepara-te para o futuro, pois o que vem por aí sou Eu.','Anônimo','Frases de Amor')\n" +
                ",('Deveria ser proibido amar tanto alguém do jeito que amo você, porque só eu sei o que sofro por não ter você!','Anônimo','Frases de Amor')\n" +
                ",('Uma vida inteira à procura do quê quando a melhor coisa está batendo forte dentro de você?','Anônimo','Frases de Amor')\n" +
                ",('Se você é capaz de amar a pessoa errada, imagine o que pode sentir pela certa.','Anônimo','Frases de Amor')\n" +
                ",('Vou mudar o meu status no facebook, em vez de \"em um relacionamento sério\" vou colocar \"em um relacionamento leve\", porque te amar me faz flutuar','Anônimo','Frases de Amor')\n" +
                ",('Se você pudesse ler meus pensamentos, entenderia o sorriso no meu rosto toda vez que olho na sua direção.','Anônimo','Frases de Amor')\n" +
                ",('O romance acabou mas não lhe desejo mal, apenas distância.','Anônimo','Frases de Amor')\n" +
                ",('Os melhores momentos da minha vida sempre são ao seu lado, meu melhor amigo e namorado!','Anônimo','Frases de Amor')\n" +
                ",('A distância afasta os corpos, mas jamais separa os corações daqueles que se amam.','Anônimo','Frases de Amor')\n" +
                ",('Não existe maior alegria que olharmos para quem temos ao nosso lado e percebermos que amar essa pessoa foi a melhor decisão da nossa vida.','Anônimo','Frases de Amor')\n" +
                ",('Amar é não ter medo de cometer uma loucura para provar seu sentimento!','Anônimo','Frases de Amor')\n" +
                ",('Sinto saudade de você, mas prometo que esta distância um dia vai desaparecer!','Anônimo','Frases de Amor')\n" +
                ",('Amar à distância é viver a saudade com esperança.','Anônimo','Frases de Amor')\n" +
                ",('Você não faz a menor ideia de como eu sou feliz ao seu lado. E eu não tenho a menor ideia de como explicar. Eu te amo!','Anônimo','Frases de Amor')\n" +
                ",('Esta distância ainda me mata, pois são tão grandes as saudades que eu sinto de você!','Anônimo','Frases de Amor')\n" +
                ",('Escolha amar todos os dias da sua vida.','Anônimo','Frases de Amor')\n" +
                ",('O que aconteceu já passou e foi graças às desilusões que me tornei mais forte e superei coisas que jamais imaginaria ter superado!','Anônimo','Frases de Amor')\n" +
                ",('Quem ama é capaz de abdicar da sua própria vida para cuidar do coração da pessoa que tem ao seu lado.','Anônimo','Frases de Amor')\n" +
                ",('Nenhuma distância é capaz de nos separar, pois o que temos está guardado em nossos corações.','Anônimo','Frases de Amor')\n" +
                ",('Posso não saber muita coisa na vida, mas existe uma coisa que não tenho dúvidas: eu amo minha esposa!','Anônimo','Frases de Amor')\n" +
                ",('Se você me vir sorrindo enquanto eu estiver dormindo, é porque estou sonhando com você.','Anônimo','Frases de Amor')\n" +
                ",('Você é o meu final feliz. Eu te amo','Anônimo','Frases de Amor')\n" +
                ",('Alguém que ama de verdade enxergará os defeitos da pessoa amada como particularidades que a tornam ainda mais especial.','Anônimo','Frases de Amor')\n" +
                ",('Atenção: quando eu falo “quer sair comigo?”, na verdade quero dizer “vamos passar a vida juntos?”.','Anônimo','Frases de Amor')\n" +
                ",('Que sorte eu tenho por ao meu lado estar a mulher dos meus sonhos. Te amo!','Anônimo','Frases de Amor')\n" +
                ",('Se tivesse o poder de encurtar distâncias estaria agora no calor dos seus braços.','Anônimo','Frases de Amor')\n" +
                ",('Aquela fase maravilhosa em que você verifica constantemente seu celular na expectativa de ter recebido uma mensagem de alguém muito especial.','Anônimo','Frases de Amor')\n" +
                ",('Estamos juntos e infinitamente apaixonados porque somos carinho, respeito e verdade. Marido, eu amo você como desde o primeiro dia!','Anônimo','Frases de Amor')\n" +
                ",('Pode o céu desabar sobre a minha cabeça, mas o que sobrar de mim continuará sempre a te amar eternamente.','Anônimo','Frases de Amor')\n" +
                ",('Se um dia você descobrir que a pessoa que sempre amou você não ama mais, é porque você não soube dar o valor que ela merecia.','Anônimo','Frases de Amor')\n" +
                ",('Ore, descanse e confie. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Se for, que seja. Se flor, floresça! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Prometo ser fiel, me amar, me respeitar todos os dias da minha vida. ','Anônimo','Frases para Whatsapp')\n" +
                ",('A prioridade deve ser sempre a felicidade. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando tudo se desfaz, é sinal de que devemos nos refazer. \uD83E\uDD19','Anônimo','Frases para Whatsapp')\n" +
                ",('É entre rasgos e remendos que vou seguindo. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Olhar pra trás só se for pra ter certeza de que o melhor foi ter seguido. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Se custa a sua paz, então é caro demais! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Remova tudo aquilo que atrasa o coração, escolha plantar e colher bons frutos. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Sigo por aí viajante, habitante de um lar sem muros. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu me abro sem medo para as mudanças que precisam acontecer na minha vida. ','Anônimo','Frases para Whatsapp')\n" +
                ",('É minha estrada, só minha. os outros podem andar ao meu lado. mas ninguém pode andar por mim… ','Anônimo','Frases para Whatsapp')\n" +
                ",('Que venham os novos tempos e a gente se permita viver o novo. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando você estiver concentrada em seguir seu caminho, todo o resto vai fluir. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Penso que o mundo faz parte de um sono profundo e cada um tem seu momento para despertar. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Apegue-se ao que te faz feliz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja o lado bom da vida! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Vá para onde o seu coração te levar. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Não se distancie da sua essência. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Na paz quero estar. ?','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida inteira é feita pra gente ser feliz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Somos instantes. Saiba fazer a diferença em cada um deles. ','Anônimo','Frases para Whatsapp')\n" +
                ",('A felicidade te espera, não vá se perder. \uD83C\uDF03','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja morada de sentimentos bons! ','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é entrega, disposição. ✌','Anônimo','Frases para Whatsapp')\n" +
                ",('Evoluir leva tempo. ⏳','Anônimo','Frases para Whatsapp')\n" +
                ",('Feita para ser o que quiser. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Vista-se de felicidade. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Tão leve, tão em paz... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Só faz sentido o que te faz sentir!','Anônimo','Frases para Whatsapp')\n" +
                ",('A maior sorte da vida é agradecer! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Onde fores feliz, fica.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorriso livre e alma leve.','Anônimo','Frases para Whatsapp')\n" +
                ",('A entrega é seu respirar. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Acorde, sorria, agradeça.','Anônimo','Frases para Whatsapp')\n" +
                ",('A essência transparece. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Você sempre pode, cabe a você querer.','Anônimo','Frases para Whatsapp')\n" +
                ",('Que todo mal vire amor!','Anônimo','Frases para Whatsapp')\n" +
                ",('É preciso sorrir! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Amadurecer é trocar razão por paz.','Anônimo','Frases para Whatsapp')\n" +
                ",('Liberdade é um desejo universal.','Anônimo','Frases para Whatsapp')\n" +
                ",('Se puderes olhar, vê. Se puderes ver, repara.','Anônimo','Frases para Whatsapp')\n" +
                ",('Energize-se.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ser morada de bons sentimentos!','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é agora, não vá se perder!','Anônimo','Frases para Whatsapp')\n" +
                ",('Em paz com tudo que chega e com tudo que se vai. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Toda luz plantada será colhida.','Anônimo','Frases para Whatsapp')\n" +
                ",('Preencher a vida com o que te toca a alma e só.','Anônimo','Frases para Whatsapp')\n" +
                ",('O analgésico da vida é o tempo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Certo mesmo é fazer aquilo que o coração manda! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Só acompanho o que me ilumina','Anônimo','Frases para Whatsapp')\n" +
                ",('Ser feliz é muito fácil, é só se entregar pra vida! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando todos forem promessas, seja atitude.','Anônimo','Frases para Whatsapp')\n" +
                ",('Que seja tudo coberto de bem querer. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Aprenda a evoluir sem se perder. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Caminho raro, coração claro! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Iluminar significa levar luz ao redor. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Gratidão eleva a vibração. ','Anônimo','Frases para Whatsapp')\n" +
                ",('A tempestade que sopra, te derruba ou te faz voar?!','Anônimo','Frases para Whatsapp')\n" +
                ",('A tempestade que sopra, te derruba ou te faz voar?!','Anônimo','Frases para Whatsapp')\n" +
                ",('Sem prender, só fluir. Sem voltar, só seguir.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sou feita de cicatriz e gratidão.','Anônimo','Frases para Whatsapp')\n" +
                ",('Mente tranquila, vida feliz.','Anônimo','Frases para Whatsapp')\n" +
                ",('Faço sentir. Isso me basta.','Anônimo','Frases para Whatsapp')\n" +
                ",('Minha fé é gigante, minha positividade ainda maior! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ame-se, aceite-se, liberte-se. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Felicidade: quando um coração repleto de vida transborda.','Anônimo','Frases para Whatsapp')\n" +
                ",('A luz que tu precisa tá dentro de você! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Escolher ser feliz é decisão que conforta o ser! ','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é agora, agradece e vai.  ','Anônimo','Frases para Whatsapp')\n" +
                ",('Faça do teu próprio coração tua zona de paz. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Perca-se nas coisas que você ama! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Cultive-se todos os dias. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Carregue dentro de si apenas o bem! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorria pra vida que ela te sorri de volta! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela orou e Deus a abraçou! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Busque no interior o seu abrigo...','Anônimo','Frases para Whatsapp')\n" +
                ",('Ponha seu coração em cada passo e gesto. ','Anônimo','Frases para Whatsapp')\n" +
                ",('E sendo, transbordo! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Na alma ninguém manda, ela fica onde se encanta. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja sua poesia preferida','Anônimo','Frases para Whatsapp')\n" +
                ",('Há tantas razões bonitas para ser feliz...','Anônimo','Frases para Whatsapp')\n" +
                ",('Transpirava alegria, era dona dos seus passos.','Anônimo','Frases para Whatsapp')\n" +
                ",('Siga na paz, eleve a alma.','Anônimo','Frases para Whatsapp')\n" +
                ",('Encontre em si próprio o melhor lugar pra repousar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Pra ser verdade, basta acreditar... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Existe uma beleza imensurável em ser exatamente quem você é!','Anônimo','Frases para Whatsapp')\n" +
                ",('Aprendeu que todo amor pode acabar, menos o próprio.','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida nos obriga a crescer. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Conhece-te a ti mesmo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Rega-te de amor próprio e seja teu próprio jardim.','Anônimo','Frases para Whatsapp')\n" +
                ",('Pertenço ao lugar onde me sinto livre! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Longe se vai quem acredita.','Anônimo','Frases para Whatsapp')\n" +
                ",('Reencontre-se, reequilibre-se, reconstrua-se. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ser importante é do ego, ser feliz é da alma.','Anônimo','Frases para Whatsapp')\n" +
                ",('O que não te traz paz, não te traz bem! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Coragem é agir com o coração. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Viva simples. Ame grande! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ninguém perde por dar amor.','Anônimo','Frases para Whatsapp')\n" +
                ",('A felicidade não entra em portas fechadas... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorrindo pra onde a sorte me sorrir.','Anônimo','Frases para Whatsapp')\n" +
                ",('Luz própria, uma alma pura e um sorriso sincero.','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é sobre quem se torna durante a caminhada!','Anônimo','Frases para Whatsapp')\n" +
                ",('Nunca mude o que te faz raro!','Anônimo','Frases para Whatsapp')\n" +
                ",('O segredo é cultivar-se! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Só é feliz quem sabe o que quer ','Anônimo','Frases para Whatsapp')\n" +
                ",('Faço de mim casa de sentimentos bons.','Anônimo','Frases para Whatsapp')\n" +
                ",('Paz, felicidade e amor próprio. O resto é resto.','Anônimo','Frases para Whatsapp')\n" +
                ",('Minha consciência limpa sempre valeu mais...','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu sou a paz e só a luz me move.','Anônimo','Frases para Whatsapp')\n" +
                ",('Viver é a arte de tentar. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Colecionando sorrisos, amores, momentos! ','Anônimo','Frases para Whatsapp')\n" +
                ",('É na simplicidade que se encontra o essencial.','Anônimo','Frases para Whatsapp')\n" +
                ",('Um riso atrás do outro, é assim que a vida tem que ser. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Meu coração pulsa cores, sons e amores. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Revide sorrisos, compre paz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Em um mundo de aparências, quem vive de essência é realmente feliz','Anônimo','Frases para Whatsapp')\n" +
                ",('Só sabe que estagnar não é uma opção','Anônimo','Frases para Whatsapp')\n" +
                ",('Se liberta que o mundo é teu, e de ti ninguém tira.','Anônimo','Frases para Whatsapp')\n" +
                ",('Até onde posso, vou deixando o melhor de mim...','Anônimo','Frases para Whatsapp')\n" +
                ",('Bem-me-quero, me basto. ','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é um sonho bonito! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Proteja sua paz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Sou Metade esperança, metade agonia!','Anônimo','Frases para Whatsapp')\n" +
                ",('Apenas seja! Seja o que tiver de ser, seja o que você veio pra ser! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O pensamento leve faz a gente voar! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O meu coração transborda liberdade! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja sempre MAIS que o MENOS que te oferecem! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Leve amor, não pesa!','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é muito curta pra não viver sorrindo por aí! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Leve só o que há de bom em você.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorriso é pouco, eu gosto de quem me deixa em festa por dentro.','Anônimo','Frases para Whatsapp')\n" +
                ",('Viva bem, não de bens.','Anônimo','Frases para Whatsapp')\n" +
                ",('Não tenho pressa, nem dono.','Anônimo','Frases para Whatsapp')\n" +
                ",('Alma viva, mente sã.  Onde há calma, observo. Onde há alma, absorvo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Boas energias sempre encontram o caminho certo...','Anônimo','Frases para Whatsapp')\n" +
                ",('Escolher ser feliz é decisão que conforta o ser. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Florescer exige passar por todas as estações! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Melhor amar do que ser amargo!','Anônimo','Frases para Whatsapp')\n" +
                ",('Ser Simples é o que te faz grande! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Alma leve e coração agradecido. Sigo em paz','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorrisos são sempre bem vindos!','Anônimo','Frases para Whatsapp')\n" +
                ",('Sonhar alto encolhe os nossos medos! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Nem tente... não se pode aprisionar quem tem asas!','Anônimo','Frases para Whatsapp')\n" +
                ",('As coisas simples são as principais fontes de alegria.','Anônimo','Frases para Whatsapp')\n" +
                ",('Independente da dor, seja sempre flor... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Vou na fé, guiada pelas boas vibrações. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Se o pensamento é positivo, a maré é sempre boa. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Viver é saltar, se jogar entre possibilidades! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Se a vista está ruim, mude a perspectiva! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Nenhuma felicidade é maior que a paz de espírito.. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Concentre-se no que está buscando, não no que está deixando para trás.','Anônimo','Frases para Whatsapp')\n" +
                ",('Aprenda a apreciar as voltas que o mundo dá. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Permita-se sentir','Anônimo','Frases para Whatsapp')\n" +
                ",('O que busquei e não encontrei, me tornei. ','Anônimo','Frases para Whatsapp')\n" +
                ",('O fluxo da vida é o mesmo, cabe a você ser caos ou calmaria.','Anônimo','Frases para Whatsapp')\n" +
                ",('Se até minha risada é exagerada, imagina meu amor. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Os contidos que me perdoem mas eu nasci pra ser intenso! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Só é bonito quem vê bem com o coração.','Anônimo','Frases para Whatsapp')\n" +
                ",('Vivendo o hoje, que é onde a vida acontece!','Anônimo','Frases para Whatsapp')\n" +
                ",('Um coração grato onde reina Deus, o Amor e o Perdão!','Anônimo','Frases para Whatsapp')\n" +
                ",('Vivona, vivendo!','Anônimo','Frases para Whatsapp')\n" +
                ",('Escolha fazer-se bem sempre.. ','Anônimo','Frases para Whatsapp')\n" +
                ",('O que me encanta é gente de alma bonita! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O ideal é ser feliz, não perfeito. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Reciprocidade, para as coisa boas. Imunidade, para as coisas ruins. ','Anônimo','Frases para Whatsapp')\n" +
                ",('O tempo voa. Cabe a você ser o piloto! ','Anônimo','Frases para Whatsapp')\n" +
                ",('A tua essência vale mais que teu status.','Anônimo','Frases para Whatsapp')\n" +
                ",('Viva um dia de cada vez. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Qualquer coisa que custe a sua paz é muito cara. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Recomece quantas vezes for necessário...','Anônimo','Frases para Whatsapp')\n" +
                ",('Ter bondade dentro de si é algo que não tem preço! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Você é feito de tudo o que acredita e manifesta!','Anônimo','Frases para Whatsapp')\n" +
                ",('Leveza para todos os dias..','Anônimo','Frases para Whatsapp')\n" +
                ",('Seguir com paz sempre!','Anônimo','Frases para Whatsapp')\n" +
                ",('Permita-se mergulhar na paz que você precisa. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Menos aparência, mais essência! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Depois que decidi ser feliz outras decisões ficaram mais fáceis.','Anônimo','Frases para Whatsapp')\n" +
                ",('Movida pela liberdade se ser quem sou! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O único símbolo de superioridade que conheço é a bondade!','Anônimo','Frases para Whatsapp')\n" +
                ",('Ganhar ou perder tanto faz, quando a gente está em paz... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja o sol no dia nublado de alguém! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Pés no chão, cabeça erguida e fé na vida!','Anônimo','Frases para Whatsapp')\n" +
                ",('Nunca foi sorte, sempre foi Deus.','Anônimo','Frases para Whatsapp')\n" +
                ",('Conexão não se cria, simplesmente flui.','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando você transforma sua mente, tudo o que você vivencia é transformado.','Anônimo','Frases para Whatsapp')\n" +
                ",('Energias positivas renovam a gente.','Anônimo','Frases para Whatsapp')\n" +
                ",('A luz que você espalha, contagia...','Anônimo','Frases para Whatsapp')\n" +
                ",('Ser feliz sem motivo e razão...','Anônimo','Frases para Whatsapp')\n" +
                ",('O que não te desafia, não te faz mudar.  ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja a melhor versão de si mesmo! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Viver, se envolver, se entregar, se encantar!','Anônimo','Frases para Whatsapp')\n" +
                ",('Felicidade não é ter, é ser...','Anônimo','Frases para Whatsapp')\n" +
                ",('O primeiro passo mata o medo! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Lave sua alma de energias positivas! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Somos feitos de instantes... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja sua própria âncora...','Anônimo','Frases para Whatsapp')\n" +
                ",('Viver, se envolver, se entregar, se encantar!','Anônimo','Frases para Whatsapp')\n" +
                ",('A paz vem de nós, não dos outros. Aprenda a cultivá-la! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Tudo tem seu tempo...','Anônimo','Frases para Whatsapp')\n" +
                ",('Exalando energia positiva! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Inspire amor, expire gratidão... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Só quem é inteiro sabe transbordar','Anônimo','Frases para Whatsapp')\n" +
                ",('Pra ser feliz basta pouco!','Anônimo','Frases para Whatsapp');";

        return frases;
    }
    public  static String carregarFrases2(){
        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES \n" +
                "('Eu quero a paz e a tranquilidade de uma alma livre!','Anônimo','Frases para Whatsapp')\n" +
                ",('Se apaixone por você todos os dias.','Anônimo','Frases para Whatsapp')\n" +
                ",('Você é o único responsável pela sua felicidade!','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja o melhor que puder!','Anônimo','Frases para Whatsapp')\n" +
                ",('Deixe a sua luz brilhar ','Anônimo','Frases para Whatsapp')\n" +
                ",('Às vezes para voltar ao equilíbrio é preciso tirar os pés do chão e sonhar alto!','Anônimo','Frases para Whatsapp')\n" +
                ",('Sentimento bom, pés no chão alma leve, corpo feliz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O melhor da vida é a sensação de paz e amor.','Anônimo','Frases para Whatsapp')\n" +
                ",('Com calma e com alma vamos além... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Alimente o seu dia com pensamentos positivos! ','Anônimo','Frases para Whatsapp')\n" +
                ",('A liberdade é a essência dela! ','Anônimo','Frases para Whatsapp')\n" +
                ",('É a forma que você encara o mundo que molda o mundo que você encara! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Profunda demais pra essa gente tão rasa!','Anônimo','Frases para Whatsapp')\n" +
                ",('Viva, creia, ame e faça! ','Anônimo','Frases para Whatsapp')\n" +
                ",('A sua alma engrandece com o que você carrega de simples e verdadeiro. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Morra com lembranças, não com sonhos...','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja luz, seja grato, seja livre! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu quero é ficar em paz, ser capaz de fazer o bem!','Anônimo','Frases para Whatsapp')\n" +
                ",('Livrai-me do mal amado, humorado e olhado!','Anônimo','Frases para Whatsapp')\n" +
                ",('Não olhe pra trás! Não é pra lá que você vai.','Anônimo','Frases para Whatsapp')\n" +
                ",('Alma leve, mente limpa e coração em paz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Nem tudo na vida são flores, mas quando forem, regue-as.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ame alguém que você admira! Começando por você mesmo!','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela prefere viver!','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida muda na proporção da sua coragem! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Buscando o aprendizado dentro de mim mesma... ','Anônimo','Frases para Whatsapp')\n" +
                ",('A paz que eu procurava, consegui encontrar em mim mesma! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Nem tudo na vida são flores, mas quando forem, regue-as.','Anônimo','Frases para Whatsapp')\n" +
                ",('O melhor professor é o tempo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Coração não é tão simples quanto pensa...','Anônimo','Frases para Whatsapp')\n" +
                ",('Onde flores, floresça.. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando você deseja o bem, o bem te deseja também.','Anônimo','Frases para Whatsapp')\n" +
                ",('Coração mole, vida dura… tanto apanha até que muda.','Anônimo','Frases para Whatsapp')\n" +
                ",('Por onde eu for, dentro de mim levarei amor.','Anônimo','Frases para Whatsapp')\n" +
                ",('Não importa onde estamos, nossa mente é o nosso lar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Desistir não é andar para trás, é mudar a rota para abrir novos caminhos.','Anônimo','Frases para Whatsapp')\n" +
                ",('De todos os amores, o própr','Anônimo','Frases para Whatsapp')\n" +
                ",('Se preocupe em ser feliz, não em tentar ser notável. ','Anônimo','Frases para Whatsapp')\n" +
                ",('De amor, encha-se','Anônimo','Frases para Whatsapp')\n" +
                ",('Permita-se recomeçar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Vida louca, vida breve!','Anônimo','Frases para Whatsapp')\n" +
                ",('O medo cega nossos sonhos!','Anônimo','Frases para Whatsapp')\n" +
                ",('Procure brilhar, mesmo em meio as trevas!','Anônimo','Frases para Whatsapp')\n" +
                ",('A dúvida pode se tornar a maior certeza da sua vida.','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja o que for, sou mais amor','Anônimo','Frases para Whatsapp')\n" +
                ",('Quem vive a própria vida, tem mais vida vivida.','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida não é e nem precisa ser uma maratona.','Anônimo','Frases para Whatsapp')\n" +
                ",('Uma vida só!','Anônimo','Frases para Whatsapp')\n" +
                ",('Não se deixe esquecer das promessas que se fez','Anônimo','Frases para Whatsapp')\n" +
                ",('Vivemos esperando dias melhores.','Anônimo','Frases para Whatsapp')\n" +
                ",('Coisas boas acontecem para quem distribui o bem por aí...','Anônimo','Frases para Whatsapp')\n" +
                ",('Não se despedace para manter os outros inteiros.','Anônimo','Frases para Whatsapp')\n" +
                ",('Em caso de excesso de lucidez, loucure-se?','Anônimo','Frases para Whatsapp')\n" +
                ",('Acreditar em você é o primeiro passo. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ou faz uma coisa bem feita, ou não faz!','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja fiel à sua essência.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sei exatamente ao lugar que quero chegar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Para essa pressa que eu quero demorar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Nunca somos, sempre estamos!','Anônimo','Frases para Whatsapp')\n" +
                ",('O universo devolve a energia que você emite.','Anônimo','Frases para Whatsapp')\n" +
                ",('Vislumbrando novos horizontes','Anônimo','Frases para Whatsapp')\n" +
                ",('Não tenha pressa. Aprecie o processo!','Anônimo','Frases para Whatsapp')\n" +
                ",('A arte da liberdade ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ninguém é o que já foi. Aceite a mudança. ','Anônimo','Frases para Whatsapp')\n" +
                ",('A felicidade está onde o coração encontra repouso. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Siga sempre em frente, faça o seu destino e tenha fé','Anônimo','Frases para Whatsapp')\n" +
                ",('Onde existe fé sempre brilha a esperança.','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu sou de muita fé, porque tudo que é pouco não enche a alma. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja você e vire tendência!','Anônimo','Frases para Whatsapp')\n" +
                ",('Você atrai o que você é, não o que você quer!','Anônimo','Frases para Whatsapp')\n" +
                ",('A gente é o que a gente espalha, não o que a gente junta!','Anônimo','Frases para Whatsapp')\n" +
                ",('O que não me faz bem, não me faz falta! ','Anônimo','Frases para Whatsapp')\n" +
                ",('É pra frente que se anda. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Aventura é não ter medo de viver a vida.  ','Anônimo','Frases para Whatsapp')\n" +
                ",('Não tenho vocação para o morno. Ou congela ou pega fogo.','Anônimo','Frases para Whatsapp')\n" +
                ",('E se a tempestade não quiser passar, eu danço na chuva!','Anônimo','Frases para Whatsapp')\n" +
                ",('É preciso permitir que coisas lindas aconteçam. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Vida é poesia!','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja você mesmo, não se distraia!','Anônimo','Frases para Whatsapp')\n" +
                ",('Quem sabe o que planta não teme a colheita! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Mergulha no que te dá vontade que a vida não espera por você.','Anônimo','Frases para Whatsapp')\n" +
                ",('Estrelas perdidas também brilham. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Se encante pela chance de viver um novo dia!! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Feliz de todos os ângulos, sorriso em todos os cantos!','Anônimo','Frases para Whatsapp')\n" +
                ",('E quando todos forem promessas, ouse ser atitude... ','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja sua poesia preferida! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Ao invés de esperar cair do céu, voe! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Não deixe que nada custe sua paz! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O sol caminha devagar, mas atravessa o mundo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Você é feito no molde perfeito pra sua vida!','Anônimo','Frases para Whatsapp')\n" +
                ",('Antes de qualquer coisa ore, depois de qualquer coisa: agradeça!','Anônimo','Frases para Whatsapp')\n" +
                ",('Só faz sentido o que te faz sentir! ','Anônimo','Frases para Whatsapp')\n" +
                ",('Não espalhe espinhos pelo caminho, seu retorno pode ser descalço!','Anônimo','Frases para Whatsapp')\n" +
                ",('O que negas, te subordina. O que aceitas, te transforma! ','Anônimo','Frases para Whatsapp')\n" +
                ",('O Importante é ser feliz, o resto agente dá risada!','Anônimo','Frases para Whatsapp')\n" +
                ",('Acender a luz do próximo, não apaga a sua!','Anônimo','Frases para Whatsapp')\n" +
                ",('Cultive todas as pessoas, as certas irão brotar!','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida tem sentido pra quem está disposto a se deixar tocar','Anônimo','Frases para Whatsapp')\n" +
                ",('Só acompanho o que me ilumina!','Anônimo','Frases para Whatsapp')\n" +
                ",('A Felicidade é o estado motivador da Vida!','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela tinha aquela fé bonita de que tudo no fim daria certo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Em caso de excesso de lucidez, loucure-se!','Anônimo','Frases para Whatsapp')\n" +
                ",('Me arrisco, me recrio, não tenho medo de me reinventar!','Anônimo','Frases para Whatsapp')\n" +
                ",('Se encha de Deus e jamais se sentirá vazio. ','Anônimo','Frases para Whatsapp')\n" +
                ",('Que das minhas dores brotem flores.','Anônimo','Frases para Whatsapp')\n" +
                ",('Só quero a paz de um riso sem razão.','Anônimo','Frases para Whatsapp')\n" +
                ",('Fazer por querer, querer por acreditar!','Anônimo','Frases para Whatsapp')\n" +
                ",('Amor próprio é revolucionário!','Anônimo','Frases para Whatsapp')\n" +
                ",('Enxergue cada dia como uma nova chance.','Anônimo','Frases para Whatsapp')\n" +
                ",('É preciso paz pra poder sorrir.','Anônimo','Frases para Whatsapp')\n" +
                ",('Me viciei na alegria.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela não vive de meios termos, meia saudade ou meio amor. Ela gosta de transbordar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Aumente o som do seu riso, e deixe surda sua dor.','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é linda quando vc começa a viver e para de somente existir.','Anônimo','Frases para Whatsapp')\n" +
                ",('Que seja infinito tudo aquilo que acalme a alma!','Anônimo','Frases para Whatsapp')\n" +
                ",('Você pode conceder a si, a vida que deseja! (Tati Rossi)','Anônimo','Frases para Whatsapp')\n" +
                ",('Por onde ela passa, deixa flores e amores!','Anônimo','Frases para Whatsapp')\n" +
                ",('Com Deus nada é capaz de me deter!','Anônimo','Frases para Whatsapp')\n" +
                ",('Onde há vontade, há chance de dar certo!','Anônimo','Frases para Whatsapp')\n" +
                ",('As maiores bençãos da vida vem através da paciência!','Anônimo','Frases para Whatsapp')\n" +
                ",('Deus cuida de cada detalhe...','Anônimo','Frases para Whatsapp')\n" +
                ",('Que os sonhos de hoje, virem os objetivos de amanhã!','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando tudo for pedra, atire a primeira flor!','Anônimo','Frases para Whatsapp')\n" +
                ",('A gratidão transforma o que temos em suficiente!','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja o amor da sua vida!','Anônimo','Frases para Whatsapp')\n" +
                ",('O que você faria se não tivesse medo?','Anônimo','Frases para Whatsapp')\n" +
                ",('Coloca o mundo no mudo e escuta o seu coração!','Anônimo','Frases para Whatsapp')\n" +
                ",('Permita-se ser o que quiser nessa vida, menos infeliz…','Anônimo','Frases para Whatsapp')\n" +
                ",('Aceite o que não pode mudar, mude o que não pode aceitar!','Anônimo','Frases para Whatsapp')\n" +
                ",('A melhor queda é cair em si!','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é uma delícia e a gente vive de dietas','Anônimo','Frases para Whatsapp')\n" +
                ",('Pra somar é raro, pra te afundar tem até fila.','Anônimo','Frases para Whatsapp')\n" +
                ",('Amor é mar! Não me contento em molhar os pés.','Anônimo','Frases para Whatsapp')\n" +
                ",('Prefiro sorrir. Me permito ser feliz. Porque sim. Por mim.','Anônimo','Frases para Whatsapp')\n" +
                ",('Olha pra cima que é de lá que vem a força.','Anônimo','Frases para Whatsapp')\n" +
                ",('Que a vontade de ser feliz, seja maior do que o medo de amar novamente.','Anônimo','Frases para Whatsapp')\n" +
                ",('Só quero agradecer tudo que um dia eu já consegui.','Anônimo','Frases para Whatsapp')\n" +
                ",('Agradecer também faz parte da oração.','Anônimo','Frases para Whatsapp')\n" +
                ",('Gratidão significa que a energia recebida deve ser devolvida.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sonhe alto, seja grato e sinta amor.','Anônimo','Frases para Whatsapp')\n" +
                ",('Agradece, novo dia, nova chance de recomeçar.','Anônimo','Frases para Whatsapp')\n" +
                ",('O hábito de agradecer libera o fluxo de receber.','Anônimo','Frases para Whatsapp')\n" +
                ",('O que adianta ter todas no pé e ela na cabeça?','Anônimo','Frases para Whatsapp')\n" +
                ",('As melhores história tem começo, medo e fim.','Anônimo','Frases para Whatsapp')\n" +
                ",('Vontade de ir para um lugar bem distante. Sem nem sentido nem direção, só ir.','Anônimo','Frases para Whatsapp')\n" +
                ",('O silêncio tem sempre razão.','Anônimo','Frases para Whatsapp')\n" +
                ",('Tá na hora de começar a surpreender todos aqueles que duvidam de você.','Anônimo','Frases para Whatsapp')\n" +
                ",('Feliz ou não, eu tô vivendo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Esse é o nosso mundo, onde o demais nunca é o bastante e a primeira vez é sempre a última chance.','Anônimo','Frases para Whatsapp')\n" +
                ",('Considere os que te consideram.','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é bela pra quem tem coragem.','Anônimo','Frases para Whatsapp')\n" +
                ",('O importante não é vencer todos os dias, mas lutar sempre.','Anônimo','Frases para Whatsapp')\n" +
                ",('Transmita paz, o mundo já tem muita energia negativa acumulada.','Anônimo','Frases para Whatsapp')\n" +
                ",('Veja beleza no mundo, e o mundo verá beleza em você.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ou você aprende a amar os espinhos ou não aceite rosas.','Anônimo','Frases para Whatsapp')\n" +
                ",('Impressionante como tudo muda em 1 ano… Pensamentos, planos, amizades, amores.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela sempre foi um mar de sentimentos, uma imensidade deles. Mas agora, finalmente, ela escolhe muito bem o que quer sentir.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela era uma flor que não tinha em qualquer floricultura, uma flor que não brota em qualquer primavera.','Anônimo','Frases para Whatsapp')\n" +
                ",('E ela não sabe mais o que fazer com o resto da vida que tem.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela é uma menina fria, fala que não quer amar ninguém, mas no fundo ela ama alguém. Só que ela tem medo, de sofrer novamente.','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas agora ela é livre pra rir do que é ruim, e chorar só se for de feliz.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela não é mole e tu não ganha de primeira, honesta, simpática né, mina parceira.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela não quer mais amor, romance acabou.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela chorava, mas não era fraca. Ela era uma boa pessoa, mas não era ingênua. Ela caiu muito, mas aprendeu a derrubar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela sabe o que quer, vai até onde puder. Brinca de bem-me-quer, no bolso nenhum qualquer.','Anônimo','Frases para Whatsapp')\n" +
                ",('Tinha tristeza nos olhos e no coração dela, mas ela tinha um sorriso no rosto.','Anônimo','Frases para Whatsapp')\n" +
                ",('Daí ela se lembrou de como é ser forte. Ela enxugou suas lágrimas e sorriu. Sim, sorriu, porque ela sabe que algo melhor está por vir. Ela sabe.','Anônimo','Frases para Whatsapp')\n" +
                ",('Essa mina é diferente, tira onda tlg.. ela é outra vibe, outro clima, outro pique.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela tem estrelas nos olhos e a lua crescente no sorriso.','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu tava pensando outro dia se é certo lutar, se é certo largar...','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela gostava de olhar as estrelas, isso lhe clareava o pensamento.','Anônimo','Frases para Whatsapp')\n" +
                ",('As vezes é mais saudável chegar ao fim...','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas há algo em ti que me impede de me afastar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Vá atrás apenas do que te faz sorrir.','Anônimo','Frases para Whatsapp')\n" +
                ",('Não desanima não menina, tua chuva de bênçãos, está vindo lá de cima.','Anônimo','Frases para Whatsapp')\n" +
                ",('É tão bom estar perto de quem a gente gosta, esquecer dos problemas, dar risadas, se sentir importante.','Anônimo','Frases para Whatsapp')\n" +
                ",('Se o final valer a pena, o caminho nem importa..','Anônimo','Frases para Whatsapp')\n" +
                ",('Se ame um pouco mais a cada dia.','Anônimo','Frases para Whatsapp')\n" +
                ",('Se cada flor tem o seu tempo, eu aceito florescer no determinado momento.','Anônimo','Frases para Whatsapp')\n" +
                ",('Aquela moça chorou, pensou em desistir. Mas ela orou, e Deus a abraçou.','Anônimo','Frases para Whatsapp')\n" +
                ",('O que o mundo vai dizer quando o amor vencer','Anônimo','Frases para Whatsapp')\n" +
                ",('Sem juízo pra não causar prejuízo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Que a minha única mania seja sorrir e que meu único vício seja a felicidade.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela quer alguém pra amar da maneira certa.','Anônimo','Frases para Whatsapp')\n" +
                ",('Não era um vazio, era só um silêncio.','Anônimo','Frases para Whatsapp')\n" +
                ",('É melhor a gente seguir em frente e aceitar as coisas como são.','Anônimo','Frases para Whatsapp')\n" +
                ",('Então viva uma vida que vai se lembrar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Deus e essa mania bonita de cuidar tão bem do meu coração.','Anônimo','Frases para Whatsapp')\n" +
                ",('A gratidão muda tudo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela não tira o sorriso do rosto nem pra passar batom, cê acha que vai tirar por você?','Anônimo','Frases para Whatsapp')\n" +
                ",('Quem faz o bem, conquista paz interior.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorria sem câmera , converse sem celular, ajude sem plateia, ame sem condições.','Anônimo','Frases para Whatsapp')\n" +
                ",('Na vida tudo é possível a mente atrai o que você pensar.','Anônimo','Frases para Whatsapp')\n" +
                ",('O mal olhado não é nada, perto da Luz que me guia.','Anônimo','Frases para Whatsapp')\n" +
                ",('Sorrir já é um recomeço.','Anônimo','Frases para Whatsapp')\n" +
                ",('Você não navegará ao futuro enquanto estiver ancorado ao passado.','Anônimo','Frases para Whatsapp')\n" +
                ",('Se o amor me rejeita, a farra me aceita.','Anônimo','Frases para Whatsapp')\n" +
                ",('Talvez seja a hora de recomeçar, de abrir novos sorrisos para novas pessoas.','Anônimo','Frases para Whatsapp')\n" +
                ",('É assim, só entende de lágrimas quem já chorou, só entende de dor quem já foi ferido, e de perda quem já perdeu…','Anônimo','Frases para Whatsapp')\n" +
                ",('Que todo mal vire amor, que toda dor vire flor.','Anônimo','Frases para Whatsapp')\n" +
                ",('Tem gente que tem o dom, de mesmo triste, continuar sorrindo.','Anônimo','Frases para Whatsapp')\n" +
                ",('A solidão faz com a vida o que o inverno faz com as flores.','Anônimo','Frases para Whatsapp')\n" +
                ",('Cair hoje e levantar mais forte amanhã.','Anônimo','Frases para Whatsapp')\n" +
                ",('Ainda bem que a vida muda, muita coisa o tempo cura.','Anônimo','Frases para Whatsapp')\n" +
                ",('Calma, respira. Nem tudo merece tanta importância…','Anônimo','Frases para Whatsapp')\n" +
                ",('Dói né? Quando você sente algo te matar por dentro, mas aí você tem que agir como isso não te afetasse…','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu queria poder voltar ao passado, não pra mudar alguma coisa, mas simplesmente pra reviver a época em que eu era feliz e não sabia…','Anônimo','Frases para Whatsapp')\n" +
                ",('Errar, superar, aprender e recomeçar…','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela é o tipo de pessoa que prefere morrer sufocada, ao invés de falar o que sente…','Anônimo','Frases para Whatsapp')\n" +
                ",('E naquele mar de amor o que restou foi só a dor…','Anônimo','Frases para Whatsapp')\n" +
                ",('Se te faz bem, cuide…','Anônimo','Frases para Whatsapp')\n" +
                ",('A melhor liberdade é você se libertar das coisas que te fazem mal…','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu machuco todo mundo, especialmente a mim mesma.','Anônimo','Frases para Whatsapp')\n" +
                ",('Deixa o tempo apagar toda a lembrança que te faz chorar.','Anônimo','Frases para Whatsapp')\n" +
                ",('Tudo mudou, e você nem se quer sabe disso.','Anônimo','Frases para Whatsapp')\n" +
                ",('Oriente sua mente e viva intensamente.','Anônimo','Frases para Whatsapp')\n" +
                ",('Que seja infinito tudo aquilo que nos faz bem…','Anônimo','Frases para Whatsapp')\n" +
                ",('Ouvi dizer que só era triste quem queria.','Anônimo','Frases para Whatsapp')\n" +
                ",('Tudo que deu errado, um dia vai dar certo, basta ter esperança.','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas ela quer o sol, a lua, a madrugada?','Anônimo','Frases para Whatsapp')\n" +
                ",('No fundo solitária escondida no batom','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela é mulher com marra de menina!','Anônimo','Frases para Whatsapp')\n" +
                ",('Maldosa, lua no dia, charmosa, corpo perfeito como só Deus esculpia','Anônimo','Frases para Whatsapp')\n" +
                ",('Tem malandragem de sobra e liberdade pra conquistar tudo que ela quer','Anônimo','Frases para Whatsapp')\n" +
                ",('Gata contagia, você foi eleita olhar que intimida, me olha na espreita','Anônimo','Frases para Whatsapp')\n" +
                ",('Então não tire minha razão, que eu não mudo de opinião','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando ela chega é tipo iluminação, clareia a mente e judia do coração?','Anônimo','Frases para Whatsapp')\n" +
                ",('Que o vento leve, que a chuva lave, que a alma brilhe, que o coração acalme.','Anônimo','Frases para Whatsapp')\n" +
                ",('A única forma de chegar ao impossível é acreditar que é possível.','Anônimo','Frases para Whatsapp')\n" +
                ",('As vezes ficamos por amor, e outras vezes vamos embora pelo mesmo motivo!','Anônimo','Frases para Whatsapp')\n" +
                ",('A gratidão muda tudo.','Anônimo','Frases para Whatsapp')\n" +
                ",('Acredite, você tem forças para chegar onde quiser. Basta querer.','Anônimo','Frases para Whatsapp')\n" +
                ",('Breves momentos deixam eternas lembranças.','Anônimo','Frases para Whatsapp')\n" +
                ",('No fim, todos seremos julgados pela coragem dos nossos corações.','Anônimo','Frases para Whatsapp')\n" +
                ",('Seja seu próprio mundo, ao invés de lutar pra ser a de alguém.','Anônimo','Frases para Whatsapp')\n" +
                ",('Porque sem cuidar, nada floresce.','Anônimo','Frases para Whatsapp')\n" +
                ",('Não se sinta culpado por fazer o que é melhor pra você…','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela não tem coração de pedra, tem apenas a firmeza necessária contra amores fracos.','Anônimo','Frases para Whatsapp')\n" +
                ",('Não desista do jardim porque uma flor não brotou.','Anônimo','Frases para Whatsapp')\n" +
                ",('Jamais perca o seu equilíbrio.','Anônimo','Frases para Whatsapp')\n" +
                ",('Se não puder retribuir, não cative.','Anônimo','Frases para Whatsapp')\n" +
                ",('Às vezes tudo que precisamos é de um novo começo.','Anônimo','Frases para Whatsapp')\n" +
                ",('É que as coisas mudam, e as pessoas também.','Anônimo','Frases para Whatsapp')\n" +
                ",('Lembrar de você me faz pensar besteira.','Anônimo','Frases para Whatsapp')\n" +
                ",('Para que ter pressa se as melhores coisas da vida são feitas bem devagarinho?\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Sem você aqui, paraíso sem cor. Sem você aqui, primavera sem flor.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Talvez não seja nessa vida ainda, mas você ainda vai ser a minha vida. \t','Anônimo','Frases para Whatsapp')\n" +
                ",('Quanta coisa a gente faz, depois quer voltar atrás\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Apresento a lhe a lua e ao sol, que no céu vai ter mais um farol que é o brilho do seu olhar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Será que existe um jeito de eu te encontrar? Porque, pelo menos pra dizer, que eu ainda gosto de você.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Salvei tua mensagem, pra ouvir tua voz. Porque eu não paro de pensar em nós.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Às vezes a paz de um sorriso, pode desarmar uma guerra.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu tenho um beck pra depois, pra brindar o infinito de nós dois\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Dos meus problemas, eu já nem me lembrava mais!\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas o problema é que eu te amo Um dia sem você eu ja reclamo Invento uma desculpa pra te ver\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu só existo se for do seu lado.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Que tenha paixão, desejo que tenha abraço e beijo, e seja a melhor sensação.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Toda história de amor é assim, tem idas e voltas.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mudei a rota e meus planos e o que eu tava procurando, eu achei em você.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ontem foi a despedida na balada, dessa vida de solteiro…\t','Anônimo','Frases para Whatsapp')\n" +
                ",('E nessa vida agora somos dois, três, quatro… Quantos você quiser \t','Anônimo','Frases para Whatsapp')\n" +
                ",('Só quero sorte pra nós, amor e paz, e resto a gente corre atrás.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Não sou anjo da guarda mas eu vou te proteger.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Lembra que foi eu, não esquece que fui eu, que te amou demais desde o dia em que te conheceu.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('No primeiro instante, vi que era amor, no momento em que a gente se encontrou.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Por mais que você corra, irmão pra sua guerra vão nem se lixar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('O único passeio que me encanta é o que a minha mão faz pelo corpo dela.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Nosso sorriso sereno hoje é o veneno pra quem trouxe tanto ódio.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Irmão, você não percebeu, que você é o único representante do seu sonho\t','Anônimo','Frases para Whatsapp')\n" +
                ",('É um clichê, romântico, triste. Vai perceber, vai ver, matou e o paraíso não existe\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ninguém nunca sabe o que realmente tem, não dá valor pra o que realmente tem\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela descortina o novo e bota fim na zona, teu olhar ilumina, abomina o cafona.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando pessoas viram coisas, cabeças viram degraus\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Vi pelo mundo a fora, a vida é como uma pessoa boa você só nota quando vai embora.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Uma dose só dividida em dois copos, uma alma só dividida em dois corpos.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('É preciso amar as pessoas como se não houvesse amanhã, porque se você parar pra pensar na verdade não há.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('De escolha própria, escolheu a solidão.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Vamos fazer nosso dever de casa, e aí então vocês vão ver, suas crianças derrubando reis.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Que nosso egoísmo, não destrua nossos corações.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas como chegar até as nuvens com os pés no chão?\t','Anônimo','Frases para Whatsapp')\n" +
                ",('E todo mundo diz que ele completa ela e vice-versa. Que nem feijão com arroz.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Quero colo, vou fugir de casa. Posso dormir aqui com você?\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Tenho um sorriso bobo parecido com soluço, enquanto o caos segue em frente\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Fez as minas de boneca, sai dessa, não sou assim por favor\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Levanta a cabeça e aceita a revanche!\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Tão difícil ficar só relembrando, momentos bons???\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Aprendi não sofrer por amor, aprendi a lidar com a ilusão.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Prefiro perder a guerra e ganhar a paz.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('O que você tem todo mundo pode ter, mas o que você é, ninguém pode ser.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Somos feitos de carne, mas temos de viver como se fôssemos de ferro.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Muitas vezes o que se cala faz maior impacto do que o que se diz.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('O melhor amigo da vida é o tempo, ele diz a verdade.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('A vida é cheia de tentativas, então levante e diga: eu vou tentar e eu vou conseguir.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Conserve os olhos fixos num ideal sublime, e lute sempre pelo que deseja, pois só os fracos desistem e só quem luta é digno de vida???\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Quem quiser vencer na vida deve fazer como os seus sábios: mesmo com a alma partida, ter um sorriso nos lábios.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Educar não é cortar as asas, mas sim orientar o voo!\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Reaja! Cada um terá a vista da montanha que subir\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Certos momentos só podem ser apreciados quando você tira o pé do acelerador.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Normalmente as oportunidades estão disfarçadas de trabalho duro, é por isso que a maioria das pessoas não as reconhecem\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Você só terá sucesso na vida quando perdoar os erros e as decepções do passado.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Queria te chamar de anjo, mas nem um anjo se compara a sua beleza\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Vem, me abraça um segundo e prometa ficar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Você foi o melhor que me aconteceu e agora nada é igual.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Me diz quando a gente vai se ver pra eu poder te abraçar e tentar te explicar a falta que você me faz.?????\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Você vira o meu mundo de ponta cabeça.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Distância é o fim pra quem tem coração.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu nem me lembro de querer alguém como eu quero você pra mim.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Então me diz o que eu faço pra tentar te esquecer eu nem sei o que eu gosto tanto, tanto em você.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('É que eu sei amar você muito mais do que eu sei cantar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Não dá mais pra brincar de adiar o fim o nosso tempo já deu\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu sei amar você tão bem, é como um vício, eu sei amar você assim, desde o início, eu quero amar você de novo se eu consigo respirar, pra mim ainda é pouco.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Você coloca minha felicidade em dia????\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Somos o que somos por culpa da puta da vida.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela me procura pra ser cura no meio da noite escura.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu tava de saída e safada é a vida que as vezes só ensina quando a oportunidade acaba.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Porque eu sei o tempo passa, mas não passa a vontade e a necessidade de te ter por perto\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Minha rotina é não ter rotina, ta ligado??\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Vai pensando que ela é fácil rapaz, ela não é daquelas minas tanto fez, tanto faz.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Sabemos o que somos, mas não sabemos o que poderemos ser.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('O número dos que nos invejam confirma as nossas capacidades.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Para aprender tem que cair.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas se quiser alguém pra te fazer sorrir, é só olhar pro lado que estou aqui.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('A felicidade é de quem não se importa de ligar o F pro mundo inteiro.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Não desisti, só não insisto mais.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Aconteceu, então, que ela tinha um coração de vidro.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Sou complexa, sou mistura. Me perco, me procuro e me acho.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Encontre alguém que, entre as idas e vindas da vida, prefira ficar.?????\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Crescer significa mudar, e mudar envolve riscos.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu quero um amor, um amor para viver, reviver e sobreviver\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Se o nosso amor é insanidade, por que você é minha clareza\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Sinto, eu apenas sinto e sentir é uma droga.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela sonhava com o paraíso toda vez que fechava os olhos.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Se não desse errado não seria eu.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Sou isso hoje, amanhã já me reinventei.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('O mundo gira e bota sempre tudo no lugar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Eu te abraçaria todos os dias como se fosse a primeira vez.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Só te peço, não seja meu quase.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Se juízo fosse vodka, seria mais fácil tomar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Longe ou perto, tanto faz. Quem quer ser feliz corre atrás.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Não existe fim para aqueles que acreditam em recomeço.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Podem cortar as flores, mas não podem deter a primavera. \t','Anônimo','Frases para Whatsapp')\n" +
                ",('De canto em canto, foi me encantando.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('O que uns chamam de orgulho, eu chamo de parei de ser babaca.??\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Estou aqui é pra viver, cair, aprender, levantar e seguir em frente.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Não procure o amor, deixe que ele encontre você.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Alguém que seja maluco o bastante para se apaixonar pelo meu caos.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Vi todos os sinais de que a vida é uma passagem.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mil cairão, mil cairão, mil mas eu não serei atingido\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas nessa madrugada eu não me sinto bem.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Seu sorriso carrega uma luz divina.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela é chave de cadeia meu chegado, mas por essa vale a pena ver o sol nascer quadrado.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Tira a minha paz e fôlego, só que faz isso parecer muito bom.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela é tipo nicotina pra quem fuma, uma casa na coluna de vista pro mar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Só não deixe a maré te levar.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Quando você se afasta do que te atrasa, tudo começa a dar certo.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Se for tarde demais, a gente aproveita a madrugada.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Saudade não trás ninguém de volta, por isso valorize enquanto tem.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Fofa como batida de trem.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Só não esquece que o mundo dá voltas. E dá voltas pra caralho. \t','Anônimo','Frases para Whatsapp')\n" +
                ",('Um dia me disseram que os ventos às vezes erram de direção.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Ela disse: eu vou ficar bem, mas ela não ficou. Na verdade ela nunca esteve.\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Mas um dia a gente acorda e percebe que tem uma vida inteirinha pela frente!\t','Anônimo','Frases para Whatsapp')\n" +
                ",('Bonito é ser de verdade, confiar em si mesmo acima de tudo. \t','Anônimo','Status para Fotos')\n" +
                ",('Ressuscite a tua essência, liberte-se e voe para onde você quiser.\t','Anônimo','Status para Fotos')\n" +
                ",('Mente positiva sempre! Ocupando a cabeça, preenchendo qualquer vazio.\t','Anônimo','Status para Fotos')\n" +
                ",('Mude os seus hábitos, as companhias, os planos, só não mude quem você é.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja simples, mas seja você.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja simples, mas seja você.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu entrego, confio e agradeço por cada fase, cada etapa e cada aprendizado.\t','Anônimo','Status para Fotos')\n" +
                ",('Entre as verdades já ditas, o sorriso é a mais bonita.\t','Anônimo','Status para Fotos')\n" +
                ",('Almas livres entendem o valor de continuarem assim.\t','Anônimo','Status para Fotos')\n" +
                ",('Se te faz sorrir, é porque te faz bem e se te faz bem, não deixe escapar.\t','Anônimo','Status para Fotos')\n" +
                ",('Meu espaço é sagrado, viver é o meu milagre.\t','Anônimo','Status para Fotos')\n" +
                ",('O que o outro pensa sobre mim nunca irá me limitar.\t','Anônimo','Status para Fotos')\n" +
                ",('As cores do arco-íris são lindas, mas o que mais me encanta é a luz.\t','Anônimo','Status para Fotos')\n" +
                ",('Que seja natural: um dia por vez, semente e terra em sintonia.\t','Anônimo','Status para Fotos')\n" +
                ",('Sonhe alto, seja grato e sinta amor.\t','Anônimo','Status para Fotos')\n" +
                ",('Nem tudo na vida são flores. Às vezes é um jardim inteiro.\t','Anônimo','Status para Fotos')\n" +
                ",('Um dia resolvi me conhecer melhor e descobri em mim um universo infinito.\t','Anônimo','Status para Fotos')\n" +
                ",('Ser luz não é sobre brilhar: é sobre iluminar caminhos.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu nunca tive medo dos fins, nem dos recomeços. Meu único medo é não ter história para contar.\t','Anônimo','Status para Fotos')\n" +
                ",('Não é sobre o que a vida entrega, mas sim ao que você se entrega.\t','Anônimo','Status para Fotos')\n" +
                ",('É o caminho que constrói a gente!\t','Anônimo','Status para Fotos')\n" +
                ",('Tenha a si mesmo como prioridade absoluta.\t','Anônimo','Status para Fotos')\n" +
                ",('Serenidade no caminho porque a batalha não é fácil mas é cheia de grandes surpresas.\t','Anônimo','Status para Fotos')\n" +
                ",('Liberte-se da necessidade de controle, o universo se encarrega de te levar ao seu destino.\t','Anônimo','Status para Fotos')\n" +
                ",('Ser incrível é ser a cada dia mais você. É dar mais importância ao que te engrandece e menos ao que te limita.\t','Anônimo','Status para Fotos')\n" +
                ",('Acredite em tudo o que você faz e dedica o seu coração.\t','Anônimo','Status para Fotos')\n" +
                ",('Com a alma tranquila e sorrindo, eu agradeço!\t','Anônimo','Status para Fotos')\n" +
                ",('Amar alguém é bom, mas amar a pessoa que você se tornou, é incrível.\t','Anônimo','Status para Fotos')\n" +
                ",('Que a paz se instale, que a alegria floresça, que o amor perdure! \t','Anônimo','Status para Fotos')\n" +
                ",('Sorria e seja feliz, ouviu O tempo voa!\t','Anônimo','Status para Fotos')\n" +
                ",('Coloca um sorriso no rosto e vai! \t','Anônimo','Status para Fotos')\n" +
                ",('Floresça, ilumine!\t','Anônimo','Status para Fotos')\n" +
                ",('Floresça, ilumine!\t','Anônimo','Status para Fotos')\n" +
                ",('Dentro dela é o seu melhor lugar. \t','Anônimo','Status para Fotos')\n" +
                ",('Manter o sorriso no rosto e a fé no coração são as regras da vida! \t','Anônimo','Status para Fotos')\n" +
                ",('Deixe o sorriso aberto, é por ele que as coisas boas costumam entrar! \t','Anônimo','Status para Fotos')\n" +
                ",('Faço de mim morada, me tenho e isso basta.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja lembrado pelos sorrisos que você espalha!\t','Anônimo','Status para Fotos')\n" +
                ",('Um sorriso na cara, a alma lavada e a vontade de ser feliz!\t','Anônimo','Status para Fotos')\n" +
                ",('Tenho em mim todos os sonhos do mundo.\t','Anônimo','Status para Fotos')\n" +
                ",('Risos pelo ar, livres para amar!\t','Anônimo','Status para Fotos')\n" +
                ",('Seja calmaria, tem gente demais sendo tempestade.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja calmaria, tem gente demais sendo tempestade.\t','Anônimo','Status para Fotos')\n" +
                ",('Amar-se cada dia mais.\t','Anônimo','Status para Fotos')\n" +
                ",('Ser, sobretudo, o melhor de mim!\t','Anônimo','Status para Fotos')\n" +
                ",('Minha consciência é limpa, meu coração segue em paz.\t','Anônimo','Status para Fotos')\n" +
                ",('Ser feliz e nada mais!\t','Anônimo','Status para Fotos')\n" +
                ",('O importante não é vencer todos os dias, mas lutar sempre. \t','Anônimo','Status para Fotos')\n" +
                ",('Um brilho no olhar e um mundo pela frente para conquistar.\t','Anônimo','Status para Fotos')\n" +
                ",('Me faço imensidão.\t','Anônimo','Status para Fotos')\n" +
                ",('Entre todas as coisas que pode fazer, nenhuma é maior do que ser você mesmo.\t','Anônimo','Status para Fotos')\n" +
                ",('Não há bênção maior que uma mente em paz.\t','Anônimo','Status para Fotos')\n" +
                ",('Não quero nada além de paz no coração! \t','Anônimo','Status para Fotos')\n" +
                ",('E o bom da vida é viver bem, estar bem, querer bem.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela sabe que dentro de si é o melhor lugar.\t','Anônimo','Status para Fotos')\n" +
                ",('Deixe de lado tudo o que tira a sua paz.\t','Anônimo','Status para Fotos')\n" +
                ",('E não se perca! Seja leve, seja livre, seja feliz!\t','Anônimo','Status para Fotos')\n" +
                ",('Correto mesmo é fazer aquilo que o coração manda!\t','Anônimo','Status para Fotos')\n" +
                ",('É sorrindo que se faz feliz!\t','Anônimo','Status para Fotos')\n" +
                ",('Me viciei na alegria, colori a minha vida de amor. \t','Anônimo','Status para Fotos')\n" +
                ",('Quando a luz vem de dentro, o filtro perde o sentido.\t','Anônimo','Status para Fotos')\n" +
                ",('Você transborda luz quando espalha felicidade!\t','Anônimo','Status para Fotos')\n" +
                ",('A gratidão desbloqueia a plenitude da vida!\t','Anônimo','Status para Fotos')\n" +
                ",('Frases para Fotos : Status para Foto\t','Anônimo','Status para Fotos')\n" +
                ",('A gratidão desbloqueia a plenitude da vida!\t','Anônimo','Status para Fotos')\n" +
                ",('Nesses tempos de ódio, é bom andar amado.\t','Anônimo','Status para Fotos')\n" +
                ",('É só uma questão de ser poesia de corpo e alma, meu bem.\t','Anônimo','Status para Fotos')\n" +
                ",('Sou da vida, sou do mundo e o que ele é de mim.\t','Anônimo','Status para Fotos')\n" +
                ",('De riso em riso a gente chega no paraíso.\t','Anônimo','Status para Fotos')\n" +
                ",('A leveza de simplesmente ser \t','Anônimo','Status para Fotos')\n" +
                ",('Que não nos falte a(fé)tos! \t','Anônimo','Status para Fotos')\n" +
                ",('Um coração que veste bondade, sai por aí sempre coberto de amor. \t','Anônimo','Status para Fotos')\n" +
                ",('Encontre o caminho da serenidade, nossa alma precisa se preencher de paz.\t','Anônimo','Status para Fotos')\n" +
                ",('O riso é capaz de espantar todos os males. Queira sorrir! \t','Anônimo','Status para Fotos')\n" +
                ",('E não se perca! Seja leve, seja livre, seja feliz!\t','Anônimo','Status para Fotos')\n" +
                ",('Frases para Fotos : Status para Foto\t','Anônimo','Status para Fotos')\n" +
                ",('E não se perca! Seja leve, seja livre, seja feliz!\t','Anônimo','Status para Fotos')\n" +
                ",('A felicidade está na entrega de uma alma tranquila e de um coração em paz.\t','Anônimo','Status para Fotos')\n" +
                ",('Corpo, mente e alma. Tudo em perfeita sintonia.\t','Anônimo','Status para Fotos')\n" +
                ",('Todo mundo é composto de mudanças, tomando sempre novas qualidades.\t','Anônimo','Status para Fotos')\n" +
                ",('Na tua essência seu jeito mulher e na tua alma todo seu valor. \t','Anônimo','Status para Fotos')\n" +
                ",('Coração em paz floresce mesmo sozinho.\t','Anônimo','Status para Fotos')\n" +
                ",('Abrace sua essência, ela é sua melhor parte.\t','Anônimo','Status para Fotos')\n" +
                ",('Antes sol que mal iluminado.\t','Anônimo','Status para Fotos')\n" +
                ",('Faz tempo que deixei de ter tempo pra coisas que não tem alma.\t','Anônimo','Status para Fotos')\n" +
                ",('Sentir é um privilégio que somente almas livres entendem.\t','Anônimo','Status para Fotos')\n" +
                ",('Para ser completa, ela só precisa de Deus!\t','Anônimo','Status para Fotos')\n" +
                ",('Sorrir pra dor ir!\t','Anônimo','Status para Fotos')\n" +
                ",('Um passo de cada vez! Lembrando que passos alegres valem por três!\t','Anônimo','Status para Fotos')\n" +
                ",('Direcione seu caminho para tudo que traz paz, alegria e luz pra sua vida.\t','Anônimo','Status para Fotos')\n" +
                ",('Que nossos caminhos sejam floridos e que não nos falte luz!\t','Anônimo','Status para Fotos')\n" +
                ",('Mente firme, alma limpa e pensamento positivo sempre.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja amor de corpo e alma.\t','Anônimo','Status para Fotos')\n" +
                ",('A alma dela não pesa e o coração é terra que faz brotar todos os frutos bons.\t','Anônimo','Status para Fotos')\n" +
                ",('Coração leve, sorriso nos lábios e vontade de espalhar o bem por aí. \t','Anônimo','Status para Fotos')\n" +
                ",('Existe uma beleza imensurável em ser quem você é.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela é imperfeita, mas é de verdade.\t','Anônimo','Status para Fotos')\n" +
                ",('Tão na boa que até meu coração anda sorrindo...\t','Anônimo','Status para Fotos')\n" +
                ",('Seja o que você sente.\t','Anônimo','Status para Fotos')\n" +
                ",('Ponha seu coração em cada passo e gesto.\t','Anônimo','Status para Fotos')\n" +
                ",('Respire, se benze e vai fundo. O mundo é todo teu!\t','Anônimo','Status para Fotos')\n" +
                ",('Liberdade é um lugar que a alma quer visitar.\t','Anônimo','Status para Fotos')\n" +
                ",('Nunca perco a minha mania de ter fé no bem.\t','Anônimo','Status para Fotos')\n" +
                ",('Quanto mais luz eu permito morar dentro de mim, mais brilhante eu deixo tudo ao meu redor!\t','Anônimo','Status para Fotos')\n" +
                ",('Seja mais alma e aprenda com a simplicidade.\t','Anônimo','Status para Fotos')\n" +
                ",('O essencial nem sempre se mostra. Se conhece.\t','Anônimo','Status para Fotos')\n" +
                ",('Minha beleza favorita é de quem tem a alma bonita.\t','Anônimo','Status para Fotos')\n" +
                ",('Não há beleza aonde não há paz.\t','Anônimo','Status para Fotos')\n" +
                ",('Verdade no olhar, amor no coração e muita alegria para dar \t','Anônimo','Status para Fotos')\n" +
                ",('Quem não valoriza a própria essência, não valoriza mais nada\t','Anônimo','Status para Fotos')\n" +
                ",('Que brotem flores em todos os canteiros de dores.\t','Anônimo','Status para Fotos')\n" +
                ",('Não há beleza aonde não há paz.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela é de exageros... Na força, no sorriso, no amor e na fé!\t','Anônimo','Status para Fotos')\n" +
                ",('Vá para longe do barulho alheio. Seu coração sempre fala o que deve ser feito. \t','Anônimo','Status para Fotos')\n" +
                ",('O que eu tenho é fé. E uma vontade bonita, toda minha, de crescer.\t','Anônimo','Status para Fotos')\n" +
                ",('Solta em direção ao infinito que tem para conquistar!\t','Anônimo','Status para Fotos')\n" +
                ",('É na simplicidade que a vida se enfeita.\t','Anônimo','Status para Fotos')\n" +
                ",('O universo não resiste a um coração que teima em ser feliz. \t','Anônimo','Status para Fotos')\n" +
                ",('Vai lá e vive sem se importar com esse mundo que julga teus exageros e não sabe lidar com a tua coragem.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela tem jeito de céu.. nem se aproxime se não for voar com ela!\t','Anônimo','Status para Fotos')\n" +
                ",('Sou destinada à intensidade desde que me conheço por gente\t','Anônimo','Status para Fotos')\n" +
                ",('Ela tem um sotaque de amor!\t','Anônimo','Status para Fotos')\n" +
                ",('Que o meu sorriso largo seja o convite para os espontâneos bons corações!\t','Anônimo','Status para Fotos')\n" +
                ",('Andar sem pressa pela beira da vida, observar e agradecer \t','Anônimo','Status para Fotos')\n" +
                ",('Coração tranquilo, sorriso aberto, alma em paz.\t','Anônimo','Status para Fotos')\n" +
                ",('Blinda a tua alma, coloca um filtro no coração, faça sua oração e deixa o resto fluir. \t','Anônimo','Status para Fotos')\n" +
                ",('Quero paz. Quero tranquilidade. Quero tudo aquilo que me faça bem de verdade.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela é do signo de luz, com ascendente em gratidão . \t','Anônimo','Status para Fotos')\n" +
                ",('A forma mais honesta de felicidade é sorrir pra si mesma.\t','Anônimo','Status para Fotos')\n" +
                ",('Onde quer que você esteja, esteja de todo coração! \t','Anônimo','Status para Fotos')\n" +
                ",('Não existe nenhum lugar melhor pra você estar, do que em paz consigo mesmo! \t','Anônimo','Status para Fotos')\n" +
                ",('Meu olhar tem disso. Esse negócio de brilhar o tempo todo.\t','Anônimo','Status para Fotos')\n" +
                ",('Não importam os caminhos se é luz que carregas.\t','Anônimo','Status para Fotos')\n" +
                ",('A tua essência vale mais do que teu status. \t','Anônimo','Status para Fotos')\n" +
                ",('Só anda por aí perfumada de liberdade e vestida de gratidão.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela ta de boa, ta leve e com a vida em paz! \t','Anônimo','Status para Fotos')\n" +
                ",('A fé é o nosso melhor sorriso para Deus! \t','Anônimo','Status para Fotos');";

        return frases;
    }
    public  static String carregarFrases3(){
        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES \n" +
                "('Que sua boca seja pequena demais para o tamanho do sorriso que a alma quer dar. \t','Anônimo','Status para Fotos')\n" +
                ",('Seja mais do que os olhos podem ver!\t','Anônimo','Status para Fotos')\n" +
                ",('Tudo aqui é exagerado, desde o sorriso até o abraço.\t','Anônimo','Status para Fotos')\n" +
                ",('Cada sorriso tem um amor, uma dor e a certeza de um caminho a seguir.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela é só dela e vai ser sempre assim!\t','Anônimo','Status para Fotos')\n" +
                ",('Faça do seu coração a sua própria zona de paz. \t','Anônimo','Status para Fotos')\n" +
                ",('Sentimentos bons não pesam, pode levar na alma e no coração, sem moderação!\t','Anônimo','Status para Fotos')\n" +
                ",('Se curta, se queira bem, se conquiste, se ame! Hoje é você por você e muitos dias também serão!\t','Anônimo','Status para Fotos')\n" +
                ",('Me permito ser feliz! Porque sim, por mim!\t','Anônimo','Status para Fotos')\n" +
                ",('Cada um dá de si o melhor que tem.\t','Anônimo','Status para Fotos')\n" +
                ",('Faça o bem, para receber o bem\t','Anônimo','Status para Fotos')\n" +
                ",('Somos o que temos no coração. O que passa disso é apenas aparência.\t','Anônimo','Status para Fotos')\n" +
                ",('Todo mundo fica bonito com uma boa luz (e ela vem de dentro)!\t','Anônimo','Status para Fotos')\n" +
                ",('Tudo depende da intensidade que cada coisa tem, do quanto seu coração se entrega! \t','Anônimo','Status para Fotos')\n" +
                ",('Com a força da minha fé, ando em qualquer lugar.\t','Anônimo','Status para Fotos')\n" +
                ",('Só é feliz quem sabe o que quer! \t','Anônimo','Status para Fotos')\n" +
                ",('O sorriso é a única curva que endireita as coisas. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é do sorriso fácil, do abraço apertado, do amor demorado. \t','Anônimo','Status para Fotos')\n" +
                ",('E se tiver a habilidade de amar, ame primeiro a si mesmo.\t','Anônimo','Status para Fotos')\n" +
                ",('Não adianta olhar para o céu com muita fé e pouca luta! \t','Anônimo','Status para Fotos')\n" +
                ",('Onde existe fé, sempre brilha a esperança! \t','Anônimo','Status para Fotos')\n" +
                ",('E com tantos amores, ela escolheu o próprio. \t','Anônimo','Status para Fotos')\n" +
                ",('Era brisa leve, agora é furacão. \t','Anônimo','Status para Fotos')\n" +
                ",('Sou como um livro.. Muitos sabem o nome, poucos conhecem a história. \t','Anônimo','Status para Fotos')\n" +
                ",('Arrisque! Ninguém é feliz com medo. \t','Anônimo','Status para Fotos')\n" +
                ",('A intensidade está na sua essência! \t','Anônimo','Status para Fotos')\n" +
                ",('Chega de observar o passado pela brecha da porta. Vá viver o novo! \t','Anônimo','Status para Fotos')\n" +
                ",('Quem é bonito por dentro, consegue atingir a perfeição do lado de fora. \t','Anônimo','Status para Fotos')\n" +
                ",('Tudo aquilo que pensa, você atrai. E quando acredita, torna-se real! \t','Anônimo','Status para Fotos')\n" +
                ",('Falar sem aspas, amar sem interrogação, viver e ponto final. \t','Anônimo','Status para Fotos')\n" +
                ",('Pra quem vive em conflito, minha paz é insulto. \t','Anônimo','Status para Fotos')\n" +
                ",('Quando eu decidi sorrir pra vida, ela passou a sorrir de volta pra mim! \t','Anônimo','Status para Fotos')\n" +
                ",('A expressão •só é feliz quem quer• nunca fez tanto sentido \t','Anônimo','Status para Fotos')\n" +
                ",('Propague amor, ecoe o bem! \t','Anônimo','Status para Fotos')\n" +
                ",('Na plenitude da sua felicidade, cada dia é uma vida inteira \t','Anônimo','Status para Fotos')\n" +
                ",('Gostava do infinito, não tinha vergonha do sorriso bonito! \t','Anônimo','Status para Fotos')\n" +
                ",('Coragem, humildade e amor! Para viver a vida que se pode fazer de cada um de nós! \t','Anônimo','Status para Fotos')\n" +
                ",('Seja conhecido pelo seu jeito bonito de ver a vida! \t','Anônimo','Status para Fotos')\n" +
                ",('Que a gente se encante cada vez mais pela simplicidade, pelo que é de verdade e por tudo que vier do coração! \t','Anônimo','Status para Fotos')\n" +
                ",('Felicidade é quando a sua liberdade te preenche! \t','Anônimo','Status para Fotos')\n" +
                ",('Seja mais você e menos o que os outros querem que você seja. \t','Anônimo','Status para Fotos')\n" +
                ",('Procure dentro de você a paz que não encontra ao seu redor. \t','Anônimo','Status para Fotos')\n" +
                ",('O que realmente importa mora dentro de mim. \t','Anônimo','Status para Fotos')\n" +
                ",('Livre pra poder amar, viver e sorrir... \t','Anônimo','Status para Fotos')\n" +
                ",('Dentro da gente cabe tanta coisa. Então minha oração de todos os dias é que caiba sempre mais amor. \t','Anônimo','Status para Fotos')\n" +
                ",('Cerque-se de energia positiva. \t','Anônimo','Status para Fotos')\n" +
                ",('Permita-se sentir tudo que está dentro de você! \t','Anônimo','Status para Fotos')\n" +
                ",('Deixe um sinal de alegria por onde passar! \t','Anônimo','Status para Fotos')\n" +
                ",('Às vezes o segredo é ir com medo mesmo! \t','Anônimo','Status para Fotos')\n" +
                ",('O melhor da vida é a sensação de paz e amor! \t','Anônimo','Status para Fotos')\n" +
                ",('Sorria mais e leve a vida simplesmente! \t','Anônimo','Status para Fotos')\n" +
                ",('Perdeu-se no abismo que é pensar e sentir... \t','Anônimo','Status para Fotos')\n" +
                ",('Dona de um coração lindo e um sorriso contagiante! \t','Anônimo','Status para Fotos')\n" +
                ",('Ela tinha a incrível mania de sorrir com os olhos e enxergar com a alma. \t','Anônimo','Status para Fotos')\n" +
                ",('Floresça em todas as estações! \t','Anônimo','Status para Fotos')\n" +
                ",('Exale coisas boas! \t','Anônimo','Status para Fotos')\n" +
                ",('Você faz suas escolhas e suas escolhas fazem você. \t','Anônimo','Status para Fotos')\n" +
                ",('A gente vai bem mais longe quando acredita. \t','Anônimo','Status para Fotos')\n" +
                ",('Só o impossível me interessa! \t','Anônimo','Status para Fotos')\n" +
                ",('Coisas incríveis não acontecem dentro da zona de conforto! \t','Anônimo','Status para Fotos')\n" +
                ",('As flores de um amanhã, estão nas sementes de hoje... \t','Anônimo','Status para Fotos')\n" +
                ",('E quanto todos forem maldade, ouse ser do bem! \t','Anônimo','Status para Fotos')\n" +
                ",('Feito girassol, buscando sempre a luz! \t','Anônimo','Status para Fotos')\n" +
                ",('A simplicidade não tem preço.. \t','Anônimo','Status para Fotos')\n" +
                ",('Pra ser feliz não precisa de tanto.. \t','Anônimo','Status para Fotos')\n" +
                ",('Deixa o sol brilhar na tua alma.. \t','Anônimo','Status para Fotos')\n" +
                ",('A cada novo dia é uma chance para reparar os erros e ser feliz! \t','Anônimo','Status para Fotos')\n" +
                ",('Cair em si é a única queda que lhe põe pra cima.. \t','Anônimo','Status para Fotos')\n" +
                ",('Ninguém apaga a luz que vem de dentro. \t','Anônimo','Status para Fotos')\n" +
                ",('Boas energias pra hoje e sempre! \t','Anônimo','Status para Fotos')\n" +
                ",('Me sinto leve, de alma e coração! \t','Anônimo','Status para Fotos')\n" +
                ",('VIVER é muito mais que existir! \t','Anônimo','Status para Fotos')\n" +
                ",('Todas as coisas do mundo encontram os seus lugares quando a gente encontra o nosso.. \t','Anônimo','Status para Fotos')\n" +
                ",('Só quem é inteiro sabe transbordar! \t','Anônimo','Status para Fotos')\n" +
                ",('Paz, amor, liberdade, calmaria e simplicidade...e que siga assim sempre! \t','Anônimo','Status para Fotos')\n" +
                ",('Faça de si mesmo seu próprio suporte, seu próprio refúgio! \t','Anônimo','Status para Fotos')\n" +
                ",('As vezes o que a gente precisa é se desligar do mundo, organizar a mente e voltar a viver. \t','Anônimo','Status para Fotos')\n" +
                ",('Calmaria, com a alma, ria! \t','Anônimo','Status para Fotos')\n" +
                ",('Daqui pra frente leve apenas o que couber no bolso e no coração! \t','Anônimo','Status para Fotos')\n" +
                ",('E tudo que for bom, que chegue e fique! \t','Anônimo','Status para Fotos')\n" +
                ",('Em caso de dúvida escolha sempre o que te acalma o coração. \t','Anônimo','Status para Fotos')\n" +
                ",('Perfumada de liberdade e vestida pela gratidão! \t','Anônimo','Status para Fotos')\n" +
                ",('Ser feliz e deixar a maré levar tudo o que tentar atrasar... \t','Anônimo','Status para Fotos')\n" +
                ",('Tenha o universo em si. \t','Anônimo','Status para Fotos')\n" +
                ",('Feita de sonhos com cobertura de fé. \t','Anônimo','Status para Fotos')\n" +
                ",('Quem faz o bem conquista a paz interior. \t','Anônimo','Status para Fotos')\n" +
                ",('A vida só te traz o melhor quando você deixa ir o que já não te pertence. \t','Anônimo','Status para Fotos')\n" +
                ",('Um pouco mais de alma, por favor! \t','Anônimo','Status para Fotos')\n" +
                ",('A liberdade é a sua essência! \t','Anônimo','Status para Fotos')\n" +
                ",('E se a vida lhe der uma rasteira Você levanta e segue em frente! \t','Anônimo','Status para Fotos')\n" +
                ",('Boas ações atraem boas consequências. \t','Anônimo','Status para Fotos')\n" +
                ",('O corpo perfeito é aquele que cabe uma alma cheia de luz dentro! \t','Anônimo','Status para Fotos')\n" +
                ",('Delete o que não serve e conserve o que lhe faz bem! \t','Anônimo','Status para Fotos')\n" +
                ",('Coloca o mundo no mudo e escuta teu coração! \t','Anônimo','Status para Fotos')\n" +
                ",('Que a alma brilhe, que o coração acalme... \t','Anônimo','Status para Fotos')\n" +
                ",('Eu me perco e me encontro, dentro de mim.\t','Anônimo','Status para Fotos')\n" +
                ",('Quem com luz ilumina, com luz será iluminado. \t','Anônimo','Status para Fotos')\n" +
                ",('A liberdade é a sua essência! \t','Anônimo','Status para Fotos')\n" +
                ",('Que sejamos leves, livres, que não nos falte alegria, paz e amor! \t','Anônimo','Status para Fotos')\n" +
                ",('Existe liberdade no sorriso. Ser forte é ser livre pra sorrir! \t','Anônimo','Status para Fotos')\n" +
                ",('A meta é buscar o melhor da vida em tudo que a gente faz. \t','Anônimo','Status para Fotos')\n" +
                ",('Quando se está em paz não há dia que não seja bonito.\t','Anônimo','Status para Fotos')\n" +
                ",('Só é bonito quem vê bem com o coração.\t','Anônimo','Status para Fotos')\n" +
                ",('A liberdade é o que me cabe mais bem.\t','Anônimo','Status para Fotos')\n" +
                ",('A gente fracassa quando tenta caber na vontade dos outros sendo que a gente tem que caber de verdade dentro da gente.\t','Anônimo','Status para Fotos')\n" +
                ",('Se alguém perguntar por mim, diz que saí por aí! \t','Anônimo','Status para Fotos')\n" +
                ",('Menina risonha, que ri e sonha. \t','Anônimo','Status para Fotos')\n" +
                ",('É tempo de plantar, renascer, de cuidar e perdoar! \t','Anônimo','Status para Fotos')\n" +
                ",('Nada nessa vida é tão importante do que aprender a entender quem você realmente é.\t','Anônimo','Status para Fotos')\n" +
                ",('Então ela sorriu, porque percebeu que a sua felicidade dependia apenas dela mesma e de mais ninguém! \t','Anônimo','Status para Fotos')\n" +
                ",('Por que melhor que ser flor, é fazer florir.\t','Anônimo','Status para Fotos')\n" +
                ",('Faça de ti mesmo teu próprio suporte, teu próprio refúgio.\t','Anônimo','Status para Fotos')\n" +
                ",('Se definir é se limitar. \t','Anônimo','Status para Fotos')\n" +
                ",('Viva os detalhes. Olhe nas entrelinhas. Não seja superficial. \t','Anônimo','Status para Fotos')\n" +
                ",('Moça da alma colorida! Pintou suas dores e plantou flores em suas feridas. \t','Anônimo','Status para Fotos')\n" +
                ",('Um universo bem grande dentro de si. \t','Anônimo','Status para Fotos')\n" +
                ",('Estar em paz é o melhor presente que você pode se dá! \t','Anônimo','Status para Fotos')\n" +
                ",('Seja protagonista da sua vida!\t','Anônimo','Status para Fotos')\n" +
                ",('Quando carregamos nossos baldes. Damos valor a cada gota de água.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu sou luz. E é de luz que é feita a minha vida!\t','Anônimo','Status para Fotos')\n" +
                ",('Plante amor pra reflorestar o mundo.. \t','Anônimo','Status para Fotos')\n" +
                ",('A vida só da asa a quem não tem medo de cair.\t','Anônimo','Status para Fotos')\n" +
                ",('A ocasião mais especial é viver! \t','Anônimo','Status para Fotos')\n" +
                ",('Todo mundo fica bonito com uma boa luz (e ela vem de dentro) \t','Anônimo','Status para Fotos')\n" +
                ",('Se permita apaixonar-se pela pessoa que está se tornando.\t','Anônimo','Status para Fotos')\n" +
                ",('Na rua ela é só certeza, por dentro é só mistério.\t','Anônimo','Status para Fotos')\n" +
                ",('É preciso um pouco de loucura para tomar a decisão de ser você mesmo.\t','Anônimo','Status para Fotos')\n" +
                ",('Tem o jeito de menina forte, mas é tão frágil quanto uma flor.\t','Anônimo','Status para Fotos')\n" +
                ",('Simplicidade é a tônica de toda verdadeira elegância!\t','Anônimo','Status para Fotos')\n" +
                ",('Sua mente é seu guia, seus atos tua sentença!\t','Anônimo','Status para Fotos')\n" +
                ",('E que a nossa vida seja repleta daquilo que nos faz bem. \t','Anônimo','Status para Fotos')\n" +
                ",('Seja rico daquilo que o dinheiro não compra.\t','Anônimo','Status para Fotos')\n" +
                ",('Redescubra quem você se tornou.\t','Anônimo','Status para Fotos')\n" +
                ",('O acaso, nada mais é do que a engrenagem do destino. \t','Anônimo','Status para Fotos')\n" +
                ",('Que a gente consiga ser luz para não de abater em dias escuros.\t','Anônimo','Status para Fotos')\n" +
                ",('Se as coisas não mudaram até agora deixe as coisas e mude você.\t','Anônimo','Status para Fotos')\n" +
                ",('Ninguém é tão eu que entenda como é navegar dentro de mim.\t','Anônimo','Status para Fotos')\n" +
                ",('Nunca permita que seus medos sejam maiores que seus sonhos.\t','Anônimo','Status para Fotos')\n" +
                ",('Não olhe para trás. Você não está indo para lá.\t','Anônimo','Status para Fotos')\n" +
                ",('Por quê cortar pela raíz se já deu flor\t','Anônimo','Status para Fotos')\n" +
                ",('Celebre a vida, se possível, todos os dias. \t','Anônimo','Status para Fotos')\n" +
                ",('A luz que me guia é mais forte do que as dificuldades que me cercam.\t','Anônimo','Status para Fotos')\n" +
                ",('A paz não existe em algum lugar distante. Ela começa ao nosso redor, no local em que estamos, e principalmente, dentro da gente. ','Anônimo','Status para Fotos')\n" +
                ",('Não deixe qualquer pessoa destruir a sua energia positiva.\t','Anônimo','Status para Fotos')\n" +
                ",('Viva pela vida, viva pelo mundo, viva pra mudar.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja vida na vida de alguém.\t','Anônimo','Status para Fotos')\n" +
                ",('Tudo é temporário, nossas emoções, pensamentos, pessoas. Não fique tão apegado, apenas deixe fluir.\t','Anônimo','Status para Fotos')\n" +
                ",('Tenha coragem de seguir sua intuição e o seu coração. O resto é secundário!\t','Anônimo','Status para Fotos')\n" +
                ",('O tempo tem uma forma maravilhosa de nos mostrar o que realmente importa.\t','Anônimo','Status para Fotos')\n" +
                ",('Um dia alguém será muito grato por conhecer você.\t','Anônimo','Status para Fotos')\n" +
                ",('Leve com você apenas o que for leve!\t','Anônimo','Status para Fotos')\n" +
                ",('O seu valor é ser exatamente quem você é! \t','Anônimo','Status para Fotos')\n" +
                ",('Que a gente seja alma antes de ser corpo!! \t','Anônimo','Status para Fotos')\n" +
                ",('Todas as coisas contribuem para a tua evolução. ACEITE E AGRADEÇA! \t','Anônimo','Status para Fotos')\n" +
                ",('Bonito é o que somos por dentro. O que somos por fora acaba com o tempo. \t','Anônimo','Status para Fotos')\n" +
                ",('Opte por aquilo que faz o seu coração vibrar!! \t','Anônimo','Status para Fotos')\n" +
                ",('É na simplicidade que se encontra o essencial\t','Anônimo','Status para Fotos')\n" +
                ",('Tudo vale a pena se a alma não é pequena! \t','Anônimo','Status para Fotos')\n" +
                ",('Que me traga paz ou me deixe em paz!\t','Anônimo','Status para Fotos')\n" +
                ",('Algumas coisas levam tempo. Outras, o tempo leva.\t','Anônimo','Status para Fotos')\n" +
                ",('Não importa onde estamos, nossa mente é nosso lar.\t','Anônimo','Status para Fotos')\n" +
                ",('Se tens felicidade, não precisa escondê-la.\t','Anônimo','Status para Fotos')\n" +
                ",('A vida é feita de escolhas, a minha foi ser feliz todos os dias!\t','Anônimo','Status para Fotos')\n" +
                ",('Seja o amor da sua vida!\t','Anônimo','Status para Fotos')\n" +
                ",('Colecione momentos. Não coisas.\t','Anônimo','Status para Fotos')\n" +
                ",('Daí eu fui. E vou toda vez que o amor me chamar.\t','Anônimo','Status para Fotos')\n" +
                ",('Ser moldado por Deus, é ter certeza de ser um vaso raro.\t','Anônimo','Status para Fotos')\n" +
                ",('Tudo se baseia na fé que você tem.\t','Anônimo','Status para Fotos')\n" +
                ",('Um dia você vai compreender o porquê de Deus não ter te dado tudo que desejou. Você enxerga o hoje, mas Deus a eternidade.\t','Anônimo','Status para Fotos')\n" +
                ",('Tempestade somente de coisas boas!\t','Anônimo','Status para Fotos')\n" +
                ",('Tudo vai acontecer no tempo certo…\t','Anônimo','Status para Fotos')\n" +
                ",('Vai com calma, sem pressa… Se for pra ser, vai ser!\t','Anônimo','Status para Fotos')\n" +
                ",('Não há nada como a respiração profunda depois de dar uma gargalhada. Nada no mundo se compara à barriga dolorida pelas razões certas.\t','Anônimo','Status para Fotos')\n" +
                ",('A vida muda, quando você muda…\t','Anônimo','Status para Fotos')\n" +
                ",('Abaixar a cabeça Só se for pra orar!\t','Anônimo','Status para Fotos')\n" +
                ",('Agradar a si, não aos outros…\t','Anônimo','Status para Fotos')\n" +
                ",('A luz que me guia é bem mais forte que os olhos que me cercam!\t','Anônimo','Status para Fotos')\n" +
                ",('Aos braços do passado dedico as minhas vitórias.\t','Anônimo','Status para Fotos')\n" +
                ",('A maldade do mundo te fez ser durona…\t','Anônimo','Status para Fotos')\n" +
                ",('Medita, se eleva, relaxa, eleva!\t','Anônimo','Status para Fotos')\n" +
                ",('E eu continuo regando meu jardim de lindezas. Porque melhor que ser flor, é fazer florir. Cultivo sorrisos, pra cativar corações.\t','Anônimo','Status para Fotos')\n" +
                ",('Objetivo do dia: Ser uma pessoa melhor, não perfeito, apenas melhor que ontem.\t','Anônimo','Status para Fotos')\n" +
                ",('Onde quer que formos, será o paraíso…\t','Anônimo','Status para Fotos')\n" +
                ",('Cada um tem sua história, eu tô aqui pra aprender, não pra julgar.\t','Anônimo','Status para Fotos')\n" +
                ",('Café esfria Sentimento também.\t','Anônimo','Status para Fotos')\n" +
                ",('Colecione momentos, não coisas.\t','Anônimo','Status para Fotos')\n" +
                ",('Confiar em Deus e nunca se decepcionar!\t','Anônimo','Status para Fotos')\n" +
                ",('Crescer, evoluir e manter as bases fortes!\t','Anônimo','Status para Fotos')\n" +
                ",('Cuidado com o medo, ele adora roubar sonhos.\t','Anônimo','Status para Fotos')\n" +
                ",('Dar valor às coisas, não pelo que valem, mas pelo que significam…\t','Anônimo','Status para Fotos')\n" +
                ",('Enquanto não chego, observo e isso só soma. Essencial pra todo ser que sonha é ter uma visão ampla.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu coloco uma prioridade altíssima em ser feliz.\t','Anônimo','Status para Fotos')\n" +
                ",('Mas o fato é que fomos, somos e seremos sempre muito fortes.\t','Anônimo','Status para Fotos')\n" +
                ",('Não chore porque acabou. Sorria porque aconteceu.\t','Anônimo','Status para Fotos')\n" +
                ",('Quantas vidas você precisa pra viver a sua\t','Anônimo','Status para Fotos')\n" +
                ",('Quantos “e se” você tem guardados\t','Anônimo','Status para Fotos')\n" +
                ",('Equilíbrio, tranquilidade, positividade!\t','Anônimo','Status para Fotos')\n" +
                ",('Errar, superar, aprender e recomeçar!\t','Anônimo','Status para Fotos')\n" +
                ",('Nem sempre a propaganda de fora corresponde ao produto de dentro.\t','Anônimo','Status para Fotos')\n" +
                ",('No final é tudo louco de alma pura.\t','Anônimo','Status para Fotos')\n" +
                ",('O difícil não é perder, e sim desistir de um sonho!\t','Anônimo','Status para Fotos')\n" +
                ",('O meu medo, é que as pessoas que eu mais confio estejam mentindo para mim.\t','Anônimo','Status para Fotos')\n" +
                ",('O segredo é pensamento positivo, gratidão e olhar pra frente…\t','Anônimo','Status para Fotos')\n" +
                ",('O tempo passa, os planos mudam.\t','Anônimo','Status para Fotos')\n" +
                ",('Se você acha que eu não me importo, você está muito certo!\t','Anônimo','Status para Fotos')\n" +
                ",('A gente aceita o amor que acha que merece.\t','Anônimo','Status para Fotos')\n" +
                ",('Se benze porque a sua felicidade vai ofender muita gente!\t','Anônimo','Status para Fotos')\n" +
                ",('Se você pode sonhar, você pode fazer.\t','Anônimo','Status para Fotos')\n" +
                ",('Segue o teu destino. Rega tuas plantas. Ama tuas rosas. O resto é sombra de árvores alheias.\t','Anônimo','Status para Fotos')\n" +
                ",('Brilhando em vida, sorrindo a toa…\t','Anônimo','Status para Fotos')\n" +
                ",('É hora de seguir em frente.\t','Anônimo','Status para Fotos')\n" +
                ",('Quando você tem uma meta, o que era um obstáculo passa a ser uma etapa de um de seus planos.\t','Anônimo','Status para Fotos')\n" +
                ",('Quem reina é ela no reino do mar!\t','Anônimo','Status para Fotos')\n" +
                ",('Só é feliz quem sabe o que quer.\t','Anônimo','Status para Fotos')\n" +
                ",('Sonhar, viver e todo o dia agradecer.\t','Anônimo','Status para Fotos')\n" +
                ",('Sorria mais, transmita paz, não desista jamais!\t','Anônimo','Status para Fotos')\n" +
                ",('Te sugiro doses de bom senso e maturidade!!!\t','Anônimo','Status para Fotos')\n" +
                ",('Seja você mesmo, todos os outros já existem….\t','Anônimo','Status para Fotos')\n" +
                ",('Sempre colocando 100% e recebendo 2%…\t','Anônimo','Status para Fotos')\n" +
                ",('Não se preocupe. As pessoas jogam pedra até em coisas que brilham.\t','Anônimo','Status para Fotos')\n" +
                ",('Que cada dia leve consigo a maravilha do momento que passa. Existir é um privilégio. Viver é maravilhoso.\t','Anônimo','Status para Fotos')\n" +
                ",('Quem mais pensou num futuro contigo, pensou menos que eu.\t','Anônimo','Status para Fotos')\n" +
                ",('São as atitudes e não as circunstâncias que determinam o valor de cada um. O que você diz, com todo respeito, é apenas o que você diz.\t','Anônimo','Status para Fotos')\n" +
                ",('Se não for hoje, um dia será. Algumas coisas, por mais impossíveis e malucas que pareçam, a gente sabe, bem no fundo, que foram feitas para um dia dar certo.\t','Anônimo','Status para Fotos')\n" +
                ",('Vida longa. Mundo pequeno. A gente ainda vai se encontrar.\t','Anônimo','Status para Fotos')\n" +
                ",('A beleza não importa…O que vale é meu carater !\t','Anônimo','Status para Fotos')\n" +
                ",('A curva mais bonita em uma mulher , sem duvidas é o sorriso.\t','Anônimo','Status para Fotos')\n" +
                ",('Aqui é 8 ou 80, ou você aguenta ou nem tenta.\t','Anônimo','Status para Fotos')\n" +
                ",('As vezes não precisamos de conselhos, só precisamos de alguém que nos ouça sem nos julgar.\t','Anônimo','Status para Fotos')\n" +
                ",('Cada inimigo seu vai te aplaudir de pé, quando o seu escudo for o seu olhar, e sua espada for sua fé!\t','Anônimo','Status para Fotos')\n" +
                ",('Dê valor a momentos e não a lembranças porque o passado nunca volta.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela é tão ela, e as outras são todas iguais…\t','Anônimo','Status para Fotos')\n" +
                ",('Ela tem mais fases do que a lua…\t','Anônimo','Status para Fotos')\n" +
                ",('Em cada pensamento meu, sua imagem ocupa um espaço.\t','Anônimo','Status para Fotos')\n" +
                ",('Nem sempre desistir é sinal de fraqueza. Às vezes, é preciso ser muito forte para deixar ir.\t','Anônimo','Status para Fotos')\n" +
                ",('O esquema é ter calma. A vida inteira é feita pra ser feliz. Abra os olhos pro que o coração te diz!\t','Anônimo','Status para Fotos')\n" +
                ",('Pense em tudo que você passou. Conserte agora o que há pra consertar. Um mundo novo está te chamando, é hora de voar. Lembre-se de onde você partiu, planeje onde você quer chegar. O mundo inteiro está esperando a sua luz brilhar.\t','Anônimo','Status para Fotos')\n" +
                ",('Espera que o sol já vem…\t','Anônimo','Status para Fotos')\n" +
                ",('E quantas vezes você pensou que não ia suportar, mas suportou Fé em Deus, levante a cabeça, olhe no espelho: você é a medida do impossível, um carrossel de milagres, plantação de Deus.\t','Anônimo','Status para Fotos')\n" +
                ",('Ela tem alma de pipa avoada, mas na sua estante imaginária coleciona corações.\t','Anônimo','Status para Fotos')\n" +
                ",('Eles adoram lhe dizer: “Não saia dos limites”, mas há algo melhor do outro lado…\t','Anônimo','Status para Fotos')\n" +
                ",('Eu não to nem aí pra o que os outros falam…\t','Anônimo','Status para Fotos')\n" +
                ",('Eu sou romance de verão, sou brisa leve passageira.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu te passei a missão te falei como é que é , antes de falar de mim ve se aprende a ser mulher.\t','Anônimo','Status para Fotos')\n" +
                ",('Goste quem gostar.. Eu sou assim.\t','Anônimo','Status para Fotos')\n" +
                ",('Histórias fáceis não costumam virar lenda. Amores fáceis não fazem história.\t','Anônimo','Status para Fotos')\n" +
                ",('Inveja é doença, eu te desejo melhoras!\t','Anônimo','Status para Fotos')\n" +
                ",('Linda flor que não se acha na floricultura…\t','Anônimo','Status para Fotos')\n" +
                ",('Mas o mundo da voltas e nas voltas que o mundo dá, você teve que me aceitar.\t','Anônimo','Status para Fotos')\n" +
                ",('Meu nome é Tédio, meu sobrenome é Ciúmes, me separei da Paciência e me casei com a Preguiça.\t','Anônimo','Status para Fotos')\n" +
                ",('Minha cara metade, meu amor eterno!\t','Anônimo','Status para Fotos')\n" +
                ",('Não há mentiras nem verdades aqui…\t','Anônimo','Status para Fotos')\n" +
                ",('Não me convença com grandes palavras, me surpreenda com pequenas atitudes…\t','Anônimo','Status para Fotos')\n" +
                ",('Não se preocupe com a minha vida, graças a Deus, eu sei cuidar dela sozinha.\t','Anônimo','Status para Fotos')\n" +
                ",('Não seja empurrado por seus problemas, seja conduzido por seus sonhos.\t','Anônimo','Status para Fotos')\n" +
                ",('Não sou feita de palavras, sou feita de atitudes. \t','Anônimo','Status para Fotos')\n" +
                ",('Pena que bons momentos não têm replay.\t','Anônimo','Status para Fotos')\n" +
                "\n" +
                ",('Poesia pra ser lida com a alma. \t','Anônimo','Status para Fotos')\n" +
                ",('Tem tanto de flor dentro de você, menina! \t','Anônimo','Status para Fotos')\n" +
                ",('Gratidão a vida que me inspira, me renova e me dá chances de evoluir diariamente. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é intensa, sincera, dona de um sorriso incrível e um coração lindo. \t','Anônimo','Status para Fotos')\n" +
                ",('Pela lógica eu não agrado a todos, e pela minha vontade eu não faço nem questão. \t','Anônimo','Status para Fotos')\n" +
                ",('O segredo é se permitir florescer. \t','Anônimo','Status para Fotos')\n" +
                ",('Agarre toda chance de ser feliz. Se te faz bem, sempre vale o risco. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é do sorriso fácil, do abraço apertado, do amor demorado… e da fé que move montanhas. \t','Anônimo','Status para Fotos')\n" +
                ",('Dentro de um olhar cabe o universo inteiro. Dentro da energia, cabe toda a criação \t','Anônimo','Status para Fotos')\n" +
                ",('Consagro os meus planos a Deus e assim vou seguindo. \t','Anônimo','Status para Fotos')\n" +
                ",('Hoje, ela não olha mais pra trás, compreendeu que é pra frente que se anda, que se ama. \t','Anônimo','Status para Fotos')\n" +
                ",('Fala mal de mim ela quer ser eu, ela é minha fã mais não quer assumir.\t','Anônimo','Status para Fotos')\n" +
                ",('Apaga da tua vida tudo que te faz mal.\t','Anônimo','Status para Fotos')\n" +
                ",('Enquanto você reclama da sua vida, ela está passando…\t','Anônimo','Status para Fotos')\n" +
                ",('Não me defino, não me limito, não me descrevo. \t','Anônimo','Status para Fotos')\n" +
                ",('Não deixo de sorrir, não há ninguém que possa ser feliz por mim. \t','Anônimo','Status para Fotos')\n" +
                ",('Entre as verdades já ditas, o sorriso é a mais bonita. \t','Anônimo','Status para Fotos')\n" +
                ",('Coragem para vestir-se de quem se é. \t','Anônimo','Status para Fotos')\n" +
                ",('Segura de mim, de quem sou e do que quero. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é aquela menina que sonha, aquela moça que acredita e aquela mulher que realiza sem nunca perder a fé. \t','Anônimo','Status para Fotos')\n" +
                ",('Quando a estrada se fizer longa demais, voarei. Quando tudo parecer infinito, infinita serei. \t','Anônimo','Status para Fotos')\n" +
                ",('Transbordando todo o bem e o amor que habitam em mim… \t','Anônimo','Status para Fotos')\n" +
                ",('Eu confio que só chegam até mim as pessoas e situações que me ajudam a cumprir a minha missão na Terra… Deus sabe de tudo! \t','Anônimo','Status para Fotos')\n" +
                ",('Habitante de um lar sem muros. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela resolveu ser como o sol, brilhar sozinha...\t','Anônimo','Status para Fotos')\n" +
                ",('Aceitação muda tudo, eu sou feita de poesia e me amo assim.\t','Anônimo','Status para Fotos')\n" +
                ",('Seja dona de si, a vida te espera para ocupar o lugar de protagonista. \t','Anônimo','Status para Fotos')\n" +
                ",('Vou no meu tempo, com calma, quando e como consigo, mas nunca deixo de ir. \t','Anônimo','Status para Fotos')\n" +
                ",('Experimente o amor próprio , todos os dias. \t','Anônimo','Status para Fotos')\n" +
                ",('A quem ousar me definir, atente-se: Os tempos são outros e eu não sou o óbvio. \t','Anônimo','Status para Fotos')\n" +
                ",('Do meu jeito, no meu tempo, vou sendo cada vez mais feliz. \t','Anônimo','Status para Fotos')\n" +
                ",('Estar em paz com as minhas escolhas tem sido minha melhor escolha. \t','Anônimo','Status para Fotos')\n" +
                ",('Cortaram minhas asas mas esqueceram de cortar minha coragem, voei. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é um oceano de mistérios, sabe navegar e só ancora se suportar intensidade. \t','Anônimo','Status para Fotos')\n" +
                ",('Solta o sorriso! A vida precisa ser leve! \t','Anônimo','Status para Fotos')\n" +
                ",('Voe na freque^ncia que te inspira! \t','Anônimo','Status para Fotos')\n" +
                ",('Não existem forças capazes de derrubar uma mulher que se descobriu. \t','Anônimo','Status para Fotos')\n" +
                ",('Sua alma sorri e agradece a cada vez que você se veste de si! \t','Anônimo','Status para Fotos')\n" +
                ",('Meu propósito não é ter uma vida íncrivel aos olhos dos outros, e sim ter uma vida que encha o seu coração de alegria, porque eu estou em paz comigo mesma! \t','Anônimo','Status para Fotos')\n" +
                ",('Quando eu finalmente entendi que eu sou meu maior compromisso, tudo mudou. \t','Anônimo','Status para Fotos')\n" +
                ",('Tô inteira, me amando, completa e leve. Não vai ser qualquer pessoa que vai me tirar do eixo. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é um lugar que será sempre dela. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é forte, enfrenta tempestades com fé e coragem. \t','Anônimo','Status para Fotos')\n" +
                ",('Um coração em paz floresce mesmo sozinho. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é inteira, forte, cheia de fé, feliz. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela é inteira, forte, cheia de fé, feliz. \t','Anônimo','Status para Fotos')\n" +
                ",('Você atrai o que você é, seja amor. \t','Anônimo','Status para Fotos')\n" +
                ",('Antes e depois de tudo, ore! \t','Anônimo','Status para Fotos')\n" +
                ",('Por um instante, se deixe em paz. \t','Anônimo','Status para Fotos')\n" +
                ",('Foque nas coisas boas, seja positivo! \t','Anônimo','Status para Fotos')\n" +
                ",('Celebre a vida e só! \t','Anônimo','Status para Fotos')\n" +
                ",('Com a alma tranquila e sorrindo, eu agradeço!\t','Anônimo','Status para Fotos')\n" +
                ",('Com a alma tranquila e sorrindo, eu agradeço!\t','Anônimo','Status para Fotos')\n" +
                ",('Amor por onde f(l)or! \t','Anônimo','Status para Fotos')\n" +
                ",('Só gaste a sua eternia com o que te ilumina. \t','Anônimo','Status para Fotos')\n" +
                ",('Desde que sentiu que Deus é sua melhor companhia, não tem mais medo de ficar sozinha; \t','Anônimo','Status para Fotos')\n" +
                ",('Deixa fluir, deixa florir. \t','Anônimo','Status para Fotos')\n" +
                ",('Alma leve e coração pleno! \t','Anônimo','Status para Fotos')\n" +
                ",('Só quer paz no coração e calma na alma. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela e sua incansável mania de, apesar de tudo, florescer sempre... \t','Anônimo','Status para Fotos')\n" +
                ",('Alma limpa, santo forte e uma imensa vontade de ser feliz! \t','Anônimo','Status para Fotos')\n" +
                ",('Elá é imperfeita, mas é de verdade!\t','Anônimo','Status para Fotos')\n" +
                ",('Elá é imperfeita, mas é de verdade!\t','Anônimo','Status para Fotos')\n" +
                ",('Floria em todas as estações, pois o coração dela era primaveira. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela percebeu que florescer é algo que só depende dela! \t','Anônimo','Status para Fotos')\n" +
                ",('Olhe para si. A maneira como você se ama, ensina os outros como te amarem. \t','Anônimo','Status para Fotos')\n" +
                ",('Você merece viver uma vida que te ilumine! \t','Anônimo','Status para Fotos')\n" +
                ",('Feito um girassol, essa moça cheia de luz, vive tirando o sol pra dançar. \t','Anônimo','Status para Fotos')\n" +
                ",('Ela só quer o que for de verdade, o que trouxer reprocidade e vier pra transbordar. \t','Anônimo','Status para Fotos')\n" +
                ",('Não economize o seu melhor sorriso! \t','Anônimo','Status para Fotos')\n" +
                ",('Prefiro sorrir, me permito ser feliz, porque sim, por mim!\t','Anônimo','Status para Fotos')\n" +
                ",('Prefiro sorrir, me permito ser feliz, porque sim, por mim!\t','Anônimo','Status para Fotos')\n" +
                ",('Ela é poesia pra ser lida com a alma. \t','Anônimo','Status para Fotos')\n" +
                ",('Quem no pouco que faz, põe tudo que é, merece ser feliz! \t','Anônimo','Status para Fotos')\n" +
                ",('Quem conhece o teu coração sente a tua verdade. \t','Anônimo','Status para Fotos')\n" +
                ",('A menina dos olhos de Deus com o coração de constelação de estrelas.. \t','Anônimo','Status para Fotos')\n" +
                ",('Faça e refaça tudo aquilo que te deixa feliz. \t','Anônimo','Status para Fotos')\n" +
                ",('Quando você acredita em você, é impossível não florescer. \t','Anônimo','Status para Fotos')\n" +
                ",('Tem se reinventado, pois entendeu que ainda pode ser bem melhor. Bem maior. Bem mais feliz. \t','Anônimo','Status para Fotos')\n" +
                ",('A vida não é fácil, é faça!\t','Anônimo','Status para Fotos')\n" +
                ",('A vida não é fácil, é faça!\t','Anônimo','Status para Fotos')\n" +
                ",('A alegria dos seus Olhos e o desejo do Seu corpo.\t','Anônimo','Status para Fotos')\n" +
                ",('A inveja que mata não me afeta mais pois o que conquistei tem o direito de ser meu…\t','Anônimo','Status para Fotos')\n" +
                ",('E agora já nem sei qual é o meu lugar.\t','Anônimo','Status para Fotos')\n" +
                ",('E pela minha lei, a gente era obrigado a ser feliz!\t','Anônimo','Status para Fotos')\n" +
                ",('De hoje em diante todo dia vai ser o dia mais importante! \t','Anônimo','Status para Fotos')\n" +
                ",('Contra inveja eu sou vacinada…\t','Anônimo','Status para Fotos')\n" +
                ",('Alguém me interne no paraíso, preciso urgente dar um tempo por lá… \t','Anônimo','Status para Fotos')\n" +
                ",('Eu digo olá pro futuro! \t','Anônimo','Status para Fotos')\n" +
                ",('Alegria é a melhor vingança! \t','Anônimo','Status para Fotos')\n" +
                ",('A curva mais bonita em uma mulher, sem duvidas é o sorriso\t','Anônimo','Status para Fotos')\n" +
                ",('A felicidade não está na estrada que leva a algum lugar! (A felicidade é a própria estrada) \t','Anônimo','Status para Fotos')\n" +
                ",('Adolescente estranha e fora do padrão, não tente me entender.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu faço do meu jeito, se te incomoda é porque funciona.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu ando de braços bem dados com a loucura! \t','Anônimo','Status para Fotos')\n" +
                ",('Falar sem pensar é atirar sem apontar.\t','Anônimo','Status para Fotos')\n" +
                ",('E que o tempo leve de mim somente aquilo que me faz mal. \t','Anônimo','Status para Fotos')\n" +
                ",('Eu tô sempre ligado , e mantenho minha mente aberta .\t','Anônimo','Status para Fotos')\n" +
                ",('As paixões cegam. o verdadeiro amor nos tornam lúcidos.\t','Anônimo','Status para Fotos')\n" +
                ",('Deixe que o instinto mais puro te mostre o caminho…\t','Anônimo','Status para Fotos')\n" +
                ",('As vezes eu falo com a vida, as vezes é ela quem diz…\t','Anônimo','Status para Fotos')\n" +
                ",('Eu possuo muitas coisas, mas nada disso me possui…\t','Anônimo','Status para Fotos')\n" +
                ",('Arrasa no estilo sem exagerar. Toda top sensual de um jeito particular! \t','Anônimo','Status para Fotos')\n" +
                ",('A vida é como uma bicicleta: se você não equilibrar, cai.\t','Anônimo','Status para Fotos')\n" +
                ",('Eu tenho o maior medo desse negócio de ser normal…\t','Anônimo','Status para Fotos')\n" +
                ",('Acalma a alma. Tudo no tempo certo. O que tiver que ser seu, será. \t','Anônimo','Status para Fotos')\n" +
                ",('Nada é tão bom quanto a nossa própria companhia. \t','Anônimo','Status para Fotos')\n" +
                ",('E nada é mais eficaz que o pensamento positivo amplificado…\t','Anônimo','Status para Fotos')\n" +
                ",('Eu não ligo para o que as pessoas pensam sobre mim, porque minha personalidade não é feita de opiniões e sim, de fatos. \t','Anônimo','Status para Fotos')\n" +
                ",('Aprendi que não devo me importar com os comentários que não vão mudar a minha vida .\t','Anônimo','Status para Fotos')\n" +
                ",('Errar é um defeito, assumir o erro é uma qualidade e perdoar é uma virtude\t','Anônimo','Status para Fotos')\n" +
                ",('E o final feliz é a gente que faz! \t','Anônimo','Status para Fotos')\n" +
                ",('Fui covarde em me calar, faltou coragem pra eu decidir com quem, com quem ficar…\t','Anônimo','Status para Fotos')\n" +
                ",('Esqueça dos motivos que te fazem chorar e lembre-se só dos que te fazem sorrir. \t','Anônimo','Status para Fotos')\n" +
                ",('Cuidado , grandes riscos de desejo e paixão.\t','Anônimo','Status para Fotos')\n" +
                ",('Se não for pra me fazer voar bem alto, nem tire meus pés do chão! \t','Anônimo','Status para Fotos')\n" +
                ",('Evito definir o que sou, mas estou bem certa do que não quero ser. \t','Anônimo','Status para Fotos')\n" +
                ",('Não deixe de sonhar, nem pare de sorrir. Na vida não vai achar, quem vai sorrir por ti. \t','Anônimo','Status para Fotos')\n" +
                ",('A little girl grew up too fast ! (Uma garota pequena que cresceu rápido demais) \t','Anônimo','Status para Fotos')\n" +
                ",('Enquanto isso, eu vivo a minha vida da melhor forma possível!\t','Anônimo','Status para Fotos')\n" +
                ",('Aquele que sente saudades, jamais vive só.\t','Anônimo','Status para Fotos')\n" +
                ",('Aquele que sente saudades, jamais vive só. \t','Anônimo','Status para Fotos')\n" +
                ",('A realidade é o maior pesadelo no mundo dos sonhos.\t','Anônimo','Status para Fotos')\n" +
                ",('Aquela viagem, o sol, a lua e as estrelas.\t','Anônimo','Status para Fotos')\n" +
                ",('Meu presente e o remetente era Deus. \t','Anônimo','Status para Namorado')\n" +
                ",('Você tem um jeito incrível de fazer o meu coração feliz. \t','Anônimo','Status para Namorado')\n" +
                ",('Fica comigo, me faz de abrigo, que eu te amo tanto... \t','Anônimo','Status para Namorado')\n" +
                ",('Minha paz tem o som da tua voz. \t','Anônimo','Status para Namorado')\n" +
                ",('Você apareceu e tudo em mim quis ser teu. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é a felicidade que a vida reservou pra mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Até parece que eu conseguiria te olhar sem te querer. \t','Anônimo','Status para Namorado')\n" +
                ",('A vida é boa, mas é muito melhor com você. \t','Anônimo','Status para Namorado')\n" +
                ",('Certos abraços confortam até a alma. \t','Anônimo','Status para Namorado')\n" +
                ",('Toda paz do mundo cabe dentro dos teus olhos. \t','Anônimo','Status para Namorado')\n" +
                ",('Quando Deus abençoa, nada separa. \t','Anônimo','Status para Namorado')\n" +
                ",('Tem gente que não sabe a paz que transmite, não sabe a leveza que é. \t','Anônimo','Status para Namorado')\n" +
                ",('Quanto mais eu fico contigo, mais eu quero ficar. Te amo! \t','Anônimo','Status para Namorado')\n" +
                ",('Amor é o resumo do infinito. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu e você somos propósito de Deus. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu dei a Deus a caneta para escrever essa história de amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Com você eu sei que nada é por acaso e muito menos em vão. Eu amo você. \t','Anônimo','Status para Namorado')\n" +
                ",('O destino acertou dessa vez e eu não me canso de gritar para o mundo o quanto te amo. \t','Anônimo','Status para Namorado')\n" +
                ",('Quando eu notei, eu já o amava e o incluia em minhas orações. \t','Anônimo','Status para Namorado')\n" +
                ",('Em mim; você. Em nós; o infinito. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu quero ser lembrada com você. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é a página mais linda que Deus escreveu na minha vida. Te amo \t','Anônimo','Status para Namorado')\n" +
                ",('Eu por você, você por mim e Deus por nós. \t','Anônimo','Status para Namorado')\n" +
                ",('Estado civil: completamente feliz ao seu lado. \t','Anônimo','Status para Namorado')\n" +
                ",('Sua voz é uma canção que me inspira dia após dia. \t','Anônimo','Status para Namorado')\n" +
                ",('Que o nosso brilho não se ofusque. Que as energias negativas de outros não nos abalem. Te amo! \t','Anônimo','Status para Namorado')\n" +
                ",('Nos planos de Deus nunca existe erro. Tudo o que vem através dele é perfeito. \t','Anônimo','Status para Namorado')\n" +
                ",('Que nosso maior compromisso sempre prevaleça. aquele de fazer um ao outro feliz. \t','Anônimo','Status para Namorado')\n" +
                ",('Há quem toca a pele, há quem toca a alma. \t','Anônimo','Status para Namorado')\n" +
                ",('Nas minhas orações você tá na parte dos agradecimentos; isso é amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Cê sabe que esse teu sorriso é meu ponto fraco. \t','Anônimo','Status para Namorado')\n" +
                ",('A minha paz tem o som da tua voz. \t','Anônimo','Status para Namorado')\n" +
                ",('Desejo que todos os seus dias sejam como os meus depois que te conheci. \t','Anônimo','Status para Namorado')\n" +
                ",('Você apareceu e tudo em mim quis ser teu. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu abro meu sorriso toda vez que você abre seus braços! Ahh, se meu abraço falasse o quanto que te amo. \t','Anônimo','Status para Namorado')\n" +
                ",('Você me trouxe uma fé tão bonita, me encheu de vontade de confiar novamente que o amor não fere, é cura. \t','Anônimo','Status para Namorado')\n" +
                ",('Aquele beijo com gosto de amor e vontade de ficar! \t','Anônimo','Status para Namorado')\n" +
                ",('Gosto do seu perfume, tu cheira ao amor da minha vida. \t','Anônimo','Status para Namorado')\n" +
                ",('Te abraçar é a desculpa mais bonita pro meu coração beijar o teu. \t','Anônimo','Status para Namorado')\n" +
                ",('Gaste suas horas com quem faz seu tempo parar. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é meu melhor momento, meu barulho, meu silêncio, você é o meu melhor lugar. \t','Anônimo','Status para Namorado')\n" +
                ",('É um laço entre dois corações. É um sorriso frouxo demais. É encontrar um lar em outro peito. \t','Anônimo','Status para Namorado')\n" +
                ",('O meu coração fez de ti a casa que sempre quis ter. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é aquele sorriso que eu dou sem perceber. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é sinônimo de felicidade na minha vida. \t','Anônimo','Status para Namorado')\n" +
                ",('E mesmo quando as coisas não estão dando certo, seu sorriso me mostra que ficará tudo bem. \t','Anônimo','Status para Namorado')\n" +
                ",('Teu olhar me desmonta inteira, mas teu abraço reconstrói cada pedacinho meu. \t','Anônimo','Status para Namorado')\n" +
                ",('Até parece que eu conseguiria te olhar e não te querer. \t','Anônimo','Status para Namorado')\n" +
                ",('Duas linhas não se cruzam à toa... Ainda bem! \t','Anônimo','Status para Namorado')\n" +
                ",('Encosta a tua calma no meu caos e faz de você minha paz! \t','Anônimo','Status para Namorado')\n" +
                ",('Você é um universo de coisas boas tão bonito, amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Vou te emprestar meus olhos pra você vê a coisa linda que vejo quando você sorri. \t','Anônimo','Status para Namorado')\n" +
                ",('Ele é tudo que ela quer. E ela é tudo o que ele precisa. \t','Anônimo','Status para Namorado')\n" +
                ",('Meu coração se encontrou no meu amor por você. \t','Anônimo','Status para Namorado')\n" +
                ",('O meu coração sempre capota na curva do teu sorriso. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é sempre um bom motivo pra eu querer ser feliz. \t','Anônimo','Status para Namorado')\n" +
                ",('Te amo de todas as formas e sentidos. \t','Anônimo','Status para Namorado')\n" +
                ",('Mas se a gente vai juntinho, vai bem... \t','Anônimo','Status para Namorado')\n" +
                ",('Você faz meu dia (e minha vida) mais feliz. \t','Anônimo','Status para Namorado')\n" +
                ",('A vida com você é muito mais bonita! \t','Anônimo','Status para Namorado')\n" +
                ",('Amar é enfrentar as dificuldades de mãos dadas... \t','Anônimo','Status para Namorado')\n" +
                ",('Teu sorriso me salva de qualquer dia ruim. \t','Anônimo','Status para Namorado')\n" +
                ",('A nossa felicidade só depende de nós dois. \t','Anônimo','Status para Namorado')\n" +
                ",('Te dei meu coração, você cuidou tão bem... \t','Anônimo','Status para Namorado')\n" +
                ",('A luz dos meus dias, razão do meu sorrir! \t','Anônimo','Status para Namorado')\n" +
                ",('Tudo se encaixou tão bem e a gente foi além. \t','Anônimo','Status para Namorado')\n" +
                ",('Era você quando eu ria sozinha e ninguém sabia o porquê. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu e essa linda mania de só ter olhos pra você... \t','Anônimo','Status para Namorado')\n" +
                ",('Veja bem, meu bem, a gente combina até no jeito sem jeito. \t','Anônimo','Status para Namorado')\n" +
                ",('Você me sorriu e a vida mudou. \t','Anônimo','Status para Namorado')\n" +
                ",('Gosto mesmo é quando tua risada se mistura com a minha e teus olhos me dizem \"te quero também\"... \t','Anônimo','Status para Namorado')\n" +
                ",('Sabe aquela pessoa que você passa a vida inteira procurando pra viver Pra mim é você. \t','Anônimo','Status para Namorado')\n" +
                ",('Por mim, ficava a eternidade só no teu abraço. \t','Anônimo','Status para Namorado')\n" +
                ",('A vida fica mais bonita quando a gente encontra alguém que nos faça bem. \t','Anônimo','Status para Namorado')\n" +
                ",('No abraço a gente entrega o quanto ama, não tem como esconder. \t','Anônimo','Status para Namorado')\n" +
                ",('Meu bem, você é o meu lar! \t','Anônimo','Status para Namorado')\n" +
                ",('Quero a sorte de ter seu sorriso por perto sempre! \t','Anônimo','Status para Namorado')\n" +
                ",('Tu é aquela sensação de paz no meio do caos, sabe \t','Anônimo','Status para Namorado')\n" +
                ",('Bendito o destino que uniu o meu amor ao teu.\t','Anônimo','Status para Namorado')\n" +
                ",('Cada um com sua sorte, você é a minha!\t','Anônimo','Status para Namorado')\n" +
                ",('Nenhuma mega sena se compara a sorte de te chamar de amor! \t','Anônimo','Status para Namorado')\n" +
                ",('O teu coração é o lar que sempre quis ter! \t','Anônimo','Status para Namorado')\n" +
                ",('Soltei o mundo para segurar suas mãos... \t','Anônimo','Status para Namorado')\n" +
                ",('Não foi sorte, foi Deus que fez tudo dar certo. \t','Anônimo','Status para Namorado')\n" +
                ",('Desde que você chegou, tudo ficou mais bonito.\t','Anônimo','Status para Namorado')\n" +
                ",('Onde houver amor, fique. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu descobri que era amor quando nos momentos das minhas orações você estava na parte de agradecimento.\t','Anônimo','Status para Namorado')\n" +
                ",('Eu te escolhi e escolheria outras mil vezes!\t','Anônimo','Status para Namorado')\n" +
                ",('Quebrou minha rotina, deu luz ao que não tinha!\t','Anônimo','Status para Namorado')\n" +
                ",('Não há alguém que me faça tão bem como você me faz \t','Anônimo','Status para Namorado')\n" +
                ",('Você é o maior presente que Deus poderia me dar \t','Anônimo','Status para Namorado')\n" +
                ",('Nos meios dos meus erros, meu acerto foi você \t','Anônimo','Status para Namorado')\n" +
                ",('Se eu tiver você, não preciso de mais nada... \t','Anônimo','Status para Namorado')\n" +
                ",('Tô correndo um risco sério de viver pra sempre com você.\t','Anônimo','Status para Namorado')\n" +
                ",('Fazer do seu sorriso um abrigo.\t','Anônimo','Status para Namorado')\n" +
                ",('Meu sorriso tem seu nome.\t','Anônimo','Status para Namorado')\n" +
                ",('Não há alguém que me faça tão bem como você me faz.\t','Anônimo','Status para Namorado')\n" +
                ",('Se eu não tivesse te encontrado eu juro que te procurava…\t','Anônimo','Status para Namorado')\n" +
                ",('Você me faz lembrar como eu tenho sorte!\t','Anônimo','Status para Namorado')\n" +
                ",('Não há um dia sequer que eu não deseje estar ao seu lado.\t','Anônimo','Status para Namorado')\n" +
                ",('Porque o meu coração é mais seu do que meu.\t','Anônimo','Status para Namorado')\n" +
                ",('E mais nada, nem ninguém a não ser você…\t','Anônimo','Status para Namorado')\n" +
                ",('E foi com você que os meus sonhos em oração vieram a se transformar em futuro.\t','Anônimo','Status para Namorado')\n" +
                ",('Do nosso amor a gente é que sabe.\t','Anônimo','Status para Namorado')\n" +
                ",('Que Deus cuide sempre do nosso amor.\t','Anônimo','Status para Namorado')\n" +
                ",('Só quero viver se for com você!\t','Anônimo','Status para Namorado')\n" +
                ",('Deixa eu ser pra você tudo aquilo que você é pra mim.\t','Anônimo','Status para Namorado')\n" +
                ",('Felicidade é saber que eu tenho o seu amor.\t','Anônimo','Status para Namorado')\n" +
                ",('Namorado Namorada. Quero amor eterno.\t','Anônimo','Status para Namorado')\n" +
                ",('Foi você que fez meu mundo desandar!\t','Anônimo','Status para Namorado')\n" +
                ",('Porque eu te amo todos os dias, cada vez mais.\t','Anônimo','Status para Namorado')\n" +
                ",('Meu presente, meu futuro… Quero viver com você.\t','Anônimo','Status para Namorado')\n" +
                ",('É que você é importante na minha vida e deixa os meus dias melhores!\t','Anônimo','Status para Namorado')\n" +
                ",('Eu cuido de você, você cuida de mim e Deus cuidará de nós…\t','Anônimo','Status para Namorado')\n" +
                ",('Seu sorriso vale mais que um diamante.\t','Anônimo','Status para Namorado')\n" +
                ",('Com você perto de mim nada mais importa.\t','Anônimo','Status para Namorado')\n" +
                ",('Minha estrela cadente, meu anjo.\t','Anônimo','Status para Namorado')\n" +
                ",('Meu amor por você supera qualquer barreira!\t','Anônimo','Status para Namorado')\n" +
                ",('Quando estou com você, estou nos braços da paz!\t','Anônimo','Status para Namorado')\n" +
                ",('Você é o que faltava em minha vida.\t','Anônimo','Status para Namorado')\n" +
                ",('Brincadeiras e intimidades Só a gente entende!\t','Anônimo','Status para Namorado')\n" +
                ",('Você está onde você se coloca. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A gente precisa aprender a se curar sem a ajuda de ninguém.\t','Anônimo','Frases de Reflexão')\n" +
                ",('Seja seletivo nas suas batalhas, às vezes estar em paz é melhor do que estar certo. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Tudo bem desistir. Às vezes, se dar a oportunidade de viver algo novo é o melhor a se fazer.\t','Anônimo','Frases de Reflexão')\n" +
                ",('Manter-se positivo não significa que você precisa estar alegre o tempo todo, mas sim que apesar dos dias ruins, você sabe que haverá dias bons a seguir.\t','Anônimo','Frases de Reflexão')\n" +
                ",('Permita-se ir além, mas permita-se voltar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Planejar, executar e realizar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A vida é muito curta para que a gente perca tempo. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A simplicidade é o último grau de sofisticação. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A força que guia o caminho é a coragem para encontrar o seu lugar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Sua mente é sua casa, cuide bem dela. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Nos passos dela, a tartaruga também chega ao seu destino. \t','Anônimo','Frases de Reflexão')\n" +
                ",('O que mais vale na vida não é o ponto de partida e sim a caminhada. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Minha essência é mudar; não me basta ser rio, se eu posso ser mar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Reveja seus lac¸os: o que voce^ fortalece e´ o que ganha forc¸a em voce^. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quebre o padrão. Mude a rota. Se admire a cada dia mais! \t','Anônimo','Frases de Reflexão')\n" +
                ",('A vida passa num instante, viva esse instante como se fosse o último dia \t','Anônimo','Frases de Reflexão')\n" +
                ",('Todo e qualquer movimento vem para somar, para o meu crescimento, para compreender o todo. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Para ser você mesma, é necessário abandonar uma vida que já não faz sentido com o seu novo eu. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Em meio á imensidões, busco um lugar em que eu encontre a paz \t','Anônimo','Frases de Reflexão')\n" +
                ",('O que é para ser tem muita força. Nunca se esqueça \t','Anônimo','Frases de Reflexão')\n" +
                ",('NÃo faz sentido na~o sentir \t','Anônimo','Frases de Reflexão')\n" +
                ",('A partir do momento em que você começa a ignorar pessoas e opiniões irrelevantes, sua vida começa a dar certo e as coisas tendem a se encaixar.\t','Anônimo','Frases de Reflexão')\n" +
                ",('O tempo deixa perguntas, mostra respostas, esclarece dúvidas, mas, acima de tudo, o tempo traz verdades. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Antes de opinar no caminho alheio, preste atenção se você está seguindo o seu como deveria. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Se livra da desculpa, senão depois só fica a culpa. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Que a gente se encante cada vez pela simplicidade, pelo que é de verdade, por tudo que vier do coração. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Sua própria companhia sempre valerá ouro. Mude sua frequência de \"necessidade\" para \"oportunidade\". \t','Anônimo','Frases de Reflexão')\n" +
                ",('Maturidade é viver em paz com aquilo que não se pode mudar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quando algo ruim acontece você tem três escolhas: deixar isso definir você, deixar isso destruir você ou fazer isso te deixar mais forte. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Há momentos em que você precisa escolher entre virar a página ou fechar o livro. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A humildade é o alicerce da sabedoria. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Ser importante é do ego, ser feliz é da alma. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A vida é agora, agradece e vai. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Existe uma beleza imensurável em ser exatamente quem você é! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Aprendeu que todo amor pode acabar, menos o próprio. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A vida é sobre quem se torna durante a caminhada! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Em um mundo de aparências, quem vive de essência é realmente feliz \t','Anônimo','Frases de Reflexão')\n" +
                ",('Se liberta que o mundo é teu, e de ti ninguém tira. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Seja sempre MAIS que o MENOS que te oferecem! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Onde há calma, observo. Onde há alma, absorvo. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Seja o primeiro a se alimentar daquilo que você oferece! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quando você aprender o quanto vale, vai parar de aceitar as mesmas desculpas das mesmas pessoas!\t','Anônimo','Frases de Reflexão')\n" +
                ",('Em cada passo que eu der, cada estrada que eu trilhar, todo caminho que escolher, a Tua mão me guiará. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Bênção mesmo é a paz interior que ninguém consegue tomar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('“Ainda que eu tenha o dom de profecia e saiba todos os mistérios e todo o conhecimento, e tenha uma fé capaz de mover montanhas, mas se não tiver amor, nada serei.” (1 Coríntios 13:2). Não adianta fazermos de tudo para agradar a Deus se não formor humildes e não termos empatia pelo próximo! É preciso ter o caráter de Cristo para poder agradar a Deus. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Viver é ter chance de acreditar que a cada dia podemos fazer mais do que imaginamos. É ter sonhos e esperanças, nos garantindo na fé, a nossa inspiração maior. \t','Anônimo','Frases de Reflexão');";

        return frases;
    }
    public  static String carregarFrases4(){
        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES \n" +
                "('Saber cultivar a alegria é um dom que pode ser aprendido quando se decide mudar alguns hábitos nocivos: reclamar, maldizer, julgar... Somos o que transmitimos! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Lembre-se sempre: a vida requer reflexão e ação, exatamente nesta ordem. Pense em tudo o que for fazer, não dê um passo à frente sem antes consultar a si mesmo. Você já possui todas as respostas que busca! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Tempestades e ventanias incontroláveis não existem apenas para causar desastres e medo, mas para anunciar mudanças. Espere pela luz que sempre volta! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Contra todo o pessimismo... Vamos sorrir e oferecer o nosso melhor abraço para quem cruzar a nossa vida! Vamos tratar de cultivar amor! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Gaste o seu tempo ganhando a vida, pensando mais nas soluções do que se preocupando com os problemas.. \t','Anônimo','Frases de Reflexão')\n" +
                ",('É difícil superar a dor de uma traição, esquecer uma mágoa, palavras ditas que te feriram, mas o remédio é encarar a decepção de frente, ir em busca da cura interna e de sua própria paz. Encare a decepção para superá-la! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Buscar a felicidade deve ser sempre a primeira meta perseguida. Não importa o lugar que estamos, a posição que ocupamos, os meios que dispomos para alcançá-la. O que importa mesmo é dar o primeiro passo! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Amor-próprio é a chave para você só investir naquilo que te faz feliz. Peça a Deus discernimento e coragem para entender e fazer o que deve ser feito, para se afastar de certas pessoas e dar um basta em certas situações. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Dias melhores são todos os dias em que se decide colocar a fé e esperança acima das preocupações. O que há de ruim no mundo que prevaleça sobre a bondade infinita de Deus! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Alegria de viver independe da perfeição, não está ligada ao quanto você ganha, ao que você tem, mas ao que você é, às coisas mais importantes da vida que não podem ser compradas e o valor que você dá a elas. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quem é grato é feliz! Viver é ser feliz e desfrutar das maravilhas de Deus, saber perceber, nos detalhes, a infinidade de razões para agradecer e celebrar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A vida segue, tudo passa, nenhum mal é de eterna duração. Deseje, atraia, lute e realize! Nada é tão possível quanto os nossos sonhos. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quem tem autoconfiança se arrisca, cria, não tem medo de se reinventar e muda quando dá vontade de mudar. Ter autoconfiança é ter o poder nas mãos! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Felicidade é ter amor, é desfrutar da rotina, de paz interior, é saber lidar com a simplicidade da vida! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Tá achando que não tem mais forças Pensa em Deus! Você está sob a proteção e a assistência d’Ele! Não desanima, tudo passa! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Ria, cante, agradeça, seja positivo! Pensamentos e palavras têm poder, se transformam em ação e realidade. Comece a transformação de dentro para fora: você merece isso! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Deus não desampara ninguém! Tenha consciência de que tudo, absolutamente tudo, é uma prova para o seu aprendizado e é necessário para a sua evolução! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Ofereça o seu sorriso para quem quer tirar tua paz! Procura tua felicidade na calmaria, deixa os excessos pra lá! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Sua mente é sua morada! Seus pensamentos são sua companhia diária! Estar em paz consigo mesmo depende apenas de fatores internos! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Enquanto você reclama e se lamenta mal sabe que a vida está trabalhando, esperando você estar pronto para aprender a lição, para enxergar a verdade, para acordar e ver tudo do jeito que realmente é. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A gratidão é um dos sentimentos mais bonitos que eu posso cultivar. Ela brota de lições duras, secas, mas que sempre dão frutos! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quantos traumas podem ser evitados se a gente souber onde convém entrar, onde convém ficar e quando convém se retirar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('A dor ensina, mas o amor também... É preciso escolher qual deles será o nosso professor. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Gratidão pela vida é reconhecer que a felicidade real vem de dentro, independente de fatores externos e o dinheiro jamais será capaz de comprar. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Os erros, muitas vezes, servem de adubo no terreno onde cultivamos nossas experiências. Até eles dão resultados positivos e nos fazem colher frutos que talvez nunca pudéssemos colher se não tivéssemos errado! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Beleza é ter um bom coração, uma alma florida, uma essência cheirosa e um caráter elegante! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Refletir e mudar é preciso! Arrancar as raízes daquilo que já não floresce mais. Plantar e regar sempre os novos sentimentos, novos projetos… Com mais força, menos dúvidas e mais fé! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quando pensamos sobre o amor, nos vem a imagem do casamento, dos nossos pais, dos nossos amigos, dos nossos filhos… Mas em meio a tanto amor, o próprio começa quando \t','Anônimo','Frases de Reflexão')\n" +
                ",('Com o passar dos anos, percebo que esperar o tempo passar é o maior desperdício de vida que pode existir... \t','Anônimo','Frases de Reflexão')\n" +
                ",('Sonhava em ser adulto, sério, centrado e independente... Hoje, pensando na infância, tenho a certeza de que aqueles sorrisos sem motivo eram o verdadeiro significado de Felicidade. \t','Anônimo','Frases de Reflexão')\n" +
                ",('Jesus nos ensinou suas virtudes através de seu sacrifício de amor. Nos ensinou a amar e a perdoar, demonstrou através de seu exemplo a misericórdia e a caridade. Sempre é tempo de aprender! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Procurar a felicidade é dar asas aos seus sonhos e não deixar que ninguém os diminua. É manter a cabeça erguida durante a busca, mesmo que calos se formem em seus pés! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Aprenda que tudo tem o seu tempo. Que tudo vem na hora certa. A dar o tempo necessário para crescer, brotar e florescer! \t','Anônimo','Frases de Reflexão')\n" +
                ",('O fim significa também um novo recomeço... A vida sempre te oferece uma nova chance! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Entender a diferença entre perseverança e teimosia é aprender uma lição de vida valiosa. Insistir em algo nem sempre é saudável, mas apenas uma perda de tempo em alguns casos. \t','Anônimo','Frases de Reflexão')\n" +
                ",('No retrovisor do tempo, a vida passa, e se você for esperto deve saber aproveitá-la! \t','Anônimo','Frases de Reflexão')\n" +
                ",('Quando nos colocamos de joelhos é porque sabemos muito bem que não somos nós que controlamos o mundo. \t','Anônimo','Frases de Deus')\n" +
                ",('Risque do seu dicionário a palavra desistir, pois o extraordinário ainda está por vir. Tenha fé!\t','Anônimo','Frases de Deus')\n" +
                ",('O único que podia nos julgar, nos amou.\t','Anônimo','Frases de Deus')\n" +
                ",('A lógica da fé é avessa, você ganha quando perde e cresce quando se esvazia. \t','Anônimo','Frases de Deus')\n" +
                ",('A gente não cansa de agradecer porque ser capaz de enxergar as bênçãos divinas em meio a tanta dificuldade é uma dádiva.\t','Anônimo','Frases de Deus')\n" +
                ",('Tua palavra é uma semente, e o meu coração é uma terra boa. \t','Anônimo','Frases de Deus')\n" +
                ",('Já estive em diversos lugares, mas não há nenhum melhor do que na Sua presença. \t','Anônimo','Frases de Deus')\n" +
                ",('O que somos é um presente de Deus, e o que nos tornamos é o nosso presente para Ele. \t','Anônimo','Frases de Deus')\n" +
                ",('O criador de todas as coisas, mora em mim. \t','Anônimo','Frases de Deus')\n" +
                ",('Somos fracos, pensamos em desistir, mas o amor de Deus nos encoraja a prosseguir. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus também está no silêncio. \t','Anônimo','Frases de Deus')\n" +
                ",('Fé na caminhada para que ela seja abençoada. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus é maior que tudo, no controle dEle estão todas as coisas. \t','Anônimo','Frases de Deus')\n" +
                ",('O agir de Deus é perfeito!\t','Anônimo','Frases de Deus')\n" +
                ",('Que sejamos sempre capazes de enxergar a grandeza das bênçãos de Deus em nossa vida. \t','Anônimo','Frases de Deus')\n" +
                ",('Nada acontece por acaso, em tudo Deus tem um propósito. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus sabe o que traz, Deus sabe o que tira, Deus sabe o que faz. \t','Anônimo','Frases de Deus')\n" +
                ",('Haverá dias bons e ruins, mas lembre-se, haverá Deus em todos. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus é aquele que te levanta, enquanto os outros nem sabem que você caiu. \t','Anônimo','Frases de Deus')\n" +
                ",('Devemos nos alegrar, pois grandes coisas Deus faz por nós. \t','Anônimo','Frases de Deus')\n" +
                ",('Orar é a melhor coisa a se fazer quando não se sabe o que fazer. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus, que a minha vontade e a Tua coincidam, caso o contrário, que a Sua prevaleça. \t','Anônimo','Frases de Deus')\n" +
                ",('Ore, espere e confie. Tudo que é da vontade de Deus, vai acontecer. \t','Anônimo','Frases de Deus')\n" +
                ",('No silêncio, Deus está trabalhando por cada um de nós. \t','Anônimo','Frases de Deus')\n" +
                ",('Quando tudo parecer contrário, Deus tem planos até para o caos. \t','Anônimo','Frases de Deus')\n" +
                ",('O mundo tem resposta para tudo, mas somente Deus tem a solução. \t','Anônimo','Frases de Deus')\n" +
                ",('Uma conversa com Deus muda tudo! \t','Anônimo','Frases de Deus')\n" +
                ",('O período que você menos entende, é o período em que Deus mais trabalha. \t','Anônimo','Frases de Deus')\n" +
                ",('Só em Deus nós podemos encontrar a verdadeira paz e segurança que o mundo não consegue dar! \t','Anônimo','Frases de Deus')\n" +
                ",('Não tem nada a ver com sorte, existe a mão de Deus em cada detalhe \t','Anônimo','Frases de Deus')\n" +
                ",('Olhe pra cima, é de lá que vem a tua força. \t','Anônimo','Frases de Deus')\n" +
                ",('Não confie em sua experiência, dinheiro ou contatos. Confie em Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Não tem nada a ver com sorte, existe a mão de Deus em cada detalhe. \t','Anônimo','Frases de Deus')\n" +
                ",('Acalme o seu coração ansioso e confie no controle de Deus, ele está agindo ao seu favor. \t','Anônimo','Frases de Deus')\n" +
                ",('Tenha mais fé, arranque o medo de seu coração porque Deus não perdeu o controle sobre sua vida. Diga para suas lutas e causas impossíveis: Eu tenho Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Tudo que é seu chegará até você. Não por obra do acaso, mas pelo plano perfeito de deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Fé na caminhada pois todos os nossos passos são por Ele guiados, eu creio! Amém! \t','Anônimo','Frases de Deus')\n" +
                ",('Tudo o que Deus nos propõe tem alguma razão, nem que seja testar o tamanho da nossa fé! \t','Anônimo','Frases de Deus')\n" +
                ",('Há uma promessa linda na Bíblia e ela diz: Não te deixarei e nem te abandonarei! \t','Anônimo','Frases de Deus')\n" +
                ",('Acalma teu coração, Deus está cuidando de tudo, inclusive daquele milagre com o qual tanto sonhou. \t','Anônimo','Frases de Deus')\n" +
                ",('Tua graça me basta, meu Pai. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus é minha calmaria em tempos turbulentos. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus age na hora certa. Confie. \t','Anônimo','Frases de Deus')\n" +
                ",('Não existem erros nos planos de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Já deu certo, em nome de Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Cria em mim um coração limpo, Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Conversar com Deus te acalma, ouvir as respostas te fortalece. \t','Anônimo','Frases de Deus')\n" +
                ",('Quem sabe esperar recebe o melhor de Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Ai de mim se não fosse o amor de Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus abrirá novas portas. \t','Anônimo','Frases de Deus')\n" +
                ",('Tua palavra é lâmpada para meu pé, e luz para o meu caminho. \t','Anônimo','Frases de Deus')\n" +
                ",('Tu só vai saber o que é amor quando conhecer Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Você ora, Deus ouve. Você espera, Deus prepara. Você crê, Deus faz acontecer. \t','Anônimo','Frases de Deus')\n" +
                ",('Ninguém explica Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus, a tua graça me basta. \t','Anônimo','Frases de Deus')\n" +
                ",('Tem coisas que Deus vai te falar, outras ele vai te mostrar... \t','Anônimo','Frases de Deus')\n" +
                ",('Sobre Deus O maior amor que já conheci. \t','Anônimo','Frases de Deus')\n" +
                ",('Ora e entrega seu caminho a Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Existe força brotando da sua fraqueza e essa força é Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Orar é voar até o céu e abraçar Deus com o coração. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus não remenda, ele faz tudo novo! \t','Anônimo','Frases de Deus')\n" +
                ",('Ei, não temas! O Senhor é contigo! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus sabe onde você consegue chegar e quanto consegue suportar... \t','Anônimo','Frases de Deus')\n" +
                ",('Aquieta minha alma, faz meu coração ouvir tua voz... \t','Anônimo','Frases de Deus')\n" +
                ",('Meu socorro vem do céu. \t','Anônimo','Frases de Deus')\n" +
                ",('Força que me move, mão que me sustenta, amor que me alimenta. \t','Anônimo','Frases de Deus')\n" +
                ",('Jesus me amou quando nem eu fui capaz de me amar. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus sabe das intenções de cada coração.. \t','Anônimo','Frases de Deus')\n" +
                ",('Pela tua fé, Deus vai agir. \t','Anônimo','Frases de Deus')\n" +
                ",('Quem ora, tem toda a atenção de Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('A vontade de Deus sempre será a melhor, confie! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus vai abrir as portas que você tanto precisa! \t','Anônimo','Frases de Deus')\n" +
                ",('Três segredos: Ore. Espere. Confie. \t','Anônimo','Frases de Deus')\n" +
                ",('Acalma o seu coração, nada saiu do controle de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Em Teus braços é meu descanso. \t','Anônimo','Frases de Deus')\n" +
                ",('Ninguém vai entender, mas Deus vai fazer acontecer. \t','Anônimo','Frases de Deus')\n" +
                ",('Tudo que Deus faz é perfeito. \t','Anônimo','Frases de Deus')\n" +
                ",('Feliz é o que sorri em meio a tristeza, pois sabe que sua alegria está em Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Esperar em Deus é querer sempre o melhor... \t','Anônimo','Frases de Deus')\n" +
                ",('Sonhe alto porque o seu Deus é grande. \t','Anônimo','Frases de Deus')\n" +
                ",('Todo dia Deus pensa em você. Toda hora Deus cuida de você. \t','Anônimo','Frases de Deus')\n" +
                ",('Quem procura Deus, nunca perde tempo! \t','Anônimo','Frases de Deus')\n" +
                ",('Que todo amor venha do céu! \t','Anônimo','Frases de Deus')\n" +
                ",('Fala pra tua tristeza que Deus ama o teu sorriso. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus, em Ti confio o meu coração! \t','Anônimo','Frases de Deus')\n" +
                ",('Quem tem fé tem mais possibilidades! \t','Anônimo','Frases de Deus')\n" +
                ",('Agradecer é a melhor forma de se auto-abençoar \t','Anônimo','Frases de Deus')\n" +
                ",('Nós não somos nada, Ele é tudo em nós. \t','Anônimo','Frases de Deus')\n" +
                ",('Seu sorriso pode ser uma mensagem de ânimo, enviada por Deus a uma alma necessitada. \t','Anônimo','Frases de Deus')\n" +
                ",('Há uma promessa linda na Bíblia, e ela diz: \"não te deixarei e nem te abandonarei\". \t','Anônimo','Frases de Deus')\n" +
                ",('Faça hoje, ame hoje, amanhã só Deus sabe. \t','Anônimo','Frases de Deus')\n" +
                ",('Pare de procurar felicidade onde Deus não está. \t','Anônimo','Frases de Deus')\n" +
                ",('Que eu tenha sempre esperança e força que vêm de Deus para vencer....  \t','Anônimo','Frases de Deus')\n" +
                ",('O que Deus quiser pra mim, eu espero. \t','Anônimo','Frases de Deus')\n" +
                ",('Quando Deus muda nossos planos é porque algo vai melhorar... \t','Anônimo','Frases de Deus')\n" +
                ",('Tudo o que vem de Deus traz paz. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus me fez amor. Então, amor serei! \t','Anônimo','Frases de Deus')\n" +
                ",('Não vá com pressa. Pergunte a Deus se é a direção certa!\t','Anônimo','Frases de Deus')\n" +
                ",('Deus tira o que te fere pra te dar o que te cura!!!\t','Anônimo','Frases de Deus')\n" +
                ",('Se encha de Deus e jamais se sentirá vazio.\t','Anônimo','Frases de Deus')\n" +
                ",('Cada sorriso meu tem um pouco de Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Que nos falte tudo, menos a presença de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Não tenha sonhos limitados, nosso Deus é infinito! \t','Anônimo','Frases de Deus')\n" +
                ",('O que vem de Deus vem pra ficar! \t','Anônimo','Frases de Deus')\n" +
                ",('Quando Deus vai na frente, todo mal tem que sair! \t','Anônimo','Frases de Deus')\n" +
                ",('Acalme o seu coração. Menos ansiedade, mais fé!\t','Anônimo','Frases de Deus')\n" +
                ",('Caminhar com Deus é sentir um pedacinho do céu dentro de si. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus não te tira as coisas, Ele te livra delas. \t','Anônimo','Frases de Deus')\n" +
                ",('Ela orou porque sabia que só Deus podia entender o que ela sentia... \t','Anônimo','Frases de Deus')\n" +
                ",('O hábito de falar com Deus muda nosso hábito de falar com as pessoas. \t','Anônimo','Frases de Deus')\n" +
                ",('Que as delicadezas de Deus te surpreendam! \t','Anônimo','Frases de Deus')\n" +
                ",('Não existem erros nos planos de Deus... \t','Anônimo','Frases de Deus')\n" +
                ",('Às vezes a vontade de Deus dói, mas nunca deixa de ser perfeita. \t','Anônimo','Frases de Deus')\n" +
                ",('O amor de Deus cabe onde nem tem cabimento. \t','Anônimo','Frases de Deus')\n" +
                ",('Recomeços curam, permita-se. \t','Anônimo','Frases Tristes')\n" +
                ",('Viver é um rasgar-se e remendar-se constante. \t','Anônimo','Frases Tristes')\n" +
                ",('A gente nunca pode julgar o que acontece dentro dos outros. \t','Anônimo','Frases Tristes')\n" +
                ",('A saudade é o que ficou do que nunca fomos.. \t','Anônimo','Frases Tristes')\n" +
                ",('É muito ruim não ser bom o suficiente. \t','Anônimo','Frases Tristes')\n" +
                ",('É tão triste esse sentimento de angústia, não sei me livrar dele. \t','Anônimo','Frases Tristes')\n" +
                ",('Quanto mais forte tento ser, mais fraco me sinto. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu não estou bem mas vou ficar, em alguns momentos eu só preciso chorar. \t','Anônimo','Frases Tristes')\n" +
                ",('Um travesseiro e milhões de pensamentos... \t','Anônimo','Frases Tristes')\n" +
                ",('Dias melhores virão, nem pense em desistir. \t','Anônimo','Frases Tristes')\n" +
                ",('Um geração que fala de amor, mas não sabe amar. \t','Anônimo','Frases Tristes')\n" +
                ",('Aquela saudade misturada com tristeza. \t','Anônimo','Frases Tristes')\n" +
                ",('O que sobrou da tempestade Se você ainda está de pé, sobrou o recomeço. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu preciso desabafar, o problema é que não tenho ninguém para isso. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu me sinto péssimo e as pessoas só pioram isso. \t','Anônimo','Frases Tristes')\n" +
                ",('A ferida parece não cicatrizar, a dor é no coração mas é tão real… \t','Anônimo','Frases Tristes')\n" +
                ",('Eu gosto de ficar sozinha, mas odeio me sentir sozinha. \t','Anônimo','Frases Tristes')\n" +
                ",('Quando eu pensei que já tinha esquecido você, veio a saudade e me lembrou. \t','Anônimo','Frases Tristes')\n" +
                ",('A gente acha que não suporta, mas sempre aguenta. \t','Anônimo','Frases Tristes')\n" +
                ",('É só mais um daqueles dias difíceis de conseguir sorrir. \t','Anônimo','Frases Tristes')\n" +
                ",('Só ela sabe quantos temporais enfrenta. \t','Anônimo','Frases Tristes')\n" +
                ",('Sinto muito por você ter sentido tão pouco. \t','Anônimo','Frases Tristes')\n" +
                ",('Aquela tua partida ainda é minha maior insônia. \t','Anônimo','Frases Tristes')\n" +
                ",('Só ela sabe quantos temporais enfrenta. \t','Anônimo','Frases Tristes')\n" +
                ",('As pessoas cometem erros... até as que amamos. \t','Anônimo','Frases Tristes')\n" +
                ",('Triste é passar a vida inteira vivendo pela metade.. \t','Anônimo','Frases Tristes')\n" +
                ",('Tem muita coisa acontecendo em mim, me perdoe se eu não conseguir sorrir hoje. \t','Anônimo','Frases Tristes')\n" +
                ",('Éramos inseparáveis, sendo constantemente separados. \t','Anônimo','Frases Tristes')\n" +
                ",('Tua saudade dá câimbras em meu coração. \t','Anônimo','Frases Tristes')\n" +
                ",('Forte nunca fui, mas hoje disfarço melhor. \t','Anônimo','Frases Tristes')\n" +
                ",('Não existe mais nós, só o teu cheiro no \t','Anônimo','Frases Tristes')\n" +
                ",('E quem ficaria com uma menina cheia de cicatrizes e problemas.. \t','Anônimo','Frases Tristes')\n" +
                ",('Acredite, eu nunca estou tão bem quanto pareço. \t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes a gente sente como se o mundo desmoronasse dentro de nós. \t','Anônimo','Frases Tristes')\n" +
                ",('Ignoro tudo durante o dia, mas a noite as lágrimas caem. \t','Anônimo','Frases Tristes')\n" +
                ",('Se for para se aproximar muito e depois se afastar do nada, é melhor nem chegar perto. \t','Anônimo','Frases Tristes')\n" +
                ",('Contei pro céu o quanto eu sinto a sua falta, e então, ele chorou junto comigo. \t','Anônimo','Frases Tristes')\n" +
                ",('Fingir estar feliz só vai me corroendo por dentro mais e mais. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu vou fingir que não sinto, até deixar de sentir... \t','Anônimo','Frases Tristes')\n" +
                ",('A vida e seus eternos \"quases\".. \t','Anônimo','Frases Tristes')\n" +
                ",('O coração está cheio de coisas não ditas... \t','Anônimo','Frases Tristes')\n" +
                ",('Quando você precisa ficar provando o seu valor é a exata hora de ir embora. \t','Anônimo','Frases Tristes')\n" +
                ",('Cansada de ouvir \"vai ficar tudo bem, é só mais uma fase\". \t','Anônimo','Frases Tristes')\n" +
                ",('É sempre fácil julgar quando a dor não é sua.. \t','Anônimo','Frases Tristes')\n" +
                ",('Tudo que eu gosto, eu perco. Ou vai embora, ou some.. \t','Anônimo','Frases Tristes')\n" +
                ",('É a coisa mais difícil do mundo, desapegar-se de alguém... \t','Anônimo','Frases Tristes')\n" +
                ",('Vai doer muito até não ser mais nada, seja paciente. \t','Anônimo','Frases Tristes')\n" +
                ",('É que somos feitos de fases e nem todas são boas... \t','Anônimo','Frases Tristes')\n" +
                ",('Não tente se encaixar onde não te cabe, não se machuque assim...\t','Anônimo','Frases Tristes')\n" +
                ",('Deixar ir sempre será doloroso, mas temos que aprender a soltar o que não nos faz bem.\t','Anônimo','Frases Tristes')\n" +
                ",('Você passará por coisas que não merece, mas isso irá lhe mostrar o quão forte você é. \t','Anônimo','Frases Tristes')\n" +
                ",('Sou o choro que ninguém ouve e a falsa risada mais alta da cidade. \t','Anônimo','Frases Tristes')\n" +
                ",('Em que bar será que você fica rindo daquele amor que eu achava lindo... \t','Anônimo','Frases Tristes')\n" +
                ",('Foi um prazer, mas não era pra ser... \t','Anônimo','Frases Tristes')\n" +
                ",('Não mudei. Me mudaram. \t','Anônimo','Frases Tristes')\n" +
                ",('A vida é uma série de partidas e chegadas.. \t','Anônimo','Frases Tristes')\n" +
                ",('Não era só o silêncio, era o vazio que machucava.. \t','Anônimo','Frases Tristes')\n" +
                ",('Você não merece ser a indecisão de ninguém. Seja tudo ou vá embora. \t','Anônimo','Frases Tristes')\n" +
                ",('Amadureci com o passar dos (D)anos... \t','Anônimo','Frases Tristes')\n" +
                ",('Eu errei, mas foi tentando acertar. \t','Anônimo','Frases Tristes')\n" +
                ",('De tanta lágrima o amor desbota ou floresce! \t','Anônimo','Frases Tristes')\n" +
                ",('A vida é curta e todos nós somos frágeis feito papel. \t','Anônimo','Frases Tristes')\n" +
                ",('Não querer lidar com as pessoas é proteção para nunca nos machucar. \t','Anônimo','Frases Tristes')\n" +
                ",('Parecia forte pela manhã, mas seu mundo desabava todas as noites. \t','Anônimo','Frases Tristes')\n" +
                ",('As vezes não queremos chorar, mas o coração não dá outra opção. \t','Anônimo','Frases Tristes')\n" +
                ",('Deus, me dá teu colo, são dias difíceis.. \t','Anônimo','Frases Tristes')\n" +
                ",('Embora eu queira muito, não dá pra querer por dois \t','Anônimo','Frases Tristes')\n" +
                ",('A triste verdade é que todos nós estamos sentindo falta de alguém.. \t','Anônimo','Frases Tristes')\n" +
                ",('Ela é forte, mas tá cansada... \t','Anônimo','Frases Tristes')\n" +
                ",('Deixe ir. É melhor meses de coração partido do que uma vida inteira de decepções diárias. \t','Anônimo','Frases Tristes')\n" +
                ",('A tristeza de ouvir ”eu avisei” de mim mesmo! \t','Anônimo','Frases Tristes')\n" +
                ",('Sorriu o dia todo, mas à noite desabou!\t','Anônimo','Frases Tristes')\n" +
                ",('Eu sinto como se errasse todos os dias! \t','Anônimo','Frases Tristes')\n" +
                ",('Não tenho mais forças para fingir um sorriso que não é meu \t','Anônimo','Frases Tristes')\n" +
                ",('Chute pra longe essa expectativa antes que você tropece e se machuque! \t','Anônimo','Frases Tristes')\n" +
                ",('Depois, como sempre, limpei o rosto e continuei… \t','Anônimo','Frases Tristes')\n" +
                ",('É que às vezes a gente fica triste pelo que não aconteceu também... \t','Anônimo','Frases Tristes')\n" +
                ",('Só ela sabe quantos temporais enfrenta diariamente... \t','Anônimo','Frases Tristes')\n" +
                ",('Triste é só amar as coisas quando as perde. \t','Anônimo','Frases Tristes')\n" +
                ",('Chorar para aliviar, sorrir para disfarçar... \t','Anônimo','Frases Tristes')\n" +
                ",('Ela está cansada de mergulhar em pessoas rasas... \t','Anônimo','Frases Tristes')\n" +
                ",('Ninguém é triste por opção, mas por carregar demasiadas dores no coração.. \t','Anônimo','Frases Tristes')\n" +
                ",('As pessoas mudam e seguem em frente.. cabe à gente se acostumar. \t','Anônimo','Frases Tristes')\n" +
                ",('Ainda me lembro de quando te (des)conheci... \t','Anônimo','Frases Tristes')\n" +
                ",('Cansei de me afogar em falsas promessas. \t','Anônimo','Frases Tristes')\n" +
                ",('Chorar por dentro é um dos piores choros. \t','Anônimo','Frases Tristes')\n" +
                ",('Quer sumir, ficar sozinha, esquecer dos problemas e ficar um pouco em paz. \t','Anônimo','Frases Tristes')\n" +
                ",('Não sou flor, às vezes espinhos me define melhor.. \t','Anônimo','Frases Tristes')\n" +
                ",('De tristeza em tristeza, muitos acabam por fazer dela sua identidade! \t','Anônimo','Frases Tristes')\n" +
                ",('Quem diz que me entende, nunca quis saber.. \t','Anônimo','Frases Tristes')\n" +
                ",('Então vem cá e me tira todo esse vazio. \t','Anônimo','Frases Tristes')\n" +
                ",('Verdade ou felicidade. Nunca os dois. \t','Anônimo','Frases Tristes')\n" +
                ",('Tão forte por fora e machucada por dentro.. \t','Anônimo','Frases Tristes')\n" +
                ",('Somos colecionadores de decepções... \t','Anônimo','Frases Tristes')\n" +
                ",('Ela vive pintando suas dores, plantando flores nas próprias feridas.. \t','Anônimo','Frases Tristes')\n" +
                ",('Somos obrigados a viver como se fôssemos de ferro! \t','Anônimo','Frases Tristes')\n" +
                ",('Não se prenda a ideia de que o tempo resolve tudo.. nem sempre é assim. \t','Anônimo','Frases Tristes')\n" +
                ",('Felizes são aqueles que não se apegam.. \t','Anônimo','Frases Tristes')\n" +
                ",('Nem todos os sorrisos são alegres.. \t','Anônimo','Frases Tristes')\n" +
                ",('Coração não é tão simples quanto pensa.. \t','Anônimo','Frases Tristes')\n" +
                ",('Você perdoa tanto, se doa tanto, que no final quem se dói e machuca e você.. \t','Anônimo','Frases Tristes')\n" +
                ",('É triste quando uma só mentira destrói mil verdades e um sentimento.. \t','Anônimo','Frases Tristes')\n" +
                ",('Como é triste quando o amor se transforma em decepção! \t','Anônimo','Frases Tristes')\n" +
                ",('Magoar quem a gente gosta dói na gente mesmo. \t','Anônimo','Frases Tristes')\n" +
                ",('O sentimento mais cruel é a saudade, porque além de doer, deixa marca. \t','Anônimo','Frases Tristes')\n" +
                ",('Como é triste perceber que estamos sós até mesmo no meio de tanta gente. \t','Anônimo','Frases Tristes')\n" +
                ",('Ficar triste é natural, mas guardar mágoa é a pior das infelicidades! \t','Anônimo','Frases Tristes')\n" +
                ",('Não se sinta culpado por algo que não depende de você. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu ouvi, doeu. Fingi que não, mas depois chorei.\t','Anônimo','Frases Tristes')\n" +
                ",('Saudade é o que o coração não consegue gritar. \t','Anônimo','Frases Tristes')\n" +
                ",('O que não te faz bem, não te pertence... \t','Anônimo','Frases Tristes')\n" +
                ",('Ela sussurrou baixinho... sou jovem demais pra tantos problemas. \t','Anônimo','Frases Tristes')\n" +
                ",('Também sinto sua falta, mas isso não muda nada... \t','Anônimo','Frases Tristes')\n" +
                ",('Sorria, assim não vai ter que explicar toda essa dor. \t','Anônimo','Frases Tristes')\n" +
                ",('Pobre menina que atrás de um sorriso tão belo esconde um sofrimento que parece eterno. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu me excluo porque percebo que não faz diferença estar ali ou não. \t','Anônimo','Frases Tristes')\n" +
                ",('Era o amor da minha vida, hoje é só mais um contato... \t','Anônimo','Frases Tristes')\n" +
                ",('Plenamente feliz eu nunca fui, mas hoje disfarço melhor.. \t','Anônimo','Frases Tristes')\n" +
                ",('Não sei dizer ao certo o que estou sentindo, só sei que dói. \t','Anônimo','Frases Tristes')\n" +
                ",('Quando tá escuro e ninguém te ouve, chega a noite e você pode chorar... \t','Anônimo','Frases Tristes')\n" +
                ",('Eu me torturo com meus próprios pensamentos... \t','Anônimo','Frases Tristes')\n" +
                ",('Se já tive amigos imaginários Não, tive amigos que eu imaginava ser verdadeiros. \t','Anônimo','Frases Tristes')\n" +
                ",('E a cada dia fica mais difícil sorrir... \t','Anônimo','Frases Tristes')\n" +
                ",('É muito triste quando você descobre quem realmente as pessoas são! \t','Anônimo','Frases Tristes')\n" +
                ",('A tristeza é a agonia de um momento. Cultivar a tristeza, é um erro de toda vida. \t','Anônimo','Frases Tristes')\n" +
                ",('Não consigo entender o motivo das pessoas saírem da minha vida. Seria tudo culpa minha! \t','Anônimo','Frases Tristes')\n" +
                ",('Se apegue e algo que nunca te pertenceu e saberá o que é tristeza. \t','Anônimo','Frases Tristes')\n" +
                ",('Permita-se sorrir por mais difícil que possa ser às vezes... E então a tristeza se vai aos poucos! \t','Anônimo','Frases Tristes')\n" +
                ",('Ela perdeu o chão tantas vezes, que acabou aprendendo a flutuar. \t','Anônimo','Frases Tristes')\n" +
                ",('Estou triste, não porque está feliz, mas por não ser eu o motivo da sua felicidade. \t','Anônimo','Frases Tristes')\n" +
                ",('A morte não é a maior perda da vida. A maior perda da vida é o que morre dentro de nós enquanto vivemos. \t','Anônimo','Frases Tristes')\n" +
                ",('Não se despedace para manter os outros inteiros. \t','Anônimo','Frases Tristes')\n" +
                ",('Eu amo o impossível, pois é o único que não pode me decepcionar. \t','Anônimo','Frases Tristes')\n" +
                ",('Nada é mais triste do que fazer de tudo para ocultar a sua tristeza! \t','Anônimo','Frases Tristes')\n" +
                ",('Maior que a tristeza de não haver vencido é a vergonha de não ter lutado... \t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes parece que quanto mais você luta, mais difícil fica... \t','Anônimo','Frases Tristes')\n" +
                ",('Todas as manhãs ela deixa os sonhos na cama, acorda e põe sua roupa de viver... \t','Anônimo','Frases Tristes')\n" +
                ",('Tem dias que não existem emoções, nem pensamentos: só dor! \t','Anônimo','Frases Tristes')\n" +
                ",('Eu amo o impossível, pois é o único que não pode me decepcionar... \t','Anônimo','Frases Tristes')\n" +
                ",('Um dia a gente cansa de esconder o nosso lado triste. \t','Anônimo','Frases Tristes')\n" +
                ",('As horas mais tristes da vida são aquelas em que duvidamos de nós próprios. \t','Anônimo','Frases Tristes')\n" +
                ",('Tem dias que a vida é um ato de coragem\t','Anônimo','Frases Tristes')\n" +
                ",('Abrir os olhos pode doer, mas é necessário.\t','Anônimo','Frases Tristes')\n" +
                ",('Algumas coisas simplesmente não voltam mais... \t','Anônimo','Frases Tristes')\n" +
                ",('Eu finjo que não me afeta, mas por dentro eu choro. \t','Anônimo','Frases Tristes')\n" +
                ",('Um sorriso estampado no rosto não significa uma alegria no coração. Veja além... \t','Anônimo','Frases Tristes')\n" +
                ",('É possível você sentir falta do que nunca foi seu \t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes você só torce para acordar e perceber que nada era real... \t','Anônimo','Frases Tristes')\n" +
                ",('Triste mesmo é não sentir.\t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes, é melhor a gente pegar o que sente e guardar pra gente.\t','Anônimo','Frases Tristes')\n" +
                ",('Hoje a saudade me escorreu pelos olhos.\t','Anônimo','Frases Tristes')\n" +
                ",('Parece que a gente nunca é suficiente pra ninguém.\t','Anônimo','Frases Tristes')\n" +
                ",('As vezes não necessariamente você está triste, mas se sente vazio!\t','Anônimo','Frases Tristes')\n" +
                ",('É por dentro que a gente sente o barco balançar.\t','Anônimo','Frases Tristes')\n" +
                ",('Cada dor te faz mais forte.\t','Anônimo','Frases Tristes')\n" +
                ",('A luta é necessária.\t','Anônimo','Frases Tristes')\n" +
                ",('Crescer dói. Dói muito.\t','Anônimo','Frases Tristes')\n" +
                ",('E quantas vezes, com os olhos cheios de lágrimas, você sorriu\t','Anônimo','Frases Tristes')\n" +
                ",('O tempo todo, à toda hora, um pedaço de mim ainda dói.\t','Anônimo','Frases Tristes')\n" +
                ",('A vida vai reaver sobre você o direito que ela tem de te levar aos lugares mais dolorosos porque assim, e só assim, é que você vai aprender a voar.\t','Anônimo','Frases Tristes')\n" +
                ",('As pessoas não duram, na verdade elas nunca foram o que você pensou.\t','Anônimo','Frases Tristes')\n" +
                ",('Nas asas do tempo, a tristeza voa. \t','Anônimo','Frases Tristes')\n" +
                ",('A lágrima é uma pequena amostra da chuva de dentro. \t','Anônimo','Frases Tristes')\n" +
                ",('Um dia essa dor de hoje será útil. \t','Anônimo','Frases Tristes')\n" +
                ",('De cada dor nasce a oportunidade de nascer uma nova flor\t','Anônimo','Frases Tristes')\n" +
                ",('Eu estou bem, só não estou feliz... \t','Anônimo','Frases Tristes')\n" +
                ",('Nem feliz, nem triste. Apenas suportando... \t','Anônimo','Frases Tristes')\n" +
                ",('As vezes… Segurar, machuca mais do que deixar ir! \t','Anônimo','Frases Tristes')\n" +
                ",('Ficar sozinho pode até ser ruim, mas também pode ser a solução... \t','Anônimo','Frases Tristes')\n" +
                ",('Se toda cura envolve dor, o remédio é encarar a decepção de frente\t','Anônimo','Frases Tristes')\n" +
                ",('Embora seja difícil, ainda sorrio às vezes pra disfarçar a dor... \t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes a tristeza não vai embora. A gente só aprende a conviver com ela... \t','Anônimo','Frases Tristes')\n" +
                ",('As dores são sempre reais mesmo se os amores forem imaginários… \t','Anônimo','Frases Tristes')\n" +
                ",('O desapego é a liberdade mais triste que conheço!\t','Anônimo','Frases Tristes')\n" +
                ",('O vazio ocupa um espaço imenso! \t','Anônimo','Frases Tristes')\n" +
                ",('Somos colecionadores de decepções!  (Projota)\t','Anônimo','Frases Tristes')\n" +
                ",('Quantos gritos cabem no silêncio\t','Anônimo','Frases Tristes')\n" +
                ",('Solidão não é estar só… é estar vazio\t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes precisa doer para aliviar \t','Anônimo','Frases Tristes')\n" +
                ",('Eu finjo que não faz diferença, mas na verdade isso acaba comigo!\t','Anônimo','Frases Tristes')\n" +
                ",('Deus, me dê forças para suportar essa tempestade \t','Anônimo','Frases Tristes')\n" +
                ",('Alguém que não provoca seu sorriso não merece sua lágrima \t','Anônimo','Frases Tristes')\n" +
                ",('Amor só existe a dois. Amor sozinho chama-se tristeza \t','Anônimo','Frases Tristes')\n" +
                ",('O problema não são as cicatrizes. O problema é olhar para elas e lembrar de quem as deixou \t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes, é melhor a gente pegar o que sente e guardar pra gente.\t','Anônimo','Frases Tristes')\n" +
                ",('Hoje a saudade me escorreu pelos olhos.\t','Anônimo','Frases Tristes')\n" +
                ",('Parece que a gente nunca é suficiente pra ninguém.\t','Anônimo','Frases Tristes')\n" +
                ",('As vezes não necessariamente você está triste, mas se sente vazio!\t','Anônimo','Frases Tristes')\n" +
                ",('É por dentro que a gente sente o barco balançar.\t','Anônimo','Frases Tristes')\n" +
                ",('Cada dor te faz mais forte.\t','Anônimo','Frases Tristes')\n" +
                ",('A luta é necessária.\t','Anônimo','Frases Tristes')\n" +
                ",('Crescer dói. Dói muito.\t','Anônimo','Frases Tristes')\n" +
                ",('E quantas vezes, com os olhos cheios de lágrimas, você sorriu\t','Anônimo','Frases Tristes')\n" +
                ",('O tempo todo, à toda hora, um pedaço de mim ainda dói.\t','Anônimo','Frases Tristes')\n" +
                ",('A vida vai reaver sobre você o direito que ela tem de te levar aos lugares mais dolorosos porque assim, e só assim, é que você vai aprender a voar.\t','Anônimo','Frases Tristes')\n" +
                ",('As pessoas não duram, na verdade elas nunca foram o que você pensou.\t','Anônimo','Frases Tristes')\n" +
                ",('Nas asas do tempo, a tristeza voa. \t','Anônimo','Frases Tristes')\n" +
                ",('A lágrima é uma pequena amostra da chuva de dentro. \t','Anônimo','Frases Tristes')\n" +
                ",('Um dia essa dor de hoje será útil. \t','Anônimo','Frases Tristes')\n" +
                ",('De cada dor nasce a oportunidade de nascer uma nova flor\t','Anônimo','Frases Tristes')\n" +
                ",('Eu estou bem, só não estou feliz... \t','Anônimo','Frases Tristes')\n" +
                ",('Nem feliz, nem triste. Apenas suportando... \t','Anônimo','Frases Tristes')\n" +
                ",('As vezes… Segurar, machuca mais do que deixar ir! \t','Anônimo','Frases Tristes')\n" +
                ",('Ficar sozinho pode até ser ruim, mas também pode ser a solução... \t','Anônimo','Frases Tristes')\n" +
                ",('Se toda cura envolve dor, o remédio é encarar a decepção de frente\t','Anônimo','Frases Tristes')\n" +
                ",('Embora seja difícil, ainda sorrio às vezes pra disfarçar a dor... \t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes a tristeza não vai embora. A gente só aprende a conviver com ela... \t','Anônimo','Frases Tristes')\n" +
                ",('As dores são sempre reais mesmo se os amores forem imaginários… \t','Anônimo','Frases Tristes')\n" +
                ",('O desapego é a liberdade mais triste que conheço!\t','Anônimo','Frases Tristes')\n" +
                ",('O vazio ocupa um espaço imenso! \t','Anônimo','Frases Tristes')\n" +
                ",('Somos colecionadores de decepções!  (Projota)\t','Anônimo','Frases Tristes')\n" +
                ",('Quantos gritos cabem no silêncio\t','Anônimo','Frases Tristes')\n" +
                ",('Solidão não é estar só… é estar vazio\t','Anônimo','Frases Tristes')\n" +
                ",('Às vezes precisa doer para aliviar \t','Anônimo','Frases Tristes')\n" +
                ",('Eu finjo que não faz diferença, mas na verdade isso acaba comigo!\t','Anônimo','Frases Tristes')\n" +
                ",('Deus, me dê forças para suportar essa tempestade \t','Anônimo','Frases Tristes')\n" +
                ",('Alguém que não provoca seu sorriso não merece sua lágrima \t','Anônimo','Frases Tristes')\n" +
                ",('Amor só existe a dois. Amor sozinho chama-se tristeza \t','Anônimo','Frases Tristes')\n" +
                ",('O problema não são as cicatrizes. O problema é olhar para elas e lembrar de quem as deixou \t','Anônimo','Frases Tristes')\n" +
                ",('Deus une propósitos. \t','Anônimo','Status para Casal')\n" +
                ",('O mais lindo em mim, é você. \t','Anônimo','Status para Casal')\n" +
                ",('Em você, me encontrei. \t','Anônimo','Status para Casal')\n" +
                ",('Corre pra mim, nada mais te falta aqui. \t','Anônimo','Status para Casal')\n" +
                ",('Paraíso em forma de gente. \t','Anônimo','Status para Casal')\n" +
                ",('Nas minhas orações, peço para continuar sempre ao seu lado, amor. \t','Anônimo','Status para Casal')\n" +
                ",('É... eu me apaixonei até pelos seus defeitos. \t','Anônimo','Status para Casal')\n" +
                ",('Felicidade é ter você. \t','Anônimo','Status para Casal')\n" +
                ",('Quando o querer é sincero, o amor se torna completo. \t','Anônimo','Status para Casal')\n" +
                ",('Meus sonhos me levam a você. \t','Anônimo','Status para Casal')\n" +
                ",('Tu é trevo que não me atrevo a perder. Meu presente de Deus! \t','Anônimo','Status para Casal')\n" +
                ",('Tem sido você desde que chegou, e ao seu lado eu tenho o que sempre me faltou. \t','Anônimo','Status para Casal')\n" +
                ",('Deus abençoou a nossa união. \t','Anônimo','Status para Casal')\n" +
                ",('Se eu tiver você comigo, o resto vira só um detalhe. \t','Anônimo','Status para Casal')\n" +
                ",('A vida acertou em cheio ao me dar você. \t','Anônimo','Status para Casal')\n" +
                ",('Eu amo você porque você é tudo o que eu sempre quis. Nem nos meus melhores sonhos poderia imaginar um amor como esse. \t','Anônimo','Status para Casal')\n" +
                ",('Eu sei que Deus te escolheu a dedo para me fazer feliz. \t','Anônimo','Status para Casal')\n" +
                ",('Ainda não descobri outra forma melhor de viver do que ter o meu coração e o seu batendo em sintonia todos os dias. \t','Anônimo','Status para Casal')\n" +
                ",('Feliz é o casal que tem a Deus, porque quem tem Deus tem tudo. \t','Anônimo','Status para Casal')\n" +
                ",('Nossa conexão é inexplicável, ela vem de Deus. \t','Anônimo','Status para Casal')\n" +
                ",('Minha companhia, meu amor, minha fonte de apoio. Eu te amo mais a cada dia! \t','Anônimo','Status para Casal')\n" +
                ",('É por você que todo dia eu agradeço, Eu não te largo, não te troco e não te esqueço. \t','Anônimo','Status para Casal')\n" +
                ",('Nos planos de Deus nunca existe erro. Tudo o que vem através dele é perfeito \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei minha paz em você. \t','Anônimo','Status para Casal')\n" +
                ",('Que o nosso futuro seja muito além de um namoro, que nosso amor seja maior do que qualquer obstáculo. \t','Anônimo','Status para Casal')\n" +
                ",('Me encaixei em você, e foi assim, me encaixando em cada detalhe seu, que aos poucos me encaixei na sua vida. \t','Anônimo','Status para Casal')\n" +
                ",('Pedi a Deus alguém que me completasse, ele me deu alguém que me transbordasse. \t','Anônimo','Status para Casal')\n" +
                ",('Amor não se evita, amor nos levita, nos deixa indo, só rindo, sorrindo! \t','Anônimo','Status para Casal')\n" +
                ",('Esse amor eu juro proteger todos os dias. \t','Anônimo','Status para Casal')\n" +
                ",('Já virou rotina me deitar e imaginar como seria se você estivesse ali. \t','Anônimo','Status para Casal')\n" +
                ",('Eu não consigo passar um dia sem pensar em você. \t','Anônimo','Status para Casal')\n" +
                ",('Eu quero você, todo santo dia. \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei em você aquilo tudo que eu sequer sabia que procurava. \t','Anônimo','Status para Casal')\n" +
                ",('E a cada novo sorriso teu, serei feliz por amar você. \t','Anônimo','Status para Casal')\n" +
                ",('Gosto do seu perfume, você cheira ao amor da minha vida. \t','Anônimo','Status para Casal')\n" +
                ",('Quando conheci você, conheci a felicidade. \t','Anônimo','Status para Casal')\n" +
                ",('A vida sorriu quando você chegou! \t','Anônimo','Status para Casal')\n" +
                ",('Você é a melhor parte dessa vida tão confusa. \t','Anônimo','Status para Casal')\n" +
                ",('Há olhares que se cruzam uma vez na vida para nunca mais se largarem. \t','Anônimo','Status para Casal')\n" +
                ",('Sou feliz no amor e a culpa é toda sua! \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei quem eu queria e ninguém te tira mais de mim! \t','Anônimo','Status para Casal')\n" +
                ",('Nada no mundo vai fazer eu desistir de você! \t','Anônimo','Status para Casal')\n" +
                ",('Tinha que ser você... \t','Anônimo','Status para Casal')\n" +
                ",('Minha meta é ficar várias décadas ao seu lado. \t','Anônimo','Status para Casal')\n" +
                ",('Você que me ensinou a amar, meu bem! \t','Anônimo','Status para Casal')\n" +
                ",('Quando penso em alguém só penso em você! \t','Anônimo','Status para Casal')\n" +
                ",('Você não faz nem ideia do quanto que eu gosto de você... \t','Anônimo','Status para Casal')\n" +
                ",('Sorte mesmo é encontrar alguém que te complete! \t','Anônimo','Status para Casal')\n" +
                ",('Ao te ver pela primeira vez Deus sussurrou no meu coração: É ele. \t','Anônimo','Status para Casal')\n" +
                ",('Te quero pra vida toda! \t','Anônimo','Status para Casal')\n" +
                ",('Além de namorados, somos também melhores amigos. \t','Anônimo','Status para Casal')\n" +
                ",('Quero uma vida inteira ao seu lado! \t','Anônimo','Status para Casal')\n" +
                ",('Você é a parte que faltava em mim. \t','Anônimo','Status para Casal')\n" +
                ",('Você merece um prêmio por conseguir me aturar todo esse tempo! \t','Anônimo','Status para Casal')\n" +
                ",('Só você tem carta branca, passe livre no meu coração. \t','Anônimo','Status para Casal')\n" +
                ",('Se eu tenho você, meu bem, não quero mais ninguém! \t','Anônimo','Status para Casal')\n" +
                ",('Seu sorriso me salva de qualquer dia ruim. \t','Anônimo','Status para Casal')\n" +
                ",('Às vezes, sem querer, a gente esbarra em alguém que valha a pena! \t','Anônimo','Status para Casal')\n" +
                ",('Mas quando você me dá a mão, amor, eu sinto que posso voar... \t','Anônimo','Status para Casal')\n" +
                ",('Meu mundo sem você pra me chamar de amor não tem graça. \t','Anônimo','Status para Casal')\n" +
                ",('O nosso amor me inspira, e me faz suspirar por você... \t','Anônimo','Status para Casal')\n" +
                ",('Nossos abraços são \"eu te amo\" disfarçados... \t','Anônimo','Status para Casal')\n" +
                ",('De repente o que era brincadeira, mudou o brilho do meu olhar... \t','Anônimo','Status para Casal')\n" +
                ",('Te amo mais do que prometi. \t','Anônimo','Status para Casal')\n" +
                ",('Nossa história foi escrita torta de propósito pra gente se cruzar. \t','Anônimo','Status para Casal')\n" +
                ",('Diante de um amor de erros você foi o meu único acerto! \t','Anônimo','Status para Casal')\n" +
                ",('Amor é quando o instante que ele acontece é bem maior que o tempo que ele dura. \t','Anônimo','Status para Casal')\n" +
                ",('Amores maduros não caem do pé! \t','Anônimo','Status para Casal')\n" +
                ",('Não tem jeito, é você. \t','Anônimo','Status para Casal')\n" +
                ",('Só do teu lado tudo é mais \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei abrigo dentro do teu abraço \t','Anônimo','Status para Casal')\n" +
                ",('E era amor. Desde o jeito de olhar, até as palavras não ditas. \t','Anônimo','Status para Casal')\n" +
                ",('Cada pensamento meu, tem um pouco de você. \t','Anônimo','Status para Casal')\n" +
                ",('Você é aquela coisa boa no meio da minha bagunça…\t','Anônimo','Status para Casal')\n" +
                ",('Você me sorriu e a vida mudou \t','Anônimo','Status para Casal')\n" +
                ",('Sem você a vida é tão sem graça \t','Anônimo','Status para Casal')\n" +
                ",('E que vire rotina, acordar todos os dias com você do meu lado. \t','Anônimo','Status para Casal')\n" +
                ",('Nos meios dos meus erros, meu acerto foi você!\t','Anônimo','Status para Casal')\n" +
                ",('Só quero dizer que você é minha coisa mais favorita do mundo \t','Anônimo','Status para Casal')\n" +
                ",('Me faz feliz, amor que vai durar pra toda vida! \t','Anônimo','Status para Casal');";

        return frases;
    }
    public  static String carregarFrases5(){
        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES \n" +
                "('Que floresça amor em cada detalhe!\t','Anônimo','Status para Casal')\n" +
                ",('Não há alguém que me faça tão bem como você me faz \t','Anônimo','Status para Casal')\n" +
                ",('Só de pensar em te perder, já me perco toda. \t','Anônimo','Status para Casal')\n" +
                ",('Mas de que importa o mundo lá fora, se eu tenho você comigo \t','Anônimo','Status para Casal')\n" +
                ",('Que o universo inteiro, conspire ao nosso favor \t','Anônimo','Status para Casal')\n" +
                ",('Gosta de tudo que eu gosto, não tem divisão \t','Anônimo','Status para Casal')\n" +
                ",('Que o nosso bem, faça bem ao outro também. \t','Anônimo','Status para Casal')\n" +
                ",('Tenho comigo uma única certeza: Deus te fez pra mim!\t','Anônimo','Status para Casal')\n" +
                ",('Meus olhos não conseguem ver Um outro amor pra minha vida… \t','Anônimo','Status para Casal')\n" +
                ",('Felicidade é saber que eu tenho o seu amor.\t','Anônimo','Status para Casal')\n" +
                ",('Nunca amei ninguém assim \t','Anônimo','Status para Casal')\n" +
                ",('Não me imagino envelhecer, sem você \t','Anônimo','Status para Casal')\n" +
                ",('Se você vem, fica tudo maior. \t','Anônimo','Status para Casal')\n" +
                ",('É como se eu existisse de um jeito mais completo. \t','Anônimo','Status para Casal')\n" +
                ",('Antes de te encontrar o mundo não tinha cor.\t','Anônimo','Status para Casal')\n" +
                ",('Quero te dizer teu amor mudou minha vida \t','Anônimo','Status para Casal')\n" +
                ",('Toda noite de insônia, eu penso em te escrever. \t','Anônimo','Status para Casal')\n" +
                ",('Sem você a vida é tão sem graça \t','Anônimo','Status para Casal')\n" +
                ",('Deus une propósitos. \t','Anônimo','Status para Casal')\n" +
                ",('O mais lindo em mim, é você. \t','Anônimo','Status para Casal')\n" +
                ",('Em você, me encontrei. \t','Anônimo','Status para Casal')\n" +
                ",('Corre pra mim, nada mais te falta aqui. \t','Anônimo','Status para Casal')\n" +
                ",('Paraíso em forma de gente. \t','Anônimo','Status para Casal')\n" +
                ",('Nas minhas orações, peço para continuar sempre ao seu lado, amor. \t','Anônimo','Status para Casal')\n" +
                ",('É... eu me apaixonei até pelos seus defeitos. \t','Anônimo','Status para Casal')\n" +
                ",('Felicidade é ter você. \t','Anônimo','Status para Casal')\n" +
                ",('Quando o querer é sincero, o amor se torna completo. \t','Anônimo','Status para Casal')\n" +
                ",('Meus sonhos me levam a você. \t','Anônimo','Status para Casal')\n" +
                ",('Tu é trevo que não me atrevo a perder. Meu presente de Deus! \t','Anônimo','Status para Casal')\n" +
                ",('Tem sido você desde que chegou, e ao seu lado eu tenho o que sempre me faltou. \t','Anônimo','Status para Casal')\n" +
                ",('Deus abençoou a nossa união. \t','Anônimo','Status para Casal')\n" +
                ",('Se eu tiver você comigo, o resto vira só um detalhe. \t','Anônimo','Status para Casal')\n" +
                ",('A vida acertou em cheio ao me dar você. \t','Anônimo','Status para Casal')\n" +
                ",('Eu amo você porque você é tudo o que eu sempre quis. Nem nos meus melhores sonhos poderia imaginar um amor como esse. \t','Anônimo','Status para Casal')\n" +
                ",('Eu sei que Deus te escolheu a dedo para me fazer feliz. \t','Anônimo','Status para Casal')\n" +
                ",('Ainda não descobri outra forma melhor de viver do que ter o meu coração e o seu batendo em sintonia todos os dias. \t','Anônimo','Status para Casal')\n" +
                ",('Feliz é o casal que tem a Deus, porque quem tem Deus tem tudo. \t','Anônimo','Status para Casal')\n" +
                ",('Nossa conexão é inexplicável, ela vem de Deus. \t','Anônimo','Status para Casal')\n" +
                ",('Minha companhia, meu amor, minha fonte de apoio. Eu te amo mais a cada dia! \t','Anônimo','Status para Casal')\n" +
                ",('É por você que todo dia eu agradeço, Eu não te largo, não te troco e não te esqueço. \t','Anônimo','Status para Casal')\n" +
                ",('Nos planos de Deus nunca existe erro. Tudo o que vem através dele é perfeito \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei minha paz em você. \t','Anônimo','Status para Casal')\n" +
                ",('Que o nosso futuro seja muito além de um namoro, que nosso amor seja maior do que qualquer obstáculo. \t','Anônimo','Status para Casal')\n" +
                ",('Me encaixei em você, e foi assim, me encaixando em cada detalhe seu, que aos poucos me encaixei na sua vida. \t','Anônimo','Status para Casal')\n" +
                ",('Pedi a Deus alguém que me completasse, ele me deu alguém que me transbordasse. \t','Anônimo','Status para Casal')\n" +
                ",('Amor não se evita, amor nos levita, nos deixa indo, só rindo, sorrindo! \t','Anônimo','Status para Casal')\n" +
                ",('Esse amor eu juro proteger todos os dias. \t','Anônimo','Status para Casal')\n" +
                ",('Já virou rotina me deitar e imaginar como seria se você estivesse ali. \t','Anônimo','Status para Casal')\n" +
                ",('Eu não consigo passar um dia sem pensar em você. \t','Anônimo','Status para Casal')\n" +
                ",('Eu quero você, todo santo dia. \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei em você aquilo tudo que eu sequer sabia que procurava. \t','Anônimo','Status para Casal')\n" +
                ",('E a cada novo sorriso teu, serei feliz por amar você. \t','Anônimo','Status para Casal')\n" +
                ",('Gosto do seu perfume, você cheira ao amor da minha vida. \t','Anônimo','Status para Casal')\n" +
                ",('Quando conheci você, conheci a felicidade. \t','Anônimo','Status para Casal')\n" +
                ",('A vida sorriu quando você chegou! \t','Anônimo','Status para Casal')\n" +
                ",('Você é a melhor parte dessa vida tão confusa. \t','Anônimo','Status para Casal')\n" +
                ",('Há olhares que se cruzam uma vez na vida para nunca mais se largarem. \t','Anônimo','Status para Casal')\n" +
                ",('Sou feliz no amor e a culpa é toda sua! \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei quem eu queria e ninguém te tira mais de mim! \t','Anônimo','Status para Casal')\n" +
                ",('Nada no mundo vai fazer eu desistir de você! \t','Anônimo','Status para Casal')\n" +
                ",('Tinha que ser você... \t','Anônimo','Status para Casal')\n" +
                ",('Minha meta é ficar várias décadas ao seu lado. \t','Anônimo','Status para Casal')\n" +
                ",('Você que me ensinou a amar, meu bem! \t','Anônimo','Status para Casal')\n" +
                ",('Quando penso em alguém só penso em você! \t','Anônimo','Status para Casal')\n" +
                ",('Você não faz nem ideia do quanto que eu gosto de você... \t','Anônimo','Status para Casal')\n" +
                ",('Sorte mesmo é encontrar alguém que te complete! \t','Anônimo','Status para Casal')\n" +
                ",('Ao te ver pela primeira vez Deus sussurrou no meu coração: É ele. \t','Anônimo','Status para Casal')\n" +
                ",('Te quero pra vida toda! \t','Anônimo','Status para Casal')\n" +
                ",('Além de namorados, somos também melhores amigos. \t','Anônimo','Status para Casal')\n" +
                ",('Quero uma vida inteira ao seu lado! \t','Anônimo','Status para Casal')\n" +
                ",('Você é a parte que faltava em mim. \t','Anônimo','Status para Casal')\n" +
                ",('Você merece um prêmio por conseguir me aturar todo esse tempo! \t','Anônimo','Status para Casal')\n" +
                ",('Só você tem carta branca, passe livre no meu coração. \t','Anônimo','Status para Casal')\n" +
                ",('Se eu tenho você, meu bem, não quero mais ninguém! \t','Anônimo','Status para Casal')\n" +
                ",('Seu sorriso me salva de qualquer dia ruim. \t','Anônimo','Status para Casal')\n" +
                ",('Às vezes, sem querer, a gente esbarra em alguém que valha a pena! \t','Anônimo','Status para Casal')\n" +
                ",('Mas quando você me dá a mão, amor, eu sinto que posso voar... \t','Anônimo','Status para Casal')\n" +
                ",('Meu mundo sem você pra me chamar de amor não tem graça. \t','Anônimo','Status para Casal')\n" +
                ",('O nosso amor me inspira, e me faz suspirar por você... \t','Anônimo','Status para Casal')\n" +
                ",('Nossos abraços são \"eu te amo\" disfarçados... \t','Anônimo','Status para Casal')\n" +
                ",('De repente o que era brincadeira, mudou o brilho do meu olhar... \t','Anônimo','Status para Casal')\n" +
                ",('Te amo mais do que prometi. \t','Anônimo','Status para Casal')\n" +
                ",('Nossa história foi escrita torta de propósito pra gente se cruzar. \t','Anônimo','Status para Casal')\n" +
                ",('Diante de um amor de erros você foi o meu único acerto! \t','Anônimo','Status para Casal')\n" +
                ",('Amor é quando o instante que ele acontece é bem maior que o tempo que ele dura. \t','Anônimo','Status para Casal')\n" +
                ",('Amores maduros não caem do pé! \t','Anônimo','Status para Casal')\n" +
                ",('Não tem jeito, é você. \t','Anônimo','Status para Casal')\n" +
                ",('Só do teu lado tudo é mais \t','Anônimo','Status para Casal')\n" +
                ",('Encontrei abrigo dentro do teu abraço \t','Anônimo','Status para Casal')\n" +
                ",('E era amor. Desde o jeito de olhar, até as palavras não ditas. \t','Anônimo','Status para Casal')\n" +
                ",('Cada pensamento meu, tem um pouco de você. \t','Anônimo','Status para Casal')\n" +
                ",('Você é aquela coisa boa no meio da minha bagunça…\t','Anônimo','Status para Casal')\n" +
                ",('Você me sorriu e a vida mudou \t','Anônimo','Status para Casal')\n" +
                ",('Sem você a vida é tão sem graça \t','Anônimo','Status para Casal')\n" +
                ",('E que vire rotina, acordar todos os dias com você do meu lado. \t','Anônimo','Status para Casal')\n" +
                ",('Nos meios dos meus erros, meu acerto foi você!\t','Anônimo','Status para Casal')\n" +
                ",('Só quero dizer que você é minha coisa mais favorita do mundo \t','Anônimo','Status para Casal')\n" +
                ",('Me faz feliz, amor que vai durar pra toda vida! \t','Anônimo','Status para Casal')\n" +
                ",('Que floresça amor em cada detalhe!\t','Anônimo','Status para Casal')\n" +
                ",('Não há alguém que me faça tão bem como você me faz \t','Anônimo','Status para Casal')\n" +
                ",('Só de pensar em te perder, já me perco toda. \t','Anônimo','Status para Casal')\n" +
                ",('Mas de que importa o mundo lá fora, se eu tenho você comigo \t','Anônimo','Status para Casal')\n" +
                ",('Que o universo inteiro, conspire ao nosso favor \t','Anônimo','Status para Casal')\n" +
                ",('Gosta de tudo que eu gosto, não tem divisão \t','Anônimo','Status para Casal')\n" +
                ",('Que o nosso bem, faça bem ao outro também. \t','Anônimo','Status para Casal')\n" +
                ",('Tenho comigo uma única certeza: Deus te fez pra mim!\t','Anônimo','Status para Casal')\n" +
                ",('Meus olhos não conseguem ver Um outro amor pra minha vida… \t','Anônimo','Status para Casal')\n" +
                ",('Felicidade é saber que eu tenho o seu amor.\t','Anônimo','Status para Casal')\n" +
                ",('Nunca amei ninguém assim \t','Anônimo','Status para Casal')\n" +
                ",('Não me imagino envelhecer, sem você \t','Anônimo','Status para Casal')\n" +
                ",('Se você vem, fica tudo maior. \t','Anônimo','Status para Casal')\n" +
                ",('É como se eu existisse de um jeito mais completo. \t','Anônimo','Status para Casal')\n" +
                ",('Antes de te encontrar o mundo não tinha cor.\t','Anônimo','Status para Casal')\n" +
                ",('Quero te dizer teu amor mudou minha vida \t','Anônimo','Status para Casal')\n" +
                ",('Toda noite de insônia, eu penso em te escrever. \t','Anônimo','Status para Casal')\n" +
                ",('Sem você a vida é tão sem graça \t','Anônimo','Status para Casal')\n" +
                ",('Me perco fácil nesse teu sorriso. \t','Anônimo','Status para Namorado')\n" +
                ",('Conexão é a coisa mais linda e rara que há. \t','Anônimo','Status para Namorado')\n" +
                ",('Sou apaixonada por cada detalhe do teu ser. \t','Anônimo','Status para Namorado')\n" +
                ",('Estar com você, sorrir e agradecer! \t','Anônimo','Status para Namorado')\n" +
                ",('Ainda bem que eu tenho você! \t','Anônimo','Status para Namorado')\n" +
                ",('Somos 8 e 80, juntos formamos o infinito desse amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Gostaria de colocar tudo que vi em voce^ em palavras. Mas daria mais que o universo um so´ verso.\t','Anônimo','Status para Namorado')\n" +
                ",('Você é a causa da minha felicidade. Você é o motivo do meu sorriso... Você é quem faz a vida parecer ter sentido. \t','Anônimo','Status para Namorado')\n" +
                ",('Quando a nossa vida e´ tocada intensamente por outra vida, o curso dela de alguma forma e´ alterado. E você faz com que essa mudança possa valer a pena. \t','Anônimo','Status para Namorado')\n" +
                ",('Te conhecer foi como escutar uma canção pela primeira vez e saber que seria a minha favorita para sempre. \t','Anônimo','Status para Namorado')\n" +
                ",('Minha sorte grande, meu amor  por toda a vida. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é minha felicidade, minha verdade, meu motivo de paz. \t','Anônimo','Status para Namorado')\n" +
                ",('Amor é o resumo do infinito, o enlace entre nossos corações. \t','Anônimo','Status para Namorado')\n" +
                ",('Você me mostrou que é possível ter um lar em outro peito. \t','Anônimo','Status para Namorado')\n" +
                ",('O amor é um sentimento lindo, que fica ainda mais belo quando compartilhado com alguém como você. \t','Anônimo','Status para Namorado')\n" +
                ",('Amar e´ saber ceder, se importar, se revoltar, mas resolver e sempre voltar pro lar. \t','Anônimo','Status para Namorado')\n" +
                ",('Tua companhia eu não troco por nenhuma outra. \t','Anônimo','Status para Namorado')\n" +
                ",('Mesmo sem saber que seria você, eu sempre te pedi em oração. \t','Anônimo','Status para Namorado')\n" +
                ",('Que o nosso amor vença toda causa. \t','Anônimo','Status para Namorado')\n" +
                ",('Me dá a mão e não solta. \t','Anônimo','Status para Namorado')\n" +
                ",('Tem coisas que eu preciso... e uma delas é você. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu te encontrei, você me escolheu. \t','Anônimo','Status para Namorado')\n" +
                ",('Fiz de ti morada e hoje sei que meu coração não poderia ter uma melhor lar. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é a melhor parte de mim, quem me fez ver que vale a pena ser plural. \t','Anônimo','Status para Namorado')\n" +
                ",('A nossa conexão foi tão forte que a cada dia eu tenho mais certeza que amor não se conquista, simplesmente pertencemos um ao outro. \t','Anônimo','Status para Namorado')\n" +
                ",('A vida e´ boa ao seu lado, você desperta o melhor de mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Me tem de uma forma tão linda. \t','Anônimo','Status para Namorado')\n" +
                ",('O teu cheiro é convite para perder o juízo. \t','Anônimo','Status para Namorado')\n" +
                ",('Sempre será você, nunca esqueça. \t','Anônimo','Status para Namorado')\n" +
                ",('Mas quando você vem, eu fico muito melhor! \t','Anônimo','Status para Namorado')\n" +
                ",('Eu e você somos um só lugar. \t','Anônimo','Status para Namorado')\n" +
                ",('Adoro seu jeito de me olhar cheio de calma, parece que toda paz do mundo cabe nos teus olhos. \t','Anônimo','Status para Namorado')\n" +
                ",('É que seu jeito de amar me faz acreditar que você é meu lar. \t','Anônimo','Status para Namorado')\n" +
                ",('E para me ver feliz, Deus me enviou você. \t','Anônimo','Status para Namorado')\n" +
                ",('O caminho é mais divertido quando o fazemos juntos. \t','Anônimo','Status para Namorado')\n" +
                ",('Amar profundamente alguém nos dá coragem. \t','Anônimo','Status para Namorado')\n" +
                ",('O coração é meu, mas tem um pouquinho de você em cada cantinho dele. \t','Anônimo','Status para Namorado')\n" +
                ",('Foi Deus que te separou e guardou pra mim, amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Sintonia é o som da harmonia entre duas vidas. \t','Anônimo','Status para Namorado')\n" +
                ",('Bonito é quem faz florescer o que há de melhor no coração da gente. \t','Anônimo','Status para Namorado')\n" +
                ",('Há braços que são lares. Abraços são lares. O seu é o meu. \t','Anônimo','Status para Namorado')\n" +
                ",('Quem quer de verdade, sempre arruma um jeito. \t','Anônimo','Status para Namorado')\n" +
                ",('Até de longe, você me faz bem. \t','Anônimo','Status para Namorado')\n" +
                ",('A gente se pertence de uma forma tão única, nossa conexão é tão rara. \t','Anônimo','Status para Namorado')\n" +
                ",('Você me tem de uma forma tão linda, amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Aquele beijo com gosto de amor e vontade de ficar... \t','Anônimo','Status para Namorado')\n" +
                ",('Fica à vontade, minha casa é sua. Meus olhos, meu sorriso, meu corpo e meu coração. \t','Anônimo','Status para Namorado')\n" +
                ",('Escolho você. Com tudo o que sou, com o pouco que tenho e com o infinito que sinto. \t','Anônimo','Status para Namorado')\n" +
                ",('É que meu amor é teu. E sempre será teu. \t','Anônimo','Status para Namorado')\n" +
                ",('Teu sorriso é a poesia mais linda que meus olhos já leram. \t','Anônimo','Status para Namorado')\n" +
                ",('Não solta nunca a minha mão, que eu prometo também jamais te abandonar. \t','Anônimo','Status para Namorado')\n" +
                ",('Com você, eu sou muito melhor! \t','Anônimo','Status para Namorado')\n" +
                ",('Eu me apaixono todos os dias por você, amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Quem lê meu coração, enxerga teu nome. \t','Anônimo','Status para Namorado')\n" +
                ",('Falei de você pra Deus e pedi pra Ele cuidar de você pra mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu me apaixono todo dia por cada detalhe teu. \t','Anônimo','Status para Namorado')\n" +
                ",('Te encontrar era minha missão \t','Anônimo','Status para Namorado')\n" +
                ",('Quando notei, seu nome já estava incluso nas minhas orações. \t','Anônimo','Status para Namorado')\n" +
                ",('Gosto da maneira única que você tem de fazer o meu coração disparar. \t','Anônimo','Status para Namorado')\n" +
                ",('Foi no seu abraço que encontrei conforto e é nele que quero permanecer pra sempre. \t','Anônimo','Status para Namorado')\n" +
                ",('O coração é meu, mas tem um pouco de você em cada cantinho dele. \t','Anônimo','Status para Namorado')\n" +
                ",('Meu lar não é uma casa, é um abraço. \t','Anônimo','Status para Namorado')\n" +
                ",('O destino quis assim: início, meio, sem fim. \t','Anônimo','Status para Namorado')\n" +
                ",('Toda vez que você me olha, algo especial acontece dentro de mim.. \t','Anônimo','Status para Namorado')\n" +
                ",('Importante mesmo é ter amor pra ir em frente. \t','Anônimo','Status para Namorado')\n" +
                ",('Cada um com sua sorte, você é a minha. \t','Anônimo','Status para Namorado')\n" +
                ",('Seu aconchego, aconchegou tudo em mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é tudo que eu sei sobre o amor. \t','Anônimo','Status para Namorado')\n" +
                ",('Mora em mim, serei teu abrigo, quando teu coração precisar de casa. \t','Anônimo','Status para Namorado')\n" +
                ",('Você tem o dom de roubar os meus sorrisos. \t','Anônimo','Status para Namorado')\n" +
                ",('Perdida em você não preciso me encontrar em mais ninguém. \t','Anônimo','Status para Namorado')\n" +
                ",('Tudo é mais simples ao lado da pessoa certa. \t','Anônimo','Status para Namorado')\n" +
                ",('Meu presente, meu futuro… Eu pretendo viver com você \t','Anônimo','Status para Namorado')\n" +
                ",('E ele nunca foi uma opção. Sempre foi minha escolha. \t','Anônimo','Status para Namorado')\n" +
                ",('A melhor parte de mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Se não for pedir muito, nunca vá embora. \t','Anônimo','Status para Namorado')\n" +
                ",('Minha melhor versão é ao seu lado. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu tenho uma paixão louca pelo seu sorriso. \t','Anônimo','Status para Namorado')\n" +
                ",('É tão bonito ter você, tão bonito amar você. \t','Anônimo','Status para Namorado')\n" +
                ",('E tu me tem sem querer, sem saber o porquê. \t','Anônimo','Status para Namorado')\n" +
                ",('Somos eu e você. Sempre foi eu e você. Pertencemos um ao outro. \t','Anônimo','Status para Namorado')\n" +
                ",('Se for preciso eu dobro o tamanho do meu coração, pra ter mais um pouquinho de ti aqui. \t','Anônimo','Status para Namorado')\n" +
                ",('Pra mim felicidade é ter você. \t','Anônimo','Status para Namorado')\n" +
                ",('E agradeço todos os dias por você ter aparecido! \t','Anônimo','Status para Namorado')\n" +
                ",('Cada minuto contigo é único, é terno. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é aquela pessoa que todo alguém queria ter ao lado. \t','Anônimo','Status para Namorado')\n" +
                ",('A vida é feita de escolhas, numa delas, te escolhi pra sempre. \t','Anônimo','Status para Namorado')\n" +
                ",('Cê sabe que eu sempre te quis! \t','Anônimo','Status para Namorado')\n" +
                ",('Teu sorriso me completa, teu olhar me transmite paz. \t','Anônimo','Status para Namorado')\n" +
                ",('Não sei o que fiz pra merecer você, mas agora vou fazer de tudo pra não perder. \t','Anônimo','Status para Namorado')\n" +
                ",('Você tem o dom de acalmar meu coração, mesmo a quilômetros de distância. \t','Anônimo','Status para Namorado')\n" +
                ",('Tudo me lembra você... \t','Anônimo','Status para Namorado')\n" +
                ",('Te fazer sorrir me faz feliz! \t','Anônimo','Status para Namorado')\n" +
                ",('E cada dia te quero um pouco mais.\t','Anônimo','Status para Namorado')\n" +
                ",('Quem te quer te melhora, não te muda! \t','Anônimo','Status para Namorado')\n" +
                ",('Eu largaria tudo para estar com você agora! \t','Anônimo','Status para Namorado')\n" +
                ",('Amar é enfrentar as dificuldades de mãos dadas. \t','Anônimo','Status para Namorado')\n" +
                ",('Seja grato a quem te faz ir dormir com um sorriso no rosto! \t','Anônimo','Status para Namorado')\n" +
                ",('Amor de pequenos atos sobrevive mais que amor de grandes promessas. \t','Anônimo','Status para Namorado')\n" +
                ",('Não importa o que aconteça, eu só preciso de você. \t','Anônimo','Status para Namorado')\n" +
                ",('Cada dia que passa eu me apaixono mais por você. \t','Anônimo','Status para Namorado')\n" +
                ",('Amar é encontrar na felicidade do outro a sua própria felicidade! \t','Anônimo','Status para Namorado')\n" +
                ",('Quando eu falo de amor por aí é pensando em você... \t','Anônimo','Status para Namorado')\n" +
                ",('Te prometo cada batida do meu coração. Prometo, teremos problemas, mas nunca sem solução. \t','Anônimo','Status para Namorado')\n" +
                ",('Talvez seja natural. Você pode ter sido feito pra mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Mesmo depois de conhecer tantos outros sorrisos o seu continua sendo o meu preferido! \t','Anônimo','Status para Namorado')\n" +
                ",('Eu moraria facilmente dentro do seu abraço. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é o motivo do meu sorriso bobo e olhar apaixonado. \t','Anônimo','Status para Namorado')\n" +
                ",('E o meu \"final feliz\" é todo dia ao seu lado! \t','Anônimo','Status para Namorado')\n" +
                ",('Com você o meu mundo é melhor! \t','Anônimo','Status para Namorado')\n" +
                ",('Sabe aquela pessoa que você passa a vida inteira procurando pra viver Pra mim é você. \t','Anônimo','Status para Namorado')\n" +
                ",('Gosto tanto de nós dois que faria de tudo só pra não te perder! \t','Anônimo','Status para Namorado')\n" +
                ",('Todos vivem por uma razão, a minha é você. \t','Anônimo','Status para Namorado')\n" +
                ",('Prometi a mim mesma que não iria me apaixonar de novo, mas quebrei a promessa assim que vi esse teu sorriso... \t','Anônimo','Status para Namorado')\n" +
                ",('Me desmancho todinha quando encosto em você! \t','Anônimo','Status para Namorado')\n" +
                ",('É tão bom acordar todos os dias e lembrar que tenho você só pra mim! \t','Anônimo','Status para Namorado')\n" +
                ",('Se te faz sorrir, é porque te faz bem. Se te faz bem, não deixe escapar. \t','Anônimo','Status para Namorado')\n" +
                ",('Meu sorriso fica mais bonito quando tem você como motivo... \t','Anônimo','Status para Namorado')\n" +
                ",('Tenho orgulho de ter você ao meu lado! \t','Anônimo','Status para Namorado')\n" +
                ",('Meu riso é tão feliz contigo. \t','Anônimo','Status para Namorado')\n" +
                ",('Meu mundo se resume em amar você. \t','Anônimo','Status para Namorado')\n" +
                ",('Ninguém além de você!\t','Anônimo','Status para Namorado')\n" +
                ",('A vida é minha. Mas o coração, é seu.\t','Anônimo','Status para Namorado')\n" +
                ",('E o teu sorriso é o meu ponto de paz.\t','Anônimo','Status para Namorado')\n" +
                ",('Quando dei por mim, tu fez da minha alma sua morada \t','Anônimo','Status para Namorado')\n" +
                ",('Todo meu amor é teu.\t','Anônimo','Status para Namorado')\n" +
                ",('Todos nós precisamos de alguém que precise de nós.\t','Anônimo','Status para Namorado')\n" +
                ",('Perto de você é onde eu quero estar. \t','Anônimo','Status para Namorado')\n" +
                ",('Obrigada por me fazer dormir sorrindo.\t','Anônimo','Status para Namorado')\n" +
                ",('Não foi sorte, foi Deus que fez tudo dar certo. \t','Anônimo','Status para Namorado')\n" +
                ",('Desde que você chegou, tudo ficou mais bonito.\t','Anônimo','Status para Namorado')\n" +
                ",('E cada dia que passa eu te amo mais. \t','Anônimo','Status para Namorado')\n" +
                ",('Te conhecer foi como escutar uma canção pela primeira vez e saber que seria a minha favorita para sempre.\t','Anônimo','Status para Namorado')\n" +
                ",('A gente podia brincar de ser infinito e por amor ou descuido, ficarmos juntos pra sempre. \t','Anônimo','Status para Namorado')\n" +
                ",('Entre mil outros, você. Entre mil sorrisos, o seu. Entre mil amores, o nosso!\t','Anônimo','Status para Namorado')\n" +
                ",('De pouco em pouco você se tornou muito pra mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Eu te entendo. E quando não te entendo, te aceito! E acima de todas as coisas EU TE AMO!!\t','Anônimo','Status para Namorado')\n" +
                ",('Ser profundamente amado por alguém nos dá força; amar alguém profundamente nos dá coragem.\t','Anônimo','Status para Namorado')\n" +
                ",('Você só saberá o que é o amor, quando lhe perguntam sobre ele e você não pensar em uma definição, mas em um nome. \t','Anônimo','Status para Namorado')\n" +
                ",('De dez vidas, onze eu te daria. \t','Anônimo','Status para Namorado')\n" +
                ",('Se existe felicidade perfeita eu não sei, mas com você eu me sinto perfeitamente feliz.\t','Anônimo','Status para Namorado')\n" +
                ",('Eu descobri que era amor quando nos momentos das minhas orações você estava na parte de agradecimento.\t','Anônimo','Status para Namorado')\n" +
                ",('Cada detalhe seu me faz te amar mais e mais.\t','Anônimo','Status para Namorado')\n" +
                ",('Eu te escolhi e escolheria outras mil vezes!\t','Anônimo','Status para Namorado')\n" +
                ",('Te amar é ter um mar de água doce em mim. \t','Anônimo','Status para Namorado')\n" +
                ",('Em tempos de corações sedentários amar é um ato revolucionário. \t','Anônimo','Status para Namorado')\n" +
                ",('Só hoje te amei para uma vida inteira. \t','Anônimo','Status para Namorado')\n" +
                ",('Do seu lado a felicidade é meu destino. Te amo!!! \t','Anônimo','Status para Namorado')\n" +
                ",('Por onde for, serei seu par! \t','Anônimo','Status para Namorado')\n" +
                ",('Você tem o dom de me fazer bem! \t','Anônimo','Status para Namorado')\n" +
                ",('Eu não preciso de mil motivos para sorrir, você já é o suficiente. \t','Anônimo','Status para Namorado')\n" +
                ",('Você é uma daquelas pessoas que faz com que a gente agradeça todos os dias por ter cruzado o nosso caminho!\t','Anônimo','Status para Namorado')\n" +
                ",('Você me trouxe paz quando eu mais precisava, você me faz feliz!\t','Anônimo','Status para Namorado')\n" +
                ",('Quando eu digo que você é o amor da minha vida , entenda duas coisas: Você é o meu amor e esse amor é o que me dá vida !\t','Anônimo','Status para Namorado')\n" +
                ",('Estado Civil: Completamente Feliz ao seu lado!\t','Anônimo','Status para Namorado')\n" +
                ",('Te encontrar era minha missão, meu destino agora é permanecer com você!\t','Anônimo','Status para Namorado')\n" +
                ",('De toda a minha literatura, você ainda é a minha melhor página!\t','Anônimo','Status para Namorado')\n" +
                ",('Vamos ver quem de nós dois consegue fazer o outro mais feliz \t','Anônimo','Status para Namorado')\n" +
                ",('Não resisti ao te ver passar pela minha vida, tive que fazer você ficar!\t','Anônimo','Status para Namorado')\n" +
                ",('Que sorte a minha, você é o sinônimo de felicidade! \t','Anônimo','Status para Namorado')\n" +
                ",('Sabe aquela sensação de que faltava alguma coisa, de que tinha alguém lá fora pra mim Sumiu quando eu te conheci… \t','Anônimo','Status para Namorado')\n" +
                ",('Eu não quero acabar com a tua vidinha de balada, quero dar PT junto contigo!\t','Anônimo','Status para Namorado')\n" +
                ",('O que você viu nele O que faltava em mim!\t','Anônimo','Status para Namorado')\n" +
                ",('Você me trouxe uma fé tão bonita, me encheu de vontade de sentir coisas boas e confiar novamente que o amor de verdade não fere, é cura!\t','Anônimo','Status para Namorado')\n" +
                ",('Viver ao seu lado é a razão de todos os meus sorrisos  Te amo!\t','Anônimo','Status para Namorado')\n" +
                ",('Ainda te olho com aqueles olhos, te admiro, te procuro… Sim, eu ainda te amo como se fosse a primeira vez!\t','Anônimo','Status para Namorado')\n" +
                ",('Não há alguém que me faça tão bem como você me faz \t','Anônimo','Status para Namorado')\n" +
                ",('Você é o maior presente que Deus poderia me dar \t','Anônimo','Status para Namorado')\n" +
                ",('Que seja feita a vontade de Deus.  (Atos 21:14)\t','Anônimo','Frases de Deus')\n" +
                ",('Jesus é o caminho que sigo para sempre.  (Atos 22:4)\t','Anônimo','Frases de Deus')\n" +
                ",('O que vem de Deus, traz paz.  (João 14:27)\t','Anônimo','Frases de Deus')\n" +
                ",('Não se turbe o vosso coração.  (João 14:1)\t','Anônimo','Frases de Deus')\n" +
                ",('Por isso posso me deitar tranquilo e dormir em paz. Quando acordo, me sinto seguro, porque Deus cuida de mim.  (Salmos 3:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Busquem, pois, em primeiro lugar o Reino de Deus e a sua justiça, e todas essas coisas serão acrescentadas a vocês. (Mateus 6:33)\t','Anônimo','Frases de Deus')\n" +
                ",('O Senhor é misericordioso e compassivo, paciente e transbordante de amor. (Salmos 145:8)\t','Anônimo','Frases de Deus')\n" +
                ",('Deem graças ao Senhor, porque ele é bom. O seu amor dura para sempre! (Salmos 136:1)\t','Anônimo','Frases de Deus')\n" +
                ",('Feliz será aquele que espera!  (Daniel 12:12)\t','Anônimo','Frases de Deus')\n" +
                ",('Permaneça em mim...  (João 15:4)\t','Anônimo','Frases de Deus')\n" +
                ",('Existe força brotando da sua fraqueza.  (2 Coríntios 12:9)\t','Anônimo','Frases de Deus')\n" +
                ",('Ele é fiel em tudo o que faz.  (Salmos 33:4)\t','Anônimo','Frases de Deus')\n" +
                ",('O senhor renova as minhas forças e me guia por caminhos certos.  (Salmos 23:3)\t','Anônimo','Frases de Deus')\n" +
                ",('Querido Deus, graças Te dou por me ouvir, me guardar e por fazer de tudo para me ver sorrir! (Salmo 64)\t','Anônimo','Frases de Deus')\n" +
                ",('Enquanto há vida, há esperança. (Eclesiastes 9:4)\t','Anônimo','Frases de Deus')\n" +
                ",('Querido Deus, Tu és minha proteção, a minha fortaleza. Tu és o meu Deus, eu confio em Ti. (Salmo 91:2)\t','Anônimo','Frases de Deus')\n" +
                ",('Deus sabe o que é bom para você. (Eclesiastes 6:12)\t','Anônimo','Frases de Deus')\n" +
                ",('Das alturas, o Eterno enxerga as profundezas. Não importa a distância, Ele sabe tudo sobre nós. (Salmo 138:6)\t','Anônimo','Frases de Deus')\n" +
                ",('Pelas suas feridas fomos curados...  (Isaías 53:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Espere no Senhor. Seja forte! Coragem! Espere no Senhor.  (Salmos 27:14)\t','Anônimo','Frases de Deus')\n" +
                ",('Mas a nossa capacidade vem de Deus.  (11 Corintios 3:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Mas graças a Deus, que nos dá a vitória por meio de nosso Senhor Jesus Cristo.  (1 Coríntios 15:57)\t','Anônimo','Frases de Deus')\n" +
                ",('Guarda-me, ó Deus, porque em ti confio.  (Salmos 16:1)\t','Anônimo','Frases de Deus')\n" +
                ",('O mais importante para Deus é o que está no coração  (Samuel 16:7)\t','Anônimo','Frases de Deus')\n" +
                ",('E Deus limpará dos seus olhos toda a lágrima.  (Apocalipse 21:4)\t','Anônimo','Frases de Deus')\n" +
                ",('Tenha coragem, Deus está contigo.  (Ageu 2:4)\t','Anônimo','Frases de Deus')\n" +
                ",('Até aqui nos ajudou o Senhor!  (Samuel 7:12)\t','Anônimo','Frases de Deus')\n" +
                ",('Aproveitem ao máximo todas as oportunidades.  (Colossenses 4:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Guarda-me, ó Deus, porque em ti confio.  (Salmos 16:1 )\t','Anônimo','Frases de Deus')\n" +
                ",('Tu, ó Senhor Deus, és tudo o que tenho. O meu futuro está em Tuas mãos. Tu diriges a minha vida.  (Salmos 16:5)\t','Anônimo','Frases de Deus')\n" +
                ",('A boca fala do que está cheio o coração.  (Mateus 12:34)\t','Anônimo','Frases de Deus')\n" +
                ",('Ele é o meu Deus, o meu refúgio, a minha fortaleza, e nele confiarei.  (Salmos 91:2)\t','Anônimo','Frases de Deus')\n" +
                ",('Felizes são os que ouvem a palavra de Deus e a guardam! (Lucas 11:28)\t','Anônimo','Frases de Deus')\n" +
                ",('O Senhor é bom, é um refúgio na tribulação; conhece os que nele confiam.  (Naum 1:7)\t','Anônimo','Frases de Deus')\n" +
                ",('Ora, a fé é a certeza daquilo que esperamos e a prova das coisas que não vemos.  (Hebreus 11:1)\t','Anônimo','Frases de Deus')\n" +
                ",('Espere no Senhor. Seja forte! Coragem! Espere no Senhor.  (Salmos 27:14)\t','Anônimo','Frases de Deus')\n" +
                ",('Venham a mim, todos os que estão cansados e sobrecarregados, e eu darei descanso a vocês.  (Mateus 11:28)\t','Anônimo','Frases de Deus')\n" +
                ",('Ó Senhor dos Exércitos, como é feliz aquele que em ti confia!  (Salmos 84:12)\t','Anônimo','Frases de Deus')\n" +
                ",('O que é nascido de Deus vence o mundo; e esta é a vitória que vence o mundo: a nossa fé.  (1 João 5:4)\t','Anônimo','Frases de Deus')\n" +
                ",('Deus mandará que os anjos dele cuidem de você para protegê-lo aonde quer que você for.  (Salmos 91.11)\t','Anônimo','Frases de Deus')\n" +
                ",('O amor me amou.  (João 3:16)\t','Anônimo','Frases de Deus')\n" +
                ",('Eu, o Senhor, sempre os guiarei; até mesmo no deserto.  (Isaías 58:11)\t','Anônimo','Frases de Deus')\n" +
                ",('O caminho de Deus é perfeito: as promessas do Senhor sempre se cumprem.  (2 Samuel 22.31)\t','Anônimo','Frases de Deus')\n" +
                ",('E tido quanto pedirdes em oração, crendo, recebereis.  (Mateus 21.22)\t','Anônimo','Frases de Deus')\n" +
                ",('O choro pode durar uma noite, mas a alegria vem pela manhã.  (Salmos 30:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Permaneça na esperança.  (Salmos 16:8-11)\t','Anônimo','Frases de Deus')\n" +
                ",('Todas as coisas foram criadas por Ele e para Ele.  (Colossenses 1:16)\t','Anônimo','Frases de Deus')\n" +
                ",('Vós sois a luz do mundo!  (Mateus 5:14)\t','Anônimo','Frases de Deus')\n" +
                ",('Porque vós, irmãos, fostes chamados à liberdade!  (Gálata 5:13)\t','Anônimo','Frases de Deus')\n" +
                ",('O senhor fez sua graça transbordar e me encheu da fé e do amor que vêm de Cristo Jesus!  (1 Timóteo 1:14)\t','Anônimo','Frases de Deus')\n" +
                ",('Eu o fortalecerei e o ajudarei; eu o segurarei com a minha mão direita vitoriosa.  (Isaías 41:10)\t','Anônimo','Frases de Deus')\n" +
                ",('O amigo ama em todos os momentos; é um irmão na adversidade.  (Provérbios 17:17)\t','Anônimo','Frases de Deus')\n" +
                ",('Respondeu Jesus: \"Eu sou o caminho, a verdade e a vida. Ninguém vem ao Pai, a não ser por mim\".  (João 14:6)\t','Anônimo','Frases de Deus')\n" +
                ",('Seja forte e corajoso! Não se apavore nem desanime, pois o Senhor, o seu Deus, estará com você por onde você andar.  (Josué 1:9)\t','Anônimo','Frases de Deus')\n" +
                ",('Mas em todas estas coisas somos mais que vencedores, por meio daquele que nos amou.  (Romanos 8:37)\t','Anônimo','Frases de Deus')\n" +
                ",('A ti, Senhor elevo a minha alma.  (Salmos 25:1)\t','Anônimo','Frases de Deus')\n" +
                ",('Amados, se Deus assim nos amou, também nos devemos amar uns aos outros.  (1 João 4:11)\t','Anônimo','Frases de Deus')\n" +
                ",('Disse, pois: Irá a minha presença contigo para te fazer descansar...  (Êxodo 33:14)\t','Anônimo','Frases de Deus')\n" +
                ",('Os que semeiam em lágrimas, segarão com alegria.  (Salmos 126:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Não façam cortes no corpo por causa dos mortos nem tatuagens em vocês mesmos. Eu sou o Senhor.  (Levítico 19:28)\t','Anônimo','Frases de Deus')\n" +
                ",('Fé não faz as coisas serem fáceis, mas as tornam totalmente possíveis, creia.  (Romanos 5:8)\t','Anônimo','Frases de Deus')\n" +
                ",('Senhor, tu és a minha porção e o meu cálice; és tu que garante o meu futuro.  (Salmos 16:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Mas bendito é o homem cuja confiança está no Senhor, cuja confiança nele está.  (Jeremias 17:7)\t','Anônimo','Frases de Deus')\n" +
                ",('Restaurarei o exausto e saciarei o enfraquecido.  (Jeremias 31:25)\t','Anônimo','Frases de Deus')\n" +
                ",('A sabedoria deve ser prioridade em sua vida.  (Provérbios 2)\t','Anônimo','Frases de Deus')\n" +
                ",('Entrega o teu caminho ao Senhor; confia nele, e Ele tudo fará.  (Salmos 37:5)\t','Anônimo','Frases de Deus')\n" +
                ",('Se Deus disse que eu posso, então eu posso! Irei e não temerei mal algum.  (Filipenses 4:13)\t','Anônimo','Frases de Deus')\n" +
                ",('O Senhor é a minha rocha, a minha fortaleza e o meu libertador. (Salmos 18:2)\t','Anônimo','Frases de Deus')\n" +
                ",('Basta a cada dia o seu próprio mal. (Mateus 6:34)\t','Anônimo','Frases de Deus')\n" +
                ",('No amor não há medo. (1 João 4:18)\t','Anônimo','Frases de Deus')\n" +
                ",('O Senhor é a minha força e o meu escudo. (Salmos 28:7)\t','Anônimo','Frases de Deus')\n" +
                ",('Alegrai-vos sempre no Senhor; outra vez digo: alegrai-vos. (Filipenses 4.4)\t','Anônimo','Frases de Deus')\n" +
                ",('Quem não ama não conhece a Deus, porque Deus é amor.  (1 João 4:8)\t','Anônimo','Frases de Deus')\n" +
                ",('Sei que a bondade e a fidelidade me acompanharão todos os dias da minha vida.  (Salmos 23:6)\t','Anônimo','Frases de Deus')\n" +
                ",('Peçam, e será dado; busquem, e encontrarão; batam, e a porta será aberta.  (Mateus 7:7)\t','Anônimo','Frases de Deus')\n" +
                ",('Lembre de Deus em tudo que fizer e ele lhe mostrará o caminho certo  (Provérbios 3:7)\t','Anônimo','Frases de Deus')\n" +
                ",('Não há causas perdidas falhas ou fracassos com Jesus  (Romanos 8:37)\t','Anônimo','Frases de Deus')\n" +
                ",('Mas tu, ó Senhor, me proteges como um escudo. Tu me dás a vitória e renovas a minha coragem.   (Salmos 3:3)\t','Anônimo','Frases de Deus')\n" +
                ",('A paz de Deus que está além de toda compreensão, guardará seu coração.  (Filipenses 4:7)\t','Anônimo','Frases de Deus')\n" +
                ",('E Deus limpará dos seus olhos toda a lágrima.  (Apocalipse 21:4)\t','Anônimo','Frases de Deus')\n" +
                ",('Quem sabe o que planta não teme a colheita  (Gálatas 6:70)\t','Anônimo','Frases de Deus')\n" +
                ",('Não há medo no amor  (João 4:18)\t','Anônimo','Frases de Deus')\n" +
                ",('Que a glória do Senhor encha o santuário do seu  (Êxodo 40:35)\t','Anônimo','Frases de Deus')\n" +
                ",('E assim esperando com paciência, alcançou a promessa  (Hebreus 6:15)\t','Anônimo','Frases de Deus')\n" +
                ",('Deus transforma as maldições em bençãos e nunca te desamparará  (Isaías 42:16)\t','Anônimo','Frases de Deus')\n" +
                ",('Eu sempre os amei e continuo a mostrar que o meu amor por vocês é eterno  (Jeremias 31:3)\t','Anônimo','Frases de Deus')\n" +
                ",('Sabendo que cada um receberá do Senhor todo o bem que fizer, seja servo, seja livre  (Efésios 6:8)\t','Anônimo','Frases de Deus')\n" +
                ",('Felizes os que guardam os mandamentos de Deus e lhe obedecem de todo coração.  (salmo 119:2)\t','Anônimo','Frases de Deus')\n" +
                ",('Deus é a minha salvação. Terei confiança e não temerei.  (Isaías 12:2)\t','Anônimo','Frases de Deus')\n" +
                ",('O coração do homem planeja o seu caminho, mas o Senhor lhe dirige os passos.  (Provérbios 16:9)\t','Anônimo','Frases de Deus')\n" +
                ",('Superei já, só choro quando lembro. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Trabalhar até os vizinhos falarem \"só pode tá roubando\". \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Como faz pra reiniciar a vida, essa não deu certo não. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Acordar mais cedo pra me atrasar com calma é a minha rotina. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Olhando pros meus problemas e falando agora não, mano. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Eu até me avisei.. mas não me ouvi. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Objetivo: reeducação alimentar. Obstáculo: comida. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se tem concorrência, serei desistência. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Parei com esse negócio de uma mão lava a outra: chega na minha vez, nunca tem água. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Trabalhar bastante pra ver se compro a paciência que me falta. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Preciso de inimigos novos, os antigos estão começando a gostar de mim, sou encantadora! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Bala perdida tem mais rumo que eu! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Com sono eu me deito, com sono eu me levanto. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Olha se tem uma coisa que eu confio é na minha desconfiança. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tô me afastando de tanta gente, que daqui a uns dias a solução vai ser conversar com as plantas. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Horrível ser pobre e não poder quebrar as coisas quando tá com raiva. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não tem a mínima possibilidade disso dar certo... tô dentro. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('A pessoa com sono desregulado quer guerra com praticamente todo mundo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se não for pra me atrasar prefiro nem ir. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Gente eu sou igual a criança, não me promete nada não. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('A gente mal chegou do réveillon e já tá pensando no carnaval, a gente não vale nada. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não tem a mínima possibilidade disso dar certo..... tô dentro. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Me tornei o que eu mais temia: quem desmarca o rolê pra ficar em casa. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ano que vem vou tomar um rumo, esse ano foi só pra testar um negócio. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Que situação complicada hein... vou tirar um cochilo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O argumento \"só se vive uma vez\" já me fez gastar tanto dinheiro.. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Queria não virar um bicho agressivo quando tô com fome \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Deve ser muito chique trabalhar, estudar, fazer academia e ainda conseguir dormir bem \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tantos dias de luta, que já tô ficando violento... \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Oi, notei que você só fica com pessoas bonitas quer experimentar algo diferente \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não discuta. Fale \"pode crer\" e se retire. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Queria um triângulo amoroso: eu, apartamento e um emprego bom. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O jovem quando está com sono não quer assunto com ninguém. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O erro do ser humano é achar que vai dar tudo certo! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vamos dormir que amanhã tem muita decisão errada pra tomar. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Uma vida resumida em: \"eu não ia comprar nada, mas tava na promoção\".. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Apagar a conversa e fingir que a pessoa nunca existiu, é assim que vivo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quer ser feliz, ok, tô aqui. Agora se quer continuar sofrendo, posso fazer nada \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vai a merda, mas vai pela calçada porque eu me preocupo com você, bebê \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Nasci com a maldição de rir nos momentos sérios. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Qual a parte de \"eu preciso economizar dinheiro\" que eu não entendo! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Gente, é sério, tô solteiro a mó tempão, não tenho ex pra superar não, pode dar em cima de mim de boa! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Alá eu fazendo exatamente aquilo que eu falei que era errado fazer.. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Queria dormir com quem eu gosto, mas infelizmente não cabe todos na minha cama. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Devolve os ML de perfume que eu usei pra ficar bem cheirosinha pra você! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O Fábio Jr. canta a música alma gêmea e já se divorciou 7 vezes. Eu vou acreditar em amor como \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Pra namorar comigo tem que ter plano de saúde, vai que infarta de raiva. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quando era menor morria de medo de bêbado, hoje sei que a gente não faz mal a ninguém! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Nova estação do ano: eutonoinferno! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vivo no impasse entre \"quero guardar dinheiro\" e \"só se vive uma vez\". \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se você cair, eu estarei aqui - disse o chão! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Até a vírgula faz diferença e a tua opinião não! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Que o dia seja tão bom quanto a minha cama estava... \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Alergia Tenho! Sou alérgica a dieta. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Já acordado, mas ainda sem condições de distinguir a Maiara da Maraísa. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Na cama eu faço loucuras, tipo derrubar o celular na cara enquanto digito.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ninguém é obrigado a gostar de mim, afinal nem todos nascem com bom gostoo.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Eu vou parar de deboche. Assinado: eu. É verdade esse bilete! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Oi, tô bem sim, esse é apenas o meu gosto musical. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tenho planos pra ser uma pessoa fitness em 2022. 2021 não vai dar, já tá muito em cima! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tomar decisões bêbado ok, tomar decisão quando tá com tesão, aí já é demais! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('É que perdi o número do meu telefone... me empresta o seu \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('E daí se vocês namoram, eu tenho tomada do lado da cama! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quem se solicita para ser o \"you\" do meu \"i love\" \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('A única boca que eu tô beijando esse ano é a boca da latinha... \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Você gosta de passar vergonha né Namora comigo então, hahaha. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Fui brincar de lutinha com a vida e to apanhando até agora!\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Por um shampoo que tire as pessoas da cabeça. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Jamais subestime a minha capacidade de te ver na rua e passar direto. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Fui sacudir a poeira e dar a volta por cima... aí a rinite me atacou! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Minha posição favorita é em pé, na frente de um caixa eletrônico sacando dinheiro! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ei, dá em cima de mim de novo que agora eu quero! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quem quiser gostar de mim tem que ser por amor mesmo! Dinheiro não tenho e beleza tá em falta! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se eu ficar rico a primeira coisa que vou fazer é acordar porque já vou saber que é sonho! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não sou desorganizado, apenas dou liberdade para minhas coisas ficarem onde elas quiserem! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Pobre é como pneu, quanto mais trabalha, mais liso fica! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Me diga quem tu amas que te direi por quem tomarás na rabiola! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Minha maior fantasia na cama Dormir cinco dias sem parar! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Um homem de ressaca não quer guerra com ninguém.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Viva cada dia como se fosse o último, um dia você acerta.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não roube! O Governo não gosta de concorrência.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Fui me olhar no espelho e dei de cara com o amor da sua vida.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Nada contra você, mas se quiser passar o resto da vida sem aparecer na minha frente eu agradeço! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Evite fritura, glúten, doces e indecisos! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Procure alguém que me entenda e depois me explique. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Acho que meu maior dom é gastar  e depois me arrepender \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Você pensa: Não a pessoa não pode ser tão sem noção…Sim ela pode! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Suspende as fritas, por que o filé chegou!\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vocês que já tomaram um rumo tem gosto de que \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se você sentir um vazio... Coma que é fome! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Sua mensagem foi recebida, visualizada e ignorada com sucesso! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se seu problema é dinheiro e você não tem dinheiro, então você não tem problema \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ando ocupado demais sendo legal, que não sobra tempo para ser bonito. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Eu gostaria de ter um filho um dia… dois dias, no máximo \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Dizem que a felicidade vem das coisas pequenas…Então olhe para o seu salário e seja feliz…\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O dia que alguém correr atrás de mim podem ter certeza, é assalto \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tô cada dia mais linda, noticia lamentável pra quem me odeia \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se a culpa é minha eu ponho em quem quiser. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Café para mudar aquilo que posso, vinho para aceitar aquilo que não posso. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vamos amar o próximo, que o anterior a gente sabe que não deu certo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Uns namoram uns ficam e eu sou lindo! é isso que importa…\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Superei já, só choro quando lembro. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Trabalhar até os vizinhos falarem \"só pode tá roubando\". \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Como faz pra reiniciar a vida, essa não deu certo não. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Acordar mais cedo pra me atrasar com calma é a minha rotina. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Olhando pros meus problemas e falando agora não, mano. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Eu até me avisei.. mas não me ouvi. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Objetivo: reeducação alimentar. Obstáculo: comida. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se tem concorrência, serei desistência. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Parei com esse negócio de uma mão lava a outra: chega na minha vez, nunca tem água. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Trabalhar bastante pra ver se compro a paciência que me falta. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Preciso de inimigos novos, os antigos estão começando a gostar de mim, sou encantadora! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Bala perdida tem mais rumo que eu! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Com sono eu me deito, com sono eu me levanto. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Olha se tem uma coisa que eu confio é na minha desconfiança. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tô me afastando de tanta gente, que daqui a uns dias a solução vai ser conversar com as plantas. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Horrível ser pobre e não poder quebrar as coisas quando tá com raiva. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não tem a mínima possibilidade disso dar certo... tô dentro. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('A pessoa com sono desregulado quer guerra com praticamente todo mundo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se não for pra me atrasar prefiro nem ir. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Gente eu sou igual a criança, não me promete nada não. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('A gente mal chegou do réveillon e já tá pensando no carnaval, a gente não vale nada. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não tem a mínima possibilidade disso dar certo..... tô dentro. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Me tornei o que eu mais temia: quem desmarca o rolê pra ficar em casa. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ano que vem vou tomar um rumo, esse ano foi só pra testar um negócio. \t','Anônimo','Frases Engraçadas para Status');";

        return frases;
    }
    public  static String carregarFrases6(){
        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES \n" +
                "('Que situação complicada hein... vou tirar um cochilo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O argumento \"só se vive uma vez\" já me fez gastar tanto dinheiro.. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Queria não virar um bicho agressivo quando tô com fome \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Deve ser muito chique trabalhar, estudar, fazer academia e ainda conseguir dormir bem \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tantos dias de luta, que já tô ficando violento... \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Oi, notei que você só fica com pessoas bonitas quer experimentar algo diferente \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não discuta. Fale \"pode crer\" e se retire. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Queria um triângulo amoroso: eu, apartamento e um emprego bom. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O jovem quando está com sono não quer assunto com ninguém. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O erro do ser humano é achar que vai dar tudo certo! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vamos dormir que amanhã tem muita decisão errada pra tomar. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Uma vida resumida em: \"eu não ia comprar nada, mas tava na promoção\".. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Apagar a conversa e fingir que a pessoa nunca existiu, é assim que vivo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quer ser feliz, ok, tô aqui. Agora se quer continuar sofrendo, posso fazer nada \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vai a merda, mas vai pela calçada porque eu me preocupo com você, bebê \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Nasci com a maldição de rir nos momentos sérios. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Qual a parte de \"eu preciso economizar dinheiro\" que eu não entendo! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Gente, é sério, tô solteiro a mó tempão, não tenho ex pra superar não, pode dar em cima de mim de boa! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Alá eu fazendo exatamente aquilo que eu falei que era errado fazer.. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Queria dormir com quem eu gosto, mas infelizmente não cabe todos na minha cama. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Devolve os ML de perfume que eu usei pra ficar bem cheirosinha pra você! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O Fábio Jr. canta a música alma gêmea e já se divorciou 7 vezes. Eu vou acreditar em amor como \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Pra namorar comigo tem que ter plano de saúde, vai que infarta de raiva. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quando era menor morria de medo de bêbado, hoje sei que a gente não faz mal a ninguém! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Nova estação do ano: eutonoinferno! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vivo no impasse entre \"quero guardar dinheiro\" e \"só se vive uma vez\". \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se você cair, eu estarei aqui - disse o chão! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Até a vírgula faz diferença e a tua opinião não! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Que o dia seja tão bom quanto a minha cama estava... \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Alergia Tenho! Sou alérgica a dieta. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Já acordado, mas ainda sem condições de distinguir a Maiara da Maraísa. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Na cama eu faço loucuras, tipo derrubar o celular na cara enquanto digito.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ninguém é obrigado a gostar de mim, afinal nem todos nascem com bom gostoo.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Eu vou parar de deboche. Assinado: eu. É verdade esse bilete! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Oi, tô bem sim, esse é apenas o meu gosto musical. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tenho planos pra ser uma pessoa fitness em 2022. 2021 não vai dar, já tá muito em cima! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tomar decisões bêbado ok, tomar decisão quando tá com tesão, aí já é demais! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('É que perdi o número do meu telefone... me empresta o seu \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('E daí se vocês namoram, eu tenho tomada do lado da cama! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quem se solicita para ser o \"you\" do meu \"i love\" \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('A única boca que eu tô beijando esse ano é a boca da latinha... \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Você gosta de passar vergonha né Namora comigo então, hahaha. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Fui brincar de lutinha com a vida e to apanhando até agora!\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Por um shampoo que tire as pessoas da cabeça. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Jamais subestime a minha capacidade de te ver na rua e passar direto. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Fui sacudir a poeira e dar a volta por cima... aí a rinite me atacou! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Minha posição favorita é em pé, na frente de um caixa eletrônico sacando dinheiro! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ei, dá em cima de mim de novo que agora eu quero! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Quem quiser gostar de mim tem que ser por amor mesmo! Dinheiro não tenho e beleza tá em falta! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se eu ficar rico a primeira coisa que vou fazer é acordar porque já vou saber que é sonho! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não sou desorganizado, apenas dou liberdade para minhas coisas ficarem onde elas quiserem! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Pobre é como pneu, quanto mais trabalha, mais liso fica! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Me diga quem tu amas que te direi por quem tomarás na rabiola! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Minha maior fantasia na cama Dormir cinco dias sem parar! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Um homem de ressaca não quer guerra com ninguém.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Viva cada dia como se fosse o último, um dia você acerta.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Não roube! O Governo não gosta de concorrência.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Fui me olhar no espelho e dei de cara com o amor da sua vida.\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Nada contra você, mas se quiser passar o resto da vida sem aparecer na minha frente eu agradeço! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Evite fritura, glúten, doces e indecisos! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Procure alguém que me entenda e depois me explique. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Acho que meu maior dom é gastar  e depois me arrepender \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Você pensa: Não a pessoa não pode ser tão sem noção…Sim ela pode! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Suspende as fritas, por que o filé chegou!\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vocês que já tomaram um rumo tem gosto de que \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se você sentir um vazio... Coma que é fome! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Sua mensagem foi recebida, visualizada e ignorada com sucesso! \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se seu problema é dinheiro e você não tem dinheiro, então você não tem problema \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Ando ocupado demais sendo legal, que não sobra tempo para ser bonito. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Eu gostaria de ter um filho um dia… dois dias, no máximo \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Dizem que a felicidade vem das coisas pequenas…Então olhe para o seu salário e seja feliz…\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('O dia que alguém correr atrás de mim podem ter certeza, é assalto \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Tô cada dia mais linda, noticia lamentável pra quem me odeia \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Se a culpa é minha eu ponho em quem quiser. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Café para mudar aquilo que posso, vinho para aceitar aquilo que não posso. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Vamos amar o próximo, que o anterior a gente sabe que não deu certo. \t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Uns namoram uns ficam e eu sou lindo! é isso que importa…\t','Anônimo','Frases Engraçadas para Status')\n" +
                ",('Que nada nunca nos separe do amor de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('A vontade de Deus, seja lá qual for, é o melhor pra você. \t','Anônimo','Frases de Deus')\n" +
                ",('Não temas jamais, Jesus está contigo. \t','Anônimo','Frases de Deus')\n" +
                ",('Ele me ama, só Ele me traz a paz que preciso. \t','Anônimo','Frases de Deus')\n" +
                ",('Com Jesus, seu problema é transformado em milagre. \t','Anônimo','Frases de Deus')\n" +
                ",('A Tua graça, me basta. \t','Anônimo','Frases de Deus')\n" +
                ",('Ela se encheu de Deus e não deixou espaço para as dores! \t','Anônimo','Frases de Deus')\n" +
                ",('Tudo que é plantado, no tempo de Deus, floresce. \t','Anônimo','Frases de Deus')\n" +
                ",('Meu coração é do Meu Mestre. \t','Anônimo','Frases de Deus')\n" +
                ",('Porque Deus é meu apoio todos os dias eu Lhe agradeço a bênção da minha fé! \t','Anônimo','Frases de Deus')\n" +
                ",('Não se trata de seguir regras. Se trata de amar a Deus!\t','Anônimo','Frases de Deus')\n" +
                ",('Resigne-se diante da vontade do Senhor e entregue os seus passos a Deus... Ele saberá lhe guiar \t','Anônimo','Frases de Deus')\n" +
                ",('Quem Pede Com Fé , Consegue o que quer \t','Anônimo','Frases de Deus')\n" +
                ",('O amor fiel de Deus subsiste em todo o tempo. \t','Anônimo','Frases de Deus')\n" +
                ",('Mas o que Deus prepara para a gente sempre é o melhor do que pedimos e pensamos. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus me chamou, eu disse: Eis-me aqui. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus age primeiro em nós para depois agir através de nós. \t','Anônimo','Frases de Deus')\n" +
                ",('Obrigado Deus, por me ouvir, abençoar, guardar e cuidar. Amém. \t','Anônimo','Frases de Deus')\n" +
                ",('Está nas mãos de Deus e sei que Ele fará o melhor. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus não espera que a gente entenda, mas sim que a gente confie. \t','Anônimo','Frases de Deus')\n" +
                ",('Quanto maior a fé, maior será a vitória. \t','Anônimo','Frases de Deus')\n" +
                ",('Quando a última coisa que você tiver for Deus, você vai descobrir que tem tudo que precisa. \t','Anônimo','Frases de Deus')\n" +
                ",('O Senhor está cuidando da gente todos os dias. \t','Anônimo','Frases de Deus')\n" +
                ",('O segredo da felicidade é caminhar ao lado de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('É por ser tão feliz que Te agradeço por toda Tua obra, meu Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Existe solução pro teu problema, entregue a Cristo. \t','Anônimo','Frases de Deus')\n" +
                ",('Onde a paz de Deus está presente, não há lugar para a preocupação. \t','Anônimo','Frases de Deus')\n" +
                ",('Eu não desisti, só coloquei nas mãos de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Pai, tira de mim tudo aquilo que impede o Teu agir. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus sabe o que se passa dentro de nós e é Ele quem cuida de tudo. \t','Anônimo','Frases de Deus')\n" +
                ",('Se tem uma coisa que devemos pedir a Deus todos os dias, é perdão! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus, cura meu coração nos lugares que ainda são fracos... \t','Anônimo','Frases de Deus')\n" +
                ",('Amigo de verdade é Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus nunca tira algo de você, sem ter algo melhor pra te dar. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus, eu queria tanto um abraço teu... \t','Anônimo','Frases de Deus')\n" +
                ",('Mais de Ti, oh Deus, e menos de mim. \t','Anônimo','Frases de Deus')\n" +
                ",('Viva o hoje, na certeza de que amanhã quem escreve é Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Meu descanso é em teus braços, Senhor. \t','Anônimo','Frases de Deus')\n" +
                ",('Permita que Deus limpe toda a poeira da alma. \t','Anônimo','Frases de Deus')\n" +
                ",('Creia, Deus é a tua cura. \t','Anônimo','Frases de Deus')\n" +
                ",('Ele te sustentará com as palmas de Suas mãos... \t','Anônimo','Frases de Deus')\n" +
                ",('Meu conforto é a Sua graça, o amor dos Seus braços. \t','Anônimo','Frases de Deus')\n" +
                ",('Você não é obra do acaso, você é filho de Deus, é herdeiro do céu. \t','Anônimo','Frases de Deus')\n" +
                ",('Me faça entender, Deus, que é no Seu tempo e não no meu. \t','Anônimo','Frases de Deus')\n" +
                ",('Onde há Deus, nada falta. \t','Anônimo','Frases de Deus')\n" +
                ",('Não existem erros nos planos de Deus... \t','Anônimo','Frases de Deus')\n" +
                ",('Quando você diz: eu não vejo saída. Deus diz: Eu guiarei teus passos.  (Provérbios 3:5-6)\t','Anônimo','Frases de Deus')\n" +
                ",('Enquanto Deus for meu chão, não há quem me derrube. \t','Anônimo','Frases de Deus')\n" +
                ",('O impossível é apenas uma das especialidades de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Quando Deus quer, nada impede. \t','Anônimo','Frases de Deus')\n" +
                ",('Todo caminho que eu escolher a sua mão me guiará... \t','Anônimo','Frases de Deus')\n" +
                ",('Com Jesus percebi o verdadeiro significado de ser feliz! \t','Anônimo','Frases de Deus')\n" +
                ",('E conhecereis a verdade e a verdade vos libertará. \t','Anônimo','Frases de Deus')\n" +
                ",('O criador de todas as cosias mora em mim. \t','Anônimo','Frases de Deus')\n" +
                ",('Ele sabe qual é o plano.  (Jeremias 29:11)\t','Anônimo','Frases de Deus')\n" +
                ",('Rezo a Deus não pedindo cargas mais leves, e sim ombros mais fortes. \t','Anônimo','Frases de Deus')\n" +
                ",('A bênção de viver é uma graça de Deus e por isso Lhe agradeço eternamente! \t','Anônimo','Frases de Deus')\n" +
                ",('Quando você diz: Eu não vejo saída Deus diz: Eu guiarei teus passos. \t','Anônimo','Frases de Deus')\n" +
                ",('Por tudo que já superei e alcancei na vida eu Te agradeço, meu Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Quando caí Tua mão me ergueu; quando sofri Teu amor me consolou. \t','Anônimo','Frases de Deus')\n" +
                ",('Tem coisas que Deus dá para a gente aprender. E tem coisas que Deus só dá quando a gente aprende. \t','Anônimo','Frases de Deus')\n" +
                ",('Entregue o teu caminho ao senhor Jesus! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus não te envia sem te preparar, antes ele vai te capacitar. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus trabalha em silêncio, age em oculto e honra em público. \t','Anônimo','Frases de Deus')\n" +
                ",('Jesus é verbo: Amar! \t','Anônimo','Frases de Deus')\n" +
                ",('Ele, antes de todas as coisas! \t','Anônimo','Frases de Deus')\n" +
                ",('É Deus quem dá a última palavra. \t','Anônimo','Frases de Deus')\n" +
                ",('E seja sempre como Deus quiser... \t','Anônimo','Frases de Deus')\n" +
                ",('Não pare nunca de orar, de louvar ao nosso Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Sou salvo pela Tua graça, mas sei que não foi de graça... \t','Anônimo','Frases de Deus')\n" +
                ",('Eu toco o céu quando meus joelhos tocam o chão. \t','Anônimo','Frases de Deus')\n" +
                ",('ELE antes de todas as coisas. \t','Anônimo','Frases de Deus')\n" +
                ",('Calma, Deus não esqueceu de você! \t','Anônimo','Frases de Deus')\n" +
                ",('O que Deus prepara pra gente é sempre o melhor do que pedimos e pensamos! \t','Anônimo','Frases de Deus')\n" +
                ",('Vai ser perfeito, como tudo que Ele faz! \t','Anônimo','Frases de Deus')\n" +
                ",('Os planos de Deus sempre conduzem a vitória. \t','Anônimo','Frases de Deus')\n" +
                ",('Enquanto tiver Deus na minha vida sei que nada me faltará! \t','Anônimo','Frases de Deus')\n" +
                ",('Deus é por você! \t','Anônimo','Frases de Deus')\n" +
                ",('Jesus é o caminho para todas as conquistas. \t','Anônimo','Frases de Deus')\n" +
                ",('Faz-me Teu servo, Senhor, me livra do mal. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus, troco os meus medos pelos segredos do Teu coração! \t','Anônimo','Frases de Deus')\n" +
                ",('Confiai no Senhor perpetuamente, porque o Senhor Deus é uma rocha eterna. \t','Anônimo','Frases de Deus')\n" +
                ",('Deus te ouve antes mesmo de você falar! \t','Anônimo','Frases de Deus')\n" +
                ",('O meu Deus é o Deus do impossível. \t','Anônimo','Frases de Deus')\n" +
                ",('Perfeito mesmo é o amor de Deus... \t','Anônimo','Frases de Deus')\n" +
                ",('Confie seus passos e sua vida a Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('É o amor de Cristo que nos coloca de pé todos os dias.\t','Anônimo','Frases de Deus')\n" +
                ",('Quem investe na fé, não precisa contar com a sorte. \t','Anônimo','Frases de Deus')\n" +
                ",('Quando Jesus não acalma o mar ele te ensina a nadar! \t','Anônimo','Frases de Deus')\n" +
                ",('Com Jesus do meu lado todas as adversidades são ultrapassadas! \t','Anônimo','Frases de Deus')\n" +
                ",('Em meio a tempestades, confie em Deus! \t','Anônimo','Frases de Deus')\n" +
                ",('Jesus nos mostrou que o amor é a melhor resposta em qualquer situação! \t','Anônimo','Frases de Deus')\n" +
                ",('O milagre já é seu. Tome posse!\t','Anônimo','Frases de Deus')\n" +
                ",('Toda mudança começa pela oração.\t','Anônimo','Frases de Deus')\n" +
                ",('Que o Senhor me guie pelos melhores caminhos. Amém \t','Anônimo','Frases de Deus')\n" +
                ",('Porque a cada segundo Deus te ama.\t','Anônimo','Frases de Deus')\n" +
                ",('Deus não castiga, Deus ensina. Deus não tira, Deus livra. Deus não demora, ele capricha!\t','Anônimo','Frases de Deus')\n" +
                ",('Quando Deus quer, nada impede! \t','Anônimo','Frases de Deus')\n" +
                ",('No dicionário de Deus, humildade vem antes de honra. \t','Anônimo','Frases de Deus')\n" +
                ",('A fé é algo que te aproxima do alto. \t','Anônimo','Frases de Deus')\n" +
                ",('Amar a Deus sobre todas as coisas e ter um segundo a sua vontade \t','Anônimo','Frases de Deus')\n" +
                ",('Deus está apenas a uma oração de distância \t','Anônimo','Frases de Deus')\n" +
                ",('Senhor… Me conduz pelo melhor caminho guiando meus passos. Aumenta minhas forças e me ensina a esperar pelo seu tempo.\t','Anônimo','Frases de Deus')\n" +
                ",('Tú, ó Senhor Deus, é tudo que eu tenho. O meu futuro está em Tuas mãos, Tu diriges a minha vida \t','Anônimo','Frases de Deus')\n" +
                ",('Para quem tem Deus, não existe perda, só vitórias. Para quem crê, não existe impossível, existem milagres!\t','Anônimo','Frases de Deus')\n" +
                ",('Maravilhoso, conselheiro, Deus forte, paz da eternidade, príncipe da paz \t','Anônimo','Frases de Deus')\n" +
                ",('Alegra-te perante o teu Deus em tudo que fizer \t','Anônimo','Frases de Deus')\n" +
                ",('Por toda a minha vida, ó Senhor, te louvarei! \t','Anônimo','Frases de Deus')\n" +
                ",('Senhor, eu sou fraco, preciso de ti, não desista de mim \t','Anônimo','Frases de Deus')\n" +
                ",('Nas mãos de DEUS, pessoas comuns se tornam instrumentos extraordinários\t','Anônimo','Frases de Deus')\n" +
                ",('Jesus é a minha maior referência de amor. \t','Anônimo','Frases de Deus')\n" +
                ",('Nossas lutas silenciosas fazem barulho no céu quando chegam aos ouvidos de Deus. \t','Anônimo','Frases de Deus')\n" +
                ",('Que Deus nos abençoe, nos guie e nos proteja.\t','Anônimo','Frases de Deus');";

        return frases;
    }
    public  static String carregarFrases7(){

        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES ('\tSe arrepender é muito mais do que pedir perdão. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Te perdendo eu cresci tanto, que não quero mais te encontrar. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pra valer a pena tem que dar frio na barriga e não dor de cabeça. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não exija de mim o que não há em você. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Cada um sabe o que tem ao lado, o problema é que ninguém acredita que um dia vai perder. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Devemos caminhar é pra frente e não engatar uma ré em nossa vida. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Faz sol com ou sem você. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A saudade define a certeza. \uD83D\uDCAD\uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Você é péssimo em fingir que se importa. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu só quero é ser feliz, viver de passado não me interessa mais. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não me arrependo de nada do que fiz. Eu só lamento o tempo que desperdicei com as pessoas erradas. \uD83D\uDCAD\uD83C\uDF07\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se cuida tá? Porque agora eu vou cuidar de mim \uD83D\uDE4C\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Antes só, do que mal valorizada \uD83D\uDE4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Você não é mais nada em mim, nem lembranças, nem saudade, nem esperanças tolas. \uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A forma com a qual as pessoas vão embora da nossa vida, diz muito sobre elas. \uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não me culpo pelos erros do passado porque eu não tinha a maturidade que tenho hoje. \uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pensei que a pior coisa da vida era ficar sozinha, mas na verdade é estar com alguém que te faz sentir sozinha. \uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Deixei de colocar interrogações onde a vida já colocou ponto final. \uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Com o tempo, a dor passa e a gente entende que algumas coisas acontecem para nos tornar mais fortes e mostrar que em primeiro lugar somos nós mesmos, sempre. ✨\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Essa foi a melhor queda da minha vida, cai em mim. \uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Algumas pessoas servem para nos mostrar o tipo de gente que não queremos para a nossa vida. \uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu mereço o que há de melhor, por isso hoje agradeço pelo que se foi. \uD83C\uDF43\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Nem tudo que dá certo, nós planejamos. Mas nem tudo que é para dar certo foi planejado, e tá tudo bem. \uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Tempos difíceis constroem pessoas fortes, e hoje sei o quanto sou forte! \uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Minha energia é valiosa demais para ser perdida. ✨\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Me tornei minha prineira opção e já não aceito que me ofereçam menos do que mereço.\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não me perco de mim mesma. Por nada no mundo. Nunca deixo que pessoas e situações negativas suguem a minha essência. \uD83C\uDF40\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Dou risada mentalmente da sua cara. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Muitas coisas tem preço... Outras tem TROCO. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Cada um tem de mim exatamente aquilo que merece. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A gente tem que se respeitar o suficiente para saber quando merecemos algo melhor. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Jamais escolheria você em vez de mim. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pessoas que eram importantes, tornaram-se apenas pessoas. \uD83D\uDCAD\uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Mal me quis e me perdeu. \uD83D\uDCAD\uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Algumas pessoas se vão e quando voltam, não cabem mais em nossos corações. Não é rancor, é o tempo. \uD83D\uDE2A\uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Tudo que tinha pra falar de nós, guardei nas reticências... Não sei dar fim ao que me inicia. \uD83D\uDE2A\uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Tu jurou minha mão não só soltar, e se foi junto dela.. \uD83D\uDE2A\uD83D\uDCAD\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não deu valor quando tinha, então agora não vai ter quando quiser. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('De você, não espero nada. Na verdade.. eu nem te espero mais. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pequenas mentiras matam grandes amores. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Olha só o que o tempo faz, eu não te conheço mais. \uD83D\uDE0C\uD83D\uDE4C\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Aprender a lidar com a ingratidão é fundamental \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não crie expectativas, crie indiferença. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Dica do dia: nenhuma recaída vale a sua paz interior. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Nunca pensei tanto em você desde o dia que decidi te esquecer. \uD83D\uDE2A\uD83D\uDE2A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A verdade é que só volta pra você aquilo que nunca quis partir. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Prioridade para quem nos prioriza, fora isso, segue o baile. \uD83D\uDE43\uD83D\uDE43\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ficava naquele \"chove não molha\" e eu não sabia se abria o guarda-chuva ou meu coração.. \uD83D\uDE2A\uD83D\uDE2A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ela era esperta demais pra ficar infeliz por muito tempo. \uD83D\uDE43\uD83D\uDE43\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Bebendo mais, amando menos, ignorando em excesso! \uD83D\uDC81\uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Uma hora a gente cansa, e por fim, desencanta. \uD83D\uDC4D\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A vida sempre se encarrega de levar o que a gente não merece carregar. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Deus já te livrou de quem não te cuidou. \uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Acha que se deu bem? Na tua fila tem uma, na dela tem cem. \uD83D\uDC8B\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Um dia pensei que jamais superaria, hoje não entendo como pude me importar tanto. \uD83D\uDC4C\uD83D\uDC81\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Acho tão bom quando a abelha volta e não tem mais mel pra ela. \uD83D\uDE43\uD83D\uDE43\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pessoas inteiras não merecem pessoas pela metade. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Quem não sabe cuidar não merece ter. \uD83D\uDE1E\uD83D\uDE1E\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Te desejo reciprocidade, e que você saiba lidar com ela. \uD83D\uDE43\uD83D\uDE43\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A falta define o valor da presença. \uD83D\uDE09\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Prioridade a quem nos prioriza, pro resto é um forte abraço! \uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Só minha felicidade vingará o que passei contigo. \uD83D\uDC4A\uD83D\uDC4A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Aprendi a ser feliz quando passei a amar o que sou em vez de me humilhar por quem não merece. \uD83D\uDC4A\uD83D\uDC4A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Gosto de prioridade, opção eu tenho várias. \uD83D\uDCA5\uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Covarde é você, que não banca o que sente! \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não é porque converso com quem já peguei, que quero pegar de novo. \uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Doeu, mas já passou e o que o tempo cura nenhum passado pode repetir. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Lembre-se de que, o mesmo coração que ama, odeia com a mesma intensidade. \uD83D\uDC4A\uD83D\uDC4A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Nosso relacionamento foi marcante para mim, mas hoje percebo o quanto puderia ter sido feliz sem você. \uD83D\uDCA5\uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Transborde amor, quem não souber nadar, que afunde sozinho! \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Tem gente que não adianta mandar pro inferno! Até o capeta devolve. \uD83D\uDE02\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Nunca espere de mim mais do que eu recebo de você! \uD83D\uDCA5\uD83D\uDCA5\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A gente se perdeu no meio da estrada antes mesmo de dizer adeus. \uD83D\uDC94\uD83D\uDC94\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Tá sentindo minha falta?! Agora beija tua liberdade e abraça teus amigos! \uD83D\uDE1D\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pobrezinho... Perdeu um diamante enquanto colecionava pedras! \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não perca o seu com pessoas que não te acrescentam nada. \uD83D\uDE12\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A culpa não é do amor, é de quem não sabe amar. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se traição tivesse perdão, o diabo voltava a ser anjo. \uD83D\uDCA5\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Vou deixar você procurar em todas o que você só vai achar em mim. \uD83D\uDE18\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu sou bom em muitas coisas, esquecer você não é uma delas. \uD83D\uDE1E\uD83D\uDE1E\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ex só serve pra uma coisa: estragar a música que você tanto gostava. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Você foi a melhor coisa que desapareceu da minha vida! \uD83D\uDC4A\uD83D\uDC4A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu perderia o total respeito por mim mesmo se eu deixasse você entrar no meu coração novamente... \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Desistiu muito rápido pra quem dizia muito amar! \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Realmente não sou como você queria... sou muito melhor! \uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Nunca estrague seu presente por um passado que não tem futuro. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Pra ti, eu era um plano temporário. Enquanto pra mim você era sonho de uma vida inteira! \uD83D\uDE2A\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Depois que naveguei na profundidade do amor próprio, nunca mais naufraguei em sentimentos rasos. \uD83D\uDC96\uD83C\uDF1F✨\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se eu ainda quero algo com você? Sim, distância! \uD83D\uDE1D\uD83D\uDC4C\uD83D\uDC4A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não tem porque insistir em um erro do passado. \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não é que eu não goste mais de você. É só que aprendi a gostar mais de mim. \uD83D\uDE09\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A vida é feita de escolhas e te esquecer foi a melhor que eu fiz!✌\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não se preocupe, de mim você terá sempre a certeza do desprezo eterno! \uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ao seu lado descobri que a felicidade é país distante de você... \uD83D\uDE09☺\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Você foi uma pessoa única e marcante, mas nem sempre pelas melhores razões... \uD83D\uDC4C\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('O bem mais sincero que algumas pessoas fazem é sair das nossas vidas.✌\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Meu coração tá ferido de amar errado... \uD83D\uDC94☹\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('De todas as suas mentiras a que mais doeu foi o “eu te amo”. \uD83D\uDC94\uD83D\uDC94\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Dói fingir que eu te esqueci... \uD83D\uDE14\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Tá com saudade de mim? Volta pro passado, foi lá que eu te quis! \uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('O erro é nos apaixonar por quem idealizamos e não por quem realmente a pessoa é!\uD83E\uDD26\u200D♀️\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('É importante saber virar a página!\uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ex bom é ex vivo, pra gente ver a decadência.\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se você não quer, tem quem queira.\uD83D\uDE0C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se alguém vai embora, é porque outro alguém está para chegar.\uD83D\uDE0C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Te amar foi bom , mas te esquecer foi melhor ainda✌\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Você me pede para não partir, mas não me dá motivos para ficar.✌\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('As vezes dar errado foi a coisa mais certa que poderia ter acontecido!! \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Mal de ex é achar que é inesquecível \uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não te quero mal, só não te quero mais... \uD83D\uDE09\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ela era esperta demais para ficar infeliz por muito tempo por causa de uma paixão idiota...\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ta me querendo agora? Volta pro passado! Foi lá que eu te quis!\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu também sei deixar saudade…\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Aprendi a aceitar a suas idas e recusar as suas voltas… \uD83D\uDE09\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Amava teu sorriso… hoje prefiro o meu \uD83D\uDE03\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Deixei de ter pena de mim por estar sem você e passei a ter pena de você por estar sem mim. \uD83D\uDE0C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A vida sempre se encarrega de levar o que a gente não merece carregar! \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Te perdendo eu cresci tanto que não quero mais te encontrar. \uD83D\uDE0E\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ela aprendeu que todo amor pode acabar, menos o próprio. \uD83D\uDE09❤️\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu era a primeira a querer falar de você, hoje evito ouvir seu nome \uD83D\uDE14\uD83D\uDE14\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Quando dei por mim, eu estava completamente curada do meu pior vício: você. \uD83D\uDE18\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ela meteu o pé, tio, agora chora \uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se não me faz bem, eu não quero pra mim \uD83D\uDE0C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Desapega que a vida flui...\uD83D\uDE09\uD83C\uDF43\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('A fila andou e você foi pro final. \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Agora quem não quer sou eu... \uD83D\uDC4C\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Aprendi a nunca esperar nada de ninguém. Desde então, eu só tenho surpresas \uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Se tu antes não queria, hoje é ela que não quer \uD83D\uDE18\uD83D\uDC4C\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Deixo para trás quem não soube me levar para frente \uD83D\uDE09\uD83D\uDC4A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não sei se acabou ou se na verdade nunca existiu \uD83D\uDE14\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Não mudei de cidade, nem de \uD83D\uDCDE. Só escolhi ser feliz \uD83D\uDE04\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Eu tô de boa, vai passado de fininho, eu tô amando outra pessoa \uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Ela resolveu viver como flor, se colorir sozinha. \uD83C\uDF3A\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('O mundo dá voltas e olha eu por cima, continuo apaixonado, mas agora pela vida. \uD83D\uDE0E\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Superar é da nossa natureza...\uD83D\uDE0C\uD83D\uDE18\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Confiar é preciso, seguir em frente é necessário, dar a volta por cima é uma questão de honra...\uD83D\uDC4A\uD83D\uDE0E\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Um dia tu vai sentir minha falta, oh se vai \uD83D\uDE18\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Era meu grande amor, hoje é só mais um ex ✌️\uD83D\uDE09\t','Anônimo','Frases para Ex')\t\t\n" +
                ",('Você esteve comigo, quando ninguém mais queria ouvir minha voz. Obrigada por tudo e feliz aniversário amiga linda. \uD83D\uDC96\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Melhores amigas, na alegria e na tristeza, na saúde e na doença, nem a morte irá nos separar. Parabéns por mais um ano de vida minha amiga.\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Distância nenhuma consegue destruir o que uma verdadeira amizade construiu. Mesmo longe torço por sua felicidade. Feliz aniversário amiga! \uD83D\uDC6D\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Eu agradeço a deus por ter você aqui, minha melhor parte de mim! Sou grata pela nossa amizade, e que ela dure muitos e muitos anos... Feliz aniversário para você, minha eterna melhor amiga. \uD83D\uDE4C\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Quero você ao meu lado pra sempre! E para isso vim lhe desejar muitos e muitos anos de vida. Parabéns amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversário, amiga. Eu vou estar sempre torcendo para que você conquiste todos seus objetivos e todos seus sonhos. Te desejo o melhor hoje e sempre. \uD83D\uDC95\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Minha melhor amiga, você é única e insubstituível na minha vida. Parabéns pelo seu aniversário! \uD83C\uDF82\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('São muitas histórias juntas e que assim seja sempre. Feliz aniversário, amiga. \uD83E\uDD73\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz novo ciclo, minha amiga. Que Deus te abençoe hoje e sempre. \uD83D\uDE4C\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('De todas as coisas que eu queria te dizer hoje, a principal delas é que te amo e estou morrendo de saudade. Feliz aniversário, amiga! \uD83C\uDF8A\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Você possui uma essência encantadora, que transmite uma paz e uma alegria que não se mede. Que Deus te conserve essa pessoa maravilhosa! Parabéns pelo seu aniversário amiga linda ♥\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Tudo que passei, você estava lá ao meu lado. Sou muito grata por sua amizade e por sua vida. Feliz aniversário minha amiga querida ♥\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Uma amizade se transformou num laço e esse laço nunca será desatado. Que Deus te abençoe hoje e sempre. Muitos anos de vida amiga! Feliz aniversário! \uD83D\uDC96\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('O dicionário define a palavra amigo, mas você a demonstra. Quero levar sua amizade para a vida toda. Que Deus te abençoe mais esse ano. Feliz aniversário amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Amizade, palavra que designa vários sentimentos, que não pode ser trocada por meras coisas materiais. Deve ser guardada e conservada no coração. Feliz aniversário minha amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Você é um anjo que Deus me enviou, que me dá broncas como uma mãe, protege como um pai e me alegra como um irmão. Parabéns minha amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Você é um ser tão explêndido, daqueles que dá gosto de manter por perto. Espero que nossa amizade dure muito tempo! Feliz aniversário amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Eu lhe desejo tudo àquilo que sempre desejam, mas numa intensidade diferente, numa intensidade melhor ainda. Eu lhe desejo todos os melhores sonhos desse mundo, porque sei que você consegue realiza-los. Feliz aniversário amiga \uD83C\uDF89\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('São poucas, mas ainda existem pessoas que valem a pena! E você é uma delas, amo nossa amizade! Feliz aniversário amiga! ✨\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Aprende que verdadeiras amizades continuam a crescer mesmo a longas distâncias. E o que importa não é o que você tem na Vida, mas quem você tem na vida. Feliz aniversário amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Nossa amizade é tão grande quanto o universo, foi por isso que Deus o fez infinito. Seja muito feliz minha amiga, você merece! Parabéns por mais um ano de vida ♥\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Amigo a gente não procura, o coração que encontra e fico feliz que o meu coração te encontrou. Feliz aniversário minha amiga do peito!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('É difícil te aturar todos os dias, mas difícil mesmo seria se eu não tivesse você pra aturar haha Feliz aniversario amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Mil felicidades e amor no coração. Que Deus abençoe sua vida minha amiga, tudo de melhor nesse seu dia ♥ Feliz aniversário. \uD83C\uDF89\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Para uma amiga tão especial como você, desejo um dia mágico e uma vida cheia de alegria, amor e paz. Feliz aniversario! \uD83E\uDD73\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversário amiga! Porque é tão especial a você desejo apenas o melhor que a vida tem para oferecer.\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Que Deus coloque grandes bênçãos em sua vida e continue te iluminando sempre, feliz aniversario amiga! \uD83D\uDE4F\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Que a vida contenha a alegria e a saúde que você merece ♥ e você merece tudo de melhor, pode apostar! Feliz aniversário amiga! ✨\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Minha amiga linda, parabéns pelo seu dia! Que o seu futuro seja pleno, próspero e repleto de sonhos realizados. \uD83C\uDF82\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('O seu brilho único e a sua luz radiante iluminam o coração de todas as pessoas, que você continue sendo essa pessoa cheia de amor. Feliz aniversário! ✨\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Amiga, pessoas maravilhosas como você são raras e merecem todas as homenagens que recebem. Saiba que torço muito por você, feliz aniversario!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario! Tudo de melhor é o que desejo nesse seu dia minha grande amiga! Muitos anos de vida.\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Que sua vida seja soma de bênçãos e de vitorias. Que a felicidade te persiga para sempre! Feliz aniversario amiga! \uD83C\uDF89\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Saiba que eu te amo, e estarei sempre aqui para você, nos momentos de tristeza ou de alegria! Feliz aniversario amiga! \uD83D\uDC96\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Um feliz aniversario para quem faz dos meus dias especiais com sua existência! Feliz aniversario amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Uma nova etapa se inicia e com ela, mais chances de ser feliz. Parabéns pelo seu dia amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Que a alegria, a paz, o sucesso, o amor e saúde te acompanhem neste novo caminho que se inicia. Feliz aniversario amiga! ✨\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga! Que este dia encha seu coração de alegria assim como você enche minha vida de felicidade ♥\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga. Sou muito grata pela nossa amizade e por tudo que você já somou na minha vida. \uD83C\uDF82\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Minha amiga saiba que torço muito pela sua felicidade e seu sucesso. Feliz aniversario!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Peço a Deus todos os dias que proteja os seus passos. Espero que o seu dia seja muito especial. Você merece feliz aniversario amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Minha amiga, você é uma pessoa maravilhosa, tem um coração enorme e eu te amo tanto! Que Deus te abençoe e te guarde! Feliz aniversario!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga! Desejo que o universo conspire a seu favor. Que as mais belas surpresas da vida aconteçam com você!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Parabéns amiga mais doida do mundo! Tenha um aniversario inesquecível e muito feliz!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Minha amiga, desejo que você viva muito mais que a eternidade e que encontre a formula para conquistar o que deseja para ter uma vida do jeito sonhado! Feliz aniversario!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga. Curta este dia com muita alegria e aproveite a vida sempre com otimismo e esperança! \uD83C\uDF82\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga! Queria lhe dizer todos os clichês de aniversario, que fazem total sentido! Mas eu te desejo tudo que for de bom, positivo... E tudo que te faça feliz!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Amiga linda. Obrigada por ser a pessoa maravilhosa que você é! Que a sua nova idade e o seu novo ano de vida lhe tragam muitas felicidades! Te adoro, feliz aniversario!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Você merece mais luz, mais alegria e mais amor em sua vida! Que Deus lhe permita permanecer do jeitinho que é... Eu te amo... Parabéns amiga! \uD83E\uDD73\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz daquele que pode estar com você hoje, feliz aniversario minha amiga querida!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Saiba que eu sempre sorrio quando lembro que tenho uma amiga como você! Feliz aniversario!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario minha amiga! Você é uma pessoa simples e sincera. O seu sorriso contagiae conquista as pessoas!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Estaremos unidas para sempre e nunca esqueceremos que nossa amizade é a maior riqueza. Feliz aniversario amiga!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga... Nesta data especial, apenas que você seja feliz! Eu te adoro muito!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Feliz aniversario amiga! Que a felicidade sequestre você, e que ninguém possa pagar o resgate, só para você viver eternamente feliz!\t','Anônimo','Frases feliz aniversario')\t\t\n" +
                ",('Nunca confunda as pessoas que estão a sua volta com pessoas que estão com você. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Que a gente cresça ao ponto de não brincar com o coração dos outros para alimentar o próprio ego. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Infelizmente nunca sabemos em que posição estamos na vida das pessoas, às vezes pensamos ser prioridade mas na verdade somos só a última preferência. \uD83D\uDE22\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não sou de abandonar ninguém, então se me afastei é porque percebi que não faz diferença eu estar ali ou não. \t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O tempo não muda pessoas, só mostra quem elas realmente são. ⏳⏳\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu já perdi meu tempo enquanto algumas pessoas perderam alguém que nunca as abandonaria. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem gente perdendo pessoas incríveis por atitudes bestas. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O meu problema é cuidar para não magoar ninguém enquanto certas pessoas me magoam. \uD83D\uDE2A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Reciprocidade é quando a pessoa finge que me engana e eu finjo que acredito. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Percebi que às vezes tudo é uma questão de não fazer mais questão. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Respeito a opinião alheia, mas felizmente não dependo dela.\uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Jamais confundo o que sou com o que falam sobre mim. \uD83D\uDC85\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A vida é troca e tudo cansa quando não é recíproco. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Você tinha tudo para deixar saudades, mas só deixou alívio. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pra mim, sua opinião só vale de algo se seu exemplo condiz com ela. \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Aprendi que a volta por cima às vezes é ir e não voltar. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não abandono ninguém, as pessoas que deixam de precisar de mim. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Nada passa batido, por isso eu gosto das voltas que o mundo dá. \uD83C\uDF0E\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Deixando para trás quem nunca poderia me oferecer o que eu quero e mereço. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quantas coisas perdemos com medo de perder, né? \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Você é livre para fazer o que quer, mas tenha em mente que o mundo dá voltas. \uD83C\uDF0E\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Sou desconfiada e todo dia alguém me dá mais motivos para isso. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Sim, claro que vou acreditar em quem age completamente contra aquilo que fala, claro… \uD83D\uDC40\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Há pessoas que deixam qualquer lugar mais alegre, especialmente quando se ausentam. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se criatividade gerasse dinheiro, certas pessoas já estariam ricas pelas histórias que inventam de mim. \uD83D\uDC40\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Cobro mais nada de ninguém. Acha que tá certo, então faz. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem um velho ditado que diz: não sou obrigada. \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ninguém é tão ocupado assim, tudo é questão de prioridades! ⏳\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Decisões tem consequências… Indecisões mais ainda! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Incrível demais pra ficar correndo atrás de quem não faz o mesmo esforço que eu. \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Dizem as más línguas, pois as boas preferem o silêncio. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A opinião é sua, mas a realidade é minha. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quanto mais eu conheço as pessoas, mais eu gosto de dormir. \uD83E\uDD7A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Arrependimento não é quando você chora. É quando você muda. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quer? Bora. Não quer? Sai fora. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O mundo gira. Hoje você pisa, amanhã eu atropelo. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Humildade e caráter: quem tem vai longe  \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Então qualquer problema que você tiver comigo, é seu. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Sinto saudade de quem morreu, quem tá vivo sabe onde me encontrar. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A gente finge que não tem ciúmes, mas é cada surto interno. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tenha sempre em mente o seu valor! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Hoje você lança as palavras, amanhã sente o efeito delas. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ideias se copiam, o talento jamais. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pessoas com boas intenções fazem promessas. As com caráter, cumprem. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Prazer meu nome é ranço, deboche é o meu sobrenome. \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Mas o tempo tá aí, mostrando quem é quem. ⏳\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Por fora até parece que tô bem, mas por dentro estou melhor ainda! ✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Gosto é de prioridade, opção tenho várias. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não seja profundo com quem é raso contigo. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu quero te ver bem... bem longe de mim. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não julgue as escolhas, quando não conheces os motivos. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O que você faz determina quem você é. O que você diz, é apenas o que você diz. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ignore, não ligue, não responda. O silêncio destrói qualquer um. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não lhe compete julgar a realidade que você não vive. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Como as pessoas te tratam é o carma delas, como você reage é o seu. Seja filtro e não esponja. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O que ninguém sabe, ninguém estraga. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Gente bem resolvida não inferniza vida alheia. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('E eu já perdi as contas de quantos pedaços certos de mim dei para as pessoas erradas. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pequenos vacilos, grandes estragos. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não confunda cabeça erguida com nariz empinado \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Honestidade nunca será demais. Sua moral não se ganha, se faz! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Uns falam bonito, outros preferem fazer. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O que tu viu é fato, o que tu ouviu é só boato. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É muita negatividade disfarçada de torcida. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Alguns causam felicidade onde quer que eles vão; outros sempre que se vão. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Más influências não influenciam boas cabeças \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu falo o que quero, você entende como achar melhor. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Deixe ir, se voltar, mande a merda! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tu acha que me engana? Onde tu faz cursinho, eu tenho diploma! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O esquema é cada um cuidar da sua vida. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Uma dose de personalidade pra quem vive de opinião alheia. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pessoas indecisas não vão te dar um amor seguro! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A vida é feita de escolhas, eu escolhi fingir demência.✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Reciprocidade não combina com cobrança! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não deposite o seu melhor em pessoas mal resolvidas!\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Desculpa se não te entendo, não sou fluente em mimimi! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Seu brilhar não depende do apagar da luz do outro! ⭐\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Com você aprendi os erros que eu jamais quero cometer! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Depois da primeira mentira, toda verdade vira uma dúvida! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Os resultados calam bocas, sem que você precise abrir a sua.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É ranço atrás de ranço! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Mal me quer, bem estou. ✌✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Prefiro uma solidão inteira do que meia presença. ✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quem é inteiro, não precisa procurar metades. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O problema é que as suas palavras agem, mas suas atitudes não dizem! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tô aqui no mesmo lugar de sempre, você sabe o caminho. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O mundo gira. Pune quem faz mal, tira de quem não cuida. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não preciso de vingança: as pessoas de coração ruim sempre se autodestroem.\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Nenhuma notificação é mais importante do que o afeto de quem está do seu lado agora. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Só de ver o brilho nos meus olhos, os falsos já recuam! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A regra é clara: ou cuida bem, ou fica sem. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Sei que não nota, mas quando falo de amor, é sempre sobre você... ❤\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ao menor sinal de desinteresse, retribua. SUMA!✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Um novo amor não merece seus velhos medos! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Vivo para ser feliz, não para agradar. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Qualquer problema que você tiver comigo, é seu. ✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Saiba a diferença entre esperar e perder tempo! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Nasci pra correr atrás de sonhos, não de pessoas. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Estar certo uma vez não faz ninguém o dono da razão. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tua energia é preciosa demais, para oferecer às pessoas erradas. ✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Desculpa se não te agradei, mas confesso, não fiz questão... Nem tentei! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Minha força vem do Homem lá de cima, não da sua opinião. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Vivo pra mim, não para os outros! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pessoas mentem, a energia delas não! ✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Criticando o que faço? Chega e faz melhor! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Felicidade não se expõe, se vive! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Dizia ser livre, mas estava presa à opinião dos outros! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Vai na fé, não na opinião dos outros. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não se diminua para caber em alguém. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Decepções mudam sentimentos. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quem gosta de você, não te modifica, te completa. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Zona de conforto é o nosso vício mais perigoso. ?\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É aquele ditado né.. Tem que rir pra não agredir. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu também sei magoar e desprezar, mas eu escolhi crescer. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não faça com os outros o que você não quer que seja feito com você! ✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Desapegue do que já foi e deixe o novo acontecer! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quem se afasta porque quer, não pode voltar quando quiser. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não trate as pessoas tão mal como elas são, trate-as tão bem quanto você é. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Valorize quem caminha contigo. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Sua vida deve ser muito vazia mesmo para você passar tanto tempo cuidando da minha. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('As pessoas mudam. E na maioria das vezes, para aquilo que disseram que nunca seriam. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Que o tempo te desmascare, pois ainda não sei se você é pecado ou milagre.. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Aprenda: há mais felicidade em estar calado que em falar tolice só para ser engraçado. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ninguém passa pela tua vida por engano. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pra te iludir tem muitos, mas pra te fazer feliz, são quase inexistentes. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Dê valor a quem está do seu lado e faz de tudo pra te ver bem! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Vem fácil, vai fácil, essa é a lei da natureza! \uD83C\uDF0E\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Subir na vida sim, mas sem fazer ninguém de degrau!\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quando você precisa ficar provando seu valor é a exata hora de ir embora! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A idade chega pra todos, a maturidade infelizmente não. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Todo dia aprendo um pouco mais a me importar um pouco menos. ✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('As pessoas não nos abandonam. A vida é que só deixa ficar quem a gente merece! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Enquanto você reclama da vida tem gente lutando por uma. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não podemos exigir que os outros sejam como queremos, nem nós mesmos somos. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Só pra lembrar: mulher solteira pode ficar com quem quiser, beijos! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Enquanto você for o que os outros querem que você seja, você não será ninguém!✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se não sabe onde eu quero chegar, não me diga o que devo fazer! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Confiança é como uma borracha. Fica menor a cada erro cometido! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Desculpa, esqueci que você e só lembra de mim quando esquecem de você! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Agradar a si, não aos outros. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O mundo precisa de exemplos não de opiniões. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O segredo é se importar cada vez menos, e viver cada vez mais.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Cuidado pra não tropeçar em tudo que finges não sentir... \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se você vacila com a pessoa certa, a errada te ensina como dói.\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não gaste saliva com quem não tem capacidade de entender suas palavras. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Uma hora a gente entende que nem todo mundo faz por nós o que fazemos por eles. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não confie em ninguém nessa vida! Até sua sombra te abandona no escuro. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Prefiro tomar champanhe do que tomar conta da vida dos outros! Pena que nem todos são assim. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Esqueça o tempo de duração, o que importa mesmo é a intensidade! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É muita bola de gude querendo ser diamante! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Os tolos são aqueles que se acham os mais inteligentes. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('11 letras, 4 palavras e 1 verdade: A vida é minha! ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quando sentir vontade de julgar alguém, corra em busca de um espelho! ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Só não me faça criar nojo. Criar nojo pra mim é pior do que ódio. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Era tudo brincadeira, até o momento em que eu comecei a sentir ciúmes de você. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Algumas pessoas merecem um grande aplausos pelo teatro que fazem! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Para de curtir minhas fotos e vem curtir minha boca! \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não, eu não esqueci, só não quero lembrar! ✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se tua vida fosse boa não perderia o tempo cuidando da minha, né?! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem gente que só te atrasa na vida! ✋\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Você perdoa tanto, se doa tanto, que no final só dói em você! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O engraçado é que muitas pessoas ainda acham que me importo com a opinião delas...\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem problema comigo vem reclamar pra mim, não para os outros! ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Difícil acreditar em palavras, quando as atitudes demonstram o oposto! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Falam um livro de você, mas só leram uma página. ✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Você pode colher mil impressões em centenas de fotografias e mesmo assim sair daqui sem me conhecer. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não importa mais a quem, faço o que me convém. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O mundo precisa de paz, colabore fechando a boca. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Uma hora a gente cansa e por fim desencanta. ✨✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ranço é igual amor, não dá para controlar. A gente só sente.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Criticar não vai te levar a nada e não vai te fazer melhor \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não sou anti-social, eu sou mesmo é anti-você! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tudo o que você tem e não valoriza, a vida tira.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Da vida eu só espero não esperar nada de ninguém.✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Triste é pensar que você conheceu uma pessoa legal, pra depois descobrir que ela é exatamente igual as outras.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não vou manchar meu coração pelos erros de ninguém  \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Fingir é tão brega! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pratique o que você prega.✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pedir desculpas é valorizar mais a relação que o ego.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A vida passa rápido demais pra perder tempo com sentimentos ruins.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não aceito nada a menos, do que eu mereço.\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Perdoar é dar paz a si mesmo.❤\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Por um mundo com menos dedos apontados e mais mãos estendidas.✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se não gosta de opinião, não faça comentários.✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Por mais pessoas que nos façam perder o fôlego, não a paciência.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quando eu me aceito eu me libero do peso de precisar que você me aceite! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ninguém vale a pena se você tem que insistir.\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('As pessoas odeiam ouvir verdades que estremecem suas mentiras! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Vou me vingar na maneira mais cruel que há. Vou deixar pra lá! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Sentimento ruim a gente não leva, a gente se livra pra viver bem.✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem gente que acha que vai fazer falta, mas tá fazendo um favor.\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Meu erro foi ter colocado expectativa onde eu deveria ter colocado só a língua.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se afasta daquelas pessoas que precisam te diminuir para se sentirem melhores! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não é todo mundo que vai entender o seu caminho, mas tudo bem, não é o deles, é o SEU! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Pedir desculpas não é se humilhar, é crescer!✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Amor bonito é amor recíproco, o resto é gritaria desnecessária! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tudo é temporário, apenas deixe fluir. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem coisas que a gente não fala, mas quer que o outro perceba! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Estou feliz assim, amor próprio, coração tranquilo e alma leve‼ \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Deixe pra trás o que não te leva pra frente! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Feliz é aquele que vê a felicidade do outro sem ter inveja! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('More no seu amor próprio, pois é complicado morar de aluguel em corações alheios! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quando falares, cuida para que tuas palavras sejam melhores que o silêncio! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A gente tem medo de quem traz a felicidade, porque não sabemos lidar com ela! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quem pensa que sabe o que o outro pensa, só pensa que sabe‼ \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O segredo é abstrair e fingir demência. Não entrar em conflito com quem só merece indiferença... \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tem gente que tem valor, outros só preço! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Decide, por que o tempo passa, e meio termo cansa ⏳\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Seja um incentivador de pessoas, o mundo já tem críticos demais \uD83D\uDCAA\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tenho me poupado de pessoas negativas e até a minha saúde melhorou! \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ignorar gente desagradável faz bem pra pele! \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Os que mais gostam de apontar o dedo são os que escondem os maiores pecados... \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Quando a gente não sabe se colocar no lugar do outro, a vida coloca agente lá pra aprender! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Seja seletivo nas suas batalhas. Ás vezes estar em paz, é melhor do que estar certo! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Amor próprio! Porque até no \"Eu te Amo\", o \"Eu\" vem primeiro!\uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se você quer mesmo fazer algo, faça! não anuncie...\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Você tem o direito de falar o que pensa, Mas não tem o direito de julgar quem não conhece \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Na boca de quem não presta, até quem é bom não vale nada! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu tenho 3 vidas: A minha ☝️, a que os outros cuidam  e a que os outros inventam! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Deixa ir, tem coisa melhor pra vir… \uD83C\uDF0E\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Você é frio demais para o meu verão intenso.☀\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tô tirando férias, dando um tempo disso, chega de amar, chega de me doar, chega de me doer. ✈\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Desculpe por não me importar com o que você pensa, estou ocupada sendo feliz.♀️\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O que é teu, chega com o tempo. E o que não é se vai com ele. ❤\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não importa o quanto demore. Se valer a pena, a espera é só um detalhe… \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ele me enche de certezas e depois me cobre de duvidas.\uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não tenho vocação para o morno. Ou congela. Ou pega fogo.❄\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O problema é que a gente pensa demais no que não deveria nem pensar.❌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ela é tipo trevo de quatro folhas. Difícil de encontrar e sorte de quem tem.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Preciso de alguém que me ensine a acertar, ao invés de apontar todas as minhas falhas.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O pior de tudo é ver a pessoa que dizia sempre estar com você, indo embora.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Confiar nas pessoas erradas é uma ótima maneira de começar a se matar.⚰\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Os piores inimigos, são aqueles que já foram nossos amigos um dia. Porque esses sim, sabem como nos atacar.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Para uns ela era primavera. Para outros, ela era inverno.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ela cansou de correr atrás dos outros e nem foi por orgulho, foi por preguiça mesmo.\uD83C\uDF0E\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu achei que tinha superado, mas aí você volta com esse seu jeitinho irresistível.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É que meu bem, eu nasci livre, ao invés de me prender, porque não voa comigo? ✈\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('To tentando entender porque sua boca ta tão longe da minha.\uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Hoje eu tô mais pé no chão.. Aprendi que não devo criar tantas expectativas e nem fazer tantos planos… \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Eu mudei sim, mas nem por isso me tornei outra pessoa. Continuo sendo eu…\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Mentiu pra mim uma vez, eu sempre vou desconfiar. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Aceite, tem gente que entra na sua vida apenas para ser uma felicidade temporária. ⌛\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tudo mudou. Eu, principalmente.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Vingativa eu? Imagina querido, só acredito que tudo na vida tem seu troco.♀️\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Foi tudo por causa de um coração partido. \uD83C\uDF43\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Só que você foi embora cedo demais. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Foi bom, vacilou me perdeu, ta querendo voltar, desculpa tu se fu. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ah, eu tô dando risada palhaço igual você tá cheio na quebrada. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Me escuta, tu teve a chance e transformou meu romance num lance. \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Aí lek, tu toma cuidado, porque com fogo tu pode se queimar. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Depois de alguns dias tu vai tá pedindo mais. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não entre na infantil disputa de quem se importa menos. \uD83D\uDE22\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Oportunidade se espera andando! \uD83D\uDCAA\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O passado é um lugar de referência, não de residência.\uD83C\uDF0E\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Me importo com quem vem e fica! \uD83D\uDE18\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não confunda convivência pacífica com amizade. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Cês falam tanto de pecado, que nem reparam as bênçãos. ✨\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Comemora sem alarde que a zica dorme leve. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('No fim do jogo peões e reis voltam para a mesma caixa.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ninguém odeia o fraco. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É fácil parecer perfeito quando você não está fazendo nada.\uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('A gente precisa aprender a se doar mais e se doer menos. ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Ser bonzinho é fácil, difícil é ser justo. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É que nada vago me sustenta. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Como tenho dito, qualquer problema que tiver comigo é exclusivamente seu. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Consciência limpa ninguém compra. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Até o que era defeito virou saudade. \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não desgaste a sua essência com quem não vive a sua intensidade.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Se arrepender da mais trabalho do que seguir o coração! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Tô aqui procurando a moral que não te dei... ✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Não sou bom entendedor e meias palavras não bastam. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('O passado é uma rua sem saída! \uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Meus mais sinceros estava a fim, mas perdi a paciência! \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Conte-me mais sobre essa opinião que nunca te pedi... ✌✌\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Compreender é muito mais profundo do que conhecer!\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Na medida do possível faço tudo só. Dá mais certo. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É renovador cortar o cabelo, as unhas e as relações sem futuro. \uD83D\uDE09\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Em terra de EGO, quem vê o outro é rei. \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Qual a sua responsabilidade na desordem da qual você se queixa \uD83D\uDC4A\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Gente feliz é imune à maldade alheia! ☺\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('É loucura odiar todas as rosas, porque uma te espetou.\uD83D\uDCAD\t','Anônimo','Frases de Indiretas')\t\t\n" +
                ",('Cada um de nós compõe a sua história. Cada ser em si carrega o dom de ser capaz, de ser feliz. \uD83C\uDF3B       \t','\t((Almir Sater)\t','Frases de Músicas')\n" +
                ",('Se o que eu sou é também o que eu escolhi ser, aceito a condição. \uD83C\uDF43                                    \t','\t( (Los Hermanos)\t','Frases de Músicas')\n" +
                ",('Tentar ser forte a todo e cada amanhecer! \uD83C\uDF40                                                            \t','\t (Legião urbana)\t','Frases de Músicas')\n" +
                ",('Seus olhos e seus olhares, milhares de tentações. ✨                                                    \t','\t(Leoni)\t','Frases de Músicas')\n" +
                ",('Basta ser sincero e desejar profundo! \uD83C\uDF42❤                                                              \t','\t(Raul Seixas)\t','Frases de Músicas')\n" +
                ",('Tu já ouviu o velho ditado que diz: A vida é simples, simples, quem complica é a gente? \uD83D\uDCAD              \t','\t((Marcelo D2)\t','Frases de Músicas')\n" +
                ",('Ela é do bem onde quer que for. ✨                                                                      \t','\t (A Banca 021)\t','Frases de Músicas')\n" +
                ",('Em alguns instantes sou pequenina e também gigante. \uD83C\uDF43                                                  \t','\t (Marisa Monte)\t','Frases de Músicas')\n" +
                ",('A felicidade está nas coisas simples! \uD83C\uDF43\uD83C\uDF3A❤                                                            \t','\t (Ponto de Equilíbrio)\t','Frases de Músicas')\n" +
                ",('Vida é fazer todo o sonho brilhar, é ser feliz! ✨\uD83D\uDE4F                                                    \t','\t(João Bosco)\t','Frases de Músicas')\n" +
                ",('Temos nosso próprio tempo. \uD83C\uDF43\uD83D\uDC4C                                                                         \t','\t(Legião Urbana)\t','Frases de Músicas')\n" +
                ",('Toda positividade eu desejo a você. \uD83C\uDF42❤                                                                \t','\t(Chorão)\t','Frases de Músicas')\n" +
                ",('Sei que um dia chego lá! ✨                                                                             \t','\t (Iza)\t','Frases de Músicas')\n" +
                ",('Pintando a vida do jeito dela... \uD83C\uDF42❤                                                                   \t','\t (A Banca 021)\t','Frases de Músicas')\n" +
                ",('Eu sou a maré viva, se entrar vai se afogar. \uD83C\uDF0A                                                         \t','\t (Fresno)\t','Frases de Músicas')\n" +
                ",('Hard work forever pays ! \uD83D\uDCAA\uD83D\uDCAA                                                                           \t','\t (Trabalho duro é eternamente compensado – Wiz Khalifa)\t','Frases de Músicas')\n" +
                ",('Todos vivemos dias difíceis mas nada disso é em vão!\uD83D\uDE0C\uD83D\uDC4A                                                \t','\t(Charlie Brown Jr)\t','Frases de Músicas')\n" +
                ",('Toda minha derrota é forjada, mas minha vitória voa. \uD83C\uDF0E                                                 \t','\t(Froid)\t','Frases de Músicas')\n" +
                ",('São os desatinos que ensinam a crescer! ✨✨                                                            \t','\t (Maneva)\t','Frases de Músicas')\n" +
                ",('Deixo a minha fé guiar. ✨                                                                              \t','\t(Iza)\t','Frases de Músicas')\n" +
                ",('Somos um eco do que imaginamos ser. \uD83C\uDF2A                                                                  \t','\t(Supercombo)\t','Frases de Músicas')\n" +
                ",('O tempo anda difícil e a vida tropeçando. \uD83D\uDEB6\u200D♀️                                                            \t','\t (Mallu Magalhães)\t','Frases de Músicas')\n" +
                ",('Somos luzes que faíscam no caos. ✨                                                                     \t','\t(O Rappa)\t','Frases de Músicas')\n" +
                ",('Esse teu sorriso largo é poesia e alegria! ✨                                                           \t','\t(Rap Box)\t','Frases de Músicas')\n" +
                ",('Só quero uma rodada de belos sorrisos! \uD83C\uDF42\uD83D\uDC4C                                                             \t','\t(Joelma)\t','Frases de Músicas')\n" +
                ",('Pra mim é tudo ou nunca mais. \uD83D\uDC4C                                                                        \t','\t (Cazuza)\t','Frases de Músicas');";
        return frases;
    }
    public  static String carregarFrases8(){

        String frases = "INSERT INTO frases (texto,autor,categoria) VALUES ('Felicidade é só questão de ser. \uD83D\uDCAB❤ ','(Marcelo Jeneci)','Frases de Músicas')\n" +
                ",('É saber se sentir infinito. ✨                                                                          \t','\t(Ana Vilela)\t','Frases de Músicas')\n" +
                ",('A estrada vai além do que se vê. ✨                                                                     \t','\t(Los Hermanos)\t','Frases de Músicas')\n" +
                ",('Nunca reclamar, só agradecer! ✨                                                                        \t','\t(Supercombo)\t','Frases de Músicas')\n" +
                ",('Eu sei que a vida vai ser bonita! \uD83C\uDF42\uD83D\uDC4C                                                                  \t','\t (Onze:20)\t','Frases de Músicas')\n" +
                ",('Mas a vida só gosta de quem gosta de viver! \uD83C\uDF43\uD83D\uDC4C                                                        \t','\t (Chorão)\t','Frases de Músicas')\n" +
                ",('A sua luz é como um farol. \uD83D\uDCAB❤                                                                         \t','\t (Gabriel Elias)\t','Frases de Músicas')\n" +
                ",('Quem te conduz é a vida, não adianta correr. \uD83C\uDF42\uD83D\uDC4C                                                       \t','\t(Cynthia)\t','Frases de Músicas')\n" +
                ",('Peço que só sinta. \uD83C\uDF43\uD83C\uDF42                                                                                 \t','\t(Da Paz)\t','Frases de Músicas')\n" +
                ",('É preciso ter sonho sempre! ✨                                                                          \t','\t(Milton Nascimento)\t','Frases de Músicas')\n" +
                ",('Vivo aqui e seja o que Deus quiser! \uD83C\uDF42❤                                                                \t','\t(Titãs)\t','Frases de Músicas')\n" +
                ",('O presente é nossa melhor fase! \uD83D\uDCAB❤                                                                    \t','\t(Filipe Ret)\t','Frases de Músicas')\n" +
                ",('Para pra ver, pode dar muito certo, basta querer! \uD83C\uDF42❤                                                  \t','\t (Melim)\t','Frases de Músicas')\n" +
                ",('Tudo é uma questão de manter a mente quieta, a espinha ereta e o coração tranquilo. ✨                  \t','\t((Walter Franco)\t','Frases de Músicas')\n" +
                ",('A vida não é fácil que nem viver! \uD83D\uDCAD                                                                    \t','\t(Dudu)\t','Frases de Músicas')\n" +
                ",('Meus pés são minha única carruagem, portanto tenho que ir em frente! \uD83C\uDF43\uD83D\uDC4C                               \t','\t((Bob Marley)\t','Frases de Músicas')\n" +
                ",('Coração e oração vira rima pedindo a Deus toda proteção! \uD83D\uDCAB❤                                           \t','\t (Lourena\t','Frases de Músicas')\n" +
                ",('Veja bem, enxergar não é ver, saiba! ✨                                                                 \t','\t (Rap Box)\t','Frases de Músicas')\n" +
                ",('Que assim seja, amém! O seu brilho é o meu abrigo! ☀✨                                                 \t','\t(Vitor Kley)\t','Frases de Músicas')\n" +
                ",('Tudo está melhor do que parece! ✨\uD83D\uDC4C                                                                    \t','\t(O Terno)\t','Frases de Músicas')\n" +
                ",('Sobre sentir coração, sobre ser de coração.. \uD83C\uDF42❤                                                       \t','\t (Chris)\t','Frases de Músicas')\n" +
                ",('Pra ficar de boa, sorriso! ✨                                                                           \t','\t (Saulo)\t','Frases de Músicas')\n" +
                ",('Eu não preciso me posicionar e nem te convencer, eu só preciso ser! \uD83C\uDF42\uD83C\uDF42                                \t','\t((Iza | Sandy)\t','Frases de Músicas')\n" +
                ",('Eu não tô aqui à toa pra agradar! \uD83D\uDCAD                                                                    \t','\t(Xamã)\t','Frases de Músicas')\n" +
                ",('O mundo é dela, menos a culpa! \uD83C\uDF42\uD83D\uDC4C                                                                     \t','\t (Raillow)\t','Frases de Músicas')\n" +
                ",('Por onde eu vou, quem eu sou, só eu sei. \uD83D\uDCAB\uD83D\uDCAB                                                           \t','\t(Rouge)\t','Frases de Músicas')\n" +
                ",('Livre, era o qe ela mais queria ser. \uD83C\uDF43\uD83C\uDF42                                                               \t','\t (Tiago Iorc)\t','Frases de Músicas')\n" +
                ",('Compaixão é fortaleza. Ter bondade é ter coragem. \uD83D\uDCAD                                                    \t','\t(Legião Urbana)\t','Frases de Músicas')\n" +
                ",('Acredite nos teus sonhos todo dia! \uD83C\uDF43\uD83C\uDF42                                                                 \t','\t (Black)\t','Frases de Músicas')\n" +
                ",('A nossa vida é feita mesmo para se aprender... \uD83C\uDF42\uD83C\uDF42                                                     \t','\t (Natiruts)\t','Frases de Músicas')\n" +
                ",('Dias melhores verão! ✨✨                                                                               \t','\t(Gabriel Elias)\t','Frases de Músicas')\n" +
                ",('É tempo de iluminar. ✨                                                                                 \t','\t(Natiruts)\t','Frases de Músicas')\n" +
                ",('Pode crer, que tudo vai dar certo! \uD83D\uDCAD                                                                   \t','\t (Armandinho)\t','Frases de Músicas')\n" +
                ",('E tudo que a gente aprendeu é liberdade. por onde for, leve seu guia, o coração. ✨                     \t','\t( (Saulo)\t','Frases de Músicas')\n" +
                ",('Porque a vida só se dá pra quem se deu.. ✨✨                                                           \t','\t(Toquinho e Vinicius)\t','Frases de Músicas')\n" +
                ",('Sorrisos bobos, abraços longos, olhares sinceros. \uD83C\uDF42\uD83C\uDF41                                                  \t','\t (Jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('Poço de qualidade e defeito, e cada jeito dela é uma emoção. ✨                                         \t','\t(Projota)\t','Frases de Músicas')\n" +
                ",('Daqui pra frente eu não quero nem pensar, eu vou deixar pra lá. \uD83D\uDC4C                                      \t','\t(Manu Gavassi)\t','Frases de Músicas')\n" +
                ",('É que o coração não pensa... \uD83C\uDFB6\uD83D\uDC99                                                                       \t','\t(Legião Urbana)\t','Frases de Músicas')\n" +
                ",('Perceber aquilo que se tem de bom no viver é um dom! \uD83C\uDF42\uD83C\uDF42                                               \t','\t (Marcelo Camelo)\t','Frases de Músicas')\n" +
                ",('Aonde quer que eu vá, serei luz. ✨                                                                     \t','\t(Thiaguinho)\t','Frases de Músicas')\n" +
                ",('Eu quero calma na alma pra poder viver a vida. \uD83C\uDF42\uD83C\uDF41                                                     \t','\t (ConeCrewDiretoria)\t','Frases de Músicas')\n" +
                ",('A vida é feita de esperanças e motivos pra sonhar. ✨                                                   \t','\t(Kemilly Santos)\t','Frases de Músicas')\n" +
                ",('Minha sina é o brilho puro da fé. ✨\uD83D\uDE4F                                                                  \t','\t(Alceu Valença)\t','Frases de Músicas')\n" +
                ",('Nada do que eu fui me veste agora.\uD83D\uDE09                                                                    \t','\t(Maria Gadu)\t','Frases de Músicas')\n" +
                ",('Você acredita no depois, eu prefiro o agora! \uD83C\uDF42\uD83C\uDF42                                                       \t','\t (Agridoce)\t','Frases de Músicas')\n" +
                ",('Eu sou problema meu. \uD83D\uDC4C\uD83D\uDC4C                                                                                \t','\t (Clarice Falcão)\t','Frases de Músicas')\n" +
                ",('Faz da dor um sorriso! ✨✨                                                                             \t','\t (Jamily)\t','Frases de Músicas')\n" +
                ",('Para todo mal, a cura existirá. ❤\uD83D\uDE4C                                                                    \t','\t(Lulu Santos)\t','Frases de Músicas')\n" +
                ",('Tudo muda, não se apresse. \uD83D\uDE4C\uD83D\uDE4C                                                                         \t','\t (Raphael Ota)\t','Frases de Músicas')\n" +
                ",('Deus ajuda, é verdade. Vai na fé, não na sorte! \uD83D\uDC99✨\uD83D\uDE4F                                                  \t','\t (Sabotage)\t','Frases de Músicas')\n" +
                ",('Bora que o mundo é nosso \uD83D\uDC4C\uD83D\uDC4C                                                                            \t','\t(Mc Duduzinho)\t','Frases de Músicas')\n" +
                ",('Ser melhor do que fui ontem é o plano que a minha alma escreveu. \uD83D\uDCAB\uD83D\uDCAB                                   \t','\t((Projota)\t','Frases de Músicas')\n" +
                ",('Um coração aberto torna tudo mais fácil de acontecer. ❤                                                \t','\t(Sandy)\t','Frases de Músicas')\n" +
                ",('Se o que eu sou é também o que eu escolhi ser, aceito a condição. ❤                                    \t','\t( (Los Hermanos)\t','Frases de Músicas')\n" +
                ",('Pode se enfraquecer, só não vale desistir! \uD83D\uDCAA\uD83D\uDCAA                                                         \t','\t (Sant)\t','Frases de Músicas')\n" +
                ",('Teu sonho mandou trazer a fé pra tu conseguir! \uD83D\uDCAB\uD83D\uDE4F                                                     \t','\t (Sant)\t','Frases de Músicas')\n" +
                ",('Sonhar pra poder crescer, crescer pra querer viver o sonhar! \uD83D\uDCAB\uD83D\uDCAB                                       \t','\t(Sant)\t','Frases de Músicas')\n" +
                ",('Não quero mágoa pra levar... \uD83C\uDF3F\uD83D\uDE4C\uD83D\uDC9A                                                                     \t','\t(Cynthia Luz)\t','Frases de Músicas')\n" +
                ",('Ela é um filme de ação com vários finais! \uD83D\uDCA5\uD83D\uDCA5                                                          \t','\t(Proota)\t','Frases de Músicas')\n" +
                ",('Vivo e quero viver, ensinar e aprender! \uD83D\uDCAB\uD83D\uDCAB                                                            \t','\t (1kilo)\t','Frases de Músicas')\n" +
                ",('Se não fossem os danos, não seria eu! \uD83D\uDCA5\uD83D\uDE0D                                                              \t','\t(Clarice Falcão)\t','Frases de Músicas')\n" +
                ",('Rir de tudo no fim... ✨\uD83D\uDE0A\uD83D\uDC95                                                                            \t','\t(Pitty)\t','Frases de Músicas')\n" +
                ",('É que o sonho é de quem busca! \uD83D\uDCAB\uD83D\uDCAB                                                                     \t','\t(Froid)\t','Frases de Músicas')\n" +
                ",('Não basta querer, tem que saber chegar. \uD83D\uDE09\uD83D\uDC4C                                                            \t','\t(Rael da Rima)\t','Frases de Músicas')\n" +
                ",('Viva todo o seu mundo, sinta toda liberdade. \uD83C\uDF0E\uD83C\uDF43✨                                                     \t','\t (Jota Quest)\t','Frases de Músicas')\n" +
                ",('É por instinto que eu encontro a luz, sou girassol. \uD83D\uDE03                                                  \t','\t (Kell Smith)\t','Frases de Músicas')\n" +
                ",('Em cada canto eu vejo um lado bom! \uD83D\uDE0D\uD83D\uDC93                                                                 \t','\t (Mallu Magalhães)\t','Frases de Músicas')\n" +
                ",('Equilíbrio é paz, cabeça fresca! ✨\uD83D\uDE4F                                                                   \t','\t (Cynthia Luz | Sant)\t','Frases de Músicas')\n" +
                ",('Nunca reclamar, só agradecer... \uD83D\uDE4F\uD83D\uDE4F                                                                    \t','\t(Supercombo)\t','Frases de Músicas')\n" +
                ",('Quanto mais a gente rala, mais a gente cresce! \uD83D\uDCAA\uD83D\uDE4F                                                     \t','\t (Chorão)\t','Frases de Músicas')\n" +
                ",('Bem equilibrado, não importa a força do vento! \uD83D\uDC4C\uD83D\uDCAB                                                     \t','\t(1Kilo)\t','Frases de Músicas')\n" +
                ",('Deixo a minha fé guiar. \uD83D\uDE4C\uD83D\uDE4C                                                                            \t','\t(Iza)\t','Frases de Músicas')\n" +
                ",('Livre, era o que ela mais queria ser. ✨✨                                                              \t','\t(Tiago Iorc)\t','Frases de Músicas')\n" +
                ",('Mas eu tenho o santo forte ✨\uD83D\uDE4F                                                                         \t','\t (Chorão)\t','Frases de Músicas')\n" +
                ",('É bom, às vezes, se perder sem ter porquê.. \uD83D\uDCAB\uD83D\uDCAB                                                        \t','\t(Los Hermanos)\t','Frases de Músicas')\n" +
                ",('Coisa boa é Deus quem dá, besteira é a gente que faz! \uD83D\uDE4C\uD83D\uDE4C                                              \t','\t(Maria Rita)\t','Frases de Músicas')\n" +
                ",('Agradecemos independente das dores ✨✨                                                                 \t','\t (Marina Peralta)\t','Frases de Músicas')\n" +
                ",('Vida passará e eu quero existir... \uD83C\uDFB6\uD83D\uDC99                                                                 \t','\t (Delacruz)\t','Frases de Músicas')\n" +
                ",('É de batalha que se vive a vida. ✨\uD83D\uDE4F                                                                   \t','\t (Raul Seixas)\t','Frases de Músicas')\n" +
                ",('Eu quero é que Deus nos proteja das dores do coração.. \uD83D\uDE4C\uD83D\uDE4C                                             \t','\t (Maria Gadu)\t','Frases de Músicas')\n" +
                ",('Ter fé e ver coragem no amor... ✨✨                                                                    \t','\t(Los Hermanos)\t','Frases de Músicas')\n" +
                ",('E ir onde o vento for.. ✨                                                                              \t','\t(Los Hermanos)\t','Frases de Músicas')\n" +
                ",('A vida é curta demais pra não ser de verdade! \uD83D\uDE4F\uD83D\uDE4F                                                      \t','\t(Frasson)\t','Frases de Músicas')\n" +
                ",('São os desatinos que ensinam a crescer! ✨\uD83D\uDE4F\uD83D\uDCAB                                                          \t','\t(Maneva)\t','Frases de Músicas')\n" +
                ",('Resgate suas forças e se sinta bem. ✨                                                                  \t','\t(Charlie Brown)\t','Frases de Músicas')\n" +
                ",('Cabeça erguida sempre pra seguir.. ✨\uD83D\uDE4F                                                                 \t','\t (Iza)\t','Frases de Músicas')\n" +
                ",('O mundo todo reside dentro, em mim! \uD83C\uDF0E\uD83C\uDF0E                                                                \t','\t(Vanessa da Mata)\t','Frases de Músicas')\n" +
                ",('Cante alto seus sonhos.. \uD83D\uDCAB\uD83D\uDCAB                                                                           \t','\t (Scalene)\t','Frases de Músicas')\n" +
                ",('Dias melhores vem logo depois das piores tempestades.. \uD83D\uDE4C\uD83D\uDC9B                                             \t','\t (Victor Mota)\t','Frases de Músicas')\n" +
                ",('Vida boa, vida louca, vida breve! \uD83C\uDF43✨                                                                  \t','\t(Estação 77)\t','Frases de Músicas')\n" +
                ",('Se querer é poder, tem que ir até o final se quiser vencer! \uD83D\uDCAA\uD83D\uDC4C                                        \t','\t(Paulo Ricardo)\t','Frases de Músicas')\n" +
                ",('A vida é curta, mas os sonhos não são! \uD83D\uDCAB\uD83D\uDCAB                                                             \t','\t(Sandy)\t','Frases de Músicas')\n" +
                ",('Tudo se dá um jeito pra quem tem fé! \uD83D\uDE4F\uD83D\uDE4F                                                               \t','\t (Projota)\t','Frases de Músicas')\n" +
                ",('Da vida a gente leva a vida só, aproveite! ✨✨                                                         \t','\t (Rael)\t','Frases de Músicas')\n" +
                ",('O tempo nos dirá que nada como um dia após o outro! \uD83D\uDE4F\uD83D\uDE4F                                                \t','\t(Tiago Iorc)\t','Frases de Músicas')\n" +
                ",('Você não tem outra chance, a vida não é um jogo. \uD83D\uDC4C\uD83D\uDC4C                                                    \t','\t(Eminem)\t','Frases de Músicas')\n" +
                ",('Pensamento leve, sem direção.. ✨✨                                                                     \t','\t(Tribo da Periferia)\t','Frases de Músicas')\n" +
                ",('Mas de uma coisa eu sei: aqui se faz, aqui se paga! \uD83D\uDC4A\uD83D\uDC4C                                                 \t','\t(NaBrisa)\t','Frases de Músicas')\n" +
                ",('E o tempo vai passar, tudo vai mudar. \uD83D\uDE4C\uD83D\uDE4C                                                              \t','\t(Vitor Kley)\t','Frases de Músicas')\n" +
                ",('Viver é uma arte, um ofício! \uD83C\uDF43\uD83D\uDE0D                                                                       \t','\t(Nando Reis)\t','Frases de Músicas')\n" +
                ",('Em lugar de mil palavras, deixa o instinto exercer... ✨✨                                              \t','\t(Sandy)\t','Frases de Músicas')\n" +
                ",('Plante coisas boas, amém! \uD83C\uDF43\uD83C\uDF3A\uD83C\uDF31                                                                        \t','\t(Gaab)\t','Frases de Músicas')\n" +
                ",('Tudo é questão de aproveitar o momento. \uD83C\uDF43\uD83C\uDF43                                                            \t','\t (Pineapple)\t','Frases de Músicas')\n" +
                ",('Minhas buscas são pela paz, pelo amor! \uD83D\uDC99\uD83D\uDE4F                                                             \t','\t-3030\t','Frases de Músicas')\n" +
                ",('Não há razões para não ser feliz... \uD83C\uDF43\uD83C\uDF43                                                                \t','\t(Luan Santana | Marília)\t','Frases de Músicas')\n" +
                ",('O sol vem pela manhã, calma, tudo vai dar certo! ☀\uD83D\uDC99                                                   \t','\t(NaBrisa)\t','Frases de Músicas')\n" +
                ",('Não existe um caminho certo, a escolha quem faz é você! \uD83C\uDF43\uD83C\uDF42                                            \t','\t(NaBrisa)\t','Frases de Músicas')\n" +
                ",('O céu explica tudo pros nossos corações! \uD83D\uDC99\uD83D\uDC99                                                           \t','\t(Henrique e Juliano)\t','Frases de Músicas')\n" +
                ",('Somos o que somos, sou o meu segredo. \uD83D\uDCA5\uD83D\uDCA5                                                              \t','\t(NaBrisa)\t','Frases de Músicas')\n" +
                ",('E o mundo que eu ia girar, gira a minha volta. ⚡\uD83C\uDF0E✨                                                   \t','\t(Cynthia | Dnarty)\t','Frases de Músicas')\n" +
                ",('Porque o medo me revela a própria força! \uD83D\uDC4A\uD83D\uDE4C\uD83D\uDCAA                                                         \t','\t (Cynthia Luz)\t','Frases de Músicas')\n" +
                ",('Ter a melhor chuteira não te faz o melhor jogador. \uD83D\uDC4C\uD83D\uDCA5                                                 \t','\t (Felipe Ret)\t','Frases de Músicas')\n" +
                ",('Se eu não guardo nem dinheiro, quem dirá guardar rancor! \uD83D\uDCA5\uD83D\uDCA5                                           \t','\t (Nego do Borel)\t','Frases de Músicas')\n" +
                ",('Ela nunca olha pra trás, ela sabe o que quer, sabe o que faz! \uD83D\uDE0D\uD83D\uDE0D                                      \t','\t(Biel)\t','Frases de Músicas')\n" +
                ",('Ouvi dizer que só era triste quem queria. ✨✨                                                          \t','\t(Chorão)\t','Frases de Músicas')\n" +
                ",('E o final feliz é a gente que faz! \uD83D\uDE0D\uD83D\uDE0D                                                                 \t','\t (Jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('Se a sorte lhe sorriu, por que não sorrir de volta?! \uD83D\uDE0D\uD83C\uDF40                                               \t','\t (Skank)\t','Frases de Músicas')\n" +
                ",('Enquanto você reclama da sua vida, ela tá passando... \uD83C\uDF43\uD83C\uDF43                                              \t','\t(Demi Lovato)\t','Frases de Músicas')\n" +
                ",('Minha fé está além do impossível. \uD83D\uDE4F\uD83D\uDE4F                                                                  \t','\t(Fernanda Brum)\t','Frases de Músicas')\n" +
                ",('Cresça, independente do que aconteça. ✌✌                                                               \t','\t (Natiruts)\t','Frases de Músicas')\n" +
                ",('O céu é o limite! \uD83D\uDE0D\uD83C\uDF24\uD83D\uDE4C                                                                                \t','\t (Racionais)\t','Frases de Músicas')\n" +
                ",('Eu não camuflo falsidades! \uD83D\uDCA5\uD83D\uDCA5                                                                         \t','\t (Haikaiss)\t','Frases de Músicas')\n" +
                ",('Quando não souber o que pedir, peça felicidade! \uD83D\uDE01\uD83D\uDE0D                                                    \t','\t(Melim)\t','Frases de Músicas')\n" +
                ",('Fé que vai melhorar sempre, um dia novo surpreende... \uD83D\uDCAB\uD83D\uDCAB                                              \t','\t-3030\t','Frases de Músicas')\n" +
                ",('Cada ser em si carrega o dom de ser capaz e ser feliz! \uD83C\uDF43\uD83D\uDC9B                                             \t','\t (Almir Sater)\t','Frases de Músicas')\n" +
                ",('Jogue suas mágoas no vento! \uD83C\uDF43\uD83C\uDF42                                                                        \t','\t(Tribo de Jah)\t','Frases de Músicas')\n" +
                ",('Com Deus no coração, o resto nós resolve! \uD83D\uDE4F❤                                                          \t','\t(Racionais MC)\t','Frases de Músicas')\n" +
                ",('Vou aproveitar a vida antes que ela me aproveite. ✨✨                                                  \t','\t (Pitty)\t','Frases de Músicas')\n" +
                ",('Quem sabe, cala. Quem não sabe é quem mais fala! \uD83D\uDC4C\uD83D\uDC4C                                                    \t','\t(Ponto de Equilíbrio)\t','Frases de Músicas')\n" +
                ",('E viva sua vida assim como um passarinho livre para voar... ✨\uD83D\uDC26✨                                      \t','\t(Mato Seco)\t','Frases de Músicas')\n" +
                ",('O segredo do sucesso é a moderação. Ter um dia sim e ter um dia não! \uD83D\uDE09\uD83D\uDC4C                               \t','\t((Matanza)\t','Frases de Músicas')\n" +
                ",('Sua vida e sua liberdade vale mais do que ouro de qualquer quilate. \uD83C\uDF43\uD83C\uDF43                                \t','\t((Facção Central)\t','Frases de Músicas')\n" +
                ",('Muita coisa ainda está por vir, muita coisa ainda vai mudar! \uD83D\uDE4F\uD83D\uDC99                                       \t','\t(Nx Zero)\t','Frases de Músicas')\n" +
                ",('Nada como um dia atrás do outro... \uD83D\uDCAB\uD83D\uDCAB                                                                 \t','\t (Tiago Iorc)\t','Frases de Músicas')\n" +
                ",('Já me perdi tentando me encontrar.\uD83D\uDE43                                                                    \t','\t(IZA)\t','Frases de Músicas')\n" +
                ",('Até pra ser flor, precisa de sorte.\uD83C\uDF38                                                                   \t','\t (Carol e Vitoria)\t','Frases de Músicas')\n" +
                ",('Hoje vai ser melhor do que ontem.\uD83D\uDC4A                                                                     \t','\t(Capital Inicial)\t','Frases de Músicas')\n" +
                ",('Eu sei que vão tentar me destruir, mas vou me reconstruir, voltar mais forte que antes.\uD83E\uDD1E                \t','\t( (Iza)\t','Frases de Músicas')\n" +
                ",('Cuidado com o destino ela brinca com as pessoas \uD83D\uDC4C                                                      \t','\t (Charlie Brown Jr)\t','Frases de Músicas')\n" +
                ",('Fiz de mim descanso pra você. \uD83D\uDE09                                                                        \t','\t(Ana vitória)\t','Frases de Músicas')\n" +
                ",('Tanto faz, os dias são iguais \uD83D\uDC4C✌️                                                                       \t','\t(Racionais MC’s)\t','Frases de Músicas')\n" +
                ",('Eu ouvi gente vazia me falando sobre amor \uD83D\uDC94\uD83D\uDC94                                                          \t','\t(Ana Vilela)\t','Frases de Músicas')\n" +
                ",('A vida é boa quando se brinca demais.\uD83D\uDE43                                                                 \t','\t (Rubel)\t','Frases de Músicas')\n" +
                ",('O tempo mostra nossa direção.                                                                           \t','\t (1Kilo)\t','Frases de Músicas')\n" +
                ",('Onde queres o ato, eu sou o espírito! ❤                                                                \t','\t(Caetano Veloso)\t','Frases de Músicas')\n" +
                ",('Ter bondade é ter coragem. ❤✨                                                                         \t','\t (Legião Urbana)\t','Frases de Músicas')\n" +
                ",('Pois quem dorme, sonha. Quem vive, realiza !!! \uD83D\uDE04                                                       \t','\t (Tribo da Periferia)\t','Frases de Músicas')\n" +
                ",('E quando a mente muda a gente anda pra frente. ✨                                                       \t','\t (Gabriel O pensador)\t','Frases de Músicas')\n" +
                ",('A melhor maquiagem é o sorriso no rosto. \uD83D\uDE03\uD83D\uDE03                                                           \t','\t(Tribo da periferia)\t','Frases de Músicas')\n" +
                ",('Faço de mim, parte do segredo do universo. ❤                                                           \t','\t(Forfun)\t','Frases de Músicas')\n" +
                ",('Ser feliz pra mim não custa caro… \uD83D\uDE06\uD83D\uDE04                                                                  \t','\t(Mateus e Kauan)\t','Frases de Músicas')\n" +
                ",('Quer saber o sentido da vida? Pra frente. \uD83D\uDE09\uD83D\uDE03                                                          \t','\t(Emicida)\t','Frases de Músicas')\n" +
                ",('A vida não é problema é batalha, desafio, cada obstáculo é uma lição.                                   \t','\t((Racionais)\t','Frases de Músicas')\n" +
                ",('Ser feliz é tão simples, mas tão simples, que todo mundo esqueceu como é.\uD83D\uDE10\uD83D\uDE10                           \t','\t((Demi Lovato)\t','Frases de Músicas')\n" +
                ",('Ei, amor, eu to contigo independente do caô. ❤                                                         \t','\t (1Kilo)\t','Frases de Músicas')\n" +
                ",('Mentir pra si mesmo, é sempre a pior mentira. \uD83D\uDE10                                                        \t','\t(Renato Russo)\t','Frases de Músicas')\n" +
                ",('Essa é a lei do retorno e não adianta chorar.\uD83D\uDE03                                                         \t','\t (Mc Dom Juan)\t','Frases de Músicas')\n" +
                ",('Eu só quero saber se você ficaria com alguém igual você! \uD83D\uDE03                                             \t','\t (Zé Neto e Cristiano)\t','Frases de Músicas')\n" +
                ",('Me diz como é que não te ama. \uD83D\uDE0D                                                                        \t','\t(Naiara Azevedo)\t','Frases de Músicas')\n" +
                ",('É um novo tempo, momento pro novo sabor do vento! \uD83C\uDF24                                                    \t','\t(Emicida)\t','Frases de Músicas')\n" +
                ",('Fazer da vida o que melhor possa ser!! \uD83D\uDE03                                                               \t','\t (Charlie Brown)\t','Frases de Músicas')\n" +
                ",('Se eu soubesse antes o que sei agora erraria tudo exatamente igual!                                     \t','\t((Engenheiros do Hawaii)\t','Frases de Músicas')\n" +
                ",('Agora eu quero ir, pra me reconhecer de volta!                                                          \t','\t(AnaVitoria)\t','Frases de Músicas')\n" +
                ",('Sou brisa leve passageira!! \uD83D\uDE03                                                                          \t','\t(Oriente)\t','Frases de Músicas')\n" +
                ",('A página vira, o são delira, então a gente pira‼                                                        \t','\tEmicida)\t','Frases de Músicas')\n" +
                ",('Eu quero aquela vida que a gente inventa antes de dormir!\uD83D\uDE4C                                             \t','\t (Kell Smith)\t','Frases de Músicas')\n" +
                ",('Abra um sorriso e faça alguém sorrir! \uD83D\uDE0A\uD83D\uDE01                                                              \t','\t(Vitor Kley)\t','Frases de Músicas')\n" +
                ",('Ser livre assim... Está preso em mim!✌                                                                  \t','\t(OutroEu)\t','Frases de Músicas')\n" +
                ",('O mesmo céu que chove é o mesmo céu que faz sol!☀                                                      \t','\t(Vitor Kley)\t','Frases de Músicas')\n" +
                ",('Já era de se esperar não é? \uD83D\uDE0D\uD83D\uDE0D                                                                        \t','\t(Kell Smith)\t','Frases de Músicas')\n" +
                ",('Foi difícil entender que esse tempo é nada! \uD83D\uDC4C\uD83D\uDC4C                                                         \t','\t (Hungria)\t','Frases de Músicas')\n" +
                ",('O nosso tempo é tão veloz... Não dá pra segurar! ✌\uD83D\uDC4C                                                    \t','\t(Jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('Eu trago a paz e alegria como barco a bom porto!⛵⛵                                                    \t','\t(Piruka)\t','Frases de Músicas')\n" +
                ",('Tô com moral no céu, eu tô.. Tem um anjo me chamando de amor! ❤❤                                      \t','\t(Matheus e Kauan)\t','Frases de Músicas')\n" +
                ",('A benção que peço a ti... Ó Deus eu sei que cê vai entender!\uD83D\uDE4F\uD83D\uDE4F                                        \t','\t (1Kilo)\t','Frases de Músicas')\n" +
                ",('Maldito sentimento que nunca se acaba!\uD83D\uDE15                                                                \t','\t(Zé Neto e Cristiano)\t','Frases de Músicas')\n" +
                ",('Pois sua simplicidade é sua fortaleza!\uD83D\uDC4F\uD83D\uDC4F                                                              \t','\t(Projoota)\t','Frases de Músicas')\n" +
                ",('Que bom que é você... Entra logo que o meu abraço ta querendo o seu! \uD83D\uDE0D\uD83D\uDE0D                               \t','\t( (Gustavo Mioto)\t','Frases de Músicas')\n" +
                ",('O amor é bandeira de paz! ✌✌                                                                           \t','\t (1Kilo)\t','Frases de Músicas')\n" +
                ",('Tô abrindo mão de tudo! E pra nós dois eu quero... Um lugarzinho, violência zero! \uD83D\uDE0D❤                  \t','\t((Jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('Corre, que essa chance passa! \uD83D\uDC4C\uD83D\uDC4C                                                                       \t','\t(Fernando e Sorocaba)\t','Frases de Músicas')\n" +
                ",('Eu quero pra vida inteira um destino incerto! ✌                                                         \t','\t (Haikaiss)\t','Frases de Músicas')\n" +
                ",('Hoje eu ganhei alta... Nem sinto mais sua falta! \uD83D\uDC4C                                                     \t','\t(Gustavo Mioto)\t','Frases de Músicas')\n" +
                ",('Se eu tô solteiro e o \uD83D\uDC4C tá namorando!                                                                  \t','\t (Zé Neto e Cristiano)\t','Frases de Músicas')\n" +
                ",('Te ver chegar me faz voar... Até a lua e voltar!\uD83D\uDE0D\uD83D\uDE0D                                                    \t','\t(Jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('Menina, você inteira é uma obra prima! \uD83D\uDE0D\uD83D\uDC4C                                                             \t','\t(Antony e Gabriel)\t','Frases de Músicas')\n" +
                ",('Esse contrato é vitalício.... Cê tá amarrada aqui comigo!                                               \t','\t (jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('Traição não é erro, é uma escolha!                                                                      \t','\t (Kleo Dibah)\t','Frases de Músicas')\n" +
                ",('Essa menina é um presente no céu… Que Deus pintou e jogou fora o pincel!                                \t','\t((Thiago Brava)\t','Frases de Músicas')\n" +
                ",('Ver a belezea em gesto pequeno ter a imensidão... Como espalhar por aí qualquer coisa que faça sorrir!  \t','\t((Tiago Iorc) \uD83D\uDE00\uD83D\uDE00\t','Frases de Músicas')\n" +
                ",('Sonho acordado pensando em você... E eu não me canso de te amar!                                        \t','\t (Ferragem) ❤❤\t','Frases de Músicas')\n" +
                ",('Amar é tão sagrado pra quem sabe amar!                                                                  \t','\t(Ferragem) \uD83D\uDC4C\uD83D\uDC4C\t','Frases de Músicas')\n" +
                ",('Ô linda, o que é que você faz pra ser assim tão linda❓\uD83D\uDE0D\uD83D\uDE0D                                              \t','\t(Projota part. Anavitória)\t','Frases de Músicas')\n" +
                ",('Viajei nas suas entrelinhas ,que te entregam e desvendam o melhor em ti... \uD83D\uDE0D\uD83D\uDE0D                         \t','\t((Ana Vitória)\t','Frases de Músicas')\n" +
                ",('Cabelo solto, vento no rosto, o som ligado, Deus do meu lado.\uD83D\uDC46\uD83D\uDC4F                                       \t','\t(Marcela Thaís)\t','Frases de Músicas')\n" +
                ",('Vida de casado é bom só perde pra de solteiro \uD83D\uDE0E\uD83D\uDE09                                                      \t','\t(Wesley Safadão)\t','Frases de Músicas')\n" +
                ",('Hoje ela tá de volta pra mostrar que é capaz \uD83D\uDC44\uD83D\uDE18                                                       \t','\t (Mc livinho)\t','Frases de Músicas')\n" +
                ",('Eu tanto quis, tanto fiz, tanto fui feliz \uD83D\uDC4F\uD83D\uDE04                                                          \t','\t(Projota)\t','Frases de Músicas')\n" +
                ",('Estou feliz assim, amor próprio, coração tranquilo e alma leve ❤️\uD83C\uDF43                                     \t','\t((Isah soares\t','Frases de Músicas')\n" +
                ",('Eu sou problema meu \uD83D\uDC4A                                                                                  \t','\tClarice Falcão)\t','Frases de Músicas')\n" +
                ",('É saudade misturada com bebida \uD83C\uDF79\uD83D\uDE14                                                                     \t','\t(Jorge e Xandy)\t','Frases de Músicas')\n" +
                ",('Quem tem fé sabe que não está sozinho.                                                                  \t','\t(CBJR)\t','Frases de Músicas')\n" +
                ",('Por dentro eu tô sensacional...\uD83D\uDC4C\uD83D\uDE0E                                                                     \t','\t (Safadão)\t','Frases de Músicas')\n" +
                ",('O meu ❤️ deu PT...                                                                                      \t','\t(Safadão)\t','Frases de Músicas')\n" +
                ",('E a gente vai viver a vida como Deus quiser \uD83D\uDC46\uD83D\uDE09                                                        \t','\t(Simone e Simaria)\t','Frases de Músicas')\n" +
                ",('O que tenho de torta, eu tenho de feliz. \uD83D\uDE06\uD83D\uDE0A                                                           \t','\t(Mallu Magalhães)\t','Frases de Músicas')\n" +
                ",('Quem não bate, apanha \uD83D\uDC4A                                                                                \t','\t(Flora Matos)\t','Frases de Músicas')\n" +
                ",('Tudo de novo, vida que segue \uD83D\uDC4C                                                                         \t','\t(Tá na mente)\t','Frases de Músicas')\n" +
                ",('Hoje eu fico até mais tarde pra fazer vale a pena \uD83D\uDC4C\uD83D\uDE09                                                  \t','\t(Ari)\t','Frases de Músicas')\n" +
                ",('Eu falo de várias mudanças, mas no final nada muda \uD83D\uDE14                                                   \t','\t(Oriente)\t','Frases de Músicas')\n" +
                ",('Teu medo te cerca, te pega e te joga pra longe de mim...\uD83D\uDE1E                                              \t','\t(Marília Mendonça)\t','Frases de Músicas')\n" +
                ",('Com sorriso na cara e chorando por dentro \uD83D\uDE25                                                            \t','\t(Carreiro e capataz)\t','Frases de Músicas')\n" +
                ",('Cansei de chorar feridas que não se fecham não se curam  \uD83D\uDE2D                                             \t','\t(Pitty)\t','Frases de Músicas')\n" +
                ",('Ontem eu era o amor da sua vida e hoje eu sou o quê? ❤️\uD83D\uDE14                                               \t','\t(Safadão)\t','Frases de Músicas')\n" +
                ",('Teve a chance e transformou meu romance num lance \uD83D\uDC4C                                                    \t','\t(Tati zac)\t','Frases de Músicas')\n" +
                ",('Aprendi a lidar com a ilusão e também a lidar com a dor \uD83D\uDC94\uD83D\uDE25                                            \t','\t(Tati zac)\t','Frases de Músicas')\n" +
                ",('Sou o seu princípio, meio e fim \uD83D\uDE09                                                                      \t','\t(Luan Santana)\t','Frases de Músicas')\n" +
                ",('Não perdi nada, acabei de me livrar \uD83D\uDC4C                                                                  \t','\t (Marília Mendonça)\t','Frases de Músicas')\n" +
                ",('Pra mim felicidade é ter você \uD83D\uDE06\uD83D\uDE0A                                                                      \t','\t(Jorge e Mateus)\t','Frases de Músicas')\n" +
                ",('As pessoas te magoam, sem perceber \uD83D\uDE25                                                                   \t','\t(Justin Bieber)\t','Frases de Músicas')\n" +
                ",('Refletiu nos meus olhos, adeus, solidão \uD83D\uDE14                                                              \t','\t(Maneva)\t','Frases de Músicas')\n" +
                ",('Duas histórias que se cruzam sem intenção \uD83D\uDE09\uD83D\uDE09                                                          \t','\t(Maneva)\t','Frases de Músicas')\n" +
                ",('E se eu quiser dizer que o universo inteiro, mora em você \uD83D\uDC4F\uD83D\uDC4F                                          \t','\t(Tiago Iorc)\t','Frases de Músicas')\n" +
                ",('Bendito seja o homem que possa conquistá-la \uD83D\uDE18                                                          \t','\t(Oriente)\t','Frases de Músicas')\n" +
                ",('Se eu sou feliz, devo isso a você \uD83D\uDE09\uD83D\uDE18                                                                  \t','\t(Nossa história)\t','Frases de Músicas')\n" +
                ",('Só quer viver que a vida é única, é única \uD83D\uDC4F\uD83D\uDE09                                                          \t','\t(Hungria)\t','Frases de Músicas')\n" +
                ",('You laugh through your tears.                                                                           \t','\t(Você ri através de suas lágrimas) \uD83D\uDE25\uD83D\uDE09( \t','Frases de Músicas')\n" +
                ",('Não vou voltar tão cedo, mas vou voltar porque eu amei te ver \uD83D\uDE18❤️                                      \t','\t(Tiago Iorc)\t','Frases de Músicas')\n" +
                ",('Me escutas quando clamo e acalma o meu pensar. \uD83D\uDE4F\uD83D\uDE4F                                                     \t','\t(Gabriela Rocha)\t','Frases de Músicas')\n" +
                ",('Viver é melhor que sonhar! \uD83D\uDCAD\uD83D\uDCAD                                                                         \t','\t(Elis Regina) \uD83D\uDC4F\uD83D\uDE09\t','Frases de Músicas')\n" +
                ",('Deus! Perto de ti eu quero estar, se tenho a ti os medos se vão!  \uD83D\uDE4F\uD83D\uDE4F                                  \t','\t(Davi Sacer)\t','Frases de Músicas')\n" +
                ",('A felicidade está em coisas simples!  \uD83D\uDC4C\uD83D\uDC4C                                                               \t','\t(Ponto de Equilíbrio)\t','Frases de Músicas')\n" +
                ",('E como quem não quer nada, você vem...  \uD83D\uDC49\uD83D\uDE0D                                                            \t','\t(Jeito Moleque)\t','Frases de Músicas')\n" +
                ",('Não querer lidar com pessoas É proteção pra você nunca se machucar! \uD83D\uDE10\uD83D\uDE10                                \t','\t(Supercombo)\t','Frases de Músicas')\n" +
                ",('Perdi as contas de quantas vezes segurei o mundo dos outros e deixei o meu cair!  \uD83D\uDE15\uD83D\uDE15                  \t','\t(Legião Urbana)\t','Frases de Músicas')\n" +
                ",('Eu tenho fé em Deus pra resolver qualquer parada! \uD83D\uDC46\uD83D\uDE4F                                                  \t','\t( CBJR.)\t','Frases de Músicas')\n" +
                ",('Ei dor eu não te escuto mais, você não me leva a nada! \uD83D\uDE4A\uD83D\uDC4A                                             \t','\t(Jota quest)\t','Frases de Músicas')\n" +
                ",('Reza a lenda que a gente nasceu pra ser feliz! \uD83D\uDE04\uD83D\uDE00                                                     \t','\t(Engenheiros do Hawaii)\t','Frases de Músicas')\n" +
                ",('O tédio é o sentimento mais moderno que existe! \uD83D\uDC4C\uD83D\uDC4C                                                     \t','\t(Cazuza)\t','Frases de Músicas')\n" +
                ",('Eleve ao mais alto o seu pensamento. É preciso ter fé, é preciso saber dar tempo ao tempo! \uD83D\uDE4F⏳         \t','\t (Tribo de Jah)\t','Frases de Músicas')\n" +
                ",('A nossa vida é uma coleção de saudades! \uD83D\uDE10\uD83D\uDE15\uD83D\uDE11                                                          \t','\t (Projota)\t','Frases de Músicas')\n" +
                ",('A vida me ensinou a nunca desistir, nem ganhar nem perder mas procurar evoluir! ✌✌                     \t','\t (Charlie Brown Jr)\t','Frases de Músicas')\n" +
                ",('É preciso força pra sonhar e perceber que a estrada vai além do que se vê! \uD83D\uDE43\uD83D\uDE43                         \t','\t (Los Hermanos)\t','Frases de Músicas')\n" +
                ",('Bobeira é não viver a realidade!\uD83D\uDC4C\uD83D\uDC4C                                                                     \t','\t (Cássia Eller)\t','Frases de Músicas')\n" +
                ",('Seja fiel a Deus no pouco e muito ele te dará! \uD83D\uDE09\uD83D\uDE4F                                                     \t','\t (Canção Nova)\t','Frases de Músicas')\n" +
                ",('É fácil de mais viver em paz, é a gente que complica tudo! \uD83D\uDE14\uD83D\uDE2C                                         \t','\t (Thalles)\t','Frases de Músicas')\n" +
                ",('Não vou me arrepender do que ficou pra trás! \uD83D\uDC4C                                                         \t','\t(Livre Estou, Frozen)\t','Frases de Músicas')\n" +
                ",('Buscando um novo rumo que faça sentido nesse mundo louco! \uD83D\uDE1C\uD83D\uDE1D\uD83D\uDE1B                                        \t','\t (CBJR)\t','Frases de Músicas')\n" +
                ",('O mundo gira e bota sempre tudo no lugar!  ✌✌                                                          \t','\t (Strike)\t','Frases de Músicas')\n" +
                ",('Cada um escuta a voz de Deus de um jeito! \uD83D\uDC42                                                            \t','\t(Projota)\t','Frases de Músicas')\n" +
                ",('Hoje eu só quero que o dia termine bem! ✌✌                                                             \t','\t (Luciana Melo)\t','Frases de Músicas')\n" +
                ",('Não diga que a vitória está perdida, tenha fé em DEUS, tenha fé na vida.. \uD83D\uDE4F✌                           \t','\t(Raul Seixas)\t','Frases de Músicas')\n" +
                ",('Ei dor... eu não te escuto mais. Você não me leva a nada! \uD83D\uDE49\uD83D\uDE49\uD83D\uDC4A                                        \t','\t (O Sol, Jota Quest)\t','Frases de Músicas')\n" +
                ",('O que importa é nossa alegria! \uD83D\uDE04\uD83D\uDE03\uD83D\uDE00                                                                   \t','\t (Charlie Brown Jr)\t','Frases de Músicas')\n" +
                ",('Eu que já não quero mais ser um vencedor, levo a vida devagar pra não faltar amor! \uD83D\uDE09\uD83D\uDE09                 \t','\t (Los Hermanos)\t','Frases de Músicas')\n" +
                ",('Tô aproveitando cada segundo antes que isso aqui vire uma tragédia! ⏰⏰                                \t','\t (Pitty)\t','Frases de Músicas')\n" +
                ",('Se você tem um sonho a vida tem sentido, uma razão, um alvo a ser atingido.. \uD83D\uDCAD\uD83D\uDCAD                       \t','\t (Shaman King)\t','Frases de Músicas')\n" +
                ",('Com o tempo a vida faz crescer e aceitar.. Que de repente tudo muda e troca de lugar ‼                  \t','\t (nX ZERO)\t','Frases de Músicas')\n" +
                ",('O medo cega os nossos sonhos! \uD83D\uDE48\uD83D\uDE48                                                                      \t','\t (Charlie Brown Jr.)\t','Frases de Músicas')\n" +
                ",('Vou buscando acertar que às vezes eu errei, mas quem pode acusar sem tentar compreender! \uD83D\uDE10\uD83D\uDE10           \t','\t (Rosa de Saron)\t','Frases de Músicas')\n" +
                ",('Esse arrocha é pra você que achou que eu tava aqui sofrendo, Vai vendo! \uD83D\uDC83\uD83D\uDC83                            \t','\t(Lucas LUCCO)\t','Frases de Músicas')\n" +
                ",('Veja tudo como se não houvesse amanhã! \uD83D\uDC40\uD83D\uDC40                                                             \t','\t(PITTY)\t','Frases de Músicas')\n" +
                ",('Dinheiro no bolso, Deus no coração, família unida e champanhe pros irmãos! ✌✌                          \t','\t (Racionais MCs)\t','Frases de Músicas')\n" +
                ",('Devia ter arriscado mais. E até errado mais. Ter feito o que eu queria fazer! \uD83D\uDC4C\uD83D\uDC4C                       \t','\t (TITÃS)\t','Frases de Músicas')\n" +
                ",('Espere o melhor, prepare-se para o pior e aceite o que vier! ✌✌                                        \t','\t (Cpm 22)\t','Frases de Músicas')\n" +
                ",('Tudo é tão simples que cabe num cartão postal... \uD83C\uDF86                                                     \t','\t (Cazuza)\t','Frases de Músicas')\n" +
                ",('Nada como um dia após o outro... ✌                                                                      \t','\t (Racionais MC’s)\t','Frases de Músicas')\n" +
                ",('Me passe o número da sua opinião, quem sabe eu ligue pra ela! \uD83D\uDCDE\uD83D\uDE18                                      \t','\t (Wesley Safadão)\t','Frases de Músicas')\n" +
                ",('Pra quem tem fé a vida nunca tem fim... \uD83D\uDE4F                                                              \t','\t (O Rappa)\t','Frases de Músicas')\n" +
                ",('Quando eu penso ser meu fim, tu tens um recomeço... \uD83D\uDC46\uD83D\uDE09                                                \t','\t (Davi Sacer)\t','Frases de Músicas')\n" +
                ",('Meu destino não é de ninguém… \uD83D\uDE24\uD83D\uDE24                                                                      \t','\t (Capital Inicial)\t','Frases de Músicas')\n" +
                ",('Quem é de verdade, sabe quem é de mentira! \uD83D\uDC4C\uD83D\uDC4C','\t (CBJR)\t','Frases de Músicas')\n" +
                ",('Meu amor só é flor no teu jardim. \uD83C\uDF39\t','Anônimo','Frases de Amor')\t\t                                \n" +
                ",('De um jeito divino, o amor é a prova que Deus existe dentro da gente. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Nosso amor para sempre como o meu combustível particular para viver mais feliz. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é mais do que oferecer morada no peito, é cuidar para que lá sempre seja o melhor lugar para o outro estar. ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Como se não bastasse ser encontro, foi amor. \uD83D\uDC69\u200D❤️\u200D\uD83D\uDC68\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando é amor, a gente sorri até com os olhos. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Minha felicidade, minha verdade, minha paz. Te amo! \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('A vida é boa ao seu lado e eu agradeço por cada dia que podemos passar lado a lado. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Só o amor pode dar a paz e a felicidade que o coração deseja. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando encontrei você, foi como se eu tivesse me encontrado também. Que Deus abençoe esse amor. \uD83D\uDE4C\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Intenso é o nosso amor e cada momento que passo ao seu lado. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O nosso amor vai ser sempre assim, eu pra você, você pra mim e Deus por nós. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Te amar é leve, é intenso, é verdadeiro ! ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Tudo que eu sinto e tudo que encontrei em nós você já sabe, a metade que eu procurava. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Deus escreveu uma linda história de amor onde o final feliz é não ter fim. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é a poesia dos sentidos. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Meu par, obrigada por ser tão bom pra mim! Eu te amo! ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('É tão bom ser amado, ser cuidado e ter uma pessoa que me traz a cada dia um novo motivo pra ser alguém melhor! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Senti que era amor quando te abracei e senti vontade de nunca mais soltar. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('A tua companhia, eu não troco por nenhuma outra. Te amo! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Há dois momentos que quero estar com você: agora e sempre. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Todo dia ele faz com que eu me apaixone de novo. Todo dia ele me faz querer ficar perto e por cada vez mais tempo. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Acredite sempre no bem e, acima de tudo, no amor.. ❤️✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Bonita é a alma que coleciona cicatriz, mas prefere espalhar amor. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O verdadeiro amor nasce em tempos difíceis. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é o resumo do infinito. É o laço entre dois corações. É encontrar um lar em outro peito. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Com você do lado, tudo vai florescer. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor talvez seja isso, descobrir o que o outro fala até quando ele não diz. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('É do seu amor que meu coração sente falta... \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor não diminui, não se desfaz, não se perde. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ame mais e julgue menos. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é o caminho certo! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amo demais, mas nunca por dois. \uD83D\uDE09\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Aprendeu que o verdadeiro amor é a liberdade de ser quem ela é. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando o amor é forte, ele dura. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('A única maneira de ser feliz é amando. \uD83D\uDC69\u200D❤️\u200D\uD83D\uDC68\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Apenas uma coisa pode tornar uma alma completa e esta coisa é o amor. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ordem do amor: primeiro o próprio, depois o recíproco. ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Não é o quanto fazemos, mas quanto amor colocamos naquilo que fazemos. ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor que você desperta em mim faz a vida valer mais a pena❣\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Que o amor venha e seja leve, sem amarras, sem nós... \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Com você o que é simples tem sabor, a vida tem mais cor, é mais fácil ser feliz. Te amo tanto... ☺\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor que sinto por você é o que de mais lindo já senti. Não se compara, é de verdade! ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando o querer é sincero, o amor se torna completo. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Se houver amor, o resto a gente ajeita! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Perca-se nas coisas que você ama! ✨❤✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Foi amor, ou ainda é? Se foi, deixe ir, se ainda é, vá buscar. ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é a casa do outro na gente. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quem tem fome de vida, não se interessa por amores sem sal. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor faz o giro do mundo valer a pena. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é a cura para esse mundo tão doente. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Grandes amores são eternidades que se beijam. \uD83D\uDE18\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Que floresça amor em cada detalhe. \uD83C\uDF39\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Escolher o amor é um caminho sem volta. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quem ama cuida em qualquer ocasião. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é o melhor presente que alguém pode nos dar. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor está por trás e dentro de tudo. ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor de causas grandes não se abala pelas pequenas. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é isso. Não prende, não aperta, não sufoca. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é atemporal. \uD83D\uDCAD\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('E se não souber amar em palavras, ame em gestos. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amo tanto você que às vezes acho que uma vida inteira não vai chegar para lhe demonstrar o tamanho do meu amor por você!\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Em qualquer lugar que existe fé, o amor pode chegar. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Carrego um amor que tempo algum há de roubar. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Eu vim pra ser amor. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Meu assunto preferido sempre será o amor. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('De bons de briga o mundo tá cheio, o que falta é gente boa de amor! ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar não é pertencer, é perdurar! \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Não sejam tolos. Não falta amor, falta amar. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Que tenhamos a coragem e a força de escolhermos ser amor. \uD83D\uDE18\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é pra quem fica até o final. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é quando se cobra menos e se doa mais. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Pra mim, o amor deve ser que nem o café. Às vezes forte, às vezes doce, às vezes só e outras acompanhado, porém nunca deve estar frio... ☕\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O que é o amor senão a capacidade de desenvolver o que temos de melhor?! \uD83D\uDCAD\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Não há nada que supere o amor de Deus! \uD83D\uDE4F\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Escolha sempre o amor, independente de quais sejam as outras opções. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O essencial é saber amar. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é o caminho mais curto para a felicidade. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Todo meu amor é teu amor! \uD83D\uDC69\u200D❤️\u200D\uD83D\uDC68\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Fazer o que ama, amar o que faz e ser feliz no caminho... ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Deixa ser, deixa o amor ser sua saída ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amores fáceis não fazem história. \uD83D\uDCAD\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Todo tipo de amor é bonito. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Seja o maior amor da sua vida! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Sou o amor que dei, a palavra de afeto que disse. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Use as lentes do amor próprio para enxergar a felicidade. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('No amor não há lugar para dúvidas. \uD83C\uDF43\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Mais amor ao falar, mais paciência ao ouvir. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Morri de amar, mas descobri que amor não mata. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ame como nunca ou nunca mais ame. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor faz o ser humano ser capaz de superar os seus limites. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ninguém é maduro quando se trata do amor.. ❣\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é o coração a brilhar nos olhos. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O verdadeiro amor é exigente, implacável e, ao mesmo tempo, infinitamente delicado. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor não é viver felizes para sempre. É saber como enfrentar a vida juntos. \uD83D\uDC6B\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é a capacidade de descobrir no outro o que ele ainda nem viu que tem. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Prefira sempre espalhar amor! ❣❣\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar não é querer para si, é dar de si para o outro! \uD83D\uDC6B (Tati Rossi)\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Tudo na vida é feito de amor. ❤❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor não faz sentido, o amor DÁ sentido. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Orar por alguém é amá-lo em segredo. \uD83D\uDE4F\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é mais que um \"te amo\". É um \"te cuido\". ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Apesar dos efeitos colaterais, o amor ainda é o melhor remédio. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Um amor firmado por Deus é também fortalecido por Ele! ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Que você encontre um amor que te lembre novamente o quão bom é amar! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Deixa o amor ser o centro sua vida! \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando é amor a gente tolera, perdoa, muda, espera, suporta, só não desiste! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor que o mundo não te deu, Jesus te dá! \uD83D\uDE4C\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Se ame primeiro pra depois amar alguém! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Se tem uma coisa que o vento nunca vai levar de mim é o meu amor próprio! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Porque por dentro eu sou amor e por fora eu tô do avesso! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ninguém perde por dar amor, perde é quem não sabe receber. ❣❣\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor que é amor, apesar das lutas, se mantém firme. \uD83D\uDC6B\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor não se diminui, não se desfaz, não se perde. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é para os fortes, porque só quem ama sabe o que o amor é capaz de suportar. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Romper também é um sinal de amor. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('A distância não diminui o amor. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('É com amor que quero encher meus dias! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Seja um rebelde, siga o caminho do amor. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Em um mar de ódio, seja uma gota contaminada pelo amor! ❤✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é a única flor que desabrocha sem a ajuda das estações. \uD83C\uDF39\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ser amor a qualquer hora, amor de corpo inteiro! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Espalhe todo o amor que tem dentro de você! \uD83D\uDE18\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('AMOR: força que nos movimenta, caminho que nos orienta! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Liberdade na vida é ter um amor pra se prender! ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('É nas miudezas que estão as maiores declarações de amor. \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Da paz e do amor eu quero muito mais! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Um coração feliz é o resultado inevitável de um coração ardente de amor. ❤❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor não se compra, nem se merece, o amor se ganha de graça e o coração recebe. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Cada dia eu sei mais sobre o amor e percebo que ele vai além das palavras ditas, por mais que elas traduzam o que se sente de verdade. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Um amor vai curando o outro, até que a gente encontre um que não machuque, que não maltrate, e que não deixe o próximo existir. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor está por trás e dentro de tudo. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Por fim, que sejamos sempre amor. ❤️\u200D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar é dizer sempre \"EU TE AMO\" sem nunca precisar dizer! \uD83D\uDE18\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é uma escolha.\uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Nunca deixe seu amor ir. Vá atrás dele e seja feliz!❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é olharmos juntos na mesma direção.❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Não desista de amar, só desista de procurar amor onde não existe! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Loucura é fugir do amor só porque alguém não soube te amar.✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando a alegria de outra pessoa for a tua, tu entenderás o sentido de amar! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ao menor sinal de amor, retribua! ❤❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('É na cruz que eu vejo o maior ato de amor que alguém fez por mim.\uD83D\uDE4F\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é um grito no vácuo! \uD83D\uDCAD\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Há amores que por mais bonitos que sejam não nasceram para serem vivos, mas para serem sentidos! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor tudo sobre, tudo crê, tudo espera, tudo suporta! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor não é palavra, é gesto!!! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Do amor que damos, só o amor herdamos!❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Em terra de cegos, quem tem amor abre caminho! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amores passam, amores ficam. Grandes amores pacificam!! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Eu quero poesia na minha vida. E aventura. E amor. Acima de tudo, amor. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é o objetivo, a vida é a viagem. ❤❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Estado de amor é o maior território que existe! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Não é a toa que amar tem ar no verbo. Respire!!! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Nada prepara ou ensina com tanto poder como o amor. O amor não constrange, atrai! \uD83D\uDC96  (Romanos 12:3)\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar é um verbo que nos sustenta! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é continuidade‼ \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('A tua presença me conforta como se fosse um calmante, bem... Acho que é amor! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor lança fora todo o medo! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é o resultado da soma de nós dois! \uD83D\uDC6B\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ame sem medo! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('É culpa desse amor eu ficar sorrindo à toa por aí! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor não troca a verdade de estar junto hoje pela ilusão de uma certeza amanhã! ✨ (Tati Rossi)\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amor é querer estar e mesmo nas dificuldades não ir embora, porque amor é assim, é conforto, é segurança! \uD83D\uDC69\u200D❤️\u200D\uD83D\uDC68\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Só pra constar nos registros por aí….O meu amor é seu! ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Nosso amor é a constância do meu sorriso. Te amar é isso: sempre ter motivos para ser feliz! \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Em cada pedaço meu há um pedaço de você!?? Porque amor é isso: misturar-se um ao outro, se perder para se encontrar! \uD83D\uDC6B\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O meu amor por você me faz mais forte, mais mulher, mais feliz! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Adoro o jeito como você rompe cada barreira do meu coração e me faz te amar, todos os dias, um pouco mais❗️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é a estrada que me leva até você! ? É o nosso encontro, é a nossa fuga, é a minha cura, é o que me faz te querer com reticências, sem fim‼️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Com Deus à frente do nosso amor ❤️, quem poderá atrapalhar nossa felicidade❓\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O significado da palavra amor tem o seu nome. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor que existe dentro de mim tem a medida certa que o seu coração precisa! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Eu me apaixonei por suas qualidades e defeitos. Não teve jeito! \uD83D\uDE0D\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar não é olhar um para o outro, é olhar juntos na mesma direção \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Tem amor que nasceu para durar uma vida inteira, tipo o meu por você ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Mas é que o amor, meu caro, faz a gente ver um arco-íris em céu nublado ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar de verdade não é gritar para o mundo inteiro ouvir, é fazer com que a outra pessoa se sinta, que de todo mundo, você só precisa dela! ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Ela quer alguém pra aamar da maneira certa ❤️\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O verdadeiro amor nunca se desgasta, quando mais se dá, mas se tem! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor se nutre pelos pequenos gestos. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Faça o amor ser fácil! \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Esse amor juro regar todos os dias. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Quando se ama, você sabe, simplesmente sabe.. ❤\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('E o amor que você der, te devolvo com juros. \uD83D\uDC6B\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Fuja para perto de todo amor possível! \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Nada é pequeno no amor! \uD83D\uDE18\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Não economize amor, mas evite desperdícios. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Amar é mudar a alma de casa. ✨\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Deixe o seu sorriso aberto que é por ele que o amor prefere entrar. \uD83D\uDC96\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('O amor é um exercício de confiança. \uD83D\uDC95\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Você merece o tipo de amor que daria a outra pessoa. \uD83E\uDD70\t','Anônimo','Frases de Amor')\t\t\n" +
                ",('Os mares não vivem só de calmaria, quem dirá o amor... \uD83D\uDC95\t','Anônimo','Frases de Amor');\t";

        return frases;
    }
    public static String carregarFrases9(){
        String frase ="INSERT INTO frases (texto,autor,categoria) VALUES\n" +
                "('Negando os padrões e sendo cada dia mais feliz!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Coisas boas acontecem para quem sorri.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Ás vezes sinto saudade de mim...\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O que eu tanto sinto e vivo não cabe nessa legenda.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Vim respirar, vim aprender a nadar no mar e a mergulhar na vida.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Colecionando histórias e eternizando momentos!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Eu sou o melhor de mim!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('A minha felicidade não cabe dentro de mim.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Não deixe de acreditar em você, menina… Você vai longe!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('A vida reflete aquilo que você sente. Sinta gratidão!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Que eu saiba ser luz quando tudo ao meu redor for escuridão.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O segredo da felicidade é manter a felicidade em segredo.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Faça cada instante da sua vida valer a pena!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Tem que ter fé para as coisas se transformarem.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Os bons momentos não são só registrados na memória.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Se o amor é a resposta, qual a pergunta?\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Não se segure em quem não te segura.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Vamos ser feliz sem pressa. Quem corre, tropeça.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Aceite-se em ser simples. Menos é mais!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Esperança é perceber que, por pior que seja aquele dia, haverá outro totalmente inesperado.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Acredite! Sua hora vai chegar.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Ame-se, aceite-se, liberte-se.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Você fica tão bonita quando se veste de si.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Se faça um favor: se olhe com amor, cuide de você com carinho.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Treine sua mente para ver o lado bom de qualquer situação.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Não sei se viro menina, se viro mulher ou se viro todas.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Quando a gente se completa sozinha, é mais fácil de transbordar!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O meu sorriso reverbera liberdade!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Seja amor, se deixe amar e se ame em primeiro lugar.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Não mude para os outros. Mude apenas para você!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Movida pela liberdade de ser quem eu sou.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Coloque o sorriso no rosto para esse novo dia.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O que tem pra hoje? Sorrir e agradecer!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Aproveite cada minuto, porque o tempo não volta.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Não há dias cinzentos para quem sonha colorido.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Acorde, mas continue sonhando!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Desejo para o teu dia todo amor que estiver em sua caminhada.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Eu tenho o poder de fazer esse dia um bom dia.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Amanhã cedo acorde sendo novamente grata pela vida!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Que hoje seja um novo começo para você!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Exercite mente positiva, vida positiva. Hoje é um novo dia!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Sempre que o sol nasce, surge uma nova esperança.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Sorrio, agradeço e vivo!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Que a felicidade sempre me abrace!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('O sorriso é o silêncio mais bonito que existe.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Sempre batalhando para sorrir cada vez mais.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Sorrio para a vida porque ela sorri para mim.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Decore sua alma com sorrisos sinceros.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Sorrir não gasta eletricidade e gera muito mais luz.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Você é a única pessoa responsável pela sua felicidade, sorria!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Seja luz! Ilumine todos os dias seu caminho.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Um sorriso no rosto pode mudar tudo, acredite!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Que nós continuemos sorrindo em todas as fases da nossa vida!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Faça e refaça aquilo que te deixa feliz.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Pare e agradeça a todas felicidades que aparecem no seu caminho!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Veja sempre o lado bom de todas as coisas.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Encha a tua vida com alegrias, ela é curta demais para agonias.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Quando a energia é boa, o universo não falha.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Sempre grata por a vida sorrir para mim!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Minha felicidade no olhar é de quem sonha com amor.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Me encanta tudo aquilo que me tira da realidade.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Espalhe coisa boa, porque a gente merece e o mundo precisa!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Você nunca vai ser feliz se não se permitir!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Permita que um sorriso floreei seu rosto.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Vista seu melhor sorriso e se jogue no mundo!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Da minha felicidade só quem sabe sou eu!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Mesmo que não haja motivos, eu vou continuar sorrindo...\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Para os dias bons: sorrisos. Para os dias ruins: paciência. Para todos os dias: fé!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Você me faz sonhar acordada e sorrir à toa.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Que sorte a minha ter você sempre ao meu lado!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Sou mais feliz agora tendo você comigo.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Eu daria meu melhor só para te ver sorrir.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Os nossos sorrisos fazemos juntos!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Ele me rouba sorrisos todos os dias.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Estar com você é a melhor parte do dia!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Te desejo sempre brilho nos olhos e sorriso na boca.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Meu amor e minha alegria de todas as vidas!\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('Junto de você a minha felicidade sempre estará completa.\t','\tDesconhecido \t','\tFrases para fotos sorrindo\t')\n" +
                ",('A cada rolê que a gente dá, tem muita história pra contar.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Aquela que sempre fecha comigo!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Nascemos para essa amizade acontecer!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Aquele tipo de amizade que so´ a gente entende.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Só posso te agradecer por tanto amor, amiga!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Presente que Deus me deu!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Não seria nada sem a amizade delas!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Que todos os dias sejam ensolarados dentro de nós!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Não precisa ter o mesmo sangue para serem irmãs!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('São os amigos que fazem a vida ser maravilhosa.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Com você onde for, quando for, para o que for.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Ela sempre me faz passar vergonha, mas não vivo sem!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Você é minha melhor versão e eu a sua!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Crescemos juntas e nos tornamos melhores amigas!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Eu amo ser sua amiga e ter você na minha vida.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Uma amizade não tem que ser perfeita, mas sim verdadeira.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Amiga, te escolhi para compartilhar tudo de bom que tenho guardado em mim!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('A parceria é forte, a curtição é louca e a amizade é eterna.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Nossa amizade é uma boa e longa história!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Que a gente sempre seja assim, do nosso jeitinho!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Os nossos sorrisos iluminam como o sol!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('A nossa amizade é maravilhosa igual aos dias ensolarados.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Chorar rios e sorrir mares é só com você, amiga!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Na calmaria do mar banhamos nossa amizade!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Feito girassóis, buscamos sempre o sol.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Nossa amizade é forte como as ondas do mar.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Juntas brilhamos mais que os raios do sol!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Individualmente somos gotas, juntas um oceano!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Há mares que vem para o bem.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Os meus melhores risos são com vocês!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('As coisas leves da vida nos dão força pra viver!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Sobre pessoas que a gente aprende a amar acima de qualquer coisa.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('O bom da vida é encontrar amigos que fazem de um pequeno instante, grandes momentos!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Sempre construindo momentos de felicidade!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Com vocês a caminhada ficou muito mais divertida e cheia de histórias para contar...\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Nossa parceria é forte e nada vai abalar!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('A nossa conexão é coisa de outro mundo, ninguém entende...\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Nossa amizade é com muito amor misturado com loucura.\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Amizades que surgem do nada, acabam se tornando tudo!\t','\tDesconhecido \t','\tFrases para foto com amiga\t')\n" +
                ",('Seja você, por você. Para você.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Quem me ve assim, não imagina da batalha que me libertei.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Amar é bom, mas se amar é maravilhoso.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Estou sempre na minha melhor fase.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O melhor de mim, dedico a mim mesma!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Linda é a mulher que bem se quer!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Seja boa com você mesma.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Cada um é bonito do seu próprio jeito!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Seja como for, vá com a alma.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O que não for leve, que a vida leve...\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Plantei amor em mim, para que eu pudesse florescer.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Sempre aprendendo o dom de recomeçar.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Que a gente saiba florir onde a vida nos plantar.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Gratidão é quando a alma diz obrigada.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Em um mundo de comparações, amar-se é revolucionário.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Sou minha poesia favorita.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Sendo sempre feliz, nada menos que isso.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Bem “se” queira.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Inteira demais para ser uma metade.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Seja quem você deseja ter por perto.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('A mete é ser melhor que ontem!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Em paz comigo mesma, nada mais me abala...\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Em constante transformação...\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Se importando menos e vivendo mais!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Acreditando, sonhando e conquistando.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O que te define é a sua essência, não a opinião alheia!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Sempre seguindo o meu caminho, meus sonhos.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Procuro sempre fazer o meu melhor, pois é isso que me define!\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('Vivendo feliz e livre de padrões.\t','\tDesconhecido \t','\tStatus para Fotos\t')\n" +
                ",('O acalento do mar é o meu amar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Não me leve mal, me leve ao litoral!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('A calmaria do mar me faz levitar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Em caso de dúvida, reme!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Nasci para habitar o mar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Perto do mar eu sou mais feliz.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Me cerco dessa energia que o azul do mar traz.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Pés na areia, coração no mar…\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Ela é mar, sol e luz.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Que seja imenso e belo como o mar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Deixei o mar me levar para longe de todo o mal.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Água salgada, alma lavada.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Permita a brisa te levar...\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Salgue os pés para adoçar a vidar!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('O melhor calmante do mundo não é água com açúcar, é água com sal!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Explore a vida como a brisa explora o mar!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('A vida melhora ao colocar o pé na praia!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Respirar a brisa do mar para aliviar a alma.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Sol e praia é sempre a minha alegria.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('A beleza do mar você não ver, você sente!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Mar calmo nunca fez bom marinheiro.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Sentindo a brisa do mar… ah, a praia é meu lugar!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Uma necessidade chamada mar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Um céu, um sol e um mar…\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('O cheiro da praia acalma a alma…\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Não ha nada que me acalme mais do que a brisa do mar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('É no azul do mar que me sinto em casa.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Felicidade é sentir a brisa do mar…\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Céu, mar e alguém que amo é tudo que preciso.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Há mares que vem para o bem.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Deixa o sol entrar em você.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Quem é do mar não enjoa.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Quanto mais salgada a água, mais doce a vida!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Eu sou do sol, do mar, da praia.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('A praia é a minha praia.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Que os dias sejam de sol, praia e muita alegria.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Praia é terapia!\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Quero poder viver a vida toda na areia...\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('O gostoso da praia é apreciar as ondas do mar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Mar doce lar.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Always summer vibes.\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('Me deixa morar na profundeza do mar...\t','\tDesconhecido \t','\tLegendas para foto na praia\t')\n" +
                ",('A cada rolê que a gente dá, tem muita história pra contar.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Aquela que sempre fecha comigo!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Nascemos para essa amizade acontecer!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Aquele tipo de amizade que so´ a gente entende.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Só posso te agradecer por tanto amor, amiga!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Presente que Deus me deu!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Não seria nada sem a amizade delas!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Que todos os dias sejam ensolarados dentro de nós!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Não precisa ter o mesmo sangue para serem irmãs!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('São os amigos que fazem a vida ser maravilhosa.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Com você onde for, quando for, para o que for.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Ela sempre me faz passar vergonha, mas não vivo sem!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Você é minha melhor versão e eu a sua!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Crescemos juntas e nos tornamos melhores amigas!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Eu amo ser sua amiga e ter você na minha vida.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Uma amizade não tem que ser perfeita, mas sim verdadeira.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Amiga, te escolhi para compartilhar tudo de bom que tenho guardado em mim!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('A parceria é forte, a curtição é louca e a amizade é eterna.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Nossa amizade é uma boa e longa história!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Que a gente sempre seja assim, do nosso jeitinho!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Os nossos sorrisos iluminam como o sol!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('A nossa amizade é maravilhosa igual aos dias ensolarados.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Chorar rios e sorrir mares é só com você, amiga!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Na calmaria do mar banhamos nossa amizade!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Feito girassóis, buscamos sempre o sol.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Nossa amizade é forte como as ondas do mar.\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Juntas brilhamos mais que os raios do sol!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Individualmente somos gotas, juntas um oceano!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Descer a serra é só com ela!\t','\tDesconhecido \t','\tStatus de  amizade\t')\n" +
                ",('Obrigado meu Deus por tudo!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Deus lhe deu um presente de 86.400 segundos hoje. Você usou um para dizer obrigado?\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Entre as graças que devemos à bondade de Deus, uma das maiores é a música. A música é tal qual como a recebemos: numa alma pura, qualquer música suscita sentimentos de pureza.  \t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Obrigado, Deus meu, pela graça de mais um dia. Assim, junto a você, tudo é bem mais fácil. Tudo é bem mais belo.\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('A bênção de viver é uma graça de Deus e por isso Lhe agradeço eternamente!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Agradeço ao Senhor por me dar esta vida plena de verdade e alegria. Te adoro, meu Deus!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Meu Deus, eu Te agradeço pela dádiva da vida e pela bênção de cada dia!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('O Teu amor cobre as minhas fraquezas e a Tua fidelidade é maior do que todos os obstáculos na minha vida. Obrigado, Deus!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Quando paro e penso na minha vida enxergo o quanto sou abençoado e por isso agradeço a Deus.\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Por tudo que já superei e alcancei na vida eu Te agradeço, meu Deus!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Tu sempre foste meu melhor amigo, Aquele que nunca me abandonou ou desamparou; e por tudo isso Te agradeço, meu Deus!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Eu Te agradeço, meu Deus, pois na Tua palavra encontro a força que preciso para continuar caminhando!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Mais um dia que começa é mais uma oportunidade para Te agradecer por todas as bênçãos, meu Deus!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Agradeço a Deus todos os dias porque em nenhum dia Ele me deixa só!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Esta vitória não é só minha, mas muito mais Tua, meu Deus, e por ela eu Te agradeço!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Te agradeço, meu Deus, por todas as bênçãos que já recebi e irei receber, pois sei que nunca me abandonarás!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Meu Deus, agradeço por teres me concedido mais um ano de vida abençoado por Teu amor e Tua presença!   \t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Agradeço por tudo, meu Deus, pois através do Teu amor vejo que a vida é luz e cada instante é precioso!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Agradeça a Deus não apenas com palavras, mas com gestos de amor e bondade para com seu semelhante.\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Porque Deus é meu apoio todos os dias eu Lhe agradeço a bênção da minha fé!\t','\tDesconhecido \t','\tFrases de Deus\t')\n" +
                ",('Ô sol, vê se não esquece e me ilumina.                                    \t','\t Vitor Kley\t','\tFrases de Músicas\t')\n" +
                ",('Não precisa caçar muito pra encontrar a alegria, ela às vezes tá escondida nas coisas do dia a dia.                 \t','\tKamau\t','\tFrases de Músicas\t')\n" +
                ",('Sei do meu valor e a cotação é dólar.                                     \t','\tIza\t','\tFrases de Músicas\t')\n" +
                ",('Possui a estranha mania de ter fé na vida.                                \t','\tMilton Nascimento\t','\tFrases de Músicas\t')\n" +
                ",('Todo mundo tem seu jeito singular de ser feliz, de viver e enxergar!      \t','\tLenine\t','\tFrases de Músicas\t')\n" +
                ",('O seu all star azul combina com o meu preto de cano alto.                 \t','\tCassia Eller\t','\tFrases de Músicas\t')\n" +
                ",('A nossa vida é feita mesmo para se aprender.                              \t','\tNatiruts\t','\tFrases de Músicas\t')\n" +
                ",('Cuide de quem te quer e cuide de você.                                    \t','\t Anitta\t','\tFrases de Músicas\t')\n" +
                ",('Sempre que eu pensar no meu bem, vou colorir o dia.                       \t','\t Silva\t','\tFrases de Músicas\t')\n" +
                ",('Nessa paz, eu vou. Munido de amor.                                        \t','\t Tiago Iorc\t','\tFrases de Músicas\t')\n" +
                ",('Na minha vida, na minha liberdade, quem manda sou eu.                     \t','\tLudmilla\t','\tFrases de Músicas\t')\n" +
                ",('Agora eu quero ir, pra me reconhecer de volta.                            \t','\tAnaVitória\t','\tFrases de Músicas\t')\n" +
                ",('Deixo a minha fé guiar.         \t','\t Iza\t','\tFrases de Músicas\t')\n" +
                ",('Como o mar e a tempestade, valente sempre serei.                          \t','\t Manu Gavassi\t','\tFrases de Músicas\t')\n" +
                ",('Por onde passei, deixei rastros de amor.                                  \t','\tDrik Barbosa\t','\tFrases de Músicas\t')\n" +
                ",('Não maltrate o coração, que dedicou ao seu sorriso, as suas batidas.      \t','\tNatiruts\t','\tFrases de Músicas\t')\n" +
                ",('Do nosso amor a gente é que sabe...                                       \t','\tLos Hermanos\t','\tFrases de Músicas\t')\n" +
                ",('Se a sorte lhe sorriu, por que não sorrir de volta?                       \t','\t Skank\t','\tFrases de Músicas\t')\n" +
                ",('Sorrindo à toa, só vibrando amor e paz.                                   \t','\tNatiruts\t','\tFrases de Músicas\t')\n" +
                ",('E esse teu sorriso largo é poesia...                                      \t','\tLourena\t','\tFrases de Músicas\t')\n" +
                ",('O mundo acaba hoje e eu estarei dançando.                                 \t','\t Pitty\t','\tFrases de Músicas\t')\n" +
                ",('Pra ela, não tem tempo ruim.    \t','\tLiniker e os Caramelows\t','\tFrases de Músicas\t')\n" +
                ",('O seu sorriso vale mais que um diamante.                                  \t','\tCharlie Brown Jr.\t','\tFrases de Músicas\t')\n" +
                ",('Luz lá do céu me visitou e fez morada em mim.                             \t','\t Iza\t','\tFrases de Músicas\t')\n" +
                ",('Sozinha, com meus sonhos, que não param de crescer.                       \t','\t Manu Gavassi\t','\tFrases de Músicas\t')\n" +
                ",('Chegou o dia que o meu coração tá daquele jeito...                        \t','\tIvete Sangalo\t','\tFrases de Músicas\t')\n" +
                ",('Sorri com força, sorri com vontade, sorri pra vida.                       \t','\t Jair Oliveira\t','\tFrases de Músicas\t')\n" +
                ",('Meu riso e tão feliz contigo.   \t','\tTribalistas\t','\tFrases de Músicas\t')\n" +
                ",('Falta teu sorriso em meu olhar. \t','\t Exaltasamba\t','\tFrases de Músicas\t')\n" +
                ",('Eu só quero o leve da vida.     \t','\tAnaVitória\t','\tFrases de Músicas\t')\n" +
                ",('A sorrir eu pretendo levar a vida.                                        \t','\t Cartola\t','\tFrases de Músicas\t')\n" +
                ",('Experimente pensar um pouquinho na gente.                                 \t','\t Cidade Negra\t','\tFrases de Músicas\t')\n" +
                ",('Livre é o que ela mais queria ser.                                        \t','\t Tiago Iorc\t','\tFrases de Músicas\t')\n" +
                ",('Hoje sei ser, o que a terra veio me ensinar.                              \t','\tNatiruts\t','\tFrases de Músicas\t')\n" +
                ",('O amor é o que te faz ser mais feliz.                                     \t','\tManeva\t','\tFrases de Músicas\t')\n" +
                ",('Pra conseguir subir tem que ser leve.                                     \t','\tLudmilla\t','\tFrases de Músicas\t')\n" +
                ",('Nada brilha mais que a vibe da tua alma.                                  \t','\tForfun\t','\tFrases de Músicas\t')\n" +
                ",('Eu sou amor da cabeça aos pés.  \t','\tNovos Baianos\t','\tFrases de Músicas\t')\n" +
                ",('Verdadeiros amigos me iluminam nessa estrada da vida.                     \t','\tFlora Matos\t','\tFrases de Músicas\t')\n" +
                ",('Alguns acreditam em anjos, eu acredito em amizade.                        \t','\tProjota\t','\tFrases de Músicas\t')\n" +
                ",('Foi Deus quem te escolheu pra ser o melhor amigo que eu pudesse ter!      \t','\tLuan Santana\t','\tFrases de Músicas\t')\n" +
                ",('Meus amigos são tudo pra mim, tamo junto até o fim.                       \t','\t Emicida\t','\tFrases de Músicas\t')\n" +
                ",('É tão bom te acompanhar!        \t','\tAnavitória\t','\tFrases de Músicas\t')\n" +
                ",('Valeu por você existir, amiga.  \t','\tFundo de Quintal\t','\tFrases de Músicas\t')\n" +
                ",('Quem tem amigos, não fica só!   \t','\tMelim\t','\tFrases de Músicas\t')\n" +
                ",('Pensando bem, eu gosto mesmo de você.                                     \t','\tVictor & Leo\t','\tFrases de Músicas\t')\n" +
                ",('Amigo, você é o mais certo das horas incertas.                            \t','\tRoberto Carlos\t','\tFrases de Músicas\t')\n" +
                ",('Nada é igual a ela e eu!        \t','\tCaetano Veloso\t','\tFrases de Músicas\t')\n" +
                ",('Há flores em tudo que eu vejo   \t','\tTitãs\t','\tFrases de Músicas\t')\n" +
                ",('Cabeça erguida, pés no chão, marrenta, extrovertida!                      \t','\tDani Russo\t','\tFrases de Músicas\t')\n" +
                ",('Eu vou com a pureza na alma     \t','\t1Kilo\t','\tFrases de Músicas\t')\n" +
                ",('Quer saber o sentido da vida? Pra frente                                  \t','\tEmicida\t','\tFrases de Músicas\t')\n" +
                ",('Faço de mim casa de sentimentos bons onde a má fé não faz morada          \t','\tMarcelo Jeneci\t','\tFrases de Músicas\t')\n" +
                ",('Em alguns instantes sou pequinina e também gigante                        \t','\tMarisa Monte\t','\tFrases de Músicas\t')\n" +
                ",('Esse teu sorriso largo é poesia e alegria!                                \t','\tRap Box\t','\tFrases de Músicas\t')\n" +
                ",('É saber se sentir infinito      \t','\t Ana Vilela\t','\tFrases de Músicas\t')\n" +
                ",('Felicidade é só questão de ser  \t','\tMarcelo Jeneci\t','\tFrases de Músicas\t')\n" +
                ",('Vida boa, vida louca, vida breve!                                         \t','\tEstação 77\t','\tFrases de Músicas\t')\n" +
                ",('Ô sol, vê se não esquece e me ilumina...                                  \t','\tVitor Kley\t','\tFrases de Músicas\t')\n" +
                ",('Há sempre alguma coisa para celebrar                                      \t','\tVanessa da Mata\t','\tFrases de Músicas\t')\n" +
                ",('Não sou eu quem me navega, quem me navega é o mar!                        \t','\tPaulinho da Viola\t','\tFrases de Músicas\t')\n" +
                ",('Eu sou a maré viva, se entrar vai se afogar                               \t','\tFresno\t','\tFrases de Músicas\t')\n" +
                ",('Pé na areia, água de coco, beira do mar                                   \t','\tDiogo Nogueira\t','\tFrases de Músicas\t')\n" +
                ",('O mar serenou quando ela pisou na areia                                   \t','\tClara Nunes\t','\tFrases de Músicas\t')\n" +
                ",('Um pôr do sol na praia, um pôr do sol à beira                             \t','\tmarLudmilla\t','\tFrases de Músicas\t')\n" +
                ",('Felicidade, paz e harmonia      \t','\t Hori\t','\tFrases de Músicas\t')\n" +
                ",('Livre, nasci como a brisa       \t','\tAgnaldo Rayol\t','\tFrases de Músicas\t')\n" +
                ",('Alguns acreditam em anjos, eu acredito em amizade                         \t','\tProjota\t','\tFrases de Músicas\t')\n" +
                ",('Gaste energia com aquilo que te edifica                                   \t','\tKell Smith\t','\tFrases de Músicas\t')\n" +
                ",('Quando a gente gosta é claro que a gente cuida                            \t','\tCaetano Veloso\t','\tFrases de Músicas\t')\n" +
                ",('Eu quero aquela vida que a gente inventa antes de dormir                  \t','\tKell Smith\t','\tFrases de Músicas\t')\n" +
                ",('Só de coisas boas eu vivo...    \t','\tSaulo\t','\tFrases de Músicas\t')\n" +
                ",('Eles querem nossa paz, mas temos Deus a nossa volta                       \t','\t Planta e Raíz\t','\tFrases de Músicas\t')\n" +
                ",('Cuide de quem te quer e cuide de você, que fica tudo bem!                 \t','\tAnitta\t','\tFrases de Músicas\t')\n" +
                ",('Toda positividade eu desejo a você                                        \t','\t Chorão\t','\tFrases de Músicas\t')\n" +
                ",('Não há razões para não ser feliz\t','\tLuan Santana\t','\tFrases de Músicas\t')\n" +
                ",('Só o que é bom dura tempo o bastante pra se tornar inesquecível           \t','\tCharlie Brown Jr.\t','\tFrases de Músicas\t')\n" +
                ",('Eu quero é você, eu amo só você… O resto tanto faz!                       \t','\t Luan Santana\t','\tFrases de Músicas\t')\n" +
                ",('Só o amor constrói pontes indestrutíveis                                  \t','\tCharlie Brown Jr.\t','\tFrases de Músicas\t')\n" +
                ",('Estranho seria se eu não me apaixonasse por você                          \t','\t Cássia Eller\t','\tFrases de Músicas\t')\n" +
                ",('Meu riso é tão feliz contigo. O meu melhor amigo é o meu amor             \t','\t Tribalistas\t','\tFrases de Músicas\t')\n" +
                ",('É seu sorriso que mistura com seu cheiro natural, isso é que te faz especial                                        \t','\t Fernando e Sorocaba\t','\tFrases de Músicas\t')\n" +
                ",('Agora fica comigo e vê se não desgruda de mim                             \t','\t Cazuza\t','\tFrases de Músicas\t')\n" +
                ",('E no meio de tanta gente eu encontrei você                                \t','\tMarisa Monte\t','\tFrases de Músicas\t')\n" +
                ",('Assim que o amor entrou no meio, o meio virou amor                        \t','\tMarcelo Camelo\t','\tFrases de Músicas\t')\n" +
                ",('Que o nosso amor pra sempre viva, minha dádiva                            \t','\tCássia Eller\t','\tFrases de Músicas\t')\n" +
                ",('Toda positividade eu desejo a você pois precisamos disso nos dias de luta \t','\t Charlie Brown Jr.\t','\tFrases de Músicas\t')\n" +
                ",('Só eu sei o que eu passei e o que eu vou ter que passar                   \t','\tDina Di\t','\tFrases de Músicas\t')\n" +
                ",('Quem sabe um dia, por descuido ou poesia, você goste de ficar             \t','\t Chico Buarque\t','\tFrases de Músicas\t')\n" +
                ",('Nada do que eu fui me veste agora                                         \t','\tMaria Gadú\t','\tFrases de Músicas\t')\n" +
                ",('A gente segue a direção que o nosso próprio coração mandar                \t','\t Marcelo Camelo\t','\tFrases de Músicas\t')\n" +
                ",('Deus me fez assim, dona de mim  \t','\tIZA\t','\tFrases de Músicas\t')\n" +
                ",('Se eu peco, é na vontade de ter um amor de verdade                        \t','\tLos Hermanos\t','\tFrases de Músicas\t')\n" +
                ",('Pra ela, não tem tempo ruim     \t','\tLiniker e os Caramelows\t','\tFrases de Músicas\t')\n" +
                ",('Livre é o que ela mais queria ser                                         \t','\tTiago Iorc\t','\tFrases de Músicas\t')\n" +
                ",('A vida vem em ondas como um mar…\t','\tLulu Santos\t','\tFrases de Músicas\t')\n" +
                ",('Ser mais forte por acreditar na alegria de viver                          \t','\t Tiago Iorc\t','\tFrases de Músicas\t')\n" +
                ",('Ser leve é bem melhor, celebre a vida e só                                \t','\tLagum\t','\tFrases de Músicas\t')\n" +
                ",('É melhor ser alegre que ser triste. Alegria é a melhor coisa que existe…  \t','\tVinicius de Moraes\t','\tFrases de Músicas\t')\n" +
                ",('Ame tudo que puder, seja o que for, venha o que vier                      \t','\tTiago Iorc\t','\tFrases de Músicas\t')\n" +
                ",('Não precisa caçar muito pra encontrar a alegria, ela às vezes tá escondida nas coisas do dia a dia                  \t','\tKamau\t','\tFrases de Músicas\t')\n" +
                ",('Hoje vamos desejar o bem sem olhar a quem, acabar com a solidão no ato de estender a mão                            \t','\tMelim\t','\tFrases de Músicas\t')\n" +
                ",('O dia vai raiar pra gente se inventar de novo                             \t','\t Cícero\t','\tFrases de Músicas\t')\n" +
                ",('Cada um de nós compõe a sua história. Cada ser em si carrega o dom de ser capaz, de ser feliz                       \t','\t Almir Sater\t','\tFrases de Músicas\t')\n" +
                ",('Hoje vamos desejar bem, sem olhar a quem!                                 \t','\t Melim\t','\tFrases de Músicas\t')\n" +
                ",('Brilhando em vida, sorrindo à toa, só vibrando amor e paz...              \t','\tNatiruts\t','\tFrases de Músicas\t')\n" +
                ",('Só levo a certeza de que muito pouco eu sei ou nada sei...                \t','\t Anavitória\t','\tFrases de Músicas\t')\n" +
                ",('A vida vem em ondas, como um mar\t','\tLulu Santos\t','\tFrases de Músicas\t')\n" +
                ",('Gosto de ser sozinho, livre pra voar...                                   \t','\tExaltasamba\t','\tFrases de Músicas\t')\n" +
                ",('Abra a janela e veja que eu sou o sol                                     \t','\tIvete Sangalo\t','\tFrases de Músicas\t')\n" +
                ",('Estou de bem com o meu viver    \t','\tNatiruts\t','\tFrases de Músicas\t')\n" +
                ",('Agora eu quero ir pra me reconhecer de volta                              \t','\tAnavitória\t','\tFrases de Músicas\t')\n" +
                ",('Vou voltar pro passado e escrever tudo de novo                            \t','\tMatuê\t','\tFrases de Músicas\t')\n" +
                ",('Cuida bem da tua forma de ser   \t','\tTulipa Ruiz\t','\tFrases de Músicas\t')\n" +
                ",('A moça de sorriso aberto        \t','\tMaria Gadú\t','\tFrases de Músicas\t')\n" +
                ",('Linda feito manhã, feito chá de hortelã                                   \t','\tTiago Iorc\t','\tFrases de Músicas\t')\n" +
                ",('Todo mundo tem seu jeito singular, de ser feliz, de viver e de enxergar   \t','\tGilberto Gil\t','\tFrases de Músicas\t')\n" +
                ",('Cada um sabe a dor e a delícia de ser o que é                             \t','\t Caetano Veloso\t','\tFrases de Músicas\t')\n" +
                ",('Cuide de quem te quer e cuide de você                                     \t','\tAnitta\t','\tFrases de Músicas\t')\n" +
                ",('Eu vou sair por aí afora, atrás da aurora...                              \t','\tChico Buarque\t','\tFrases de Músicas\t')\n" +
                ",('Eu quero ficar perto de tudo que acho certo, até o dia em que eu mudar de opinião                                   \t','\tDanni Carlos\t','\tFrases de Músicas\t')\n" +
                ",('Mesmo triste eu estava feliz    \t','\tMarisa Monte\t','\tFrases de Músicas\t')\n" +
                ",('Viver é melhor que sonhar       \t','\tElis Regina\t','\tFrases de Músicas\t');";

        return frase;
    }
    }
