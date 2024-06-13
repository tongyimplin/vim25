package com.vmware.vim25;

import com.vmware.vim25.HttpFault;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpFault", propOrder = {"statusCode", "statusMessage"})
public class HttpFault extends VimFault {
  protected int statusCode;
  
  @XmlElement(required = true)
  protected String statusMessage;
  
  public int getStatusCode() {
    return this.statusCode;
  }
  
  public void setStatusCode(int paramInt) {
    this.statusCode = paramInt;
  }
  
  public String getStatusMessage() {
    return this.statusMessage;
  }
  
  public void setStatusMessage(String paramString) {
    this.statusMessage = paramString;
  }
}
