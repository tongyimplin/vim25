package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHostConfigurationInput;
import com.vmware.vim25.ExtendHCIRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SDDCBase;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendHCIRequestType", propOrder = {"_this", "hostInputs", "vSanConfigSpec"})
public class ExtendHCIRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ClusterComputeResourceHostConfigurationInput> hostInputs;
  
  protected SDDCBase vSanConfigSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ClusterComputeResourceHostConfigurationInput> getHostInputs() {
    if (this.hostInputs == null)
      this.hostInputs = new ArrayList<>(); 
    return this.hostInputs;
  }
  
  public SDDCBase getVSanConfigSpec() {
    return this.vSanConfigSpec;
  }
  
  public void setVSanConfigSpec(SDDCBase paramSDDCBase) {
    this.vSanConfigSpec = paramSDDCBase;
  }
}
