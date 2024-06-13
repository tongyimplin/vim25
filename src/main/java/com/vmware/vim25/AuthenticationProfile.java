package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryProfile;
import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.AuthenticationProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationProfile", propOrder = {"activeDirectory"})
public class AuthenticationProfile extends ApplyProfile {
  protected ActiveDirectoryProfile activeDirectory;
  
  public ActiveDirectoryProfile getActiveDirectory() {
    return this.activeDirectory;
  }
  
  public void setActiveDirectory(ActiveDirectoryProfile paramActiveDirectoryProfile) {
    this.activeDirectory = paramActiveDirectoryProfile;
  }
}
