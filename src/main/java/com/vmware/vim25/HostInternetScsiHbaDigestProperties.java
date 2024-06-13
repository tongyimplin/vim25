package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaDigestProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDigestProperties", propOrder = {"headerDigestType", "headerDigestInherited", "dataDigestType", "dataDigestInherited"})
public class HostInternetScsiHbaDigestProperties extends DynamicData {
  protected String headerDigestType;
  
  protected Boolean headerDigestInherited;
  
  protected String dataDigestType;
  
  protected Boolean dataDigestInherited;
  
  public String getHeaderDigestType() {
    return this.headerDigestType;
  }
  
  public void setHeaderDigestType(String paramString) {
    this.headerDigestType = paramString;
  }
  
  public Boolean isHeaderDigestInherited() {
    return this.headerDigestInherited;
  }
  
  public void setHeaderDigestInherited(Boolean paramBoolean) {
    this.headerDigestInherited = paramBoolean;
  }
  
  public String getDataDigestType() {
    return this.dataDigestType;
  }
  
  public void setDataDigestType(String paramString) {
    this.dataDigestType = paramString;
  }
  
  public Boolean isDataDigestInherited() {
    return this.dataDigestInherited;
  }
  
  public void setDataDigestInherited(Boolean paramBoolean) {
    this.dataDigestInherited = paramBoolean;
  }
}
