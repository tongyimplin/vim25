package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDVSSetting;
import com.vmware.vim25.ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDVSSetting", propOrder = {"dvSwitch", "pnicDevices", "dvPortgroupSetting"})
public class ClusterComputeResourceDVSSetting extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference dvSwitch;
  
  protected List<String> pnicDevices;
  
  protected List<ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping> dvPortgroupSetting;
  
  public ManagedObjectReference getDvSwitch() {
    return this.dvSwitch;
  }
  
  public void setDvSwitch(ManagedObjectReference paramManagedObjectReference) {
    this.dvSwitch = paramManagedObjectReference;
  }
  
  public List<String> getPnicDevices() {
    if (this.pnicDevices == null)
      this.pnicDevices = new ArrayList<>(); 
    return this.pnicDevices;
  }
  
  public List<ClusterComputeResourceDVSSettingDVPortgroupToServiceMapping> getDvPortgroupSetting() {
    if (this.dvPortgroupSetting == null)
      this.dvPortgroupSetting = new ArrayList<>(); 
    return this.dvPortgroupSetting;
  }
}
