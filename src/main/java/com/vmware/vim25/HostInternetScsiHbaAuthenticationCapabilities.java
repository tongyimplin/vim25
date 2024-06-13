package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaAuthenticationCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaAuthenticationCapabilities", propOrder = {"chapAuthSettable", "krb5AuthSettable", "srpAuthSettable", "spkmAuthSettable", "mutualChapSettable", "targetChapSettable", "targetMutualChapSettable"})
public class HostInternetScsiHbaAuthenticationCapabilities extends DynamicData {
  protected boolean chapAuthSettable;
  
  protected boolean krb5AuthSettable;
  
  protected boolean srpAuthSettable;
  
  protected boolean spkmAuthSettable;
  
  protected Boolean mutualChapSettable;
  
  protected Boolean targetChapSettable;
  
  protected Boolean targetMutualChapSettable;
  
  public boolean isChapAuthSettable() {
    return this.chapAuthSettable;
  }
  
  public void setChapAuthSettable(boolean paramBoolean) {
    this.chapAuthSettable = paramBoolean;
  }
  
  public boolean isKrb5AuthSettable() {
    return this.krb5AuthSettable;
  }
  
  public void setKrb5AuthSettable(boolean paramBoolean) {
    this.krb5AuthSettable = paramBoolean;
  }
  
  public boolean isSrpAuthSettable() {
    return this.srpAuthSettable;
  }
  
  public void setSrpAuthSettable(boolean paramBoolean) {
    this.srpAuthSettable = paramBoolean;
  }
  
  public boolean isSpkmAuthSettable() {
    return this.spkmAuthSettable;
  }
  
  public void setSpkmAuthSettable(boolean paramBoolean) {
    this.spkmAuthSettable = paramBoolean;
  }
  
  public Boolean isMutualChapSettable() {
    return this.mutualChapSettable;
  }
  
  public void setMutualChapSettable(Boolean paramBoolean) {
    this.mutualChapSettable = paramBoolean;
  }
  
  public Boolean isTargetChapSettable() {
    return this.targetChapSettable;
  }
  
  public void setTargetChapSettable(Boolean paramBoolean) {
    this.targetChapSettable = paramBoolean;
  }
  
  public Boolean isTargetMutualChapSettable() {
    return this.targetMutualChapSettable;
  }
  
  public void setTargetMutualChapSettable(Boolean paramBoolean) {
    this.targetMutualChapSettable = paramBoolean;
  }
}
