fun main() {


	//fun simboliza função
	//Variaveis em Kotlin.

	//Val simboliza que não podemos mais assinalar outro valor a essa variavel, como um const do JavaScript


	//Retorna o valor máximo de uma variavel do tipo inteiro
	val maxIntegerValue: Int = Int.MAX_VALUE;


	//Retorna o valor mínimo de uma variavel do tipo inteiro
	val minInteger: Int = Int.MIN_VALUE;


	print("Valor maximo para numeros inteiros : $maxIntegerValue \nValor minimo para numeros inteiros:  $minInteger");

	//Output : 2147483647 && -2147483647


	//Valor máximo que um dado do tipo byte pode armazenar

	val maxByteValue: Byte = Byte.MAX_VALUE;

	//Valor mínimo que um dado do tipo byte pode armazenar

	val minByteValue: Byte = Byte.MIN_VALUE;

	print("\nValor maximo para dados do tipo Byte: $maxByteValue \nValor minimo para dados do tipo Byte $minByteValue")


	//Output : Valor máximo  : 127 Valor mínimo : -128.


	val maxShortValue: Short = Short.MAX_VALUE;

	val minShortValue: Short = Short.MIN_VALUE;


	print("\nValor maximo para dados do tipo short  $maxShortValue \nValor minimo para dados do tipo short $minShortValue");

	//Output : 32767 && -32768

	val maxLongValue: Long = Long.MAX_VALUE;

	val minLongValue: Long = Long.MIN_VALUE;


	print("\nValor maximo para dados do tipo Long  $maxLongValue \nValor minimo para dados do tipo Long $minLongValue");

	//Output: 9223372036854775807  && -9223372036854775807 

	//Ponto flutuante.
	
	//O Kotlin considera como Double, mesmo ao declarar como Float.
	val myNumber = 3.42;
	
	//Agora reconhece como float.
	val myNumber2 = 3.4f;

	//Double tem mais precisão no cálculo.
	
	
	print("Double : $myNumber \nFloat : $myNumber2")
	
	//Char e Boolean --------------------------------
	
	val booleanValue = true;
	val charValue : Char = 'F';
	
	print("\nChar value : $charValue \nBoolean value : $booleanValue");


}
