package com.vmware.vim25;

import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.InvalidNasCredentials;
import com.vmware.vim25.InvalidNetworkResource;
import com.vmware.vim25.NasConfigFault;
import com.vmware.vim25.NasConnectionLimitReached;
import com.vmware.vim25.NasSessionCredentialConflict;
import com.vmware.vim25.NasVolumeNotMounted;
import com.vmware.vim25.NetworkInaccessible;
import com.vmware.vim25.NoPermissionOnNasVolume;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasConfigFault", propOrder = {"name"})
@XmlSeeAlso({NoPermissionOnNasVolume.class, InvalidNetworkResource.class, NasSessionCredentialConflict.class, InvalidNasCredentials.class, NetworkInaccessible.class, NasVolumeNotMounted.class, NasConnectionLimitReached.class})
public class NasConfigFault extends HostConfigFault {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
