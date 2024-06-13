package com.vmware.vim25;

import com.vmware.vim25.VmFaultToleranceInvalidFileBacking;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceInvalidFileBacking", propOrder = {"backingType", "backingFilename"})
public class VmFaultToleranceInvalidFileBacking extends VmFaultToleranceIssue {
  protected String backingType;
  
  protected String backingFilename;
  
  public String getBackingType() {
    return this.backingType;
  }
  
  public void setBackingType(String paramString) {
    this.backingType = paramString;
  }
  
  public String getBackingFilename() {
    return this.backingFilename;
  }
  
  public void setBackingFilename(String paramString) {
    this.backingFilename = paramString;
  }
}
