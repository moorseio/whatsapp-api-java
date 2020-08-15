package io.moorse.demo.whatsapp.models;

public class Message {
	
	private String id;
	private String channel;
	private String type;
	private String status;
	private String to;
	private String from;
	private String creationDate;
	private String sendDate;
	private String readDate;
	private String receivedDate;
	private String content;
	private String idMessage;
	private String base64;
	private String fileName;
	private Users contactUser;
	private String urlFile;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	public String getReadDate() {
		return readDate;
	}
	public void setReadDate(String readDate) {
		this.readDate = readDate;
	}
	public String getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(String idMessage) {
		this.idMessage = idMessage;
	}
	
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getUrlFile() {
		return urlFile;
	}
	public void setUrlFile(String urlFile) {
		this.urlFile = urlFile;
	}

  public Users getContactUser() {
    return contactUser;
  }

  public void setContactUser(Users contactUser) {
    this.contactUser = contactUser;
  }

  @Override
	public String toString() {
		return "Message [id=" + id + ", channel=" + channel + ", type=" + type + ", status=" + status + ", to=" + to
				+ ", from=" + from + ", creationDate=" + creationDate + ", sendDate=" + sendDate + ", readDate="
				+ readDate + ", receivedDate=" + receivedDate + ", content=" + content + ", idMessage=" + idMessage
				+ "]";
	}
	
	


	
}
