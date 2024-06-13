package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSslThumbprintInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSslThumbprintInfo", propOrder = {"principal", "ownerTag", "sslThumbprints"})
public class HostSslThumbprintInfo extends DynamicData {
  @XmlElement(required = true)
  protected String principal;
  
  protected String ownerTag;
  
  protected List<String> sslThumbprints;
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public String getOwnerTag() {
    return this.ownerTag;
  }
  
  public void setOwnerTag(String paramString) {
    this.ownerTag = paramString;
  }
  
  public List<String> getSslThumbprints() {
    if (this.sslThumbprints == null)
      this.sslThumbprints = new ArrayList<>(); 
    return this.sslThumbprints;
  }
}
