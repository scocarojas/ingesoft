/*Codificado por tu cucha*/

package USERS;

public class Usuario
{
    /*Atributos*/

    protected int id;

    /*Métodos*/

    public void setId(int id)
    {
        this.id=id;
    }

    public int getId()
    {
        return this.id;
    }
}

public class Aspirante extends Usuario
{
    /*Métodos*/
}

public class Profesor extends Usuario
{
    /*Atributos*/

    protected String nombre;
    protected String correo;
    protected int idDepartamento;

    /*Métodos*/

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getNombre();
    {
        return this.nombre;
    }

    public void setCorreo(String correo)
    {
        this.correo=correo;
    }

    public String getCorreo();
    {
        return this.correo;
    }

    public void setIdDepartamento(String idDepartamento)
    {
        this.idDepartamento=idDepartamento;
    }

    public String getIdDepartamento();
    {
        return this.idDepartamento;
    }
}

public class ProfesorDirector extends Profesor
{
    /*Métodos*/
}

public class ProfesorDocente extends Profesor
{
    /*Métodos*/
}

public class Estudiante extends Usuario
{
    /*Atributos*/

    protected String nombre;
    protected String correo;
    protected int idCarrera;

    /*Métodos*/

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public String getNombre();
    {
        return this.nombre;
    }

    public void setCorreo(String correo)
    {
        this.correo=correo;
    }

    public String getCorreo();
    {
        return this.correo;
    }

    public void setIdCarrera(String idCarrera)
    {
        this.idCarrera=idCarrera;
    }

    public String getIdCarrera();
    {
        return this.idCarrera;
    }
}

public class Perfil
{
    /*Atributos*/

    protected Profesor persona;

    /*Métodos*/

    public void setProfesor(Profesor persona)
    {
        this.persona=persona;
    }

    public Profesor getProfesor()
    {
        return this.persona;
    }
}

