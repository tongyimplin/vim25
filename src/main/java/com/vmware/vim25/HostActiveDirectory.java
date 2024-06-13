package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostActiveDirectory;
import com.vmware.vim25.HostActiveDirectorySpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostActiveDirectory", propOrder = {"changeOperation", "spec"})
public class HostActiveDirectory extends DynamicData {
  @XmlElement(required = true)
  protected String changeOperation;
  
  protected HostActiveDirectorySpec spec;
  
  public String getChangeOperation() {
    return this.changeOperation;
  }
  
  public void setChangeOperation(String paramString) {
    this.changeOperation = paramString;
  }
  
  public HostActiveDirectorySpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostActiveDirectorySpec paramHostActiveDirectorySpec) {
    this.spec = paramHostActiveDirectorySpec;
  }
}
