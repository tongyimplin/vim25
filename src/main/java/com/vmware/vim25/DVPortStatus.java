package com.vmware.vim25;

import com.vmware.vim25.DVPortStatus;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NumericRange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortStatus", propOrder = {"linkUp", "blocked", "vlanIds", "trunkingMode", "mtu", "linkPeer", "macAddress", "statusDetail", "vmDirectPathGen2Active", "vmDirectPathGen2InactiveReasonNetwork", "vmDirectPathGen2InactiveReasonOther", "vmDirectPathGen2InactiveReasonExtended"})
public class DVPortStatus extends DynamicData {
  protected boolean linkUp;
  
  protected boolean blocked;
  
  protected List<NumericRange> vlanIds;
  
  protected Boolean trunkingMode;
  
  protected Integer mtu;
  
  protected String linkPeer;
  
  protected String macAddress;
  
  protected String statusDetail;
  
  protected Boolean vmDirectPathGen2Active;
  
  protected List<String> vmDirectPathGen2InactiveReasonNetwork;
  
  protected List<String> vmDirectPathGen2InactiveReasonOther;
  
  protected String vmDirectPathGen2InactiveReasonExtended;
  
  public boolean isLinkUp() {
    return this.linkUp;
  }
  
  public void setLinkUp(boolean paramBoolean) {
    this.linkUp = paramBoolean;
  }
  
  public boolean isBlocked() {
    return this.blocked;
  }
  
  public void setBlocked(boolean paramBoolean) {
    this.blocked = paramBoolean;
  }
  
  public List<NumericRange> getVlanIds() {
    if (this.vlanIds == null)
      this.vlanIds = new ArrayList<>(); 
    return this.vlanIds;
  }
  
  public Boolean isTrunkingMode() {
    return this.trunkingMode;
  }
  
  public void setTrunkingMode(Boolean paramBoolean) {
    this.trunkingMode = paramBoolean;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
  
  public String getLinkPeer() {
    return this.linkPeer;
  }
  
  public void setLinkPeer(String paramString) {
    this.linkPeer = paramString;
  }
  
  public String getMacAddress() {
    return this.macAddress;
  }
  
  public void setMacAddress(String paramString) {
    this.macAddress = paramString;
  }
  
  public String getStatusDetail() {
    return this.statusDetail;
  }
  
  public void setStatusDetail(String paramString) {
    this.statusDetail = paramString;
  }
  
  public Boolean isVmDirectPathGen2Active() {
    return this.vmDirectPathGen2Active;
  }
  
  public void setVmDirectPathGen2Active(Boolean paramBoolean) {
    this.vmDirectPathGen2Active = paramBoolean;
  }
  
  public List<String> getVmDirectPathGen2InactiveReasonNetwork() {
    if (this.vmDirectPathGen2InactiveReasonNetwork == null)
      this.vmDirectPathGen2InactiveReasonNetwork = new ArrayList<>(); 
    return this.vmDirectPathGen2InactiveReasonNetwork;
  }
  
  public List<String> getVmDirectPathGen2InactiveReasonOther() {
    if (this.vmDirectPathGen2InactiveReasonOther == null)
      this.vmDirectPathGen2InactiveReasonOther = new ArrayList<>(); 
    return this.vmDirectPathGen2InactiveReasonOther;
  }
  
  public String getVmDirectPathGen2InactiveReasonExtended() {
    return this.vmDirectPathGen2InactiveReasonExtended;
  }
  
  public void setVmDirectPathGen2InactiveReasonExtended(String paramString) {
    this.vmDirectPathGen2InactiveReasonExtended = paramString;
  }
}
