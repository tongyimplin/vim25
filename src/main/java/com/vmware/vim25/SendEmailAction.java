package com.vmware.vim25;

import com.vmware.vim25.Action;
import com.vmware.vim25.SendEmailAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendEmailAction", propOrder = {"toList", "ccList", "subject", "body"})
public class SendEmailAction extends Action {
  @XmlElement(required = true)
  protected String toList;
  
  @XmlElement(required = true)
  protected String ccList;
  
  @XmlElement(required = true)
  protected String subject;
  
  @XmlElement(required = true)
  protected String body;
  
  public String getToList() {
    return this.toList;
  }
  
  public void setToList(String paramString) {
    this.toList = paramString;
  }
  
  public String getCcList() {
    return this.ccList;
  }
  
  public void setCcList(String paramString) {
    this.ccList = paramString;
  }
  
  public String getSubject() {
    return this.subject;
  }
  
  public void setSubject(String paramString) {
    this.subject = paramString;
  }
  
  public String getBody() {
    return this.body;
  }
  
  public void setBody(String paramString) {
    this.body = paramString;
  }
}
