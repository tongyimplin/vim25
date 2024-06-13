package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryProfile;
import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.AuthenticationProfile;
import com.vmware.vim25.DateTimeProfile;
import com.vmware.vim25.DvsProfile;
import com.vmware.vim25.DvsVNicProfile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FirewallProfile;
import com.vmware.vim25.FirewallProfileRulesetProfile;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostMemoryProfile;
import com.vmware.vim25.IpAddressProfile;
import com.vmware.vim25.IpRouteProfile;
import com.vmware.vim25.LinkProfile;
import com.vmware.vim25.NasStorageProfile;
import com.vmware.vim25.NetStackInstanceProfile;
import com.vmware.vim25.NetworkPolicyProfile;
import com.vmware.vim25.NetworkProfile;
import com.vmware.vim25.NetworkProfileDnsConfigProfile;
import com.vmware.vim25.NsxHostVNicProfile;
import com.vmware.vim25.NumPortsProfile;
import com.vmware.vim25.OpaqueSwitchProfile;
import com.vmware.vim25.OptionProfile;
import com.vmware.vim25.PermissionProfile;
import com.vmware.vim25.PhysicalNicProfile;
import com.vmware.vim25.PnicUplinkProfile;
import com.vmware.vim25.PortGroupProfile;
import com.vmware.vim25.ProfileApplyProfileElement;
import com.vmware.vim25.ProfileApplyProfileProperty;
import com.vmware.vim25.ProfilePolicy;
import com.vmware.vim25.SecurityProfile;
import com.vmware.vim25.ServiceProfile;
import com.vmware.vim25.StaticRouteProfile;
import com.vmware.vim25.StorageProfile;
import com.vmware.vim25.UserGroupProfile;
import com.vmware.vim25.UserProfile;
import com.vmware.vim25.VirtualSwitchProfile;
import com.vmware.vim25.VirtualSwitchSelectionProfile;
import com.vmware.vim25.VlanProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyProfile", propOrder = {"enabled", "policy", "profileTypeName", "profileVersion", "property", "favorite", "toBeMerged", "toReplaceWith", "toBeDeleted", "copyEnableStatus", "hidden"})
@XmlSeeAlso({DvsProfile.class, FirewallProfile.class, NasStorageProfile.class, NetworkProfile.class, StorageProfile.class, NsxHostVNicProfile.class, PnicUplinkProfile.class, AuthenticationProfile.class, DateTimeProfile.class, PermissionProfile.class, IpAddressProfile.class, ActiveDirectoryProfile.class, NumPortsProfile.class, LinkProfile.class, NetworkPolicyProfile.class, VirtualSwitchProfile.class, OptionProfile.class, StaticRouteProfile.class, HostMemoryProfile.class, NetStackInstanceProfile.class, ServiceProfile.class, ProfileApplyProfileElement.class, VirtualSwitchSelectionProfile.class, UserProfile.class, OpaqueSwitchProfile.class, VlanProfile.class, PhysicalNicProfile.class, FirewallProfileRulesetProfile.class, SecurityProfile.class, UserGroupProfile.class, PortGroupProfile.class, HostApplyProfile.class, DvsVNicProfile.class, IpRouteProfile.class, NetworkProfileDnsConfigProfile.class})
public class ApplyProfile extends DynamicData {
  protected boolean enabled;
  
  protected List<ProfilePolicy> policy;
  
  protected String profileTypeName;
  
  protected String profileVersion;
  
  protected List<ProfileApplyProfileProperty> property;
  
  protected Boolean favorite;
  
  protected Boolean toBeMerged;
  
  protected Boolean toReplaceWith;
  
  protected Boolean toBeDeleted;
  
  protected Boolean copyEnableStatus;
  
  protected Boolean hidden;
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public List<ProfilePolicy> getPolicy() {
    if (this.policy == null)
      this.policy = new ArrayList<>(); 
    return this.policy;
  }
  
  public String getProfileTypeName() {
    return this.profileTypeName;
  }
  
  public void setProfileTypeName(String paramString) {
    this.profileTypeName = paramString;
  }
  
  public String getProfileVersion() {
    return this.profileVersion;
  }
  
  public void setProfileVersion(String paramString) {
    this.profileVersion = paramString;
  }
  
  public List<ProfileApplyProfileProperty> getProperty() {
    if (this.property == null)
      this.property = new ArrayList<>(); 
    return this.property;
  }
  
  public Boolean isFavorite() {
    return this.favorite;
  }
  
  public void setFavorite(Boolean paramBoolean) {
    this.favorite = paramBoolean;
  }
  
  public Boolean isToBeMerged() {
    return this.toBeMerged;
  }
  
  public void setToBeMerged(Boolean paramBoolean) {
    this.toBeMerged = paramBoolean;
  }
  
  public Boolean isToReplaceWith() {
    return this.toReplaceWith;
  }
  
  public void setToReplaceWith(Boolean paramBoolean) {
    this.toReplaceWith = paramBoolean;
  }
  
  public Boolean isToBeDeleted() {
    return this.toBeDeleted;
  }
  
  public void setToBeDeleted(Boolean paramBoolean) {
    this.toBeDeleted = paramBoolean;
  }
  
  public Boolean isCopyEnableStatus() {
    return this.copyEnableStatus;
  }
  
  public void setCopyEnableStatus(Boolean paramBoolean) {
    this.copyEnableStatus = paramBoolean;
  }
  
  public Boolean isHidden() {
    return this.hidden;
  }
  
  public void setHidden(Boolean paramBoolean) {
    this.hidden = paramBoolean;
  }
}
