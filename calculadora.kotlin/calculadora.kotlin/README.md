# calculadora.kotlin

• O projeto é um aplicativo Android. Existem dois modos de acessá-lo, através do Android Studio ou baixando-o. Abaixo serão descritos os procedimentos para visualização do aplicativo em ambos os casos, bem como serão descritos os procedimentos de navegação e de localização dos arquivos e pastas.
<br/>

• Procedimentos – Abertura do app pelo Android Studio:
-	Baixar o Android Studio através deste site: https://developer.android.com/studio.
-	Baixar este projeto e inserir sua pasta descompactada na pasta de projetos do Android Studio (AndroidStudioProjects).
-	Abrir o Android Studio.
-	Ir em “File” -> “Open” -> Escolher o projeto -> Clicar em “OK”.
-	Aguardar o projeto abrir por completo.
-	Na barra de comando na parte superior, apertar a seta verde (play), conforme ícone circulado em vermelho abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400102-6df88080-dcf6-11eb-8a9f-9570dfb67801.png)</img>
-	Um emulador irá se abrir, basta aguardar a execução completa do aplicativo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400214-3211eb00-dcf7-11eb-9b6c-52c1a66dc0c7.png)</img>
-	Em vez do emulador, é possível abrir o app diretamente no celular (caso seja Android). Para isso, no celular, ir em  “Configurações” -> “Sobre o dispositivo/telefone” -> Clicar em “Número da Versão” sete vezes. Após, ir em “Configurações” -> “Sistema” -> “Avançado” > “Opções do desenvolvedor” > Ativar o item “Depuração USB”. Com isso, quando o celular for conectado ao computador, ele aparecerá no Android Studio (conforme circulado abaixo), e quando o play for dado, o programa irá rodar no celular:
    <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400130-bc0d8400-dcf6-11eb-99df-6444199ef5c8.png)</img>
-	Para verificar os procedimentos da navegação, ir em “Procedimentos – Navegação” mais abaixo.
<br/>

• Procedimentos – Baixar o app para acessá-lo pelo celular (sistema Android):
-	Baixar o arquivo aqui inserido como “calculadora.kotlin_app_baixar_celular” e descompactá-lo.
-	Conectar o celular ao computador (caso o arquivo tenha sido baixado pelo computador), habilitando a transferência de arquivos.
-	Transferir a pasta “calculadora.kotlin_app_baixar_celular” (inserida neste repositório, conforme pastas acima) para o celular, inserindo-a por exemplo na pasta de “Downloads.
-	No celular, abrir a pasta do projeto e clicar no arquivo “apk”, conforme circulado em vermelho na imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400131-c465bf00-dcf6-11eb-8f3a-14fbcc4dabca.png)</img>
-	Em seguida, clicar em “Instalar”, conforme imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400135-cd569080-dcf6-11eb-8494-576ca4f5992c.png)</img>
-	Por fim, clicar em “Abrir”, conforme imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400140-d47d9e80-dcf6-11eb-82fe-c082ac75d98d.png)</img>
<br/>

• Procedimentos – Navegação:
-	O aplicativo é composto de apenas uma tela, conforme imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400143-dba4ac80-dcf6-11eb-9e78-5e7ca84bd415.png)</img>
-	Ao inserir o nome do anúncio e o valor investido em seus respectivos campos, deve-se apertar o botão “CALCULAR”. Dessa forma, será feito o cálculo da projeção máxima de visualizações com base no valor investido no anúncio, e o resultado irá constar em “Projeção – Máximo de Visualizações”, bem como o nome do anúncio constará em “Anúncios”, conforme imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400145-e2cbba80-dcf6-11eb-950f-c8e7cd37f98d.png)</img>
-	Importante destacar que todos os campos devem ser preenchidos, pois em caso contrário será mostrada uma mensagem de erro, conforme imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400151-e8290500-dcf6-11eb-9c8b-c4851863f588.png)</img>
<br/>

• Procedimentos – Como localizar os arquivos no Github e no Android Studio (os exemplos abaixo são do Android Studio, mas a sequência de pastas é a mesma no Github):
-	O projeto é composto de 3 tipos de arquivos: os de código, os de layout e os de apoio do layout.
-	Para acessar os arquivos de código ir em: “app” -> “src” -> “main” -> “java” -> “com.example.calculadorakotlin”. Lá consta o arquivo utilizado “MainActivity”. Nele consta todos os códigos da parte lógica.
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400163-f24b0380-dcf6-11eb-9b4e-40558e17b7ee.png)</img>
-	Para acessar os arquivos de layout ir em: “app” -> “src” -> “main” -> “res” -> “layout”. Lá consta o arquivo utilizado “activity_main”. Nele constam todos os códigos da estrutura visual. 
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400171-f8d97b00-dcf6-11eb-9a07-9814a2c3b1bb.png)</img>
-	Para verificar o código e o layout, clicar em “split”, conforme imagem abaixo:
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400175-00991f80-dcf7-11eb-9124-0a1520d87c79.png)</img>
-	Para acessar os arquivos de apoio do layout ir em: “app” -> “src” -> “main” -> “res” -> “drawable”. Lá consta o arquivo utilizado “background”. Ir também em “.app” -> “src” -> “main” -> “res” -> “values”. Lá constam os arquivos utilizados “colors”, “dimen”, “strings” e “styles”.
   <br/><img>![image](https://user-images.githubusercontent.com/60974082/124400184-07c02d80-dcf7-11eb-896b-8bc6d25e657f.png)</img>
