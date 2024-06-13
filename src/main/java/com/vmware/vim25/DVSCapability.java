package com.vmware.vim25;

import com.vmware.vim25.DVSCapability;
import com.vmware.vim25.DVSFeatureCapability;
import com.vmware.vim25.DistributedVirtualSwitchHostProductSpec;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSCapability", propOrder = {"dvsOperationSupported", "dvPortGroupOperationSupported", "dvPortOperationSupported", "compatibleHostComponentProductInfo", "featuresSupported"})
public class DVSCapability extends DynamicData {
  protected Boolean dvsOperationSupported;
  
  protected Boolean dvPortGroupOperationSupported;
  
  protected Boolean dvPortOperationSupported;
  
  protected List<DistributedVirtualSwitchHostProductSpec> compatibleHostComponentProductInfo;
  
  protected DVSFeatureCapability featuresSupported;
  
  public Boolean isDvsOperationSupported() {
    return this.dvsOperationSupported;
  }
  
  public void setDvsOperationSupported(Boolean paramBoolean) {
    this.dvsOperationSupported = paramBoolean;
  }
  
  public Boolean isDvPortGroupOperationSupported() {
    return this.dvPortGroupOperationSupported;
  }
  
  public void setDvPortGroupOperationSupported(Boolean paramBoolean) {
    this.dvPortGroupOperationSupported = paramBoolean;
  }
  
  public Boolean isDvPortOperationSupported() {
    return this.dvPortOperationSupported;
  }
  
  public void setDvPortOperationSupported(Boolean paramBoolean) {
    this.dvPortOperationSupported = paramBoolean;
  }
  
  public List<DistributedVirtualSwitchHostProductSpec> getCompatibleHostComponentProductInfo() {
    if (this.compatibleHostComponentProductInfo == null)
      this.compatibleHostComponentProductInfo = new ArrayList<>(); 
    return this.compatibleHostComponentProductInfo;
  }
  
  public DVSFeatureCapability getFeaturesSupported() {
    return this.featuresSupported;
  }
  
  public void setFeaturesSupported(DVSFeatureCapability paramDVSFeatureCapability) {
    this.featuresSupported = paramDVSFeatureCapability;
  }
}
