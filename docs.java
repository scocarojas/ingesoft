package DOCS;

public class Documentos
{
	protected String formato;
	protected String titulo;

	public void setFormato(String formato)
	{
		this.formato=formato;
	}

	public String getFormato()
	{
		return this.formato;
	}

	public void setTitulo(String titulo)
	{
		this.titulo=titulo;
	}

	public String getTitulo()
	{
		return this.titulo
	}
}

public class Tesis
{
	protected int idTesis;
	protected Estudiantes[] autores;
	protected Profesores[] directores;
	protected String titulo;
	protected Documento contenido;
	protected int nota;
	protected int anio;

	public void setIdTesis(int idTesis)
	{
		this.idTesis=idTesis;
	}

	public int getIdTesis()
	{
		return this.idTesis;
	}

	public void setAutores(Estudiantes[] autores)
	{
		for(int i=0; i<autores.length; i=i+1)
		{
			this.autores[i]=autores[i];
		}
	}

	public Estudiantes[] getAutores()
	{
		return this.autores;
	}

	public void SetDirectores(Profesores[] directores)
	{
		for(int i=0; i<directores.length; i=i+1)
		{
			this.directores[i]=directores[i];
		}
	}

	public Profesores[] getDirectores()
	{
		return this.directores;
	}

	public void setTitulo(String titulo)
	{
		this.titulo=titulo;
	}

	public String getTitulo()
	{
		return this.titulo
	}

	public void setContenido(Documento contenido)
	{
		this.contenido=contenido;
	}

	public Documento getContenido()
	{
		return this.contenido;
	}

	public void setNota(int nota)
	{
		this.nota=nota;
	}

	public int getNota()
	{
		return this.nota;
	}

	public void setAnio(int anio)
	{
		this.anio=anio;
	}

	public int getAnio()
	{
		return this.anio;
	}	
}
































