package com.vmware.vim25;

import com.vmware.vim25.GuestRegistryFault;
import com.vmware.vim25.GuestRegistryKeyAlreadyExists;
import com.vmware.vim25.GuestRegistryKeyFault;
import com.vmware.vim25.GuestRegistryKeyHasSubkeys;
import com.vmware.vim25.GuestRegistryKeyInvalid;
import com.vmware.vim25.GuestRegistryKeyParentVolatile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegistryKeyFault", propOrder = {"keyName"})
@XmlSeeAlso({GuestRegistryKeyInvalid.class, GuestRegistryKeyHasSubkeys.class, GuestRegistryKeyParentVolatile.class, GuestRegistryKeyAlreadyExists.class})
public class GuestRegistryKeyFault extends GuestRegistryFault {
  @XmlElement(required = true)
  protected String keyName;
  
  public String getKeyName() {
    return this.keyName;
  }
  
  public void setKeyName(String paramString) {
    this.keyName = paramString;
  }
}
