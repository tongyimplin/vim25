package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProtocolEndpoint;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VVolHostPE;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VVolHostPE", propOrder = {"key", "protocolEndpoint"})
public class VVolHostPE extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  @XmlElement(required = true)
  protected List<HostProtocolEndpoint> protocolEndpoint;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public List<HostProtocolEndpoint> getProtocolEndpoint() {
    if (this.protocolEndpoint == null)
      this.protocolEndpoint = new ArrayList<>(); 
    return this.protocolEndpoint;
  }
}
