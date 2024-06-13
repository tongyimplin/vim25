package com.vmware.vim25;

import com.vmware.vim25.ResourcePoolSummary;
import com.vmware.vim25.VAppProductInfo;
import com.vmware.vim25.VirtualAppSummary;
import com.vmware.vim25.VirtualAppVAppState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualAppSummary", propOrder = {"product", "vAppState", "suspended", "installBootRequired", "instanceUuid"})
public class VirtualAppSummary extends ResourcePoolSummary {
  protected VAppProductInfo product;
  
  protected VirtualAppVAppState vAppState;
  
  protected Boolean suspended;
  
  protected Boolean installBootRequired;
  
  protected String instanceUuid;
  
  public VAppProductInfo getProduct() {
    return this.product;
  }
  
  public void setProduct(VAppProductInfo paramVAppProductInfo) {
    this.product = paramVAppProductInfo;
  }
  
  public VirtualAppVAppState getVAppState() {
    return this.vAppState;
  }
  
  public void setVAppState(VirtualAppVAppState paramVirtualAppVAppState) {
    this.vAppState = paramVirtualAppVAppState;
  }
  
  public Boolean isSuspended() {
    return this.suspended;
  }
  
  public void setSuspended(Boolean paramBoolean) {
    this.suspended = paramBoolean;
  }
  
  public Boolean isInstallBootRequired() {
    return this.installBootRequired;
  }
  
  public void setInstallBootRequired(Boolean paramBoolean) {
    this.installBootRequired = paramBoolean;
  }
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
}
