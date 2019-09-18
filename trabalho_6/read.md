Implemente	as classes	representadas no	diagrama	acima,	de	acordo	com	a	
seguinte	definição	de	atributos	e	métodos.

1.Atributos de	cada	classe
    1. Disco:	um	nome (apenas uma letra - char) e uma coleção de	pastas
    2. Pasta:	um	nome	(String) e uma	coleção	de	arquivos
    3. Arquivo:	um	nome (String) e	uma	sequência	de	bytes
 
2.Métodos de	cada	classe:
    1.Disco:	criar	uma	pasta,	remover	uma	pasta,	listar	as	pastas
    2. Pasta:	inserir um	arquivo, remover	um	arquivo, listar	os nome dos arquivos, duplicar	(ie,	criar	uma cópia	de)	um	arquivo,	imprimir	o	nome da	pasta
    3. Arquivo:	abrir o	arquivo no	aplicativo	adequado,	criar	uma	cópia do arquivo,	imprimir o	nome do	arquivo
    4. Documento:	abrir
    5. Planilha:	abrir
    6. Apresentacao:	abrir
    7. Texto:	abrir
    8. Imagem:	abrir
    9. Som:	abrir
    10. Video:	abrir
 
 
Cada implementação	do	método	abrir	na	hierarquia	de	classes	com	raiz	na	classe:

   Arquivo	deve	acionar	um	aplicativo	apropriado.	Por	exemplo,	na	classe	Planilha,	
o	aplicativo	acionado	pode	ser o	Excel.	Para	fins	de	teste,	o	acionamento	de	um	
aplicativo	é	simbolizado	simplesmente	com	a	impressão do	seu	nome na	tela.	Na	
classe	Arquivo,	o	método	abrir	deve	acionar	um	aplicativo	que	permita	a	edição	
de	bytes.
A	implementação	deve	ser	testada	com	a	classe	Sistema	abaixo.