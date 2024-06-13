package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDVSConfigurationValidation;
import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDVSConfigurationValidation", propOrder = {"isDvsValid", "isDvpgValid"})
public class ClusterComputeResourceDVSConfigurationValidation extends ClusterComputeResourceValidationResultBase {
  protected boolean isDvsValid;
  
  protected boolean isDvpgValid;
  
  public boolean isIsDvsValid() {
    return this.isDvsValid;
  }
  
  public void setIsDvsValid(boolean paramBoolean) {
    this.isDvsValid = paramBoolean;
  }
  
  public boolean isIsDvpgValid() {
    return this.isDvpgValid;
  }
  
  public void setIsDvpgValid(boolean paramBoolean) {
    this.isDvpgValid = paramBoolean;
  }
}
