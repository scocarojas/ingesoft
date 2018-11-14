package COMUNICACION;

public class Chat
{
    /*Atributos*/

    protected int idChat;
    protected Usuario remitente;
    protected Director destinatario;
    protected String correoRemitente;
    protected String contenido;

    /*Métodos*/

    public void setIdChat(int idChat)
    {
    	this.idChat=idChat;
    }

    public int getIdChat()
    {
    	return this.idChat;
    }

    public void setRemitente(Usuario remitente)
    {
    	this.remitente=remitente;
    }

    public Usuario getRemitente()
    {
    	return this.remitente;
    }

	public void setDestinatario(Director destinatario)
    {
    	this.destinatario=destinatario;
    }

    public Director getDestinario()
    {
    	return this.destinatario;
    }    

    public void setCorreoRemitente(String correoRemitente)
    {
    	this.correoRemitente=correoRemitente;
    }

    public String getCorreoRemitente()
    {
    	return this.correoRemitente;
    }

    public void setContenido(String contenido)
    {
    	this.contenido=contenido;
    }

    public String getContenido()
    {
    	return this.contenido;
    }

}