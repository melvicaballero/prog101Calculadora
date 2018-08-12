
public class Calculadora {

	public int addWithDelim(String cad)
	{
		if (cad=="") {
			return 0;
		}
		int suma=0;
		String[] datos=cad.split(",");
		for(int i=0;i<datos.length;i++)
		{
			int numero=Integer.parseInt(datos[i]);
		suma+=numero;
		}
		return suma;
	}
}
