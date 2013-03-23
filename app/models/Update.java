package models;

public class Update {
	public Long userid;
    public Long date;
    public String description;
    
    public Update() {}
    public Update(Long userid, Long date, String description) {
    	this.userid = userid;
    	this.date = date;
    	this.description = description;
    }
}
