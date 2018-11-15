package PROGRAMAS;

public class Posgrados
{
	protected int idPosgrado;
	protected Director director;
	protected String nombre;
	protected Cursos[] cursos;
	protected String infoFinanciera;

	public void setIdPosgrado(int idPosgrado)
	{
		this.idPosgrado=idPosgrado;
	}

	public int getIdPosgrado()
	{
		return this.idPosgrado;
	}

	public void setDirector(Director director)
	{
		this.director=director;
	}

	public Director getDirector()
	{
		return this.director;
	}

	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}

	public String getNombre()
	{
		return this.idPosgrado;
	}

	public void setCursos(Cursos[] cursos)
	{
		for(int i=0; i<cursos.length; i=i+1)
		{
			this.cursos[i]=cursos[i];
		}
	}

	public Cursos[] getCursos()
	{
		return this.cursos;
	}

	public void setInfoFinanciera(String infoFinanciera)
	{
		this.infoFinanciera=infoFinanciera;
	}

	public String getInfoFinanciera()
	{
		return this.infoFinanciera;
	}
}

public class Cursos
{
	protected int idCurso;
	protected Profesor[] profesores;
	protected String bibliografia;
	protected String contenidos;
	protected String evaluaciones;

	public void setIdCurso(int idCurso)
	{
		this.idCurso=idCurso;
	}

	public int getIdCurso()
	{
		return this.idCurso;
	}

	public void setProfesores(Profesor[] profesores)
	{
		for(int i=0; i<profesores.length; i=i+1)
		{
			this.profesores[i]=profesores[i];
		}
	}

	public Profesor[] getProfesores()
	{
		return this.profesores;
	}

	public void setBibliografia(String bibliografia)
	{
		this.bibliografia=bibliografia;
	}

	public String getBibliografia()
	{
		return this.bibliografia;
	}

	public void setContenidos(String contenidos)
	{
		this.contenidos=contenidos;
	}

	public String getContenidos()
	{
		return this.contenidos;
	}

	public void setEvaluaciones(String evaluaciones)
	{
		this.evaluaciones=evaluaciones;
	}

	public int getEvaluaciones()
	{
		return this.evaluaciones;
	}
} 



















