package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.DvsNotAuthorized;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsNotAuthorized", propOrder = {"sessionExtensionKey", "dvsExtensionKey"})
public class DvsNotAuthorized extends DvsFault {
  protected String sessionExtensionKey;
  
  protected String dvsExtensionKey;
  
  public String getSessionExtensionKey() {
    return this.sessionExtensionKey;
  }
  
  public void setSessionExtensionKey(String paramString) {
    this.sessionExtensionKey = paramString;
  }
  
  public String getDvsExtensionKey() {
    return this.dvsExtensionKey;
  }
  
  public void setDvsExtensionKey(String paramString) {
    this.dvsExtensionKey = paramString;
  }
}
