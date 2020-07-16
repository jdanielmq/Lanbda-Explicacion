package cl.curso.desarrollo.prueba;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionTest funcion = () -> System.out.println("Hola mundo otra forma");
			
		LambdaTest objeto = new LambdaTest();
		
		objeto.miMetodo(funcion);

	}
	
	public void miMetodo(FunctionTest parametro) {
		parametro.Saludar();
	}

}
