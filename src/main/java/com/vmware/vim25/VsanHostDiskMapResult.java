package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VsanHostDiskMapResult;
import com.vmware.vim25.VsanHostDiskMapping;
import com.vmware.vim25.VsanHostDiskResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskMapResult", propOrder = {"mapping", "diskResult", "error"})
public class VsanHostDiskMapResult extends DynamicData {
  @XmlElement(required = true)
  protected VsanHostDiskMapping mapping;
  
  protected List<VsanHostDiskResult> diskResult;
  
  protected LocalizedMethodFault error;
  
  public VsanHostDiskMapping getMapping() {
    return this.mapping;
  }
  
  public void setMapping(VsanHostDiskMapping paramVsanHostDiskMapping) {
    this.mapping = paramVsanHostDiskMapping;
  }
  
  public List<VsanHostDiskResult> getDiskResult() {
    if (this.diskResult == null)
      this.diskResult = new ArrayList<>(); 
    return this.diskResult;
  }
  
  public LocalizedMethodFault getError() {
    return this.error;
  }
  
  public void setError(LocalizedMethodFault paramLocalizedMethodFault) {
    this.error = paramLocalizedMethodFault;
  }
}
