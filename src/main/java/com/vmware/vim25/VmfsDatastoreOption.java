package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmfsDatastoreBaseOption;
import com.vmware.vim25.VmfsDatastoreOption;
import com.vmware.vim25.VmfsDatastoreSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmfsDatastoreOption", propOrder = {"info", "spec"})
public class VmfsDatastoreOption extends DynamicData {
  @XmlElement(required = true)
  protected VmfsDatastoreBaseOption info;
  
  @XmlElement(required = true)
  protected VmfsDatastoreSpec spec;
  
  public VmfsDatastoreBaseOption getInfo() {
    return this.info;
  }
  
  public void setInfo(VmfsDatastoreBaseOption paramVmfsDatastoreBaseOption) {
    this.info = paramVmfsDatastoreBaseOption;
  }
  
  public VmfsDatastoreSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VmfsDatastoreSpec paramVmfsDatastoreSpec) {
    this.spec = paramVmfsDatastoreSpec;
  }
}
