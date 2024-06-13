package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.OvfCreateDescriptorResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCreateDescriptorResult", propOrder = {"ovfDescriptor", "error", "warning", "includeImageFiles"})
public class OvfCreateDescriptorResult extends DynamicData {
  @XmlElement(required = true)
  protected String ovfDescriptor;
  
  protected List<LocalizedMethodFault> error;
  
  protected List<LocalizedMethodFault> warning;
  
  protected Boolean includeImageFiles;
  
  public String getOvfDescriptor() {
    return this.ovfDescriptor;
  }
  
  public void setOvfDescriptor(String paramString) {
    this.ovfDescriptor = paramString;
  }
  
  public List<LocalizedMethodFault> getError() {
    if (this.error == null)
      this.error = new ArrayList<>(); 
    return this.error;
  }
  
  public List<LocalizedMethodFault> getWarning() {
    if (this.warning == null)
      this.warning = new ArrayList<>(); 
    return this.warning;
  }
  
  public Boolean isIncludeImageFiles() {
    return this.includeImageFiles;
  }
  
  public void setIncludeImageFiles(Boolean paramBoolean) {
    this.includeImageFiles = paramBoolean;
  }
}
