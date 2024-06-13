package com.vmware.vim25;

import com.vmware.vim25.SessionManagerHttpServiceRequestSpec;
import com.vmware.vim25.SessionManagerServiceRequestSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagerHttpServiceRequestSpec", propOrder = {"method", "url"})
public class SessionManagerHttpServiceRequestSpec extends SessionManagerServiceRequestSpec {
  protected String method;
  
  @XmlElement(required = true)
  protected String url;
  
  public String getMethod() {
    return this.method;
  }
  
  public void setMethod(String paramString) {
    this.method = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
}
