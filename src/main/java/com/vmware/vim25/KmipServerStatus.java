package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.KmipServerStatus;
import com.vmware.vim25.ManagedEntityStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmipServerStatus", propOrder = {"clusterId", "name", "status", "description"})
public class KmipServerStatus extends DynamicData {
  @XmlElement(required = true)
  protected KeyProviderId clusterId;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus status;
  
  @XmlElement(required = true)
  protected String description;
  
  public KeyProviderId getClusterId() {
    return this.clusterId;
  }
  
  public void setClusterId(KeyProviderId paramKeyProviderId) {
    this.clusterId = paramKeyProviderId;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedEntityStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.status = paramManagedEntityStatus;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
}
