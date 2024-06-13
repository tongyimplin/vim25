package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VAppConfigInfo;
import com.vmware.vim25.VAppIPAssignmentInfo;
import com.vmware.vim25.VAppOvfSectionInfo;
import com.vmware.vim25.VAppProductInfo;
import com.vmware.vim25.VAppPropertyInfo;
import com.vmware.vim25.VmConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigInfo", propOrder = {"product", "property", "ipAssignment", "eula", "ovfSection", "ovfEnvironmentTransport", "installBootRequired", "installBootStopDelay"})
@XmlSeeAlso({VAppConfigInfo.class})
public class VmConfigInfo extends DynamicData {
  protected List<VAppProductInfo> product;
  
  protected List<VAppPropertyInfo> property;
  
  @XmlElement(required = true)
  protected VAppIPAssignmentInfo ipAssignment;
  
  protected List<String> eula;
  
  protected List<VAppOvfSectionInfo> ovfSection;
  
  protected List<String> ovfEnvironmentTransport;
  
  protected boolean installBootRequired;
  
  protected int installBootStopDelay;
  
  public List<VAppProductInfo> getProduct() {
    if (this.product == null)
      this.product = new ArrayList<>(); 
    return this.product;
  }
  
  public List<VAppPropertyInfo> getProperty() {
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
  
  public List<VAppOvfSectionInfo> getOvfSection() {
    if (this.ovfSection == null)
      this.ovfSection = new ArrayList<>(); 
    return this.ovfSection;
  }
  
  public List<String> getOvfEnvironmentTransport() {
    if (this.ovfEnvironmentTransport == null)
      this.ovfEnvironmentTransport = new ArrayList<>(); 
    return this.ovfEnvironmentTransport;
  }
  
  public boolean isInstallBootRequired() {
    return this.installBootRequired;
  }
  
  public void setInstallBootRequired(boolean paramBoolean) {
    this.installBootRequired = paramBoolean;
  }
  
  public int getInstallBootStopDelay() {
    return this.installBootStopDelay;
  }
  
  public void setInstallBootStopDelay(int paramInt) {
    this.installBootStopDelay = paramInt;
  }
}
