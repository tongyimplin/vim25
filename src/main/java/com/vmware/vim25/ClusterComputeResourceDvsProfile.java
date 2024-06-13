package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDvsProfile;
import com.vmware.vim25.ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceDvsProfile", propOrder = {"dvsName", "dvSwitch", "pnicDevices", "dvPortgroupMapping"})
public class ClusterComputeResourceDvsProfile extends DynamicData {
  protected String dvsName;
  
  protected ManagedObjectReference dvSwitch;
  
  protected List<String> pnicDevices;
  
  protected List<ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping> dvPortgroupMapping;
  
  public String getDvsName() {
    return this.dvsName;
  }
  
  public void setDvsName(String paramString) {
    this.dvsName = paramString;
  }
  
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
  
  public List<ClusterComputeResourceDvsProfileDVPortgroupSpecToServiceMapping> getDvPortgroupMapping() {
    if (this.dvPortgroupMapping == null)
      this.dvPortgroupMapping = new ArrayList<>(); 
    return this.dvPortgroupMapping;
  }
}
