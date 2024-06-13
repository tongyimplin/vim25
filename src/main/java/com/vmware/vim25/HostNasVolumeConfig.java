package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNasVolumeConfig;
import com.vmware.vim25.HostNasVolumeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNasVolumeConfig", propOrder = {"changeOperation", "spec"})
public class HostNasVolumeConfig extends DynamicData {
  protected String changeOperation;
  
  protected HostNasVolumeSpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public HostNasVolumeSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostNasVolumeSpec paramHostNasVolumeSpec) {
    this.spec = paramHostNasVolumeSpec;
  }
}
