package ua.kpi.kramarenko.api.hotel.beans;

public interface Contact {
	public int getId();
	public int getClientId();
	public void setClientId(int clientId);
	public int getRequestId();
	public void setRequestId(int requestId);
	public String getTelephoneNo();
	public void setTelephoneNo(String telephoneNo);
}
