# cadastro.kotlin

• O projeto é um aplicativo Android. Existem dois modos de acessá-lo, através do Android Studio ou baixando-o. Abaixo serão descritos os procedimentos para visualização do aplicativo em ambos os casos, bem como serão descritos os procedimentos de navegação e de localização dos arquivos e pastas.


• Procedimentos – Abertura do app pelo Android Studio:
-	Baixar o Android Studio através deste site: https://developer.android.com/studio.
-	Baixar este projeto e inserir sua pasta descompactada na pasta de projetos do Android Studio (AndroidStudioProjects).
-	Abrir o Android Studio.
-	Ir em “File” -> “Open” -> Escolher o projeto -> Clicar em “OK”.
-	Aguardar o projeto abrir por completo.
-	Na barra de comando na parte superior, apertar a seta verde (play), conforme ícone circulado em vermelho abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400557-caa96a80-dcf9-11eb-8a47-b192d393a116.png)</img>
-	Um emulador irá se abrir, basta aguardar a execução completa do aplicativo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400559-ced58800-dcf9-11eb-9f15-ebc47e2b8f89.png)</img> 
-	Em vez do emulador, é possível abrir o app diretamente no celular (caso seja Android). Para isso, no celular, ir em  “Configurações” -> “Sobre o dispositivo/telefone” -> Clicar em “Número da Versão” sete vezes. Após, ir em “Configurações” -> “Sistema” -> “Avançado” > “Opções do desenvolvedor” > Ativar o item “Depuração USB”. Com isso, quando o celular for conectado ao computador, ele aparecerá no Android Studio (conforme circulado abaixo), e quando o play for dado, o programa irá rodar no celular:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400564-d6952c80-dcf9-11eb-863e-0698726f3712.png)</img> 
-	Para verificar os procedimentos da navegação, ir em “Procedimentos – Navegação” mais abaixo.
<br/>

• Procedimentos – Baixar o app para acessá-lo pelo celular:
-	Baixar o arquivo aqui inserido como “cadastro.kotlin_app_baixar_celular” e descompactá-lo.
-	Conectar o celular ao computador (caso o arquivo tenha sido baixado pelo computador), habilitando a transferência de arquivos.
-	Transferir a pasta “cadastro.kotlin_app_baixar_celular” (inserida neste repositório, conforme pastas acima) para o celular, inserindo-a por exemplo na pasta de “Downloads.
-	No celular, abrir a pasta do projeto e clicar no arquivo “apk”, conforme circulado em vermelho na imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400567-e0b72b00-dcf9-11eb-8852-4f89c95949e0.png)</img> 
-	Em seguida, clicar em “Instalar”, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400571-e57bdf00-dcf9-11eb-8955-a22d5589b2f6.png)</img> 
-	Por fim, clicar em “Abrir”, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400573-ea409300-dcf9-11eb-8514-1ecb8831e390.png)</img>
<br/>

• Procedimentos – Navegação:
-	O aplicativo é composto de duas telas: uma onde constam os cadastros de anúncio e outra onde são inseridos os dados para os cadastros.
-	O aplicativo abre na tela de cadastros de anúncios, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400578-f0367400-dcf9-11eb-8f85-c0ad75f7f795.png)</img>  
-	Para cadastrar um anúncio, basta clicar em “CADASTRAR NOVO ANÚNCIO”, assim o usuário será redirecionado à tela de cadastro, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400584-f4fb2800-dcf9-11eb-8623-2c4c2660bc7c.png)</img> 
-	Importante destacar que todos os campos devem ser preenchidos, pois em caso contrário será mostrada uma mensagem de erro, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400588-f9bfdc00-dcf9-11eb-8b71-bfb0504a0ebb.png)</img> 
-	Ressalta-se que nos itens “Inserir data de início do anúncio” e “Inserir data de término do anúncio” é necessário clicar duas vezes com o botão esquerdo do mouse para que abra o visualizador de data, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400594-017f8080-dcfa-11eb-9e37-a22f8de65847.png)</img> 
-	Após todos os campos serem preenchidos, clicar em “SALVAR”. Com isso o usuário será levado novamente à primeira tela, onde será possível verificar o cadastro realizado, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400601-06443480-dcfa-11eb-8dbc-95a929c1fbb4.png)</img> 
-	No ícone de lixeira (<img>![image](https://user-images.githubusercontent.com/60974082/124400608-1825d780-dcfa-11eb-9478-b02b06846822.png)</img>) é possível excluir o cadastro realizado.
-	Na caixa “Pesquisar”, é possível filtrar anúncios por qualquer tipo de informação disponível, como nome do anúncio, nome do cliente, números, etc. Pasta digitar o que deseja ser filtrado e clicar no ícone de lupa (<img>![image](https://user-images.githubusercontent.com/60974082/124400612-1c51f500-dcfa-11eb-9535-00507a8e642a.png)</img>).
-	Para limpar a pesquisa realizada, basta apertar o botão “LIMPAR PESQUISA”.
-	A cada novo anúncio cadastrado, será criada uma nova caixa de anúncio, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400617-23790300-dcfa-11eb-9c29-1fbde7f379b1.png)</img>
<br/>

• Procedimentos – Como localizar os arquivos no Github e no Android Studio (os exemplos abaixo são do Android Studio, mas a sequência de pastas é a mesma no Github):
-	O projeto é composto de 3 tipos de arquivos: os de código, os de layout e os de apoio do layout.
-	Para acessar os arquivos de código ir em: “app” -> “src” -> “main” -> “java” -> “com.example.cadastrokotlin”. Lá constam os arquivos utilizados “Adapter”, “Cadastro”, “MainActivity” e “SecondActivity”. Neles constam todos os códigos da parte lógica.
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400619-296ee400-dcfa-11eb-9afc-ebc41bb89655.png)</img> 
-	Para acessar os arquivos de layout ir em: “app” -> “src” -> “main” -> “res” -> “layout”. Lá constam os arquivos utilizados “activity_main”, “activity_second” e “item_cadastro”. Neles constam todos os códigos da estrutura visual. 
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400621-2d9b0180-dcfa-11eb-9934-f05adcd3f6b5.png)</img>
-	Para verificar o código e o layout, clicar em “split”, conforme imagem abaixo:
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400624-325fb580-dcfa-11eb-968a-c9b0c6cfed89.png)</img> 
-	Para acessar os arquivos de apoio do layout ir em: “app” -> “src” -> “main” -> “res” -> “drawable”. Lá consta o arquivo utilizado “background”. Ir também em “.app” -> “src” -> “main” -> “res” -> “values”. Lá constam os arquivos utilizados “colors”, “dimen”, “strings” e “styles”.
<br/><img>![image](https://user-images.githubusercontent.com/60974082/124400626-37246980-dcfa-11eb-8dac-143b96763bb4.png)</img>
