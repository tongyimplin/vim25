package com.vmware.vim25;

import com.vmware.vim25.ClusterEVCManagerCheckResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEVCManagerCheckResult", propOrder = {"evcModeKey", "error", "host"})
public class ClusterEVCManagerCheckResult extends DynamicData {
  @XmlElement(required = true)
  protected String evcModeKey;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault error;
  
  protected List<ManagedObjectReference> host;
  
  public String getEvcModeKey() {
    return this.evcModeKey;
  }
  
  public void setEvcModeKey(String paramString) {
    this.evcModeKey = paramString;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
}
