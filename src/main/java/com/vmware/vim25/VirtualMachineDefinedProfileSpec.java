package com.vmware.vim25;

import com.vmware.vim25.KeyValue;
import com.vmware.vim25.ReplicationSpec;
import com.vmware.vim25.VirtualMachineDefinedProfileSpec;
import com.vmware.vim25.VirtualMachineProfileRawData;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDefinedProfileSpec", propOrder = {"profileId", "replicationSpec", "profileData", "profileParams"})
public class VirtualMachineDefinedProfileSpec extends VirtualMachineProfileSpec {
  @XmlElement(required = true)
  protected String profileId;
  
  protected ReplicationSpec replicationSpec;
  
  protected VirtualMachineProfileRawData profileData;
  
  protected List<KeyValue> profileParams;
  
  public String getProfileId() {
    return this.profileId;
  }
  
  public void setProfileId(String paramString) {
    this.profileId = paramString;
  }
  
  public ReplicationSpec getReplicationSpec() {
    return this.replicationSpec;
  }
  
  public void setReplicationSpec(ReplicationSpec paramReplicationSpec) {
    this.replicationSpec = paramReplicationSpec;
  }
  
  public VirtualMachineProfileRawData getProfileData() {
    return this.profileData;
  }
  
  public void setProfileData(VirtualMachineProfileRawData paramVirtualMachineProfileRawData) {
    this.profileData = paramVirtualMachineProfileRawData;
  }
  
  public List<KeyValue> getProfileParams() {
    if (this.profileParams == null)
      this.profileParams = new ArrayList<>(); 
    return this.profileParams;
  }
}
