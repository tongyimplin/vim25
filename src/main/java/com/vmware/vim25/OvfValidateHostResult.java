package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.OvfValidateHostResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfValidateHostResult", propOrder = {"downloadSize", "flatDeploymentSize", "sparseDeploymentSize", "error", "warning", "supportedDiskProvisioning"})
public class OvfValidateHostResult extends DynamicData {
  protected Long downloadSize;
  
  protected Long flatDeploymentSize;
  
  protected Long sparseDeploymentSize;
  
  protected List<LocalizedMethodFault> error;
  
  protected List<LocalizedMethodFault> warning;
  
  protected List<String> supportedDiskProvisioning;
  
  public Long getDownloadSize() {
    return this.downloadSize;
  }
  
  public void setDownloadSize(Long paramLong) {
    this.downloadSize = paramLong;
  }
  
  public Long getFlatDeploymentSize() {
    return this.flatDeploymentSize;
  }
  
  public void setFlatDeploymentSize(Long paramLong) {
    this.flatDeploymentSize = paramLong;
  }
  
  public Long getSparseDeploymentSize() {
    return this.sparseDeploymentSize;
  }
  
  public void setSparseDeploymentSize(Long paramLong) {
    this.sparseDeploymentSize = paramLong;
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
  
  public List<String> getSupportedDiskProvisioning() {
    if (this.supportedDiskProvisioning == null)
      this.supportedDiskProvisioning = new ArrayList<>(); 
    return this.supportedDiskProvisioning;
  }
}
