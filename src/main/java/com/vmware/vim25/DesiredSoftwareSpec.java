package com.vmware.vim25;

import com.vmware.vim25.DesiredSoftwareSpec;
import com.vmware.vim25.DesiredSoftwareSpecBaseImageSpec;
import com.vmware.vim25.DesiredSoftwareSpecVendorAddOnSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesiredSoftwareSpec", propOrder = {"baseImageSpec", "vendorAddOnSpec"})
public class DesiredSoftwareSpec extends DynamicData {
  @XmlElement(required = true)
  protected DesiredSoftwareSpecBaseImageSpec baseImageSpec;
  
  protected DesiredSoftwareSpecVendorAddOnSpec vendorAddOnSpec;
  
  public DesiredSoftwareSpecBaseImageSpec getBaseImageSpec() {
    return this.baseImageSpec;
  }
  
  public void setBaseImageSpec(DesiredSoftwareSpecBaseImageSpec paramDesiredSoftwareSpecBaseImageSpec) {
    this.baseImageSpec = paramDesiredSoftwareSpecBaseImageSpec;
  }
  
  public DesiredSoftwareSpecVendorAddOnSpec getVendorAddOnSpec() {
    return this.vendorAddOnSpec;
  }
  
  public void setVendorAddOnSpec(DesiredSoftwareSpecVendorAddOnSpec paramDesiredSoftwareSpecVendorAddOnSpec) {
    this.vendorAddOnSpec = paramDesiredSoftwareSpecVendorAddOnSpec;
  }
}
