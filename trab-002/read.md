Programação	Orientada	a	Objetos	- Trabalho	2

Acrescente	as	seguintes classes ao	projeto	organizado nos	pacotes	Matematica	e	
Especialista	que	contêm,	respectivamente,	as	classes	Circulo	e	Arquiteto,	
estudadas	em	aula:

1. Classe	Retangulo
    1. Contida no	pacote	Matematica.
    2. Contém	os	seguintes	atributos	privados	do	tipo	float:	ladoH e	
    ladoV.
    3. Contém	os	seguintes	métodos	públicos:
        1. definir_lados:	atribui	dois	valores fornecidos	como	
        parâmetros aos	atributos ladoH e	ladoV.
        2. area:	retorna	a	área	de	um	retângulo	cujas	medidas dos lados	
        são dadas	por	ladoH e	ladoV.
        3. perimetro:	retorna	o	perímetro	de	um	retângulo cujas	
        medidas	dos	lados	são	dadas	por	ladoH e	ladoV.
    4. Possui	a	seguinte invariante: as	medidas	dos	lados	são	positivas.
2. Classe	EngenheiroCivil
    1. Contida no	pacote	Especialista.
    2. Contém	o	método	exibir_dados_pessoais de	forma	análoga	à	
        classe	Arquiteto.
    3. Contém	o	método	main com	os	seguintes	passos:
        1. Chama	o	método	exibir_dados_pessoais.
        2. Chama	o	método	definir_lados da	classe	Retangulo	com	os	
        'valores	4.7	e	8.2	como	parâmetros.
        3. Chama	os	métodos	area e	perimetro da	classe	Retangulo e	
            imprime	os	resultados	dessas	chamadas.