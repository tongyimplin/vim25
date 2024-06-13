package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPortGroupConfig;
import com.vmware.vim25.HostPortGroupSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPortGroupConfig", propOrder = {"changeOperation", "spec"})
public class HostPortGroupConfig extends DynamicData {
  protected String changeOperation;
  
  protected HostPortGroupSpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public HostPortGroupSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostPortGroupSpec paramHostPortGroupSpec) {
    this.spec = paramHostPortGroupSpec;
  }
}
