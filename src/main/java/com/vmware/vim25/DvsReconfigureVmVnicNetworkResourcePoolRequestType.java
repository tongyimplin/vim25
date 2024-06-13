package com.vmware.vim25;

import com.vmware.vim25.DvsReconfigureVmVnicNetworkResourcePoolRequestType;
import com.vmware.vim25.DvsVmVnicResourcePoolConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsReconfigureVmVnicNetworkResourcePoolRequestType", propOrder = {"_this", "configSpec"})
public class DvsReconfigureVmVnicNetworkResourcePoolRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<DvsVmVnicResourcePoolConfigSpec> configSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<DvsVmVnicResourcePoolConfigSpec> getConfigSpec() {
    if (this.configSpec == null)
      this.configSpec = new ArrayList<>(); 
    return this.configSpec;
  }
}
