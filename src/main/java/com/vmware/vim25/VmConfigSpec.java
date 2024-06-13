package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VAppConfigSpec;
import com.vmware.vim25.VAppIPAssignmentInfo;
import com.vmware.vim25.VAppOvfSectionSpec;
import com.vmware.vim25.VAppProductSpec;
import com.vmware.vim25.VAppPropertySpec;
import com.vmware.vim25.VmConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigSpec", propOrder = {"product", "property", "ipAssignment", "eula", "ovfSection", "ovfEnvironmentTransport", "installBootRequired", "installBootStopDelay"})
@XmlSeeAlso({VAppConfigSpec.class})
public class VmConfigSpec extends DynamicData {
  protected List<VAppProductSpec> product;
  
  protected List<VAppPropertySpec> property;
  
  protected VAppIPAssignmentInfo ipAssignment;
  
  protected List<String> eula;
  
  protected List<VAppOvfSectionSpec> ovfSection;
  
  protected List<String> ovfEnvironmentTransport;
  
  protected Boolean installBootRequired;
  
  protected Integer installBootStopDelay;
  
  public List<VAppProductSpec> getProduct() {
    if (this.product == null)
      this.product = new ArrayList<>(); 
    return this.product;
  }
  
  public List<VAppPropertySpec> getProperty() {
    if (this.property == null)
      this.property = new ArrayList<>(); 
    return this.property;
  }
  
  public VAppIPAssignmentInfo getIpAssignment() {
    return this.ipAssignment;
  }
  
  public void setIpAssignment(VAppIPAssignmentInfo paramVAppIPAssignmentInfo) {
    this.ipAssignment = paramVAppIPAssignmentInfo;
  }
  
  public List<String> getEula() {
    if (this.eula == null)
      this.eula = new ArrayList<>(); 
    return this.eula;
  }
  
  public List<VAppOvfSectionSpec> getOvfSection() {
    if (this.ovfSection == null)
      this.ovfSection = new ArrayList<>(); 
    return this.ovfSection;
  }
  
  public List<String> getOvfEnvironmentTransport() {
    if (this.ovfEnvironmentTransport == null)
      this.ovfEnvironmentTransport = new ArrayList<>(); 
    return this.ovfEnvironmentTransport;
  }
  
  public Boolean isInstallBootRequired() {
    return this.installBootRequired;
  }
  
  public void setInstallBootRequired(Boolean paramBoolean) {
    this.installBootRequired = paramBoolean;
  }
  
  public Integer getInstallBootStopDelay() {
    return this.installBootStopDelay;
  }
  
  public void setInstallBootStopDelay(Integer paramInteger) {
    this.installBootStopDelay = paramInteger;
  }
}
