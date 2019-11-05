package Matematica;
/*
Contida no	pacote	Matematica.
Contém	os	seguintes	atributos	privados	do	tipo	float:	ladoH e	ladoV.
Contém	os	seguintes	métodos	públicos:
definir_lados:	atribui	dois	valores fornecidos	como	parâmetros aos	atributos ladoH e	ladoV.
area:	retorna	a	área	de	um	retângulo	cujas	medidas dos lados	são dadas	por	ladoH e	ladoV.
perimetro:	retorna	o	perímetro	de	um	retângulo cujas	medidas	dos	lados	são	dadas	por	ladoH e	ladoV.
Possui	a	seguinte invariante: as	medidas	dos	lados	são	positivas.

 */


public class Retangulo {

    private float ladoH, ladoV;

    public Retangulo(float ladoH, float ladoV){
        this.ladoH = Math.abs(ladoH);
        this.ladoV = Math.abs(ladoV);

    }

    public float area(){
        return ladoH * ladoV;
    }

    public float perimetro(){
        return (ladoV + ladoH) * 2;
    }



}
